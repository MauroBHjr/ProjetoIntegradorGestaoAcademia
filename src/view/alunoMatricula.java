/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author 182110041
 */
public class alunoMatricula extends javax.swing.JFrame {

    /**
     * Creates new form alunoMatricula
     */
    public alunoMatricula() {
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

        jbtngSexoAlunoMatricula = new javax.swing.ButtonGroup();
        jpAlunoMatricula = new javax.swing.JPanel();
        jlblTelefoneAlunoMatricula = new javax.swing.JLabel();
        jlblNomeAlunoMatricula = new javax.swing.JLabel();
        jlblEmailAlunoMatricula = new javax.swing.JLabel();
        jlblEnderecoAlunoMatricula = new javax.swing.JLabel();
        jlblRGAlunoMatricula = new javax.swing.JLabel();
        jlblCPFAlunoMatricula = new javax.swing.JLabel();
        jlblNomeAlunoMatricula6 = new javax.swing.JLabel();
        jlblSexoAlunoMatricula = new javax.swing.JLabel();
        jlblBirthdayAlunoMatricula = new javax.swing.JLabel();
        jlblCidadeAlunoMatricula = new javax.swing.JLabel();
        jlblEstadoAlunoMatricula = new javax.swing.JLabel();
        jtfNomeAlunoMatricula = new javax.swing.JTextField();
        jtfRgAlunoMatricula = new javax.swing.JTextField();
        jrbSexoMasculinoAlunoMatricula = new javax.swing.JRadioButton();
        jrbSexoFemininoAlunoMatricula = new javax.swing.JRadioButton();
        jtfCpfAlunoMatricula = new javax.swing.JTextField();
        jtfBirthdayAlunoMatricula = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JComboBox<>();
        jtfCidadeAlunoMatricula = new javax.swing.JTextField();
        jtfEnderecoAlunoMatricula = new javax.swing.JTextField();
        jtfTelefoneAlunoMatricula5 = new javax.swing.JTextField();
        jtfTelefoneAlunoMatriculaAlt = new javax.swing.JTextField();
        jtfEmailAlunoMatricula01 = new javax.swing.JTextField();
        jtfEmailAlunoMatricula02 = new javax.swing.JTextField();
        jtfEnderecoComplementarAlunoMatricula = new javax.swing.JTextField();
        jbtnConfirmarAlunoMatricula = new javax.swing.JButton();
        jbtnCancelarAlunoMatricula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblTelefoneAlunoMatricula.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jlblTelefoneAlunoMatricula.setText("Telefone");

        jlblNomeAlunoMatricula.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jlblNomeAlunoMatricula.setText("Nome");

        jlblEmailAlunoMatricula.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jlblEmailAlunoMatricula.setText("E-mail");

        jlblEnderecoAlunoMatricula.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jlblEnderecoAlunoMatricula.setText("Endereço");

        jlblRGAlunoMatricula.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jlblRGAlunoMatricula.setText("RG");

        jlblCPFAlunoMatricula.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jlblCPFAlunoMatricula.setText("CPF");

        jlblNomeAlunoMatricula6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        jlblSexoAlunoMatricula.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jlblSexoAlunoMatricula.setText("Sexo");

        jlblBirthdayAlunoMatricula.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jlblBirthdayAlunoMatricula.setText("Data de Nascimento");

        jlblCidadeAlunoMatricula.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jlblCidadeAlunoMatricula.setText("Cidade");

        jlblEstadoAlunoMatricula.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jlblEstadoAlunoMatricula.setText("Estado");

        jtfNomeAlunoMatricula.setText("Nome Completo");
        jtfNomeAlunoMatricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfNomeAlunoMatriculaFocusGained(evt);
            }
        });
        jtfNomeAlunoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeAlunoMatriculaActionPerformed(evt);
            }
        });

        jtfRgAlunoMatricula.setText("Documento de RG");
        jtfRgAlunoMatricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfRgAlunoMatriculaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfRgAlunoMatriculaFocusLost(evt);
            }
        });
        jtfRgAlunoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRgAlunoMatriculaActionPerformed(evt);
            }
        });

        jbtngSexoAlunoMatricula.add(jrbSexoMasculinoAlunoMatricula);
        jrbSexoMasculinoAlunoMatricula.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jrbSexoMasculinoAlunoMatricula.setText("Masculino");
        jrbSexoMasculinoAlunoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSexoMasculinoAlunoMatriculaActionPerformed(evt);
            }
        });

        jbtngSexoAlunoMatricula.add(jrbSexoFemininoAlunoMatricula);
        jrbSexoFemininoAlunoMatricula.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jrbSexoFemininoAlunoMatricula.setText("Feminino");
        jrbSexoFemininoAlunoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSexoFemininoAlunoMatriculaActionPerformed(evt);
            }
        });

        jtfCpfAlunoMatricula.setText("Documento de CPF");
        jtfCpfAlunoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCpfAlunoMatriculaActionPerformed(evt);
            }
        });

        jtfBirthdayAlunoMatricula.setText("Dia/Mês/Ano");

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RS", "SC", "PR", "SP" }));
        jcbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoActionPerformed(evt);
            }
        });

        jtfCidadeAlunoMatricula.setText("Insira Cidade");
        jtfCidadeAlunoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCidadeAlunoMatriculaActionPerformed(evt);
            }
        });

        jtfEnderecoAlunoMatricula.setText("Rua, Número, Bairro");
        jtfEnderecoAlunoMatricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfEnderecoAlunoMatriculaFocusGained(evt);
            }
        });
        jtfEnderecoAlunoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEnderecoAlunoMatriculaActionPerformed(evt);
            }
        });

        jtfTelefoneAlunoMatricula5.setText("(xx) xxxxx-xxxx");
        jtfTelefoneAlunoMatricula5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefoneAlunoMatricula5ActionPerformed(evt);
            }
        });

        jtfTelefoneAlunoMatriculaAlt.setText("(xx) xxxxx-xxxx");
        jtfTelefoneAlunoMatriculaAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefoneAlunoMatriculaAltActionPerformed(evt);
            }
        });

        jtfEmailAlunoMatricula01.setText("e-mail de contato primário");
        jtfEmailAlunoMatricula01.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfEmailAlunoMatricula01FocusGained(evt);
            }
        });
        jtfEmailAlunoMatricula01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailAlunoMatricula01ActionPerformed(evt);
            }
        });

        jtfEmailAlunoMatricula02.setText("e-mail de contrato alternativo");
        jtfEmailAlunoMatricula02.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfEmailAlunoMatricula02FocusGained(evt);
            }
        });
        jtfEmailAlunoMatricula02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailAlunoMatricula02ActionPerformed(evt);
            }
        });

        jtfEnderecoComplementarAlunoMatricula.setText("Complemento");
        jtfEnderecoComplementarAlunoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEnderecoComplementarAlunoMatriculaActionPerformed(evt);
            }
        });

        jbtnConfirmarAlunoMatricula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbtnConfirmarAlunoMatricula.setText("Confirmar");

        jbtnCancelarAlunoMatricula.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbtnCancelarAlunoMatricula.setText("Cancelar");

        javax.swing.GroupLayout jpAlunoMatriculaLayout = new javax.swing.GroupLayout(jpAlunoMatricula);
        jpAlunoMatricula.setLayout(jpAlunoMatriculaLayout);
        jpAlunoMatriculaLayout.setHorizontalGroup(
            jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAlunoMatriculaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                        .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblEnderecoAlunoMatricula)
                            .addComponent(jlblNomeAlunoMatricula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNomeAlunoMatricula)
                            .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCpfAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                                        .addComponent(jlblBirthdayAlunoMatricula)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfBirthdayAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                                        .addComponent(jlblCidadeAlunoMatricula)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfCidadeAlunoMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))
                            .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                                .addComponent(jtfRgAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlblSexoAlunoMatricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbSexoMasculinoAlunoMatricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbSexoFemininoAlunoMatricula)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                                .addComponent(jtfEnderecoAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jtfEnderecoComplementarAlunoMatricula))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAlunoMatriculaLayout.createSequentialGroup()
                        .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                                .addComponent(jlblRGAlunoMatricula)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblTelefoneAlunoMatricula)
                                    .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                                        .addComponent(jlblEmailAlunoMatricula)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlblNomeAlunoMatricula6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                                        .addComponent(jbtnConfirmarAlunoMatricula)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                                        .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfEmailAlunoMatricula01)
                                            .addComponent(jtfTelefoneAlunoMatricula5))
                                        .addGap(9, 9, 9)))))
                        .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfEmailAlunoMatricula02, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(jbtnCancelarAlunoMatricula)
                            .addComponent(jtfTelefoneAlunoMatriculaAlt, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                        .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblEstadoAlunoMatricula)
                            .addComponent(jlblCPFAlunoMatricula))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpAlunoMatriculaLayout.setVerticalGroup(
            jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNomeAlunoMatricula)
                    .addComponent(jtfNomeAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblRGAlunoMatricula)
                    .addComponent(jlblSexoAlunoMatricula)
                    .addComponent(jtfRgAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbSexoMasculinoAlunoMatricula)
                    .addComponent(jrbSexoFemininoAlunoMatricula))
                .addGap(18, 18, 18)
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblCPFAlunoMatricula)
                    .addComponent(jlblBirthdayAlunoMatricula)
                    .addComponent(jtfCpfAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBirthdayAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblEstadoAlunoMatricula)
                    .addComponent(jlblCidadeAlunoMatricula)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCidadeAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblEnderecoAlunoMatricula)
                    .addComponent(jtfEnderecoAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEnderecoComplementarAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTelefoneAlunoMatricula)
                    .addComponent(jtfTelefoneAlunoMatricula5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefoneAlunoMatriculaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jlblNomeAlunoMatricula6))
                    .addGroup(jpAlunoMatriculaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEmailAlunoMatricula01, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfEmailAlunoMatricula02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblEmailAlunoMatricula))))
                .addGap(18, 18, 18)
                .addGroup(jpAlunoMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCancelarAlunoMatricula)
                    .addComponent(jbtnConfirmarAlunoMatricula))
                .addContainerGap(193, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(jpAlunoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeAlunoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeAlunoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeAlunoMatriculaActionPerformed

    private void jtfRgAlunoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRgAlunoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRgAlunoMatriculaActionPerformed

    private void jrbSexoMasculinoAlunoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSexoMasculinoAlunoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbSexoMasculinoAlunoMatriculaActionPerformed

    private void jrbSexoFemininoAlunoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSexoFemininoAlunoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbSexoFemininoAlunoMatriculaActionPerformed

    private void jtfCpfAlunoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCpfAlunoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCpfAlunoMatriculaActionPerformed

    private void jtfNomeAlunoMatriculaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNomeAlunoMatriculaFocusGained
        // TODO add your handling code here:
        jtfNomeAlunoMatricula.setText("");
    }//GEN-LAST:event_jtfNomeAlunoMatriculaFocusGained

    private void jtfRgAlunoMatriculaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfRgAlunoMatriculaFocusGained
        // TODO add your handling code here:
        jtfRgAlunoMatricula.setText("");
    }//GEN-LAST:event_jtfRgAlunoMatriculaFocusGained

    private void jtfRgAlunoMatriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfRgAlunoMatriculaFocusLost
        // TODO add your handling code here:
        System.out.println(jtfRgAlunoMatricula.getText());
        
    }//GEN-LAST:event_jtfRgAlunoMatriculaFocusLost

    private void jtfCidadeAlunoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCidadeAlunoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCidadeAlunoMatriculaActionPerformed

    private void jtfEnderecoAlunoMatriculaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfEnderecoAlunoMatriculaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEnderecoAlunoMatriculaFocusGained

    private void jtfEnderecoAlunoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEnderecoAlunoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEnderecoAlunoMatriculaActionPerformed

    private void jtfTelefoneAlunoMatricula5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefoneAlunoMatricula5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefoneAlunoMatricula5ActionPerformed

    private void jtfTelefoneAlunoMatriculaAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefoneAlunoMatriculaAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefoneAlunoMatriculaAltActionPerformed

    private void jtfEmailAlunoMatricula01FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfEmailAlunoMatricula01FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailAlunoMatricula01FocusGained

    private void jtfEmailAlunoMatricula01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailAlunoMatricula01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailAlunoMatricula01ActionPerformed

    private void jtfEmailAlunoMatricula02FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfEmailAlunoMatricula02FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailAlunoMatricula02FocusGained

    private void jtfEmailAlunoMatricula02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailAlunoMatricula02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailAlunoMatricula02ActionPerformed

    private void jtfEnderecoComplementarAlunoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEnderecoComplementarAlunoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEnderecoComplementarAlunoMatriculaActionPerformed

    private void jcbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEstadoActionPerformed

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
            java.util.logging.Logger.getLogger(alunoMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alunoMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alunoMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alunoMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alunoMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnCancelarAlunoMatricula;
    private javax.swing.JButton jbtnConfirmarAlunoMatricula;
    private javax.swing.ButtonGroup jbtngSexoAlunoMatricula;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JLabel jlblBirthdayAlunoMatricula;
    private javax.swing.JLabel jlblCPFAlunoMatricula;
    private javax.swing.JLabel jlblCidadeAlunoMatricula;
    private javax.swing.JLabel jlblEmailAlunoMatricula;
    private javax.swing.JLabel jlblEnderecoAlunoMatricula;
    private javax.swing.JLabel jlblEstadoAlunoMatricula;
    private javax.swing.JLabel jlblNomeAlunoMatricula;
    private javax.swing.JLabel jlblNomeAlunoMatricula6;
    private javax.swing.JLabel jlblRGAlunoMatricula;
    private javax.swing.JLabel jlblSexoAlunoMatricula;
    private javax.swing.JLabel jlblTelefoneAlunoMatricula;
    private javax.swing.JPanel jpAlunoMatricula;
    private javax.swing.JRadioButton jrbSexoFemininoAlunoMatricula;
    private javax.swing.JRadioButton jrbSexoMasculinoAlunoMatricula;
    private javax.swing.JTextField jtfBirthdayAlunoMatricula;
    private javax.swing.JTextField jtfCidadeAlunoMatricula;
    private javax.swing.JTextField jtfCpfAlunoMatricula;
    private javax.swing.JTextField jtfEmailAlunoMatricula01;
    private javax.swing.JTextField jtfEmailAlunoMatricula02;
    private javax.swing.JTextField jtfEnderecoAlunoMatricula;
    private javax.swing.JTextField jtfEnderecoComplementarAlunoMatricula;
    private javax.swing.JTextField jtfNomeAlunoMatricula;
    private javax.swing.JTextField jtfRgAlunoMatricula;
    private javax.swing.JTextField jtfTelefoneAlunoMatricula5;
    private javax.swing.JTextField jtfTelefoneAlunoMatriculaAlt;
    // End of variables declaration//GEN-END:variables
}
