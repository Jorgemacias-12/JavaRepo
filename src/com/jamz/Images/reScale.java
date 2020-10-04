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
    
    /*
        Public non static methods.
    */
    
    /**
     * This function allow to resize an ImageIcon, using a file object how
     * to input.
     * @param file A file object with the route of the selected image.
     * @param newWidth The new width of the image.
     * @param newHeight The new height of the image.
     * @return  Returns resized image.
     */
    public ImageIcon scaleImageIcon(File file, int newWidth, int newHeight)
    {
        try 
        {
            Image image = ImageIO.read(file);
            return new ImageIcon(image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(reScale.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /*
        Public static methods.
    */
    
}
