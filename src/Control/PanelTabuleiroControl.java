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
import java.awt.Dimension;
import java.awt.Point;


/**
 *
 * @author paabl
 */
public class PanelTabuleiroControl extends AbstractControl{
    
    PanelTabuleiroView view;

    public Jogador[] jogadores;
    public int jogadorDaVez = 0;
    
    public PanelTabuleiroControl(PanelTabuleiroView view) {
        this.view = view;
        jogadores = new Jogador[]{
            new Jogador(),
            new Jogador(),
            new Jogador(),
            new Jogador() 
        };
    }         
    
    public void lancarDado(Jogador.DadoEscolhido dado){
        
        if(jogadorDaVez > 3)
            jogadorDaVez = 0;
       
       jogadores[jogadorDaVez].lancarDado(dado);
       jogadorDaVez++;
    }
    
    public void lancarDados(){
         if(jogadorDaVez > 3)
            jogadorDaVez = 0;
       
       jogadores[jogadorDaVez].lancarDados();
       jogadorDaVez++;
    
    }

    @Override
    public void mostrarView() {
        FrameOperation.setView(view);
        FrameOperation.setMaximized(false);
        FrameOperation.setResizable(false);
        FrameOperation.setSize(new Dimension(1271,833));
        FrameOperation.setLocation(new Point(80,20));
    }

    @Override
    public void viewAnterior() {
       new PanelInicialControl(new PanelInicialView()).mostrarView();
    }
    
    
}
