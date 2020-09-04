package com.jamz.regularExpresions;

/** -------------------------------------------
        @author: JAMZ    

        File: stringValidations.java
        Date: 3/09/2020 
        Time: 04:09:03 PM
        
        Purpose: validar la entrada del usuario
        * dependiendo del método requerido.

    -------------------------------------------*/  

public class stringValidations {
    /**
     * @param input entrada de tipo String (texto).
     * @return Valor verdadero o falso dependiendo de la entrada.
     */
    public static boolean ValidateCURP(String input) {
        return input.matches("^[A-Z]{4}[\\d]{6}([H]|[M])(AS|BC|BS|CC|CL|CS|CM|CH|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)[A-Z]{3}(\\w){2}$");
    }
}
