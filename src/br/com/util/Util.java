package br.com.util;

import br.com.view.EscolheJogo;
import br.com.view.Jogo2;
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
         int alturaTela;
    int larguraTela;

    public Util(){
        AjustarTamanhoTela();
        //System.out.println("construtor util");
    }
    
    public JFrame montarFrameGenerico(){
        JFrame frame = new JFrame();
        
        btnVoltar.setBounds((this.larguraTela - 170), 10, 150, 100);
        
        frame.add(btnVoltar,BorderLayout.CENTER);
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
                System.out.println("botao");
                try {
                    new EscolheJogo().setVisible(true);
                    dispose();
                } catch (Exception ex) {
                    Logger.getLogger(Jogo2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });    



        return frame;
    }
            
    
    public void AjustarTamanhoTela() {
        this.alturaTela = ((Toolkit.getDefaultToolkit().getScreenSize()).height);
        this.larguraTela = ((Toolkit.getDefaultToolkit().getScreenSize()).width);

        // debug
//        System.out.println("width= " + this.larguraTela + "  height= " + this.alturaTela);
//        System.out.println("alturaRetanguloPadrao= " + this.alturaRetanguloPadrao + "  larguraRetanguloPadrao= " + this.larguraRetanguloPadrao);
//		System.out.println("largura 1= " + fracaoLargura);
//		System.out.println("largura 2= " + (meiaTelaLargura + fracaoLargura));
    }

    
}
