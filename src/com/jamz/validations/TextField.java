package com.jamz.validations;

import java.awt.Toolkit;

/**
 * -------------------------------------------
 *
 * @author: JAMZ  *
 * File: TextField.java Date: 3/09/2020 Time: 10:18:41 AM
 *
 * Purpose: Esta clase nos permite validar la entrada del usuario.
 *
 * -------------------------------------------
 */
public class TextField {

    /**
     * Indica que solo se deben introducir numeros.
     */
    public static int ONLY_NUMBERS = 0;
    /**
     * Indica que solo se deben introducir letras.
     */
    public static int ONLY_WORDS = 1;
    
    private static char[] specialCharacters = 
        {'°', '|', '!', '"', '#', '$', '%', 
        '&', '/', '(', ')', '=', '\'', '?', '¿', '¡', '¨', '*', '´', '+', '{',
        '}', '[', ']', '^', '`', '~', '\\', ',', ';', '.', ':', '-', '_','@'};;
    
    /**
     * Constructor de la clase.
     */
    public TextField() {
        TextField.specialCharacters = new char[]{'°', '|', '!', '"', '#', '$', '%', 
        '&', '/', '(', ')', '=', '\'', '?', '¿', '¡', '¨', '*', '´', '+', '{',
        '}', '[', ']', '^', '`', '~', '\\', ',', ';', '.', ':', '-', '_','@'};
    }
    
    /**
     *
     * @param option Tipo validación que se llevara a cabo.
     * @param evt Evento del componente
     */
    public static void ValidateFieldInput(int option, java.awt.event.KeyEvent evt){
        switch(option){
            case 0:
                if(Character.isLetter(evt.getKeyChar())){
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                }else{
                    for (char tempChar : specialCharacters) {
                        if(tempChar == evt.getKeyChar()){
                            evt.consume();
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
                break;
            case 1:
                if(Character.isDigit(evt.getKeyChar())){
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
                break;
        }
    }
    
    /**
     * @param characters Cuantos caracteres se pueden introducir en el campo
     * de texto.
     */
    public static void LimitInput(int characters){
        
    }
}
