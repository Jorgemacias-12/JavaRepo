package com.jamz.fullScreen;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

/**
    @author: Jorge Antonio Macias Zambrano
    File: screenManiputaltion.java
    Date: 6/09/2020
    Time: 02:13:38 PM

    Purpose:

*/

public class screenManipulation {
    
    private final GraphicsDevice device;
    
    public screenManipulation()
    {
        device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    }
    
    public void setFullScreen(boolean isFullScreenAllowed, JFrame frame)
    {
        if(isFullScreenAllowed && device.isFullScreenSupported())
        {
            device.setFullScreenWindow(frame);
        }
        else
        {
            device.setFullScreenWindow(null);
        }
    }
    
    
}
