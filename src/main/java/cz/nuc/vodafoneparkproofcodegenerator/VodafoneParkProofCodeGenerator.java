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
    public static void main(String[] args) {
        // 108
        String span1 = "<span style=\"display:none\"><style type=\"text/css\">.pfw{color:#9AA624;display:none;}.pfd{color:#9570E9;display:none;}.pfc{color:#7536DE;display:none;}.pf3{color:#985365;display:none;}</style><span class=\"pf3\"></span><span class=\"pfc\"></span><span class=\"pfd\"></span><span class=\"pfw\"></span><script type=\"text/javascript\">for(var a=alert,b='11 20(6){25 13=6.14(/^26\\((\\12+),\\18*(\\12+),\\18*(\\12+)\\)$/);24(13===27){6=6.14(/^#(..)(..)(..)$/);$.28(6,11(17,15){6[17]=10(15,16)})}23{6=13}11 7(19){22(\"0\"+10(19,5).29(3)).30(-2)}22 7(6[1])+7(6[2])+7(6[3])}$(\"#31\").32(21+8*(9+3)+9-21+10(20($(\".6\").33(\"34\")),4));',c=35,d=\"      pf3 pfc   parseInt function d pfw match value  index s x pfd 6656 return else if var rgb null each toString slice id40 val css color\".split(\" \");c--;)d[c]&&(b=b.replace(RegExp(\"\\\\b\"+c+\"\\\\b\",\"g\"),d[c])); a(b);</script></span>";
        // 9000781
        String span2 = "<span style=\"display:none\"><style type=\"text/css\">.pfb{color:#95F852;display:none;}.pf8{color:#953856;display:none;}.pf7{color:#976431;display:none;}.pf4{color:#589017;display:none;}.pf3{color:#985365;display:none;}.pf2{color:#895746;display:none;}</style><span class=\"pf2\"></span><span class=\"pf3\"></span><span class=\"pf4\"></span><span class=\"pf7\"></span><span class=\"pf8\"></span><span class=\"pfb\"></span><script type=\"text/javascript\">for(var a=eval,b='11 14=7(24,9){15 25(24,9)};7 27(4){11 13=4.20(/^32\\((\\12+),\\18*(\\12+),\\18*(\\12+)\\)$/);34(13===29){4=4.20(/^#(..)(..)(..)$/);$.35(4,7(23,22){4[23]=25(22,16)})}30{4=13}7 6(21){15(\"0\"+14(21,10).36(16)).31(-2)}15 6(4[1])+6(4[2])+6(4[3])}11 17=$(\".9\").33(\"17\");$(\"#37\").28(19+14(27(17),16)+5-8*3+26-19);',c=38,d=\"    pf8  pf7 function  pf2  var d pfh pf3 return  color s 3758 match x value index pfb parseInt  pf4 val null else slice rgb css if each toString id72\".split(\" \");c--;)d[c]&& (b=b.replace(RegExp(\"\\\\b\"+c+\"\\\\b\",\"g\"),d[c]));a(b);</script></span>";
        // 1877
        String span3 = "<span style=\"display:none\"><style type=\"text/css\">.pfx{color:#95360C;display:none;}.pfu{color:#0953F3;display:none;}.pfi{color:#856327;display:none;}.pfi{color:#956A96;display:none;}.pfd{color:#9570E9;display:none;}.pfa{color:#97A957;display:none;}</style><span class=\"pfa\"></span><span class=\"pfd\"></span><span class=\"pfi\"></span><span class=\"pfu\"></span><span class=\"pfx\"></span><script type=\"text/javascript\">for(var a=eval,b='6 20(4){23 13=4.19(/^22\\((\\12+),\\21*(\\12+),\\21*(\\12+)\\)$/);24(13===25){4=4.19(/^#(..)(..)(..)$/);$.26(4,6(14,15){4[14]=10(15,16)})}27{4=13}6 5(17){18(\"0\"+10(17,7).28(8)).32(-2)}18 5(4[1])+5(4[2])+5(4[3])}$(\"#31\").34(11+10(20($(\".30\").29(\"33\")),9)-11*2+11);',c=35,d=\"    pfu pfx function    parseInt 1340393476172 d pfd index value  x return match pfi s rgb var if null each else toString css pfa id4 slice color val\".split(\" \");c--;)d[c]&&(b=b.replace(RegExp(\"\\\\b\"+c+\"\\\\b\",\"g\"),d[c])); a(b);</script></span>";
        // 12
        String span4 = "<span style=\"display:none\"><style type=\"text/css\">.pfy{color:#563765;display:none;}.pfr{color:#976348;display:none;}.pfg{color:#95E647;display:none;}.pfd{color:#9570E9;display:none;}.pf4{color:#589017;display:none;}</style><span class=\"pf4\"></span><span class=\"pfd\"></span><span class=\"pfg\"></span><span class=\"pfr\"></span><span class=\"pfy\"></span><script type=\"text/javascript\">for(var a=eval,b=\'11 19(4){24 10=4.12(/^28\\\\((\\\\6+),\\\\18*(\\\\6+),\\\\18*(\\\\6+)\\\\)$/);27(10===23){4=4.12(/^#(..)(..)(..)$/);$.25(4,11(15,17){4[15]=7(17,16)})}22{4=10}11 5(14){13(\"0\"+7(14,9).31(8)).30(-2)}13 5(4[1])+5(4[2])+5(4[3])}$(\"#33\").29(20+9*7(19($(\".32\").26(\"21\")),3)+3-(20)*1);\',c=34,d=\"    pfg pfr d parseInt   pf4 function match return x index  value s pfy 1340835696656 color else null var each css if rgb val slice toString pfd idf\".split(\" \");c--;)d[c]&&(b=b.replace(RegExp(\"\\\\b\"+c+\"\\\\b\",\"g\"),d[c])); a(b);</script></span>";
        // 3283
        String span5 = "<span style=\"display:none\"><style type=\"text/css\">.pfw{color:#9AA624;display:none;}.pfj{color:#985552;display:none;}.pfi{color:#856327;display:none;}.pfj{color:#302459;display:none;}.pfi{color:#956A96;display:none;}.pfc{color:#7536DE;display:none;}.pfb{color:#95F852;display:none;}</style><span class=\"pfb\"></span><span class=\"pfc\"></span><span class=\"pfi\"></span><span class=\"pfj\"></span><span class=\"pfw\"></span><script type=\"text/javascript\">for(var a=eval,b=\'11 17(6){24 12=6.13(/^25\\\\((\\\\10+),\\\\20*(\\\\10+),\\\\20*(\\\\10+)\\\\)$/);26(12===23){6=6.13(/^#(..)(..)(..)$/);$.27(6,11(15,14){6[15]=8(14,16)})}22{6=12}11 7(18){21(\"0\"+8(18,9).28(4)).32(-2)}21 7(6[1])+7(6[2])+7(6[3])}$(\"#31\").34(19+5*8(17($(\".30\").29(\"33\")),5)-19-4+2);\',c=35,d=\"      pfi pfb parseInt  d function pfj match value index  pfw x 1340868799116 s return else null var rgb if each toString css pfc id4 slice color val\".split(\" \");c--;)d[c]&&(b=b.replace(RegExp(\"\\\\b\"+c+\"\\\\b\",\"g\"),d[c])); a(b);</script></span>";
        // 10
        String span6 = "<span style=\"display:none\"><style type=\"text/css\">.pfh{color:#7598EA;display:none;}.pf5{color:#897367;display:none;}.pf3{color:#985365;display:none;}.pf0{color:#625381;display:none;}</style><span class=\"pf0\"></span><span class=\"pf3\"></span><span class=\"pf5\"></span><span class=\"pfh\"></span><script type=\"text/javascript\">for(var a=eval,b=\'8 21(4){20 10=4.18(/^22\\\\((\\\\6+),\\\\19*(\\\\6+),\\\\19*(\\\\6+)\\\\)$/);24(10===25){4=4.18(/^#(..)(..)(..)$/);$.26(4,8(12,13){4[12]=9(13,16)})}23{4=10}8 5(14){17(\"0\"+9(14,7).31(16)).27(-2)}17 5(4[1])+5(4[2])+5(4[3])}20 11=$(\".32\").29(\"11\");$(\"#28\").30(15+9(21(11),16)-15);\',c=33,d=\"    pf5 pfh d  function parseInt pf6 color index value x 205  return match s var pf3 rgb else if null each slice id4 css val toString pf0\".split(\" \");c--;)d[c]&&(b=b.replace(RegExp(\"\\\\b\"+c+\"\\\\b\",\"g\"),d[c]));a(b);</script></span>";
        
        VodafoneParkProofCodeGenerator x = new VodafoneParkProofCodeGenerator();
        try {
            System.out.println("106 - " + x.getProofCode(span1));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("9000781 - " + x.getProofCode(span2));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("1877 - " + x.getProofCode(span3));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("12 - " + x.getProofCode(span4));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println("3283 - " + x.getProofCode(span5));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("10 - " + x.getProofCode(span6));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
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
