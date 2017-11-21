/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.TabuleiroControl;
import javax.swing.JOptionPane;

/**
 *
 * @author paabl
 */
public class PanelTabuleiroView extends javax.swing.JPanel {

    /**
     * Creates new form TAB
     */
    
    TabuleiroControl control;
    public PanelTabuleiroView() {
        control = new TabuleiroControl(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabelUser9 = new javax.swing.JLabel();
        jLabelUser10 = new javax.swing.JLabel();
        jLabelUser11 = new javax.swing.JLabel();
        jLabelUser12 = new javax.swing.JLabel();
        jLabelPeaoYellow9 = new javax.swing.JLabel();
        jLabelPeaoBlue9 = new javax.swing.JLabel();
        jLabelPeaoBlue10 = new javax.swing.JLabel();
        jLabelPeaoBlue11 = new javax.swing.JLabel();
        jLabelPeaoYellow10 = new javax.swing.JLabel();
        jLabelPeaoBlue12 = new javax.swing.JLabel();
        jLabelPeaoYellow11 = new javax.swing.JLabel();
        jLabelDados2 = new javax.swing.JLabel();
        jLabelPeaoYellow12 = new javax.swing.JLabel();
        jLabelPeaoRed9 = new javax.swing.JLabel();
        jLabelPeaoRed10 = new javax.swing.JLabel();
        jLabelPeaoGreen9 = new javax.swing.JLabel();
        jLabelPeaoRed11 = new javax.swing.JLabel();
        jLabelPeaoRed12 = new javax.swing.JLabel();
        jLabelPeaoGreen10 = new javax.swing.JLabel();
        jLabelPeaoGreen11 = new javax.swing.JLabel();
        jLabelPeaoGreen12 = new javax.swing.JLabel();
        jLabelTabuleiero2 = new javax.swing.JLabel();
        jLabelCircleYellow2 = new javax.swing.JLabel();
        jLabelCircleBlue2 = new javax.swing.JLabel();
        jLabelCircleGreen2 = new javax.swing.JLabel();
        jLabelCircleRed2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 253, 165));

