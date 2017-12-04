/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.PanelTabuleiroControl;
import static Control.PanelTabuleiroControl.corDoJogadorDaVez.AMARELO;
import static Control.PanelTabuleiroControl.corDoJogadorDaVez.AZUL;
import static Control.PanelTabuleiroControl.corDoJogadorDaVez.VERDE;
import static Control.PanelTabuleiroControl.corDoJogadorDaVez.VERMELHO;
import Model.Dado;
import Model.JogadorModel;
import Util.MovimentaDado;
import java.awt.Point;
import java.util.Random;
import javafx.scene.Cursor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;



/**
 *
 * @author paabl
 */
public class PanelTabuleiroView extends javax.swing.JPanel {
    private final Random randomGenerator;
    private final int MAX_ICONS = 6;
    private final ImageIcon[] framesDado = new ImageIcon[MAX_ICONS];
    MovimentaDado movimentDado;
    PanelTabuleiroControl control;
    private String nomeAvatarJogador;
    
    
//    ArrayList<JLabel> peoesBaseVerde;
//    ArrayList<JLabel> peoesBaseVermelho;
//    ArrayList<JLabel> peoesBaseAzul;
//    ArrayList<JLabel> peoesForaBaseVerde;
//    ArrayList<JLabel> peoesForaBaseVermelho;
//    ArrayList<JLabel> peoesForaBaseAzul;
    
