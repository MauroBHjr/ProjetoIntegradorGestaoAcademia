/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author 182110041
 */
public class telaLoginFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form alunoMatricula
     */
    public telaLoginFuncionario() {
        initComponents();
        
        jlblEsqueciSenha.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                System.out.println("clicado");
                //tenho que ver como voou fazer o frame
                JFrame frameRecuperaSenha = new JFrame("Recuperação de senha");
                frameRecuperaSenha.setVisible(true);
                
                frameRecuperaSenha.setSize(350, 100);
                frameRecuperaSenha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frameRecuperaSenha.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        //painel.add(btnCadPessoa);
        //painel.add(btnCadCarros);
        //janela.add(painel);
        //janela.setVisible(true);
        //btnCadPessoa.addActionListener(this);
        //btnCadCarros.addActionListener(this);
                
                
                
            }
        });

        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtngSexoAlunoMatricula = new javax.swing.ButtonGroup();
        jpAlunoMatricula = new javax.swing.JPanel();
        jlblUsuarioTelaLogin = new javax.swing.JLabel();
        jlblNomeAlunoMatricula6 = new javax.swing.JLabel();
        jtfUsuarioTelaLogin = new javax.swing.JTextField();
        jlblSenhaTelaLogin = new javax.swing.JLabel();
        jbtnConfirmarTelaLogin = new javax.swing.JButton();
        jbtnCancelarTelaLogin = new javax.swing.JButton();
        jpfSenhaTelaLogin = new javax.swing.JPasswordField();
        jlblEsqueciSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblUsuarioTelaLogin.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jlblUsuarioTelaLogin.setText("Usuário");

        jlblNomeAlunoMatricula6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        jtfUsuarioTelaLogin.setText("Entre 6 a 18 caracteres");
        jtfUsuarioTelaLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfUsuarioTelaLoginFocusGained(evt);
            }
        });
        jtfUsuarioTelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioTelaLoginActionPerformed(evt);
            }
        });

        jlblSenhaTelaLogin.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jlblSenhaTelaLogin.setText("Senha");

        jbtnConfirmarTelaLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbtnConfirmarTelaLogin.setText("Confirmar");

        jbtnCancelarTelaLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbtnCancelarTelaLogin.setText("Cancelar");
        jbtnCancelarTelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarTelaLoginActionPerformed(evt);
            }
        });

        jpfSenhaTelaLogin.setToolTipText("Insira uma senha de no mínimo 6 caracteres contendo Maísculas, mínusculas, números e caracters especiais.");

        jlblEsqueciSenha.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jlblEsqueciSenha.setForeground(new java.awt.Color(0, 102, 255));
        jlblEsqueciSenha.setText("Esqueci minha senha");

        javax.swing.GroupLayout jpAlunoMatriculaLayout = new javax.swing.GroupLayout(jpAlunoMatricula);
        jpAlunoMatricula.setLayout(jpAlunoMatriculaLayout);
        jpAlunoMatriculaLayout.setHorizontalGroup(
            jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jlblNomeAlunoMatricula6))
                    .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jbtnConfirmarTelaLogin)
                        .addGap(55, 55, 55)
                        .addComponent(jbtnCancelarTelaLogin)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAlunoMatriculaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblUsuarioTelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jlblSenhaTelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88)
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfUsuarioTelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jpfSenhaTelaLogin)
                    .addComponent(jlblEsqueciSenha, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27))
        );
        jpAlunoMatriculaLayout.setVerticalGroup(
            jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblUsuarioTelaLogin)
                    .addComponent(jtfUsuarioTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSenhaTelaLogin)
                    .addComponent(jpfSenhaTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblEsqueciSenha)
                .addGap(18, 18, 18)
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnConfirmarTelaLogin)
                    .addComponent(jbtnCancelarTelaLogin))
                .addGap(97, 97, 97)
                .addComponent(jlblNomeAlunoMatricula6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsuarioTelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioTelaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioTelaLoginActionPerformed

    private void jtfUsuarioTelaLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfUsuarioTelaLoginFocusGained
        // TODO add your handling code here:
        jtfUsuarioTelaLogin.setText("");
    }//GEN-LAST:event_jtfUsuarioTelaLoginFocusGained

    private void jbtnCancelarTelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarTelaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCancelarTelaLoginActionPerformed

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
            java.util.logging.Logger.getLogger(telaLoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLoginFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnCancelarTelaLogin;
    private javax.swing.JButton jbtnConfirmarTelaLogin;
    private javax.swing.ButtonGroup jbtngSexoAlunoMatricula;
    private javax.swing.JLabel jlblEsqueciSenha;
    private javax.swing.JLabel jlblNomeAlunoMatricula6;
    private javax.swing.JLabel jlblSenhaTelaLogin;
    private javax.swing.JLabel jlblUsuarioTelaLogin;
    private javax.swing.JPanel jpAlunoMatricula;
    private javax.swing.JPasswordField jpfSenhaTelaLogin;
    private javax.swing.JTextField jtfUsuarioTelaLogin;
    // End of variables declaration//GEN-END:variables
}
