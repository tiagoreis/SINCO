package br.com.view;

import br.com.util.Util;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javafx.geometry.Rectangle2D;
import javafx.scene.text.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Jogo1 extends Panel {

    // http://www.professorvida.com.br/el53d/2_ig1.pdf
    // http://www.eclipse.org/efxclipse/install.html
    // http://efxclipse.bestsolution.at/install.html
    int alturaTela;
    int larguraTela;

    int alturaRetanguloPadrao = 100;
    int larguraRetanguloPadrao = 100;

    int fatorEspacoY = 110;
    int fatorEspacoX = 110;

    int meiaTelaLargura;
    int fracaoLargura;

     
   
    int fracaoLarguraRetangulo ;
    int fracaoAltura;
    int fracaoAlturaRetangulo;
    
    Map<String, String> valores = new HashMap<String, String>();

    Rectangle retangulo11;
    Rectangle retangulo12;
    Color corRetangulo11;
    Color corRetangulo12;

    boolean retangulo11Marcado = false;
    boolean retangulo12Marcado = false;
    boolean retangulo21Marcado = false;
    boolean retangulo22Marcado = false;

    static JLabel lblCronometro = new JLabel();
    static JFrame frame = new JFrame("Fase 1");

    Rectangle retangulo21;
    Rectangle retangulo22;
    Color corRetangulo21;
    Color corRetangulo22;

    Color corPadrao = Color.BLACK;
//    JButton btnVoltar = new JButton("Voltar");
    JButton btnZerar = new JButton("Zerar Jogo");
    boolean zerarJogo = false;
    
    Util util = new Util();
    private static final long serialVersionUID = 8067455339781596616L;


    
    public Jogo1() {
        util.AjustarCursosMouse();
        AjustarTamanhoTela();
        MontarRetangulo();

    }

    public void montarFrame() {
//        frame = this.util.montarFrameGenericoJogo1();
        //frame.add(btnZerar, BorderLayout.CENTER);
        //btnZerar.setBounds(0, (alturaTela - 150), 150, 100);
        frame = this.util.montarFrameGenerico(1);

        btnZerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                try {
                    reiniciarQuadadros();
                } catch (Exception ex) {
                    //Logger.getLogger(Jogo1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        frame.setTitle("Jogo 1");
    }

    public void MontarRetangulo() {

        ajustarTamanhoRetangulo();
        
        int posicaoXColuna1 = fracaoLargura;
        int posicaoY11 = fracaoAltura;
        int posicaoY12 =  fracaoAltura *2 + fracaoAlturaRetangulo;

        int posicaoXColuna2 = fracaoLargura *2;
        int posicaoY21 = fracaoAltura;
        int posicaoY22 = fracaoAltura *2 + fracaoAlturaRetangulo;
   
        retangulo11 = new Rectangle(posicaoXColuna1, posicaoY11, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo11 = Color.black;

        retangulo12 = new Rectangle(posicaoXColuna1, posicaoY12, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo12 = Color.black;

        retangulo21 = new Rectangle(posicaoXColuna2, posicaoY21, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo21 = Color.black;
        retangulo22 = new Rectangle(posicaoXColuna2, posicaoY22, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo22 = Color.black;

        addMouseMotionListener(new RectangleHandler());

    }

        private void ajustarTamanhoRetangulo() {

        this.alturaRetanguloPadrao = util.getAlturaTela() / 5;
        this.larguraRetanguloPadrao = util.getAlturaTela() / 5;

        fracaoLargura = util.getLarguraTela() / 3;
        fracaoLarguraRetangulo = fracaoLargura / 3;

        fracaoAltura = util.getAlturaTela() / 5;
        fracaoAlturaRetangulo = fracaoAltura / 3;

//        System.out.println("alturaRetanguloPadrao= " + this.alturaRetanguloPadrao + "  larguraRetanguloPadrao= " + this.larguraRetanguloPadrao);
//        System.out.println("fracaoLargura= " + fracaoLargura + "  fracaoLarguraRetangulo= " + fracaoLarguraRetangulo);
//        System.out.println("fracaoAltura= " + fracaoAltura + "  fracaoAlturaRetangulo= " + fracaoAlturaRetangulo);
//        System.out.println("(fracaoAltura * 2) = " + (fracaoAltura * 2));

    }

        
    @Override
    public void paint(Graphics grafico) {

        grafico.setColor(corRetangulo11);
        grafico.fillRect(retangulo11.x, retangulo11.y, retangulo11.width, retangulo11.height);
        grafico.setColor(corRetangulo12);
        grafico.fillRect(retangulo12.x, retangulo12.y, retangulo12.width, retangulo12.height);

        grafico.setColor(corRetangulo21);
        grafico.fillRect(retangulo21.x, retangulo21.y, retangulo21.width, retangulo21.height);
        grafico.setColor(corRetangulo22);
        grafico.fillRect(retangulo22.x, retangulo22.y, retangulo22.width, retangulo22.height);
    }



    private void AjustarTamanhoTela() {
        this.alturaTela = ((Toolkit.getDefaultToolkit().getScreenSize()).height);
        this.larguraTela = ((Toolkit.getDefaultToolkit().getScreenSize()).width);

        this.alturaRetanguloPadrao = alturaTela / 5;
        this.larguraRetanguloPadrao = alturaTela / 5;

        this.meiaTelaLargura = this.larguraTela / 2;
        this.fracaoLargura = (this.larguraTela / 2) / 3;

    }

    public void iniciaCronometro() {
        Timer timer = null;

        final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

        if (timer == null) {
            timer = new Timer();

            TimerTask tarefa = new TimerTask() {

                @Override
                public void run() {
                    try {
                        System.out.println("Hora: " + format.format(new Date().getTime()));
                    } catch (Exception e) {
                    }
                }

            };

            timer.scheduleAtFixedRate(tarefa, 0, 1000);
        }
    }

    //http://www.guj.com.br/java/286222-resolvido-ajuda-com-cronometro-usando-timer
    public void Cronometro(final JLabel label) {

        final Timer timer = new Timer();

        TimerTask tarefa = new TimerTask() {

            int hora = 0;
            int minuto = 0;
            int segundo = 0;

            public void run() {
                try {

                    label.setText(hora + ":" + minuto + ":" + segundo);
                    segundo++;
                    if (segundo == 60) {
                        segundo = 0;
                        minuto++;
                        if (minuto == 60) {
                            minuto = 0;
                            hora++;
                            if (hora == 60) {
                                hora = 0;
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        timer.schedule(tarefa, 1000, 1000);
    }

            
    public void reiniciarQuadadros() {
        corRetangulo11 = corPadrao;
        corRetangulo12 = corPadrao;
        corRetangulo21 = corPadrao;
        corRetangulo22 = corPadrao;

        retangulo11Marcado = false;
        retangulo12Marcado = false;
        retangulo21Marcado = false;
        retangulo22Marcado = false;

//        frame.invalidate();
//        frame.validate();
//        frame.repaint();
//        
        SwingUtilities.updateComponentTreeUI(frame);
        
    }

    private class RectangleHandler extends MouseMotionAdapter {

        public void mouseMoved(MouseEvent event) {
            int posicaoX = event.getX();
            int posicaoY = event.getY();

            pintarRetangulo11(posicaoX, posicaoY);
            pintarRetangulo12(posicaoX, posicaoY);

            pintarRetangulo21(posicaoX, posicaoY);
            pintarRetangulo22(posicaoX, posicaoY);

            verificarTodosRetangulos();
            
            if(zerarJogo){
                pintarTodos();
                zerarJogo = false;
            }

        }
        


        private void verificarTodosRetangulos() {

            if (retangulo11Marcado && retangulo12Marcado && retangulo21Marcado
                    && retangulo22Marcado) {
                System.out.println("todos percorridos");
            }

        }

                
        private void pintarTodos() {

            corRetangulo11 = corPadrao;
            corRetangulo12 = corPadrao;
            corRetangulo21 = corPadrao;
            corRetangulo22 = corPadrao;

            retangulo11Marcado = false;
            retangulo12Marcado = false;
            retangulo21Marcado = false;
            retangulo22Marcado = false;

            repaint();
            validate();

        }

                
        private void pintarRetangulo11(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo11.x;
            int retanguloX2 = retangulo11.x + retangulo11.width;
            int retanguloY1 = retangulo11.y;
            int retanguloY2 = retangulo11.y + retangulo11.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo11 = cor;
                retangulo11Marcado = true;
                repaint();
            }

        }

        private void pintarRetangulo12(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo12.x;
            int retanguloX2 = retangulo12.x + retangulo12.width;
            int retanguloY1 = retangulo12.y;
            int retanguloY2 = retangulo12.y + retangulo12.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo12 = cor;
                retangulo12Marcado = true;
                repaint();
            }

        }

        // 21
        private void pintarRetangulo21(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo21.x;
            int retanguloX2 = retangulo21.x + retangulo21.width;
            int retanguloY1 = retangulo21.y;
            int retanguloY2 = retangulo21.y + retangulo21.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo21 = cor;
                retangulo21Marcado = true;
                repaint();
            }

        }

        private void pintarRetangulo22(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo22.x;
            int retanguloX2 = retangulo22.x + retangulo22.width;
            int retanguloY1 = retangulo22.y;
            int retanguloY2 = retangulo22.y + retangulo22.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo22 = cor;
                retangulo22Marcado = true;
                repaint();
            }

        }

    }
}
