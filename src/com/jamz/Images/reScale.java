package com.jamz.Images;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/** -------------------------------------------
        @author: JAMZ    

        File: reScale.java
        Date: 4/09/2020 
        Time: 09:34:59 AM
        
        Purpose: redimensionar imagenes.

   
    -------------------------------------------*/  

public class reScale {
    
    /**
     * 
     * @param file   archivo (imagen)
     * @param width  nuevo ancho
     * @param height nuevo alto
     * @return ImageIcon redimensionado 
     */
    public static ImageIcon scaleImg(File file, int width, int height){
        try {
            Image image = ImageIO.read(file);
            return new ImageIcon(image.getScaledInstance(width, height, Image.SCALE_SMOOTH));
        } catch (IOException ex) {
            Logger.getLogger(reScale.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
