package com.jamz.Images;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * This class can resize Images
 * 
 */

public class reScale
{
    
    /**
     * Class variables.
     */
    
    
    /**
     * Classes constructors.
     */
    public reScale()
    {

    }
    //
    
    
    public ImageIcon scaleImageIcon(File file, int newWidth, int newHeight)
    {
        try {
            Image image = ImageIO.read(file);
            return new ImageIcon(image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));
        } catch (IOException ex) {
            Logger.getLogger(reScale.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
