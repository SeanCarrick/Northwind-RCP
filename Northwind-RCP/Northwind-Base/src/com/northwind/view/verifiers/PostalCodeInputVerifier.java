/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.view.verifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 */
public class PostalCodeInputVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String canRegEx = "^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$";
        String usRegEx = "^[0-9]{5}(?:-[0-9]{4})?$";
        
        Pattern usPattern = Pattern.compile(usRegEx);
        Pattern canPattern = Pattern.compile(canRegEx);
        
        Matcher matcher = usPattern.matcher(
                ((javax.swing.JTextField)input).getText());
        
        if ( matcher.matches() ) {
            return true;
        } else {
            matcher = canPattern.matcher(
                    ((javax.swing.JTextField)input).getText());
            
            if ( matcher.matches() ) {
                return true;
            }
        }
        
        return false;
    }
    
}
