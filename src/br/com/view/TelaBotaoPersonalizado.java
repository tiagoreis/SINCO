package br.com.view;

import br.com.audio.Audio;
import br.com.util.Botao;
import br.com.util.ControleBotaoNovo;
import br.com.util.ParserBotao;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import org.w3c.dom.NodeList;

public class TelaBotaoPersonalizado extends javax.swing.JFrame {

    Audio audio = new Audio();

    public TelaBotaoPersonalizado() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();

        this.carregarTextoBotao();
        //ajustarTamanhoBotoes();
        personalizarBotoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        framePrincipal = new javax.swing.JFrame();
        btn2 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnEscolheJogo = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnEditarBotoes = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();

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

        btn2.setText("Sem texto");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn9.setText("Sem texto");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnEscolheJogo.setText("Jogos");
        btnEscolheJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolheJogoActionPerformed(evt);
            }
        });

        btn6.setText("Sem texto");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.setText("Sem texto");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn5.setText("Sem texto");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setText("Sem texto");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn3.setText("Sem texto");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn7.setText("Sem texto");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnEditarBotoes.setText("Editar botões");
        btnEditarBotoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarBotoesActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar Tela Principal");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btn1.setText("Sem texto");
        btn1.setAutoscrolls(true);
        btn1.setHideActionText(btn1.getAutoscrolls());
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnEscolheJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnEditarBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnEditarBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEscolheJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEscolheJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscolheJogoActionPerformed
        new EscolheJogo().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEscolheJogoActionPerformed


    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        audio.tocarAudio("bomdia");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        audio.tocarAudio("sim");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        audio.tocarAudio("precisodeajuda");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        audio.tocarAudio("nao");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        audio.tocarAudio("queromemexer");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        audio.tocarAudio("queroiraobanheiro");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        audio.tocarAudio("querovertv");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        audio.tocarAudio("chameaenfermeira");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnEditarBotoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarBotoesActionPerformed
                TelaEditarBotao tela = new TelaEditarBotao();
        tela.setIdBotao("btn1");
        tela.setVisible(true);
        
    }//GEN-LAST:event_btnEditarBotoesActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed


    
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
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnEditarBotoes;
    private javax.swing.JButton btnEscolheJogo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFrame framePrincipal;
    // End of variables declaration//GEN-END:variables

    private void carregarTextoBotao() {
        
        ParserBotao parser = new ParserBotao();
        List<Botao> botoes = parser.listarBotoes();
        
        for (int i = 0; i < botoes.size(); i++) {
            
            String idBotao = botoes.get(i).getId();
            String texto = botoes.get(i).getTexto();
            if(texto.length() > 10){
                int idx = texto.indexOf(" "); 
            }
            
            
            switch (idBotao) { 
                case "btn1" : btn1.setText(texto);
                btn1.setToolTipText(texto);
                break;    
                
                case "btn2" : btn2.setText(botoes.get(i).getTexto());
                btn2.setToolTipText(texto);
                break;    
                
                case "btn3" : btn3.setText(botoes.get(i).getTexto());
                btn3.setToolTipText(texto);
                break;    
                
                case "btn4" : btn4.setText(botoes.get(i).getTexto());
                btn4.setToolTipText(texto);
                break;    
                
                case "btn5" : btn5.setText(botoes.get(i).getTexto());
                btn5.setToolTipText(texto);
                break;    
                
                case "btn6" : btn6.setText(botoes.get(i).getTexto());
                btn6.setToolTipText(texto);
                break;    
                
                case "btn7" : btn7.setText(botoes.get(i).getTexto());
                btn7.setToolTipText(texto);
                break;    
                
                case "btn8" : btn8.setText(botoes.get(i).getTexto());
                btn8.setToolTipText(texto);
                break;    

                case "btn9" : btn9.setText(botoes.get(i).getTexto());
                btn9.setToolTipText(texto);
                break;    
                    
            }
           // System.out.println("botao " + botoes.get(i).getId());

        }
        
        
    }

    private void ajustarTamanhoBotoes() {
        
        btn1.setSize(100, 50);
        btn2.setSize(100, 50);
        btn3.setSize(100, 50);
        btn4.setSize(100, 50);
        btn5.setSize(100, 50);
        btn6.setSize(100, 50);
        btn7.setSize(100, 50);
        btn8.setSize(100, 50);
        btn9.setSize(100, 50);
        btnEditarBotoes.setSize(100, 50);
        btnEscolheJogo.setSize(100, 50);
        btnVoltar.setSize(100, 50);

    }
   
    private void personalizarBotoes() {
     
        Border borda = new LineBorder(Color.WHITE, 2);
        btn1.setBorder(borda);
        btn2.setBorder(borda);
        btn3.setBorder(borda);
        btn4.setBorder(borda);
        btn5.setBorder(borda);
        btn6.setBorder(borda);
        btn7.setBorder(borda);
        btn8.setBorder(borda);
        btn9.setBorder(borda);
        btnEditarBotoes.setBorder(borda);
        btnEscolheJogo.setBorder(borda);
        btnVoltar.setBorder(borda);
        
    }

    
    
      
}
