package br.com.view;

import br.com.audio.Audio;
import br.com.util.Botao;
import br.com.util.ControleBotaoNovo;
import br.com.util.ParserBotao;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.NodeList;

public class TelaBotaoPersonalizado extends javax.swing.JFrame {

    Audio audio = new Audio();

    public TelaBotaoPersonalizado() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();

        this.carregarTextoBotao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        framePrincipal = new javax.swing.JFrame();
        btnBomDia = new javax.swing.JButton();
        btnSim = new javax.swing.JButton();
        btnJogos = new javax.swing.JButton();
        btnPrecisoDeAjuda = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnNao = new javax.swing.JButton();
        btnQueroMeMexer = new javax.swing.JButton();
        btnQueroIrAoBanheiro = new javax.swing.JButton();
        btnQueroVerTV = new javax.swing.JButton();
        btnChameAEnfermeira = new javax.swing.JButton();
        btnTecladoVirtual = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnVoltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        btn1.setAlignmentY(0.0F);
        btn1.setMargin(new java.awt.Insets(0, 14, 2, 14));
        btn1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
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

        btnTecladoVirtual.setText("Teclado Virtual");
        btnTecladoVirtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecladoVirtualActionPerformed(evt);
            }
        });

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar Tela Principal");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnChameAEnfermeira, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrecisoDeAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(89, 89, 89)
                .addComponent(btnBomDia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQueroVerTV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSim, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(jToggleButton1))
                    .addComponent(btnJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTecladoVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQueroMeMexer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQueroIrAoBanheiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnNao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBomDia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnQueroVerTV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addComponent(btnQueroIrAoBanheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnQueroMeMexer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTecladoVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1)
                            .addComponent(btnSim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnNao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)))
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

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        audio.tocarAudio("obrigado");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoActionPerformed
        audio.tocarAudio("nao");
    }//GEN-LAST:event_btnNaoActionPerformed

    private void btnQueroMeMexerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueroMeMexerActionPerformed
        audio.tocarAudio("queromemexer");
    }//GEN-LAST:event_btnQueroMeMexerActionPerformed

    private void btnQueroIrAoBanheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueroIrAoBanheiroActionPerformed
        audio.tocarAudio("queroiraobanheiro");
    }//GEN-LAST:event_btnQueroIrAoBanheiroActionPerformed

    private void btnQueroVerTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueroVerTVActionPerformed
        audio.tocarAudio("querovertv");
    }//GEN-LAST:event_btnQueroVerTVActionPerformed

    private void btnChameAEnfermeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChameAEnfermeiraActionPerformed
        audio.tocarAudio("chameaenfermeira");
    }//GEN-LAST:event_btnChameAEnfermeiraActionPerformed

    private void btnTecladoVirtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecladoVirtualActionPerformed
        
        
    }//GEN-LAST:event_btnTecladoVirtualActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        //this.txtNomeNovoBotao.setVisible(true);
        TelaTextoBotao tela = new TelaTextoBotao();
        tela.setIdBotao("btn1");
        tela.setVisible(true);
        //        new TelaTextoBotao().setVisible(true);

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaTextoBotao tela = new TelaTextoBotao();
        tela.setIdBotao("btn1");
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    
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
            java.util.logging.Logger.getLogger(TelaBotaoPersonalizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBotaoPersonalizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBotaoPersonalizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBotaoPersonalizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBotaoPersonalizado().setVisible(true);
            }
        });
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btnBomDia;
    private javax.swing.JButton btnChameAEnfermeira;
    private javax.swing.JButton btnJogos;
    private javax.swing.JButton btnNao;
    private javax.swing.JButton btnPrecisoDeAjuda;
    private javax.swing.JButton btnQueroIrAoBanheiro;
    private javax.swing.JButton btnQueroMeMexer;
    private javax.swing.JButton btnQueroVerTV;
    private javax.swing.JButton btnSim;
    private javax.swing.JButton btnTecladoVirtual;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFrame framePrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    private void carregarTextoBotao() {
        
        ParserBotao parser = new ParserBotao();
        List<Botao> botoes = parser.listarBotoes();
        
        for (int i = 0; i < botoes.size(); i++) {
            
            String idBotao = botoes.get(i).getId();
            
            switch (idBotao) { 
                case "btn1" : btn1.setText(botoes.get(i).getTexto());

                break;    
            }
           // System.out.println("botao " + botoes.get(i).getId());

        }
        
        
    }

      public void alterarTextBotao(String botao ,String texto){
//        btnTecladoVirtual.setText(texto);
        System.out.println("texto " + texto);
//        ControleBotaoNovo controle = new ControleBotaoNovo();
//        btnSim.setText(controle.getTextoBotao());
//        btnSim.setText("tiago");
        
//        TelaBotaoPersonalizado.this.invalidate();
//        TelaBotaoPersonalizado.this.validate();
//        TelaBotaoPersonalizado.this.repaint();
//        
//        TelaBotaoPersonalizado.this.btnNao.setText("naonao");
        
//        TelaBotaoPersonalizado tela = new TelaBotaoPersonalizado();
//        tela.btnNao.setText("11111");
//        tela.repaint();
//        super.repaint();
//        tela.getContentPane().invalidate();
//        tela.getContentPane().validate();
//        tela.getContentPane().repaint();
    }
            
    
    
      
}