        jButton1.setBackground(new java.awt.Color(255, 253, 165));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/logoutDOOR.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jPanel7.setBackground(new java.awt.Color(255, 253, 165));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUser9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAvatars/avatar2.png"))); // NOI18N
        jLabelUser9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel7.add(jLabelUser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, 80));

        jLabelUser10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAvatars/avatar4.png"))); // NOI18N
        jLabelUser10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel7.add(jLabelUser10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 400, -1, 80));

        jLabelUser11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAvatars/avatar3.png"))); // NOI18N
        jLabelUser11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel7.add(jLabelUser11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, -1, 80));

        jLabelUser12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAvatars/avatar1.png"))); // NOI18N
        jLabelUser12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel7.add(jLabelUser12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, 70));

        jLabelPeaoYellow9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-yellow.png"))); // NOI18N
        jPanel7.add(jLabelPeaoYellow9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, -1, -1));

        jLabelPeaoBlue9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-blue.png"))); // NOI18N
        jPanel7.add(jLabelPeaoBlue9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, -1, -1));

        jLabelPeaoBlue10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-blue.png"))); // NOI18N
        jPanel7.add(jLabelPeaoBlue10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, -1, -1));

        jLabelPeaoBlue11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-blue.png"))); // NOI18N
        jPanel7.add(jLabelPeaoBlue11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, -1, -1));

        jLabelPeaoYellow10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-yellow.png"))); // NOI18N
        jPanel7.add(jLabelPeaoYellow10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, -1, -1));

        jLabelPeaoBlue12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-blue.png"))); // NOI18N
        jPanel7.add(jLabelPeaoBlue12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, -1, -1));

        jLabelPeaoYellow11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-yellow.png"))); // NOI18N
        jPanel7.add(jLabelPeaoYellow11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, -1, -1));

        jLabelDados2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/dado.png"))); // NOI18N
        jLabelDados2.setToolTipText("");
        jPanel7.add(jLabelDados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, -1, -1));

        jLabelPeaoYellow12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-yellow.png"))); // NOI18N
        jPanel7.add(jLabelPeaoYellow12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, -1, -1));

        jLabelPeaoRed9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-red-th4.png"))); // NOI18N
        jPanel7.add(jLabelPeaoRed9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, 40));

        jLabelPeaoRed10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-red-th4.png"))); // NOI18N
        jPanel7.add(jLabelPeaoRed10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, 40));

        jLabelPeaoGreen9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-green.png"))); // NOI18N
        jPanel7.add(jLabelPeaoGreen9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 30, 40));

        jLabelPeaoRed11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-red-th4.png"))); // NOI18N
        jPanel7.add(jLabelPeaoRed11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, 40));

        jLabelPeaoRed12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-red-th4.png"))); // NOI18N
        jPanel7.add(jLabelPeaoRed12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, 40));

        jLabelPeaoGreen10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-green.png"))); // NOI18N
        jPanel7.add(jLabelPeaoGreen10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 30, 40));

        jLabelPeaoGreen11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-green.png"))); // NOI18N
        jPanel7.add(jLabelPeaoGreen11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 30, 40));

        jLabelPeaoGreen12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePinos/ludo-piece-green.png"))); // NOI18N
        jPanel7.add(jLabelPeaoGreen12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 30, 40));

        jLabelTabuleiero2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/tabu.png"))); // NOI18N
        jLabelTabuleiero2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel7.add(jLabelTabuleiero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabelCircleYellow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/yellow-circle-design-hi.png"))); // NOI18N
        jPanel7.add(jLabelCircleYellow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabelCircleBlue2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/blue-circle-design-hi.png"))); // NOI18N
        jPanel7.add(jLabelCircleBlue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, -1, -1));

        jLabelCircleGreen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/green-circle-design-hi.png"))); // NOI18N
        jPanel7.add(jLabelCircleGreen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, -1, -1));

        jLabelCircleRed2.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jLabelCircleRed2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageViews/red-circle-design-hi.png"))); // NOI18N
        jPanel7.add(jLabelCircleRed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        jPanel5.add(jPanel7, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1332, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(759, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(69, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            control.viewAnterior();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelCircleBlue2;
    private javax.swing.JLabel jLabelCircleGreen2;
    private javax.swing.JLabel jLabelCircleRed2;
    private javax.swing.JLabel jLabelCircleYellow2;
    private javax.swing.JLabel jLabelDados2;
    private javax.swing.JLabel jLabelPeaoBlue10;
    private javax.swing.JLabel jLabelPeaoBlue11;
    private javax.swing.JLabel jLabelPeaoBlue12;
    private javax.swing.JLabel jLabelPeaoBlue9;
    private javax.swing.JLabel jLabelPeaoGreen10;
    private javax.swing.JLabel jLabelPeaoGreen11;
    private javax.swing.JLabel jLabelPeaoGreen12;
    private javax.swing.JLabel jLabelPeaoGreen9;
    private javax.swing.JLabel jLabelPeaoRed10;
    private javax.swing.JLabel jLabelPeaoRed11;
    private javax.swing.JLabel jLabelPeaoRed12;
    private javax.swing.JLabel jLabelPeaoRed9;
    private javax.swing.JLabel jLabelPeaoYellow10;
    private javax.swing.JLabel jLabelPeaoYellow11;
    private javax.swing.JLabel jLabelPeaoYellow12;
    private javax.swing.JLabel jLabelPeaoYellow9;
    private javax.swing.JLabel jLabelTabuleiero2;
    private javax.swing.JLabel jLabelUser10;
    private javax.swing.JLabel jLabelUser11;
    private javax.swing.JLabel jLabelUser12;
    private javax.swing.JLabel jLabelUser9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
