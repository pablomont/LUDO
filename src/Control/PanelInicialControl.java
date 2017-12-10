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
import View.PanelMenuView;
import View.PanelRegisterView;
import View.PanelTabuleiroView;
import java.awt.Dimension;





/**
 *
 * @author paabl
 */
public class PanelInicialControl extends AbstractControl{
    
    private PanelInicialView view;
    private final int dimensionWidth = 804;
    private final int dimensionHeight = 600;
    private final int locationX = 0;
    private final int locationY = 0;

    public PanelInicialControl(PanelInicialView view) {
        this.view = view;

    }

    public void loginVerificacao(String login, String senha){
        
        try {
            
        JogadorModel jg = new JogadorModel();
        Jogador j = new Jogador();
        j.setLogin(login);
        j.setSenha(senha);

        jg.doLogin(j);
            
        PanelMenuControl menuController = new PanelMenuControl(new PanelMenuView());
        menuController.mostrarView();
        
        view.mostraAlerta("Login realizado com sucesso !");
            
            
        } catch (Exception ex) {
            
            view.mostraAlerta(ex.getMessage());
        }
  
        
    }
    
    public void register() {
        PanelRegisterControl regController = new PanelRegisterControl(new PanelRegisterView());
        regController.mostrarView();
    }

    public void guest() {
        PanelTabuleiroControl tabController = new PanelTabuleiroControl(new PanelTabuleiroView());
        tabController.mostrarView();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
}
