/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.FramePrincipal;
import View.PanelInicialView;
import View.TabuleiroVIew2;

/**
 *
 * @author paabl
 */
public class PanelInicialControl {

    PanelInicialView view;

    public PanelInicialControl(PanelInicialView view) {
        this.view = view;
    }

   
    
    public void login() {
        
    }

    public void register() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void guest() {
        FramePrincipal f = (FramePrincipal)view.getParent();
        f.setContentPane(new TabuleiroVIew2());
    }
    
    
}
