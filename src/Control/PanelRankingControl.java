/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Util.FrameOperation;
import View.PanelMenuView;
import View.PanelRankingView;
import java.awt.Dimension;

/**
 *
 * @author paabl
 */
public class PanelRankingControl extends AbstractControl{

    private final int dimensionWidth = 804;
    private final int dimensionHeight = 600;
    private final int locationX = 0;
    private final int locationY = 0;
    private PanelRankingView view;
    
    public PanelRankingControl(PanelRankingView view){
    
        this.view = view;
    }
    
    
    @Override
    public void mostrarView() {
         FrameOperation.setView(view);
        FrameOperation.setMaximized(false);
        FrameOperation.setResizable(false);
        FrameOperation.setSize(new Dimension(dimensionWidth, dimensionHeight));
        FrameOperation.setCenter(true);
    }

    @Override
    public void viewAnterior() {
        new PanelMenuControl(new PanelMenuView()).mostrarView();
    }
    
}
