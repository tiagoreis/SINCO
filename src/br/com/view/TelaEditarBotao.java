/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.util.Botao;
import br.com.util.ControleBotaoNovo;
import br.com.util.ParserBotao;
import br.com.view.TelaBotaoPersonalizado;
import java.util.List;
import javax.swing.ButtonModel;

public class TelaEditarBotao extends javax.swing.JFrame {

    private String idBotao;
    private int quantidadeBotoes = 12;

    /**
     * Creates new form TelaTextoBotao
     */
    public TelaEditarBotao() {
        initComponents();

        carregarTextoBotao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRadioBtn = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTextoBotaoNovo = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        rdBtn1 = new javax.swing.JRadioButton();
        rdBtn2 = new javax.swing.JRadioButton();
        rdBtn3 = new javax.swing.JRadioButton();
        rdBtn4 = new javax.swing.JRadioButton();
        rdBtn5 = new javax.swing.JRadioButton();
        rdBtn6 = new javax.swing.JRadioButton();
        rdBtn7 = new javax.swing.JRadioButton();
        rdBtn8 = new javax.swing.JRadioButton();
        rdBtn9 = new javax.swing.JRadioButton();
        rdBtn10 = new javax.swing.JRadioButton();
        rdBtn11 = new javax.swing.JRadioButton();
        rdBtn12 = new javax.swing.JRadioButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTextoBotaoNovo.setColumns(20);
        txtTextoBotaoNovo.setRows(5);
        jScrollPane1.setViewportView(txtTextoBotaoNovo);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        groupRadioBtn.add(rdBtn1);
        rdBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtn1ActionPerformed(evt);
            }
        });

        groupRadioBtn.add(rdBtn2);

        groupRadioBtn.add(rdBtn3);

        groupRadioBtn.add(rdBtn4);

        groupRadioBtn.add(rdBtn5);
        rdBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtn5ActionPerformed(evt);
            }
        });

        groupRadioBtn.add(rdBtn6);

        groupRadioBtn.add(rdBtn7);

        groupRadioBtn.add(rdBtn8);

        groupRadioBtn.add(rdBtn9);

        groupRadioBtn.add(rdBtn10);

        groupRadioBtn.add(rdBtn11);

        groupRadioBtn.add(rdBtn12);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnviar)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar))
                    .addComponent(rdBtn2)
                    .addComponent(rdBtn1))
                .addGap(0, 319, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdBtn3)
                    .addComponent(rdBtn4)
                    .addComponent(rdBtn5)
                    .addComponent(rdBtn6)
                    .addComponent(rdBtn7)
                    .addComponent(rdBtn10)
                    .addComponent(rdBtn8)
                    .addComponent(rdBtn12)
                    .addComponent(rdBtn11)
                    .addComponent(rdBtn9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar)
                    .addComponent(btnFechar))
                .addGap(10, 10, 10)
                .addComponent(rdBtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdBtn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdBtn4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdBtn5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdBtn6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtn7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtn8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtn9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtn10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtn11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtn12)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        rdBtn1.setSelected(true);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        String texto = txtTextoBotaoNovo.getText();
        ButtonModel sel = groupRadioBtn.getSelection();
        //String id = sel.toString();
        
        String id = radioSelecionado();
        
        System.out.println("id " +id );
//        ControleBotaoNovo controle = new ControleBotaoNovo();
//        controle.setTextoBotao(texto);

        ParserBotao parser = new ParserBotao();
        parser.gravaCadastro(id, texto);

//        TelaBotaoPersonalizado tela = new TelaBotaoPersonalizado();
//        tela.alterarTextBotao(texto, texto);

        dispose();


    }//GEN-LAST:event_btnEnviarActionPerformed

    private void rdBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdBtn5ActionPerformed

    private void rdBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdBtn1ActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarBotao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarBotao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarBotao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarBotao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarBotao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnFechar;
    private javax.swing.ButtonGroup groupRadioBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdBtn1;
    private javax.swing.JRadioButton rdBtn10;
    private javax.swing.JRadioButton rdBtn11;
    private javax.swing.JRadioButton rdBtn12;
    private javax.swing.JRadioButton rdBtn2;
    private javax.swing.JRadioButton rdBtn3;
    private javax.swing.JRadioButton rdBtn4;
    private javax.swing.JRadioButton rdBtn5;
    private javax.swing.JRadioButton rdBtn6;
    private javax.swing.JRadioButton rdBtn7;
    private javax.swing.JRadioButton rdBtn8;
    private javax.swing.JRadioButton rdBtn9;
    private javax.swing.JTextArea txtTextoBotaoNovo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the idBotao
     */
    public String getIdBotao() {
        return idBotao;
    }

    /**
     * @param idBotao the idBotao to set
     */
    public void setIdBotao(String idBotao) {
        this.idBotao = idBotao;
    }

    private void carregarTextoBotao() {

        ParserBotao parser = new ParserBotao();
        List<Botao> botoes = parser.listarBotoes();

        for (int i = 0; i < botoes.size(); i++) {

            String idBotao = botoes.get(i).getId();
            String textoBotao = botoes.get(i).getTexto();
            textoBotao = (textoBotao.isEmpty() || textoBotao.equals("")) ? "Sem texto" : textoBotao;
            
            switch (idBotao) {
                case "btn1":
                    rdBtn1.setText(textoBotao);
                    break;
                case "btn2":
                    rdBtn2.setText(textoBotao);
                    break;
                case "btn3":
                    rdBtn3.setText(textoBotao);
                    break;
                case "btn4":
                    rdBtn4.setText(textoBotao);
                    break;
                case "btn5":
                    rdBtn5.setText(textoBotao);
                    break;
                case "btn6":
                    rdBtn6.setText(textoBotao);
                    break;
                case "btn7":
                    rdBtn7.setText(textoBotao);
                    break;
                case "btn8":
                    rdBtn8.setText(textoBotao);
                    break;
                case "btn9":
                    rdBtn9.setText(textoBotao);
                    break;
                case "btn10":
                    rdBtn10.setText(textoBotao);
                    break;
                case "btn11":
                    rdBtn11.setText(textoBotao);
                    break;
                case "btn12":
                    rdBtn12.setText(textoBotao);
                    break;
            }
        }

    }

    private String radioSelecionado() {
        String idBotao = "btn1";
      
        if(rdBtn1.isSelected()){
            idBotao = "btn1";
        } else if(rdBtn2.isSelected()) {
            idBotao = "btn2";
        } else if(rdBtn3.isSelected()) {
            idBotao = "btn3";
        } else if(rdBtn4.isSelected()) {
            idBotao = "btn4";
        } else if(rdBtn5.isSelected()) {
            idBotao = "btn5";
        } else if(rdBtn6.isSelected()) {
            idBotao = "btn6";
        } else if(rdBtn7.isSelected()) {
            idBotao = "btn7";
        } else if(rdBtn8.isSelected()) {
            idBotao = "btn8";
        } else if(rdBtn9.isSelected()) {
            idBotao = "btn9";
        } else if(rdBtn10.isSelected()) {
            idBotao = "btn10";
        } else if(rdBtn11.isSelected()) {
            idBotao = "btn11";
        } else if(rdBtn12.isSelected()) {
            idBotao = "btn12";
        }
        return idBotao;
    }

}
