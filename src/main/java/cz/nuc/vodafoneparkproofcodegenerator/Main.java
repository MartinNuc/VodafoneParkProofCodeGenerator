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
        String span = "<span style=\"display:none\"><style type=\"text/css\">.pfb{color:#95F852;display:none;}.pf8{color:#953856;display:none;}.pf7{color:#976431;display:none;}.pf4{color:#589017;display:none;}.pf3{color:#985365;display:none;}.pf2{color:#895746;display:none;}</style><span class=\"pf2\"></span><span class=\"pf3\"></span><span class=\"pf4\"></span><span class=\"pf7\"></span><span class=\"pf8\"></span><span class=\"pfb\"></span><script type=\"text/javascript\">for(var a=eval,b=\'11 14=7(24,9){15 25(24,9)};7 27(4){11 13=4.20(/^32\\\\((\\\\12+),\\\\18*(\\\\12+),\\\\18*(\\\\12+)\\\\)$/);34(13===29){4=4.20(/^#(..)(..)(..)$/);$.35(4,7(23,22){4[23]=25(22,16)})}30{4=13}7 6(21){15(\"0\"+14(21,10).36(16)).31(-2)}15 6(4[1])+6(4[2])+6(4[3])}11 17=$(\".9\").33(\"17\");$(\"#37\").28(19+14(27(17),16)+5-8*3+26-19);\',c=38,d=\"    pf8  pf7 function  pf2  var d pfh pf3 return  color s 13 match x value index pfb parseInt  pf4 val null else slice rgb css if each toString idf\".split(\" \");c--;)d[c]&& (b=b.replace(RegExp(\"\\\\b\"+c+\"\\\\b\",\"g\"),d[c]));a(b);</script></span>";
        VodafoneParkProofCodeGenerator x = new VodafoneParkProofCodeGenerator();
        try {
            System.out.println("vf-park - " + x.getProofCode(span));
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
