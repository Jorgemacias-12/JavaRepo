package com.jamz.dragAndDropUndecorated;

import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
    @author: Jorge Antonio Macias Zambrano
    File: undecoratedWindow.java
    Date: 6/09/2020
    Time: 01:12:41 PM

    Purpose:

*/

public class undecoratedWindow {
    /**
     * Posicion en X antes de mover el frame.
    */
    int oldXpos;
    /**
     * Posicion en Y antes de mover el frame.
     */
    int oldYpos;
    /**
     * Nueva posicion en X.
    */
    int newXpos;
    /**
     * Nueva posicion en Y.
     */
    int newYpos;
    
    /**
     * 
     * @param frame Ventana que se va a mover.
     * @param evt Evento de mouse.
     */
    public void mouseDragged(JFrame frame, MouseEvent evt)
    {
        newXpos = evt.getXOnScreen();
        newYpos = evt.getYOnScreen();
        frame.setLocation(newXpos - oldXpos, newYpos - oldYpos);
    }
    
    /**
     * 
     * @param evt Evento de mouse.
     */
    public void mousePressed(MouseEvent evt)
    {
        oldXpos = evt.getX();
        oldYpos = evt.getY();
    }
    
}
