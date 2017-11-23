/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import static Control.PanelTabuleiroControl.jogadorDaVez.AMARELO;
import static Control.PanelTabuleiroControl.jogadorDaVez.AZUL;
import static Control.PanelTabuleiroControl.jogadorDaVez.VERDE;
import static Control.PanelTabuleiroControl.jogadorDaVez.VERMELHO;
import Model.Jogador;
import Util.FrameOperation;
import View.PanelInicialView;
import View.PanelTabuleiroView;
import java.awt.Dimension;
import java.awt.Point;
import java.util.Random;


/**
 *
 * @author paabl
 */
public class PanelTabuleiroControl extends AbstractControl{
    private final Random randomGenerator;
    PanelTabuleiroView view;

    public int jogaMaquina() {
        int escolha = randomGenerator.nextInt(3)+1;
        
        switch(escolha){
    
            case 1:  lancarDado(Jogador.DadoEscolhido.DadoUm);break;
            case 2:  lancarDado(Jogador.DadoEscolhido.DadoDois);break;
            case 3:  lancarDados();
        }
        
        return escolha;
    }

    public enum jogadorDaVez {
       AMARELO, VERDE, AZUL, VERMELHO;
    }
    
    
    private Jogador[] jogadores;
    private int jogadorDaVez = 0;

    public jogadorDaVez getJogadorDaVez() {
        if(jogadorDaVez > 3)
            jogadorDaVez = 0;
        
        
        switch(jogadorDaVez){
            case 0: return AMARELO;
            case 1: return VERDE;
            case 2: return VERMELHO;
            case 3: return AZUL;
        }
        return null;
    }
    
    
    public PanelTabuleiroControl(PanelTabuleiroView view) {
        randomGenerator = new Random();
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
       
    }
    
    public void lancarDados(){  
        if(jogadorDaVez > 3)
            jogadorDaVez = 0;
       jogadores[jogadorDaVez].lancarDados();
 
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

    public void proximoJogadorDaVez() {
        
        if(jogadorDaVez > 3)
            jogadorDaVez = 0;
        
       jogadorDaVez++;
    }
    
    
}
