package com.jamz.graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
    @author: Jorge Antonio Macias Zambrano
    File: drawManager.java
    Date: 6/09/2020
    Time: 05:33:59 PM

    Purpose: Esta clase se expone como podemos dibujar lineas y/o figuras
    * geometricas en un Panel.

*/

public class drawManager extends JPanel{

    public drawManager()
    {
        
    }
    
    @Override
    public void paint(Graphics g)
    {
        
        g.setColor(Color.black);
        g.drawLine(100,100,30,60);
        g.drawRect(100,100,300,300);
        g.drawRoundRect(600, 600, 200, 200, 50, 50);
        g.drawOval(400, 250, 300, 300);
        int[] xPoints = {500,550,450};
        int[] yPoints = {70,120,120};
        g.drawPolygon(xPoints, yPoints, 3);
        g.drawString("El día que te conocí, fue el mejor xd.", 500, 30);
    }
    
}
