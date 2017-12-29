/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

import Control.PanelInicialControl;
import Util.DadoTimerTask;
import Util.FrameOperation;
import View.PanelInicialView;
import data.DataBase;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import songs.TocarSom;

/**
 *
 * @author paabl
 */
public class AppStart {
    
    
    public static void main(String[] args){
         
           DataBase data = new DataBase();
           data.createDataBase();
//        new Thread(() -> {
//            FramePrincipal f = new FramePrincipal();
//            f.setVisible(true);
//            f.setPanel(new PanelInicialView(f));
//        }).start();
       
//        try {
//            TocarSom t = new TocarSom();
//            t.tocaSom("trilha_decorrente.wav");
//        } catch (IOException ex) {
//            Logger.getLogger(DadoTimerTask.class.getName()).log(Level.SEVERE, null, ex);
//        }
   
           // new FrameOperation(new PanelInicialView());
            new FrameOperation();
            PanelInicialControl control = new PanelInicialControl(new PanelInicialView());
            control.mostrarView();
            
    }
}
