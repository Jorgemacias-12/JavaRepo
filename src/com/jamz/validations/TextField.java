package com.jamz.validations;

/**
 * -------------------------------------------
 *
 * @author: JAMZ  *
 * File: TextField.java Date: 3/09/2020 Time: 10:18:41 AM
 *
 * Purpose: Esta clase  *
 *
 * -------------------------------------------
 */
public class TextField {

    public static int ONLY_NUMBERS = 0;
    public static int ONLY_WORDS = 1;
    
    private final char[] specialCharacters;
    
    public TextField() {
        this.specialCharacters = new char[]{'°', '|', '!', '"', '#', '$', '%', '&', '/', '(', ')', '=', '\'', '?', '¿', '¡', '¨', '*', '´', '+', '{', '}', '[', ']', '^', '`', '~', '\\', ',', ';', '.', ':', '-', '_'};
    }
    
    /**
     * 
     * @param option Validación que se llevara a cabo.
     * @param evt Evento del componente
     */
    public static void ValidateFieldInput(int option, java.awt.event.KeyEvent evt){
        switch(option){
            
        }
    }
    
}
