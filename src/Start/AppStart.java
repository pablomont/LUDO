/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

import Control.PanelInicialControl;
import Util.FrameOperation;
import View.FramePrincipal;
import View.PanelInicialView;

/**
 *
 * @author paabl
 */
public class AppStart {
    public static void main(String[] args){
        
//        new Thread(() -> {
//            FramePrincipal f = new FramePrincipal();
//            f.setVisible(true);
//            f.setPanel(new PanelInicialView(f));
//        }).start();
        
            
           // new FrameOperation(new PanelInicialView());
            new FrameOperation();
            PanelInicialControl control = new PanelInicialControl(new PanelInicialView());
            control.mostrarView();
            
    }
}
