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
public class EmailNotRequiredInputVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String regex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+"
                + ")*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(
                ((javax.swing.JTextField)input).getText());
        
        if ( ((javax.swing.JTextField)input).getText() == null ||
                ((javax.swing.JTextField)input).getText().isBlank() ||
                ((javax.swing.JTextField)input).getText().isEmpty() ) {
            return true;
        } else {
            return matcher.matches();   
        }
    }
    
}
