/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Util.FrameOperation;
import View.PanelInicialView;
import View.PanelMenuView;
import View.PanelRankingView;
import View.PanelTabuleiroView;
import java.awt.Dimension;

/**
 *
 * @author Lufh
 */
public class PanelMenuControl extends AbstractControl{
    
    private final int dimensionWidth = 804;
    private final int dimensionHeight = 600;
    private final int locationX = 0;
    private final int locationY = 0;
    
    
    
    PanelMenuView view;
    public PanelMenuControl(PanelMenuView view){
         this.view = view;
    }
    

    @Override
    public void mostrarView() {
        
        FrameOperation.setView(view);
        FrameOperation.setMaximized(false);
        FrameOperation.setResizable(false);
        FrameOperation.setSize(new Dimension(dimensionWidth, dimensionHeight));

    }

    @Override
    public void viewAnterior() {
         new PanelInicialControl(new PanelInicialView()).mostrarView();
    }

    public void jogar() {
         PanelTabuleiroControl tabController = new PanelTabuleiroControl(new PanelTabuleiroView());
         tabController.mostrarView();
    }

    public void ranking() {
        PanelRankingControl rankingControl = new PanelRankingControl(new PanelRankingView());
        rankingControl.mostrarView();
    }

}
