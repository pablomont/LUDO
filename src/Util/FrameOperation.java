/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import View.FramePrincipal;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import static java.awt.Frame.NORMAL;
import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author paabl
 */
public class FrameOperation {
    
    public static FramePrincipal mainFrame;
     
    public FrameOperation(){
        mainFrame = new FramePrincipal();
        mainFrame.setVisible(true);
    }
    
    public FrameOperation(JPanel view){
        mainFrame = new FramePrincipal();
        mainFrame.setVisible(true);
        setView(view);
    } 
    
    public static void setLocation(Point p){
        mainFrame.setLocation(p);
    }
    
    public static void setSize(Dimension d){
        mainFrame.setSize(d);
    }
    
    //setExtendedState(MAXIMIZED_BOTH);
    public static void setMaximized(boolean valor){
        if(valor)
            mainFrame.setExtendedState(MAXIMIZED_BOTH);
        else{
            mainFrame.setExtendedState(NORMAL);
        }
    }
      
    public static void setResizable(boolean valor){
        mainFrame.setResizable(valor);
    }
    
    public static void setView(JPanel view){
        view.setVisible(true);
        mainFrame.setContentPane(view);
        mainFrame.revalidate();  
    }
    
    public static void sair() {
        System.exit(0);
    } 
}
