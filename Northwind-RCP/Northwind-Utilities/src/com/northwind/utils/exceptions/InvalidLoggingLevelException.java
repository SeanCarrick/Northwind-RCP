/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.northwind.utils.exceptions;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class InvalidLoggingLevelException extends Exception {

    /**
     * Creates a new instance of <code>InvalidLoggingLevelException</code> without detail message.
     */
    public InvalidLoggingLevelException() {
    }


    /**
     * Constructs an instance of <code>InvalidLoggingLevelException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public InvalidLoggingLevelException(String msg) {
        super(msg);
    }
}
