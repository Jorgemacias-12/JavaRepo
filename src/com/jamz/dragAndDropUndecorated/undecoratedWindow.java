package com.jamz.dragAndDropUndecorated;

/**
    @author: Jorge Antonio Macias Zambrano
    File: undecoratedWindow.java
    Date: 6/09/2020
    Time: 01:12:41 PM

    Purpose:

*/

public class undecoratedWindow {
    
    int oldXpos;
    int oldYpos;
    int newXpos;
    int newYpos;
    
    public void mouseDragged(java.awt.event.MouseEvent evt)
    {
        oldXpos = evt.getX();
        oldYpos = evt.getY();
    }
    
    public void mousePressed(javax.swing.JFrame frame, java.awt.
    event.MouseEvent evt)
    {
        newXpos = evt.getXOnScreen();
        newYpos = evt.getYOnScreen();
        frame.setLocation(newXpos - oldXpos, newYpos - oldYpos);
    }
    
}
