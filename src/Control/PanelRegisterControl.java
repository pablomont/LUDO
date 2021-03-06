/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Jogador;
import Model.JogadorModel;
import Util.FrameOperation;
import View.PanelInicialView;
import View.PanelRegisterView;

/**
 *
 * @author paabl
 */
public class PanelRegisterControl extends AbstractControl{

    PanelRegisterView view;
    public static boolean cadastroSucesso = false; 
    
    public void registrarJogador(String nome, String dataDeNascimento, String avatar, String login,String senha) throws Exception{
       
        
        
       Jogador jogador = new Jogador();
        
        jogador.setName(nome);
        jogador.setDataDeNascimento(dataDeNascimento);
        jogador.setAvatar(avatar);
        jogador.setLogin(login);
        jogador.setSenha(senha);
        jogador.setQtdPartidas(0);
        jogador.setQtdVitorias(0);
        
        
       JogadorModel jg = new JogadorModel();
       
       try {
           
            jg.insertUser(jogador);
            
         
        } catch (Exception ex) {
          System.out.println(ex.getMessage());
        }
        
        
    }
    
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
