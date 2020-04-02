/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.view.verifiers;

import javax.swing.InputVerifier;
import javax.swing.JComponent;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 */
public class StateOrProvinceInputVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((javax.swing.JTextField)input).getText();
        
        switch ( text.toLowerCase() ) {
            case "al":
            case "ak":
            case "az":
            case "ar":
            case "ca":
            case "co":
            case "ct":
            case "de":
            case "fl":
            case "ga":
            case "hi":
            case "id":
            case "il":
            case "in":
            case "ia":
            case "ks":
            case "ky":
            case "la":
            case "me":
            case "md":
            case "ma":
            case "mi":
            case "mn":
            case "ms":
            case "mo":
            case "mt":
            case "ne":
            case "nv":
            case "nh":
            case "nj":
            case "nm":
            case "ny":
            case "nc":
            case "nd":
            case "oh":
            case "ok":
            case "or":
            case "pa":
            case "ri":
            case "sc":
            case "sd":
            case "tn":
            case "tx":
            case "ut":
            case "vt":
            case "va":
            case "wa":
            case "wv":
            case "wi":
            case "wy":
            case "dc":
            case "ab":
            case "bc":
            case "mb":
            case "nb":
            case "nf":
            case "nt":
            case "ns":
            case "nu":
            case "on":
            case "pe":
            case "qc":
            case "pq":
            case "sk":
            case "yt":
                return true;
            default:
                return false;
        }
    }
    
}
