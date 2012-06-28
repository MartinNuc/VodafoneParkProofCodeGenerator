package cz.nuc.vodafoneparkproofcodegenerator;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class VodafoneParkProofCodeGenerator 
{
    public String getProofCode(String span) throws Exception
    {
        Span hlavniSpan = null;
        Pattern pattern, pattern2;
        Matcher matcher, matcher2;
        // spany
        ArrayList<Span> spany = new ArrayList<Span>();
        pattern = Pattern.compile("\\.([\\w]*)\\{color:#(\\w{6});");
        matcher = pattern.matcher(span);
        while (matcher.find()) {
            spany.add(new Span(matcher.group(1), matcher.group(2)));
        }
        
        // b
        String b = "";
        pattern = Pattern.compile("b='(.*)'");
        matcher = pattern.matcher(span);
        if (matcher.find())
            b = matcher.group(1);
        else
            throw new Exception("Nepodarilo se naparsovat javascript - b");
        
        // d
        String d = "";
        pattern = Pattern.compile("d=\\\"(.*)\\\".split");
        matcher = pattern.matcher(span);
        if (matcher.find())
            d = matcher.group(1);
        else
            throw new Exception("Nepodarilo se naparsovat javascript - d");
        
        // pouzijem deobfuskaci
        String[] dsplit = d.split(" ");
        for (int i = 100; i>=0; i--)
        {
            if (i < dsplit.length && !dsplit[i].equals(""))
                b=b.replaceAll("\\b" + i + "\\b", dsplit[i]);
        }

        // zjistime z ktereho pole se kod pocita
        pattern = Pattern.compile("\\$\\(\"\\.(\\w*)\\\"\\)\\.css\\(\\\"color\\\"\\)");
        matcher = pattern.matcher(b);
        if (matcher.find())
            d = matcher.group(1);
        else
            throw new Exception("Nepodarilo se najit hlavni span");
        
        for (Span tmpspan : spany)
            if (tmpspan.name.equals(d))
            {
                hlavniSpan = tmpspan;
                break;
            }
        
        if (hlavniSpan == null)
            throw new Exception("Nepodarilo se najit hlavni span");
        
        // zjistime ciselnou soustavu do ktery se cislo dekoduje      
        int radixTo=0, radixFrom=0, offset=-2;
        pattern = Pattern.compile("return\\w*\\(\"0\"\\w*\\+.*,(\\d*)\\).toString\\((\\d*)\\)\\).slice\\w*\\((-*\\d*)");
        matcher = pattern.matcher(b);
        if (matcher.find())
        {
            radixTo = Integer.parseInt(matcher.group(1));
            radixFrom = Integer.parseInt(matcher.group(2));
            offset = Integer.parseInt(matcher.group(3));
        }
        else
            throw new Exception("Nepodarilo se najit ciselny soustavy vypoctu");
            
        // vystupni ciselna soustava
        int radixOut = 0;
        pattern = Pattern.compile(".css\\(\"color\"\\)\\),\\s*(\\d+)\\)");  // .css("color")), __
        pattern2 = Pattern.compile("color\\)\\,\\s*(\\d+)\\)");   // var color = ...
        
        matcher = pattern.matcher(b);
        matcher2 = pattern2.matcher(b);
        if (matcher.find())
        {
            String tmp = matcher.group(1);
            radixOut = Integer.parseInt(tmp);
        }
        else if (matcher2.find())
        {
            String tmp = matcher2.group(1);
            radixOut = Integer.parseInt(tmp);
        }
        else
            throw new Exception("Nepodarilo se najit ciselny soustavy vypoctu");    
        
        Integer rc = Integer.parseInt(hlavniSpan.color.substring(0,2), 16);  
        Integer gc = Integer.parseInt(hlavniSpan.color.substring(2,4), 16);  
        Integer bc = Integer.parseInt(hlavniSpan.color.substring(4,6), 16); 
        String r1 = getRout(rc,radixTo, radixFrom, offset);
        String r2 = getRout(gc,radixTo, radixFrom, offset);
        String r3 = getRout(bc,radixTo, radixFrom, offset);
        String rout = r1+r2+r3;

        String sum = removeBadChars(rout, radixOut);
        sum = Integer.toString(Integer.parseInt(sum, radixOut));
        
        // naparsujem rovnici - pri necem jinem nez cislu/zavorce pouzijeme sum
        String rovnice = "";
        pattern = Pattern.compile("\\$\\(\"#\\w*\"\\)\\.val\\((.*)\\);");
        matcher = pattern.matcher(b);
        if (matcher.find())
        {
            rovnice = matcher.group(1);
        }
        else
            throw new Exception("Nepodarilo se naparsovat matematicky vyraz");
        
        String nahrazovanaCast = "";
        pattern = Pattern.compile("[+-/*]*(\\s*\\w+\\(.*,\\s*\\d*\\))");
        matcher = pattern.matcher(rovnice);
        if (matcher.find())
        {
            nahrazovanaCast = matcher.group(1);
        }
        else
            throw new Exception("Nepodarilo se naparsovat nahrazovanou cast matematickeho vyrazu");
        
        
        rovnice = rovnice.replace(nahrazovanaCast, sum);
        
        Calculable calc = new ExpressionBuilder(rovnice).build();
        Double res = calc.calculate();
        return res.intValue() + "";
    }
    
    private static String getRout(Integer color, int radixTo, int radixFrom, int offset)
    {
        String cout = removeBadChars(color.toString(), radixTo);

        if ("".equals(cout))
            return "aN";
        
        Integer c7 = Integer.parseInt(cout,radixTo);
        String c8 = "0" + Integer.toString(c7, radixFrom);
        return c8.substring(c8.length()+offset);
    }
    
    private static String removeBadChars(String str, int radix)
    {
        String cout = "";
        CharacterIterator it = new StringCharacterIterator(str);
        for (char ch=it.first(); ch != CharacterIterator.DONE; ch=it.next()) {
            if (Character.digit(ch, radix) != -1)
                cout += ch;
            else
                return cout;
        }
        return cout;
    }

    private class Span
    {
        private String name;
        private String color;
        Span(String name, String color)
        {
            this.name = name;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Span{" + "name=" + name + '}';
        }
        
        
    }
}
