/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.PanelRegisterControl;
import Model.UserRanking;
import Model.RankingModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Lufh
 */
public class PanelRegisterView extends javax.swing.JPanel {

    PanelRegisterControl control;
    private final int MAX_ICONS = 4;
    private ImageIcon[] icons = new ImageIcon[MAX_ICONS];
    
    /**
     * Creates new form Tabuleiro
     */
    
     public PanelRegisterView() {
        control = new PanelRegisterControl(this);
        initComponents();
        preencheComboBox();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLogin = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButtonSair = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        JTextSenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);
        add(jLogin);
        jLogin.setBounds(110, 260, 230, 30);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        add(jFormattedTextField1);
        jFormattedTextField1.setBounds(110, 360, 230, 30);

        jButtonSair.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/logoutDOOR.png"))); // NOI18N
        jButtonSair.setBorder(null);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        add(jButtonSair);
        jButtonSair.setBounds(760, 10, 33, 33);

        btnRegister.setBackground(new java.awt.Color(0, 255, 0));
        btnRegister.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Cadastrar");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister);
        btnRegister.setBounds(110, 450, 230, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Login:");
        add(jLabel10);
        jLabel10.setBounds(110, 240, 50, 20);

        txtNome.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        add(txtNome);
        txtNome.setBounds(110, 310, 230, 30);

        JTextSenha.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        JTextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextSenhaActionPerformed(evt);
            }
        });
        add(JTextSenha);
        JTextSenha.setBounds(110, 410, 230, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Data de nascimento:");
        add(jLabel8);
        jLabel8.setBounds(110, 340, 150, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Escolha seu avatar: ");
        add(jLabel7);
        jLabel7.setBounds(540, 80, 150, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Senha:");
        add(jLabel4);
        jLabel4.setBounds(110, 390, 60, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Usuário:");
        add(jLabel5);
        jLabel5.setBounds(110, 290, 80, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/Ludo_logo.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, -10, 500, 300);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/ludo2.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(500, 270, 300, 281);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/a-soft-sky-with-cloud-background-in-pastel-color-abstract-gradation-color-pastel_6529-11.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(100, 70, 626, 417);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Usuário:");
        add(jLabel6);
        jLabel6.setBounds(120, 340, 80, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1);
        jComboBox1.setBounds(560, 110, 90, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

        int reply = JOptionPane.showConfirmDialog(null, "Tem certeza que você deseja sair", "Fazer logout", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            control.viewAnterior();
        }

    }//GEN-LAST:event_jButtonSairActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
     
        boolean podeCadastrar = true;
        
        if(jLogin.getText().length() < 4 ){
            JOptionPane.showMessageDialog(null,"O login possui menos que 4 caracteres");
            podeCadastrar = false;
        }
        if(jLogin.getText().length() > 10){
            JOptionPane.showMessageDialog(null,"O login possui mais que 10 caracteres");
            podeCadastrar = false;
        }
        
        
        char aux; 
        aux = jLogin.getText().charAt(0);
        
        if(aux == '0' || aux == '1' || aux == '2'  || aux == '3' || aux == '4' || aux == '5' ||
           aux == '6' || aux == '7' || aux == '9'){
            
             JOptionPane.showMessageDialog(null,"O login não deve ser iniciado com um número ");
             podeCadastrar = false;
        }
        
        if(JTextSenha.getText().length() < 8 || JTextSenha.getText().length() > 10 ){
            JOptionPane.showMessageDialog(null,"A senha deve possui entre 8 e 10 caracteres");
            
            podeCadastrar = false;
        }
         
        if(podeCadastrar){
            String avatar = "avatar"+(avatarList.getSelectedIndex()+1)+".png";
        
        try {
            control.registrarUsuario(txtNome.getText(), jFormattedTextField1.getText(), avatar, jLogin.getText(),String.valueOf(JTextSenha.getName()));
            UserRanking ranking = new UserRanking();
            ranking.setLogin(jLogin.getText());
            ranking.setPartJogadas(0);
            ranking.setQuantidadeVitorias(0);
        
        
            RankingModel rankModel = new RankingModel();
       
       try {
           rankModel.insertUserRanking(ranking);
        } catch (Exception ex) {
          System.out.println(ex.getMessage());
        }
        
            
            JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso");
             txtNome.setText(""); 
             jFormattedTextField1.setText("");
             jLogin.setText("");
             JTextSenha.setText("");
             
             } catch (Exception ex) {
            Logger.getLogger(PanelRegisterView.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    
        }

        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void JTextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextSenhaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JTextSenha;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jLogin;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

     JComboBox avatarList;
    private void preencheComboBox() {
         //DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (int i = 1; i <= MAX_ICONS; i++) {
            icons[i-1] = new javax.swing.ImageIcon(getClass().getResource("/ImageAvatars/avatar"+i+".png"));
            //.addElement("Icone "+i);
        }
        
        avatarList = new JComboBox(icons);
        avatarList.setLocation(jComboBox1.getLocation());
        avatarList.setSize(jComboBox1.getSize());
        avatarList.setVisible(true);
        this.add(avatarList, 0);
    }
}
