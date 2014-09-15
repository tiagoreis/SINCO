package br.com.view;

import br.com.audio.Audio;
import java.awt.Color;

public class TelaPrincipal extends javax.swing.JFrame {
//http://www.edu4java.com/en/game/game2.html
    Audio audio = new Audio();

    public TelaPrincipal() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
       //personalizarBotoes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        framePrincipal = new javax.swing.JFrame();
        btnBomDia = new javax.swing.JButton();
        btnSim = new javax.swing.JButton();
        btnJogos = new javax.swing.JButton();
        btnPrecisoDeAjuda = new javax.swing.JButton();
        btnObrigado = new javax.swing.JButton();
        btnNao = new javax.swing.JButton();
        btnQueroMeMexer = new javax.swing.JButton();
        btnQueroIrAoBanheiro = new javax.swing.JButton();
        btnDesligueALuz = new javax.swing.JButton();
        btnQueroVerTV = new javax.swing.JButton();
        btnChameAEnfermeira = new javax.swing.JButton();
        btnBotaoPersonalizado = new javax.swing.JButton();

        javax.swing.GroupLayout framePrincipalLayout = new javax.swing.GroupLayout(framePrincipal.getContentPane());
        framePrincipal.getContentPane().setLayout(framePrincipalLayout);
        framePrincipalLayout.setHorizontalGroup(
            framePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        framePrincipalLayout.setVerticalGroup(
            framePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SINCO");
        setExtendedState(100);
        setName("framePrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 768));

        btnBomDia.setText("Bom Dia!");
        btnBomDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBomDiaActionPerformed(evt);
            }
        });

        btnSim.setText("Sim");
        btnSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimActionPerformed(evt);
            }
        });

        btnJogos.setText("Jogos");
        btnJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogosActionPerformed(evt);
            }
        });

        btnPrecisoDeAjuda.setText("Preciso de Ajuda");
        btnPrecisoDeAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecisoDeAjudaActionPerformed(evt);
            }
        });

        btnObrigado.setText("Obrigado!");
        btnObrigado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrigadoActionPerformed(evt);
            }
        });

        btnNao.setText("Não");
        btnNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoActionPerformed(evt);
            }
        });

        btnQueroMeMexer.setText("Quero me mexer");
        btnQueroMeMexer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueroMeMexerActionPerformed(evt);
            }
        });

        btnQueroIrAoBanheiro.setText("Quero ir ao banheiro");
        btnQueroIrAoBanheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueroIrAoBanheiroActionPerformed(evt);
            }
        });

        btnDesligueALuz.setText("Desligue a luz");
        btnDesligueALuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesligueALuzActionPerformed(evt);
            }
        });

        btnQueroVerTV.setText("Quero ver TV");
        btnQueroVerTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueroVerTVActionPerformed(evt);
            }
        });

        btnChameAEnfermeira.setText("Chame a enfermeira");
        btnChameAEnfermeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChameAEnfermeiraActionPerformed(evt);
            }
        });

        btnBotaoPersonalizado.setText("Botões Personalizados");
        btnBotaoPersonalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotaoPersonalizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChameAEnfermeira, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(btnSim, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPrecisoDeAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(btnQueroVerTV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBotaoPersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQueroIrAoBanheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBomDia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObrigado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDesligueALuz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQueroMeMexer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnQueroVerTV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnQueroIrAoBanheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQueroMeMexer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBomDia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBotaoPersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDesligueALuz, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObrigado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrecisoDeAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChameAEnfermeira, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogosActionPerformed

        new EscolheJogo().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnJogosActionPerformed


    private void btnBomDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBomDiaActionPerformed
        audio.tocarAudio("bomdia");
    }//GEN-LAST:event_btnBomDiaActionPerformed

    private void btnSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimActionPerformed
        audio.tocarAudio("sim");
    }//GEN-LAST:event_btnSimActionPerformed

    private void btnPrecisoDeAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecisoDeAjudaActionPerformed
        audio.tocarAudio("precisodeajuda");
    }//GEN-LAST:event_btnPrecisoDeAjudaActionPerformed

    private void btnObrigadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrigadoActionPerformed
        audio.tocarAudio("obrigado");
    }//GEN-LAST:event_btnObrigadoActionPerformed

    private void btnNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoActionPerformed
        audio.tocarAudio("nao");
    }//GEN-LAST:event_btnNaoActionPerformed

    private void btnQueroMeMexerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueroMeMexerActionPerformed
        audio.tocarAudio("queromemexer");
    }//GEN-LAST:event_btnQueroMeMexerActionPerformed

    private void btnQueroIrAoBanheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueroIrAoBanheiroActionPerformed
        audio.tocarAudio("queroiraobanheiro");
    }//GEN-LAST:event_btnQueroIrAoBanheiroActionPerformed

    private void btnDesligueALuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesligueALuzActionPerformed
        audio.tocarAudio("desliguealuz");
    }//GEN-LAST:event_btnDesligueALuzActionPerformed

    private void btnQueroVerTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueroVerTVActionPerformed
        audio.tocarAudio("querovertv");
    }//GEN-LAST:event_btnQueroVerTVActionPerformed

    private void btnChameAEnfermeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChameAEnfermeiraActionPerformed
        audio.tocarAudio("chameaenfermeira");
    }//GEN-LAST:event_btnChameAEnfermeiraActionPerformed

    private void btnBotaoPersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotaoPersonalizadoActionPerformed
        
        new TelaBotaoPersonalizado().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnBotaoPersonalizadoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBomDia;
    private javax.swing.JButton btnBotaoPersonalizado;
    private javax.swing.JButton btnChameAEnfermeira;
    private javax.swing.JButton btnDesligueALuz;
    private javax.swing.JButton btnJogos;
    private javax.swing.JButton btnNao;
    private javax.swing.JButton btnObrigado;
    private javax.swing.JButton btnPrecisoDeAjuda;
    private javax.swing.JButton btnQueroIrAoBanheiro;
    private javax.swing.JButton btnQueroMeMexer;
    private javax.swing.JButton btnQueroVerTV;
    private javax.swing.JButton btnSim;
    private javax.swing.JFrame framePrincipal;
    // End of variables declaration//GEN-END:variables

    private void personalizarBotoes() {
        
        btnChameAEnfermeira.setBackground(Color.red);
        btnPrecisoDeAjuda.setBackground(Color.MAGENTA);
        btnJogos.setBackground(Color.BLUE);
        
    }

}
