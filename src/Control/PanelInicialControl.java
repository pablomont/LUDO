/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Util.FrameOperation;
import View.PanelInicialView;
import View.PanelRegisterView;
import View.PanelTabuleiroView;




/**
 *
 * @author paabl
 */
public class PanelInicialControl extends AbstractControl{

    PanelInicialView view;

    public PanelInicialControl(PanelInicialView view) {
        this.view = view;
    }

    public void login() {
        
    }

    public void register() {
        PanelRegisterControl regController = new PanelRegisterControl(new PanelRegisterView());
        regController.mostrarView();
    }

    public void guest() {
        TabuleiroControl tabController = new TabuleiroControl(new PanelTabuleiroView());
        tabController.mostrarView();
    }

    @Override
    public void mostrarView() {
        FrameOperation.setView(view);
        FrameOperation.setMaximized(false);
        FrameOperation.setResizable(false);
    }

    @Override
    public void viewAnterior() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
