/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.nuc.vodafoneparkproofcodegenerator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mist
 */
public class Main {
    public static void main(String[] args) {
        String span = "<span style=\"display:none\"><style type=\"text/css\">.pfh{color:#7598EA;display:none;}.pf5{color:#897367;display:none;}.pf3{color:#985365;display:none;}.pf0{color:#625381;display:none;}</style><span class=\"pf0\"></span><span class=\"pf3\"></span><span class=\"pf5\"></span><span class=\"pfh\"></span><script type=\"text/javascript\">for(var a=eval,b=\'8 21(4){20 10=4.18(/^22\\\\((\\\\6+),\\\\19*(\\\\6+),\\\\19*(\\\\6+)\\\\)$/);24(10===25){4=4.18(/^#(..)(..)(..)$/);$.26(4,8(12,13){4[12]=9(13,16)})}23{4=10}8 5(14){17(\"0\"+9(14,7).31(16)).27(-2)}17 5(4[1])+5(4[2])+5(4[3])}20 11=$(\".32\").29(\"11\");$(\"#28\").30(15+9(21(11),16)-15);\',c=33,d=\"    pf5 pfh d  function parseInt pf6 color index value x 9  return match s var pf3 rgb else if null each slice id1a css val toString pf0\".split(\" \");c--;)d[c]&&(b=b.replace(RegExp(\"\\\\b\"+c+\"\\\\b\",\"g\"),d[c]));a(b);</script></span>";
        VodafoneParkProofCodeGenerator x = new VodafoneParkProofCodeGenerator();
        try {
            System.out.println("vf-park - " + x.getProofCode(span));
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
