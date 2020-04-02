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
public class TextRequiredInputVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        return ((javax.swing.JTextField)input).getText() != null &&
                !((javax.swing.JTextField)input).getText().isBlank() &&
                !((javax.swing.JTextField)input).getText().isEmpty();
    }
    
}
