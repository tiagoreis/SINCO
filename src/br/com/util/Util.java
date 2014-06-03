package br.com.util;

import br.com.view.EscolheJogo;
import br.com.view.*;
import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
import java.awt.BorderLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Util {

    JButton btnVoltar = new JButton("Voltar");
    private int alturaTela;
    private int larguraTela;

    public Util() {
        AjustarTamanhoTela();
        //System.out.println("construtor util");
    }

    public JFrame montarFrameGenericoJogo1() {
        JFrame frame = new JFrame();

        btnVoltar = localizacaoBotaoVoltar(btnVoltar);
//        btnVoltar.setBounds((this.getLarguraTela() - 170), 10, 150, 100);

        frame.add(btnVoltar, BorderLayout.CENTER);
        frame.add(new Jogo1());
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setExtendedState(MAXIMIZED_BOTH);

        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                try {
                    new EscolheJogo().setVisible(true);
                    dispose();
                } catch (Exception ex) {
                    Logger.getLogger(Jogo1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        return frame;
    }

       
    public JFrame montarFrameGenericoJogo2() {
        JFrame frame = new JFrame();

        btnVoltar = localizacaoBotaoVoltar(btnVoltar);
//        btnVoltar.setBounds((this.getLarguraTela() - 170), 10, 150, 100);

        frame.add(btnVoltar, BorderLayout.CENTER);
        frame.add(new Jogo2());
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setExtendedState(MAXIMIZED_BOTH);

        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                try {
                    new Jogo2().setVisible(false);
                    new EscolheJogo().setVisible(true);
                    //dispose();
                    System.out.println("util");
                    
                } catch (Exception ex) {
                    Logger.getLogger(Jogo2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        return frame;
    }


    public JFrame montarFrameGenericoJogo3() {
        JFrame frame = new JFrame();

        btnVoltar = localizacaoBotaoVoltar(btnVoltar);
        
        frame.add(btnVoltar, BorderLayout.CENTER);
        frame.add(new Jogo3());
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setExtendedState(MAXIMIZED_BOTH);

        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                try {
                    new EscolheJogo().setVisible(true);
                    dispose();
                } catch (Exception ex) {
                    Logger.getLogger(Jogo3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        return frame;
    }

    public void AjustarTamanhoTela() {
        this.alturaTela = ((Toolkit.getDefaultToolkit().getScreenSize()).height);
        this.larguraTela = ((Toolkit.getDefaultToolkit().getScreenSize()).width);

        // debug
        System.out.println("width= " + this.larguraTela + "  height= " + this.alturaTela);
//        System.out.println("alturaRetanguloPadrao= " + this.alturaRetanguloPadrao + "  larguraRetanguloPadrao= " + this.larguraRetanguloPadrao);
//		System.out.println("largura 1= " + fracaoLargura);
//		System.out.println("largura 2= " + (meiaTelaLargura + fracaoLargura));
    }

    public int getAlturaTela() {
        return alturaTela;
    }

    public int getLarguraTela() {
        return larguraTela;
    }

    public JButton localizacaoBotaoVoltar(JButton botao) {
        botao.setBounds((this.getLarguraTela() - 170), (this.getAlturaTela() - 150), 150, 100);
        return botao;
    }

}
