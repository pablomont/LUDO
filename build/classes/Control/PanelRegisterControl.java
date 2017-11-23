/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Util.FrameOperation;
import View.PanelInicialView;
import View.PanelRegisterView;

/**
 *
 * @author paabl
 */
public class PanelRegisterControl extends AbstractControl{

    PanelRegisterView view;
    
    public PanelRegisterControl(PanelRegisterView view) {
        this.view = view;
    }

    @Override
    public void mostrarView() {
         FrameOperation.setView(view);
         FrameOperation.setMaximized(false);
    }

    @Override
    public void viewAnterior() {
         new PanelInicialControl(new PanelInicialView()).mostrarView();
    }
    
}
