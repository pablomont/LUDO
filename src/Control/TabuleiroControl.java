/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Jogador;
import Util.FrameOperation;
import View.PanelInicialView;
import View.PanelTabuleiroView;


/**
 *
 * @author paabl
 */
public class TabuleiroControl extends AbstractControl{
    
    PanelTabuleiroView view;

    public Jogador[] jogadores;
    public int jogadorDaVez = 0;
    
    public TabuleiroControl(PanelTabuleiroView view) {
        this.view = view;
        jogadores = new Jogador[]{
            new Jogador(),
            new Jogador(),
            new Jogador(),
            new Jogador() 
        };
    }         
    
    public void jogar(){
        
        
        if(jogadorDaVez > 3)
            jogadorDaVez = 0;
        
       jogadores[jogadorDaVez].jogar();
       jogadorDaVez++;
    }

    @Override
    public void mostrarView() {
        FrameOperation.setView(view);
        FrameOperation.setMaximized(true);
        FrameOperation.setResizable(true);
    }

    @Override
    public void viewAnterior() {
       FrameOperation.setView(new PanelInicialView());
       FrameOperation.setMaximized(false);
       FrameOperation.setResizable(false);
    }
    
    
}
