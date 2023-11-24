/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author clebe
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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

        jLblLogin = new javax.swing.JLabel();
        jlblSenha = new javax.swing.JLabel();
        jTxtLogin = new javax.swing.JTextField();
        jTxtSenha = new javax.swing.JPasswordField();
        jBtnLogar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastro");

        jLblLogin.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLblLogin.setText("Login:");

        jlblSenha.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlblSenha.setText("Senha:");

        jTxtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtLoginActionPerformed(evt);
            }
        });

        jTxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSenhaActionPerformed(evt);
            }
        });

        jBtnLogar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jBtnLogar.setMnemonic('l');
        jBtnLogar.setText("Logar");
        jBtnLogar.setToolTipText("Logar no Sistema");
        jBtnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogarActionPerformed(evt);
            }
        });
        jBtnLogar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtnLogarKeyPressed(evt);
            }
        });

        jBtnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jBtnCancelar.setMnemonic('c');
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.setToolTipText("Cancelar ");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jBtnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtnCancelarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblSenha)
                            .addComponent(jLblLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtLogin)
                            .addComponent(jTxtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblLogin)
                    .addComponent(jTxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSenha)
                    .addComponent(jTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLogar)
                    .addComponent(jBtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogarActionPerformed
        String senha = String.valueOf(jTxtSenha.getPassword());
        if(jTxtLogin.getText().equals("java")&& senha.equals("java")){
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Usúario ou senha incorreto!!");
            jTxtLogin.setText (null);
            jTxtSenha.setText (null);
            jTxtLogin.requestFocus();

        }
    }//GEN-LAST:event_jBtnLogarActionPerformed

    private void jBtnLogarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtnLogarKeyPressed
       String senha = String.valueOf(jTxtSenha.getPassword());
        if(jTxtLogin.getText().equals("java")&& senha.equals("java")){
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Usúario ou senha incorreto!!");
        }
    }//GEN-LAST:event_jBtnLogarKeyPressed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtnCancelarKeyPressed
        System.exit(0);
    }//GEN-LAST:event_jBtnCancelarKeyPressed

    private void jTxtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtLoginActionPerformed

    private void jTxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnLogar;
    private javax.swing.JLabel jLblLogin;
    private javax.swing.JTextField jTxtLogin;
    private javax.swing.JPasswordField jTxtSenha;
    private javax.swing.JLabel jlblSenha;
    // End of variables declaration//GEN-END:variables
}
