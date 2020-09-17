package com.jamz.validations;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

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
    /**
     * Indica que se pueden introducir letras y/o caracteres
     * especiales.
     */
    public static int ONLY_WORDS_WITH_SPECIAL_CHARACTERS = 2;
    
    public static int WORDS_AND_NUMBERS_WITHOUT_SPECIAL_CHARACTERS = 3;
    
    private static char[] specialCharacters = 
        {'°', '|', '!', '"', '#', '$', '%', 
        '&', '/', '(', ')', '=', '\'', '?', '¿', '¡', '¨', '*', '´', '+', '{',
        '}', '[', ']', '^', '`', '~', '\\', ',', ';', '.', ':', '-', '_','@'
        ,'<','>'};
    
    /**
     * Constructor de la clase.
     */
    public TextField() {
        
    }
    
    public static void ValidateAndLimitField(int typeOfValidation, KeyEvent evt
    , int CharacterLimit, JTextField inputField)
    {
        ValidateFieldInput(typeOfValidation, evt);
        LimitInput(CharacterLimit, inputField, evt);
    }
    
    /**
     *
     * @param option Tipo validación que se llevara a cabo.
     * @param evt Evento del componente
     */
    public static void ValidateFieldInput(int option, java.awt.event.KeyEvent evt){
        switch(option)
        {
            case 0:
                if(Character.isLetter(evt.getKeyChar()))
                {
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
                else
                {
                    for (char tempChar : specialCharacters)
                    {
                        if(tempChar == evt.getKeyChar())
                        {
                            evt.consume();
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
                break;
            case 1:
                if(Character.isDigit(evt.getKeyChar()))
                {
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
                else
                {
                    for(char tempChar : specialCharacters)
                    {
                        if(tempChar == evt.getKeyChar())
                        {
                            evt.consume();
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
                break;
            case 2: 
                if(Character.isDigit(evt.getKeyChar()))
                {
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
                break;
            case 3:
                for(char tempChar : specialCharacters)
                {
                    if(tempChar == evt.getKeyChar())
                    {
                        evt.consume();
                        Toolkit.getDefaultToolkit().beep();
                    }
                }
        }
    }
    
    /**
     * @param limit Cuantos caracteres se pueden introducir en el campo
     * de texto.
     * @param field campo de texto a limitar.
     * @param evt Evento del campo de texto a limitar.
     */
    public static void LimitInput(int limit, JTextField field, java.awt.event.KeyEvent evt){
        if(field.getText().length() >= limit){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
