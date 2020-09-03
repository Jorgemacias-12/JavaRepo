package com.jamz.SplashScreen;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;


/** -------------------------------------------
        @author: JAMZ    

        File: SplashScreen.java
        Date: 3/09/2020 
        Time: 12:28:56 PM
        
        Purpose: Ejemplo de como iniciar una aplicación
        * con una barra de progreso.

   
    -------------------------------------------*/  

public class SplashScreen extends JFrame{
   
    private static int tempCounter = 0;
    private static Timer timer;
    
    public static void initApplication(JProgressBar progress, boolean paintProgress){
        ActionListener ac = (ActionListener) ->{
            if(paintProgress){
               progress.setStringPainted(true);
               progress.setString((tempCounter++)+"%");
               progress.setValue(tempCounter++);
               progress.setForeground(new java.awt.Color(6,176,37));
            }else{
               progress.setValue(tempCounter++);
            }
            if(progress.getValue()  == 100){
                timer.stop();
            }
        };
        timer = new Timer(100, ac);
        timer.start();
    }
    
}