    public PanelTabuleiroView() {
        control = new PanelTabuleiroControl(this);
        initComponents();
        
        nomeAvatarJogador = JogadorModel.USER_LOGGED.getAvatar();
        Icon avatar = new javax.swing.ImageIcon(getClass().getResource("/ImageAvatars/"+nomeAvatarJogador));
        jLabelJogador.setIcon(avatar);
        
        
        randomGenerator = new Random();
        preencheVetorFramesDado();
        //preenchePeoesBase();
        //preenchePeosForaBase();  
        movimentDado = new MovimentaDado(jBtnDado1,framesDado);
        movimentDado.start(1100);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jBtnDado1 = new javax.swing.JButton();
        jLabelJogador = new javax.swing.JLabel();
        jLabelUser10 = new javax.swing.JLabel();
        jLabelUser11 = new javax.swing.JLabel();
        jLabelUser12 = new javax.swing.JLabel();
        jLabelPeaoYellow1 = new javax.swing.JLabel();
        jLabelPeaoBlue4 = new javax.swing.JLabel();
        jLabelPeaoBlue3 = new javax.swing.JLabel();
        jLabelPeaoBlue1 = new javax.swing.JLabel();
        jLabelPeaoYellow2 = new javax.swing.JLabel();
        jLabelPeaoBlue2 = new javax.swing.JLabel();
        jLabelPeaoYellow3 = new javax.swing.JLabel();
        jLabelPeaoYellow4 = new javax.swing.JLabel();
        jLabelPeaoRed3 = new javax.swing.JLabel();
        jLabelPeaoRed4 = new javax.swing.JLabel();
        jLabelPeaoGreen1 = new javax.swing.JLabel();
        jLabelPeaoRed1 = new javax.swing.JLabel();
        jLabelPeaoRed2 = new javax.swing.JLabel();
        jLabelPeaoGreen4 = new javax.swing.JLabel();
        jLabelPeaoGreen3 = new javax.swing.JLabel();
        jLabelPeaoGreen2 = new javax.swing.JLabel();
        jLabelTabuleiero2 = new javax.swing.JLabel();
        jLabelCircleYellow2 = new javax.swing.JLabel();
        jLabelCircleBlue2 = new javax.swing.JLabel();
        jLabelCircleGreen2 = new javax.swing.JLabel();
        jLabelCircleRed2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 253, 165));

        jButtonVoltar.setBackground(new java.awt.Color(255, 253, 165));
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/logoutDOOR.png"))); // NOI18N
        jButtonVoltar.setBorder(null);
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 253, 165));
        jPanel7.setLayout(null);

        jBtnDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesDado/dado1.png"))); // NOI18N
        jBtnDado1.setBorder(null);
        jBtnDado1.setBorderPainted(false);
        jBtnDado1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnDado1.setName(""); // NOI18N
        jBtnDado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDado1ActionPerformed(evt);
            }
        });
        jPanel7.add(jBtnDado1);
        jBtnDado1.setBounds(290, 390, 40, 40);

        jLabelJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAvatars/avatar5.png"))); // NOI18N
        jLabelJogador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel7.add(jLabelJogador);
        jLabelJogador.setBounds(150, 430, 70, 80);

        jLabelUser10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAvatars/avatar5.png"))); // NOI18N
        jLabelUser10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel7.add(jLabelUser10);
        jLabelUser10.setBounds(1030, 400, 70, 80);

        jLabelUser11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAvatars/avatar5.png"))); // NOI18N
        jLabelUser11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel7.add(jLabelUser11);
        jLabelUser11.setBounds(1020, 30, 70, 80);

        jLabelUser12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAvatars/avatar5.png"))); // NOI18N
        jLabelUser12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel7.add(jLabelUser12);
        jLabelUser12.setBounds(130, 40, 70, 70);

        jLabelPeaoYellow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-yellow.png"))); // NOI18N
        jLabelPeaoYellow1.setToolTipText("1");
        jLabelPeaoYellow1.setName("jLabelPeaoYellow1"); // NOI18N
        jLabelPeaoYellow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoYellow1);
        jLabelPeaoYellow1.setBounds(560, 580, 23, 32);

        jLabelPeaoBlue4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-blue.png"))); // NOI18N
        jLabelPeaoBlue4.setToolTipText("3");
        jLabelPeaoBlue4.setName("jLabelPeaoBlue4"); // NOI18N
        jLabelPeaoBlue4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoBlue4);
        jLabelPeaoBlue4.setBounds(820, 500, 23, 32);

        jLabelPeaoBlue3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-blue.png"))); // NOI18N
        jLabelPeaoBlue3.setToolTipText("2");
        jLabelPeaoBlue3.setName("jLabelPeaoBlue3"); // NOI18N
        jLabelPeaoBlue3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoBlue3);
        jLabelPeaoBlue3.setBounds(850, 470, 23, 32);

        jLabelPeaoBlue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-blue.png"))); // NOI18N
        jLabelPeaoBlue1.setToolTipText("0");
        jLabelPeaoBlue1.setName("jLabelPeaoBlue1"); // NOI18N
        jLabelPeaoBlue1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoBlue1);
        jLabelPeaoBlue1.setBounds(870, 340, 23, 32);

        jLabelPeaoYellow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-yellow.png"))); // NOI18N
        jLabelPeaoYellow2.setToolTipText("0");
        jLabelPeaoYellow2.setName("jLabelPeaoYellow2"); // NOI18N
        jLabelPeaoYellow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoYellow2);
        jLabelPeaoYellow2.setBounds(440, 570, 23, 32);

        jLabelPeaoBlue2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-blue.png"))); // NOI18N
        jLabelPeaoBlue2.setToolTipText("1");
        jLabelPeaoBlue2.setName("jLabelPeaoBlue2"); // NOI18N
        jLabelPeaoBlue2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoBlue2);
        jLabelPeaoBlue2.setBounds(820, 430, 23, 32);

        jLabelPeaoYellow3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-yellow.png"))); // NOI18N
        jLabelPeaoYellow3.setToolTipText("0");
        jLabelPeaoYellow3.setName("jLabelPeaoYellow3"); // NOI18N
        jLabelPeaoYellow3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoYellow3);
        jLabelPeaoYellow3.setBounds(410, 530, 23, 32);

        jLabelPeaoYellow4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-yellow.png"))); // NOI18N
        jLabelPeaoYellow4.setToolTipText("0");
        jLabelPeaoYellow4.setName("jLabelPeaoYellow4"); // NOI18N
        jLabelPeaoYellow4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoYellow4);
        jLabelPeaoYellow4.setBounds(440, 500, 23, 32);

        jLabelPeaoRed3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-red-th4.png"))); // NOI18N
        jLabelPeaoRed3.setToolTipText("2");
        jLabelPeaoRed3.setName("jLabelPeaoRed3"); // NOI18N
        jLabelPeaoRed3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoRed3);
        jLabelPeaoRed3.setBounds(790, 90, 23, 40);

        jLabelPeaoRed4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-red-th4.png"))); // NOI18N
        jLabelPeaoRed4.setToolTipText("3");
        jLabelPeaoRed4.setName("jLabelPeaoRed4"); // NOI18N
        jLabelPeaoRed4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoRed4);
        jLabelPeaoRed4.setBounds(750, 120, 23, 40);

        jLabelPeaoGreen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-green.png"))); // NOI18N
        jLabelPeaoGreen1.setToolTipText("0");
        jLabelPeaoGreen1.setName("jLabelPeaoGreen1"); // NOI18N
        jLabelPeaoGreen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoGreen1);
        jLabelPeaoGreen1.setBounds(320, 270, 30, 40);

        jLabelPeaoRed1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-red-th4.png"))); // NOI18N
        jLabelPeaoRed1.setToolTipText("0");
        jLabelPeaoRed1.setName("jLabelPeaoRed1"); // NOI18N
        jLabelPeaoRed1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoRed1);
        jLabelPeaoRed1.setBounds(635, 25, 23, 40);

        jLabelPeaoRed2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-red-th4.png"))); // NOI18N
        jLabelPeaoRed2.setToolTipText("1");
        jLabelPeaoRed2.setName("jLabelPeaoRed2"); // NOI18N
        jLabelPeaoRed2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoRed2);
        jLabelPeaoRed2.setBounds(750, 50, 23, 40);

        jLabelPeaoGreen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-green.png"))); // NOI18N
        jLabelPeaoGreen4.setToolTipText("3");
        jLabelPeaoGreen4.setName("jLabelPeaoGreen4"); // NOI18N
        jLabelPeaoGreen4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoGreen4);
        jLabelPeaoGreen4.setBounds(370, 190, 30, 40);

        jLabelPeaoGreen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-green.png"))); // NOI18N
        jLabelPeaoGreen3.setToolTipText("2");
        jLabelPeaoGreen3.setName("jLabelPeaoGreen3"); // NOI18N
        jLabelPeaoGreen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoGreen3);
        jLabelPeaoGreen3.setBounds(410, 150, 30, 40);

        jLabelPeaoGreen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-green.png"))); // NOI18N
        jLabelPeaoGreen2.setToolTipText("1");
        jLabelPeaoGreen2.setName("jLabelPeaoGreen2"); // NOI18N
        jLabelPeaoGreen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeaoMouseClicked(evt);
            }
        });
        jPanel7.add(jLabelPeaoGreen2);
        jLabelPeaoGreen2.setBounds(370, 120, 30, 40);

        jLabelTabuleiero2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/tabu.png"))); // NOI18N
        jLabelTabuleiero2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel7.add(jLabelTabuleiero2);
        jLabelTabuleiero2.setBounds(280, 10, 656, 653);

        jLabelCircleYellow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/yellow-circle-design-hi.png"))); // NOI18N
        jLabelCircleYellow2.setText("Dado 1");
        jPanel7.add(jLabelCircleYellow2);
        jLabelCircleYellow2.setBounds(10, 370, 300, 360);

        jLabelCircleBlue2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/blue-circle-design-hi.png"))); // NOI18N
        jPanel7.add(jLabelCircleBlue2);
        jLabelCircleBlue2.setBounds(890, 380, 350, 345);

        jLabelCircleGreen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/green-circle-design-hi.png"))); // NOI18N
        jPanel7.add(jLabelCircleGreen2);
        jLabelCircleGreen2.setBounds(10, 21, 350, 345);

        jLabelCircleRed2.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jLabelCircleRed2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/red-circle-design-hi.png"))); // NOI18N
        jPanel7.add(jLabelCircleRed2);
        jLabelCircleRed2.setBounds(870, 20, 350, 345);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1197, 1197, 1197)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
         int reply = JOptionPane.showConfirmDialog(null, "Tem certeza que você deseja sair", "Fazer logout", JOptionPane.YES_NO_OPTION);
         if (reply == JOptionPane.YES_OPTION) {
            control.viewAnterior();
        }
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    
    private void jBtnDado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDado1ActionPerformed
        
        if(Dado.getNum() == 6){
            //Button2.setVisible(true);
            movimentDado.start(900);
        }
            
        
    
    }//GEN-LAST:event_jBtnDado1ActionPerformed

    private void movimentaPeao(String str, JLabel peaoClicado){
        
        if(peaoClicado.getName().contains("jLabelPeao"+str+"1")){
            control.getJogadorDaVez().escolhePeça(0);
        }
        else if(peaoClicado.getName().contains("jLabelPeao"+str+"2")){
            control.getJogadorDaVez().escolhePeça(1);
        }
        else if(peaoClicado.getName().contains("jLabelPeao"+str+"3")){
            control.getJogadorDaVez().escolhePeça(2);
        }
        else if(peaoClicado.getName().contains("jLabelPeao"+str+"4")){
            control.getJogadorDaVez().escolhePeça(3);
        }
        
        
        try{
            Point p = control.movimentaPeao();
            peaoClicado.setLocation(p); 
            atualizaView();
        }
        catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(this, "Você não pode mover a peça escolhida com o dado atual.", "", ERROR_MESSAGE);
        }
        

    
        Point p = control.movimentaPeao();
        peaoClicado.setLocation(p); 
        atualizaView();
    
    }                                                                                      

    
    private void jLabelPeaoMouseClicked(java.awt.event.MouseEvent evt) {                                        
       
        if (MovimentaDado.isRunning()){
             JOptionPane.showMessageDialog(this, "Espere o dado parar antes de mover a peça");
             return;
        }
        
        JLabel peaoClicado = (JLabel)evt.getSource();

        if(control.getCorDoJogadorDaVez() == AMARELO && peaoClicado.getName().contains("jLabelPeaoYellow")){
            movimentaPeao("Yellow",peaoClicado);
        }
        
        else if(control.getCorDoJogadorDaVez() == VERDE && peaoClicado.getName().contains("jLabelPeaoGreen")){
             movimentaPeao("Green",peaoClicado);
        }
        
        else if(control.getCorDoJogadorDaVez() == VERMELHO && peaoClicado.getName().contains("jLabelPeaoRed")){
            movimentaPeao("Red",peaoClicado);    
        }
 
        else if(control.getCorDoJogadorDaVez() == AZUL && peaoClicado.getName().contains("jLabelPeaoBlue")){ 
            movimentaPeao("Blue",peaoClicado);   
        }  
    } 

    private void preencheVetorFramesDado() {
        for (int i = 1; i <= MAX_ICONS; i++) 
            framesDado[i-1] = new javax.swing.ImageIcon(getClass().getResource("/ImagesDado/dado"+i+".png"));
    }

    private void atualizaView() {
      
        movimentDado.start(900);
        control.proximoJogadorDaVez();
        switch(control.getCorDoJogadorDaVez()){
            
            case AMARELO:   updatePositionDados(new Point(300,400)); 
                            //MovimentaDado.stopTimerTask();
                            return;
            case VERDE:     updatePositionDados(new Point(290,20));       
                            
                            break;
            case VERMELHO:  updatePositionDados(new Point(880,20));  
                            break;
            case AZUL:      updatePositionDados(new Point(830,610));
                            break;
        }
    }

    private void updatePositionDados(Point PosBtn1) {
         jBtnDado1.setLocation(PosBtn1);
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDado1;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelCircleBlue2;
    private javax.swing.JLabel jLabelCircleGreen2;
    private javax.swing.JLabel jLabelCircleRed2;
    private javax.swing.JLabel jLabelCircleYellow2;
    private javax.swing.JLabel jLabelJogador;
    private javax.swing.JLabel jLabelPeaoBlue1;
    private javax.swing.JLabel jLabelPeaoBlue2;
    private javax.swing.JLabel jLabelPeaoBlue3;
    private javax.swing.JLabel jLabelPeaoBlue4;
    private javax.swing.JLabel jLabelPeaoGreen1;
    private javax.swing.JLabel jLabelPeaoGreen2;
    private javax.swing.JLabel jLabelPeaoGreen3;
    private javax.swing.JLabel jLabelPeaoGreen4;
    private javax.swing.JLabel jLabelPeaoRed1;
    private javax.swing.JLabel jLabelPeaoRed2;
    private javax.swing.JLabel jLabelPeaoRed3;
    private javax.swing.JLabel jLabelPeaoRed4;
    private javax.swing.JLabel jLabelPeaoYellow1;
    private javax.swing.JLabel jLabelPeaoYellow2;
    private javax.swing.JLabel jLabelPeaoYellow3;
    private javax.swing.JLabel jLabelPeaoYellow4;
    private javax.swing.JLabel jLabelTabuleiero2;
    private javax.swing.JLabel jLabelUser10;
    private javax.swing.JLabel jLabelUser11;
    private javax.swing.JLabel jLabelUser12;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables

   

//    private JLabel escolhePeaoNaBaseRandom(PanelTabuleiroControl.corDoJogadorDaVez cor) {
//        int num;
//        JLabel peao = null;
//        
//  
//        switch(cor){
//            case VERDE: num = randomGenerator.nextInt(peoesBaseVerde.size());
//                        peao = peoesBaseVerde.get(num);
//                        peoesBaseVerde.remove(peao);
//                        peoesForaBaseVerde.add(peao); break;
//            case VERMELHO: num = randomGenerator.nextInt(peoesBaseVermelho.size());
//                        peao = peoesBaseVermelho.get(num);
//                        peoesBaseVermelho.remove(peao);
//                        peoesForaBaseVermelho.add(peao); break;
//            case AZUL:  num = randomGenerator.nextInt(peoesBaseAzul.size());
//                        peao = peoesBaseAzul.get(num);
//                        peoesBaseAzul.remove(peao);
//                        peoesForaBaseAzul.add(peao);break;            
//        }
//       
//        return peao;
//    }
//
//    private JLabel escolhePeãoForaDaBaseRandom(PanelTabuleiroControl.corDoJogadorDaVez cor) {
//        int num;
//        JLabel peao = null;
//        
//        switch(cor){
//            case VERDE: num = randomGenerator.nextInt(peoesForaBaseVerde.size());
//                        peao = peoesForaBaseVerde.get(num);break;
//            case VERMELHO:
//                        num = randomGenerator.nextInt(peoesForaBaseVermelho.size());
//                        peao = peoesForaBaseVermelho.get(num);break;
//            case AZUL:  num = randomGenerator.nextInt(peoesForaBaseAzul.size());
//                        peao = peoesForaBaseAzul.get(num);break;           
//        }
//       
//        return peao;
//        
//    }
//
//    private void preenchePeoesBase() {
//        peoesBaseVerde = new ArrayList();
//        peoesBaseVerde.add(jLabelPeaoGreen2);
//        peoesBaseVerde.add(jLabelPeaoGreen3);
//        peoesBaseVerde.add(jLabelPeaoGreen4);
//        
//        peoesBaseVermelho = new ArrayList();
//        peoesBaseVermelho.add(jLabelPeaoRed2);
//        peoesBaseVermelho.add(jLabelPeaoRed3);
//        peoesBaseVermelho.add(jLabelPeaoRed4);
//        
//        peoesBaseAzul = new ArrayList();
//        peoesBaseAzul.add(jLabelPeaoBlue2);
//        peoesBaseAzul.add(jLabelPeaoBlue3);
//        peoesBaseAzul.add(jLabelPeaoBlue4);
//    }
//
//    private void preenchePeosForaBase() {
//        peoesForaBaseVerde = new ArrayList();
//        peoesForaBaseVerde.add(jLabelPeaoGreen1);
//        
//        peoesForaBaseVermelho = new ArrayList();
//        peoesForaBaseVermelho.add(jLabelPeaoRed1);
//        
//        peoesForaBaseAzul = new ArrayList();
//        peoesForaBaseAzul.add(jLabelPeaoBlue1);
//  
//    }
//
//    private void removePeaoDaListaForaDaBase(JLabel peao, PanelTabuleiroControl.corDoJogadorDaVez cor) {
//        switch(cor){
//            case VERMELHO: peoesForaBaseVermelho.remove(peao); break;
//            case AZUL: peoesForaBaseAzul.remove(peao); break;
//            case VERDE: peoesForaBaseVerde.remove(peao); break;
//        
//        }
//    }
}       
       
    

