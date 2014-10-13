package br.com.view;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class EscolheJogo extends javax.swing.JFrame {

    /**
     * Creates new form TelaEscolheJogo
     */
    public EscolheJogo() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
         personalizarBotoes();
    }

    public void start(){
        System.out.println("start");
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        framePrincipal = new javax.swing.JFrame();
        btnFase1 = new javax.swing.JButton();
        btnFase2 = new javax.swing.JButton();
        btnFase3 = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnFase4 = new javax.swing.JButton();
        btnFase5 = new javax.swing.JButton();
        btnFase6 = new javax.swing.JButton();
        btnFase7 = new javax.swing.JButton();
        btnFase8 = new javax.swing.JButton();
        btnFase9 = new javax.swing.JButton();
        btnFase10 = new javax.swing.JButton();
        btnFase11 = new javax.swing.JButton();
        btnFase12 = new javax.swing.JButton();
        btnFase13 = new javax.swing.JButton();
        btnFase14 = new javax.swing.JButton();

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
        setTitle("SINCO - JOGOS");

        btnFase1.setText("Fase 1");
        btnFase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase1ActionPerformed(evt);
            }
        });

        btnFase2.setText("Fase 2");
        btnFase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase2ActionPerformed(evt);
            }
        });

        btnFase3.setText("Fase 3");
        btnFase3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase3ActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar Tela Principal");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnFase4.setText("Fase 4");
        btnFase4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase4ActionPerformed(evt);
            }
        });

        btnFase5.setText("Fase 5");
        btnFase5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase5ActionPerformed(evt);
            }
        });

        btnFase6.setText("Fase 6");
        btnFase6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase6ActionPerformed(evt);
            }
        });

        btnFase7.setText("Fase 7");
        btnFase7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase7ActionPerformed(evt);
            }
        });

        btnFase8.setText("Fase 8");
        btnFase8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase8ActionPerformed(evt);
            }
        });

        btnFase9.setText("Fase 9");
        btnFase9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase9ActionPerformed(evt);
            }
        });

        btnFase10.setText("Fase 10");
        btnFase10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase10ActionPerformed(evt);
            }
        });

        btnFase11.setText("Fase 11");
        btnFase11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase11ActionPerformed(evt);
            }
        });

        btnFase12.setText("Fase 12");
        btnFase12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase12ActionPerformed(evt);
            }
        });

        btnFase13.setText("Fase 13");
        btnFase13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase13ActionPerformed(evt);
            }
        });

        btnFase14.setText("Fase 14");
        btnFase14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFase9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFase13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFase1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFase2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFase3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFase4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFase14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnFase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase1ActionPerformed
        
//        AlteraCor1 altera = new AlteraCor1();
//        altera.montarFrame();
        
        Jogo1 jogo = new Jogo1();
        jogo.montarFrame();
        dispose();
    }//GEN-LAST:event_btnFase1ActionPerformed

    private void btnFase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase2ActionPerformed
        Jogo2 jogo = new Jogo2();
        jogo.montarFrame();
        dispose();
    }//GEN-LAST:event_btnFase2ActionPerformed

    private void btnFase3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase3ActionPerformed
        Jogo3 jogo = new Jogo3();
        jogo.montarFrame();
        dispose();
    }//GEN-LAST:event_btnFase3ActionPerformed

    private void btnFase4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase4ActionPerformed
        Jogo4 jogo = new Jogo4();
        jogo.montarFrame();
        dispose();
    }//GEN-LAST:event_btnFase4ActionPerformed

    private void btnFase5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFase5ActionPerformed

    private void btnFase6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFase6ActionPerformed

    private void btnFase7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFase7ActionPerformed

    private void btnFase8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFase8ActionPerformed

    private void btnFase9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFase9ActionPerformed

    private void btnFase10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFase10ActionPerformed

    private void btnFase11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFase11ActionPerformed

    private void btnFase12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFase12ActionPerformed

    private void btnFase13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFase13ActionPerformed

    private void btnFase14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase14ActionPerformed
        Jogo14 jogo = new Jogo14();
        jogo.montarFrame();
        dispose();
    }//GEN-LAST:event_btnFase14ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFase1;
    private javax.swing.JButton btnFase10;
    private javax.swing.JButton btnFase11;
    private javax.swing.JButton btnFase12;
    private javax.swing.JButton btnFase13;
    private javax.swing.JButton btnFase14;
    private javax.swing.JButton btnFase2;
    private javax.swing.JButton btnFase3;
    private javax.swing.JButton btnFase4;
    private javax.swing.JButton btnFase5;
    private javax.swing.JButton btnFase6;
    private javax.swing.JButton btnFase7;
    private javax.swing.JButton btnFase8;
    private javax.swing.JButton btnFase9;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFrame framePrincipal;
    // End of variables declaration//GEN-END:variables

    private void personalizarBotoes() {
     
        Border borda = new LineBorder(Color.WHITE, 2);
        btnFase1.setBorder(borda);
        btnFase2.setBorder(borda);
        btnFase3.setBorder(borda);
        btnFase4.setBorder(borda);
        btnFase5.setBorder(borda);
        btnFase6.setBorder(borda);
        btnFase7.setBorder(borda);
        btnFase8.setBorder(borda);
        btnFase9.setBorder(borda);
        btnFase10.setBorder(borda);
        btnFase11.setBorder(borda);
        btnFase12.setBorder(borda);
        btnFase13.setBorder(borda);
        btnFase14.setBorder(borda);
        btnVoltar.setBorder(borda);
        
    }
}
