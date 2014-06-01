package br.com.view;


import java.awt.Color;
import java.awt.Frame;

import static java.awt.Frame.MAXIMIZED_BOTH;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class Jogo3 extends Panel {

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

    Map<String, String> valores = new HashMap<String, String>();

    Rectangle retangulo11;
    Rectangle retangulo12;
    Color corRetangulo11;
    Color corRetangulo12;

    Rectangle retangulo21;
    Rectangle retangulo22;
    Color corRetangulo21;
    Color corRetangulo22;

    Rectangle retangulo31;
    Rectangle retangulo32;
    Color corRetangulo31;
    Color corRetangulo32;

    Rectangle retangulo41;
    Rectangle retangulo42;
    Color corRetangulo41;
    Color corRetangulo42;

    boolean retangulo11Marcado = false;
    boolean retangulo12Marcado = false;
    boolean retangulo21Marcado = false;
    boolean retangulo22Marcado = false;
    boolean retangulo31Marcado = false;
    boolean retangulo32Marcado = false;
    boolean retangulo41Marcado = false;
    boolean retangulo42Marcado = false;

    static JLabel lblCronometro = new JLabel();
    static Frame frame = new Frame("Fase 3");

    private static final long serialVersionUID = 8067455339781596616L;

    public static void main(String[] arg) {
        frame.add(new Jogo3());
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setExtendedState(MAXIMIZED_BOTH);

    }

    public Jogo3() {
        AjustarCursosMouse();
        AjustarTamanhoTela();
        MontarRetangulo();
    }

    public void montarFrame() {
        frame.add(new Jogo3());
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

//		frame.getContentPane().add(lblCronometro, BorderLayout.CENTER); 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setExtendedState(MAXIMIZED_BOTH);
    }

    public void MontarRetangulo() {

        int nivel = 1;

        switch (nivel) {
            case 1:
                //x = largura na tela
                //y = altura na tela
                // x ,  y , width, height

                retangulo11 = new Rectangle(170, 150, larguraRetanguloPadrao, alturaRetanguloPadrao);
                corRetangulo11 = Color.black;
                retangulo12 = new Rectangle(170, 370, larguraRetanguloPadrao, alturaRetanguloPadrao);
                corRetangulo12 = Color.black;

                retangulo21 = new Rectangle(450, 150, larguraRetanguloPadrao, alturaRetanguloPadrao);
                corRetangulo21 = Color.black;
                retangulo22 = new Rectangle(450, 370, larguraRetanguloPadrao, alturaRetanguloPadrao);
                corRetangulo22 = Color.black;

                retangulo31 = new Rectangle(740, 150, larguraRetanguloPadrao, alturaRetanguloPadrao);
                corRetangulo31 = Color.black;
                retangulo32 = new Rectangle(740, 370, larguraRetanguloPadrao, alturaRetanguloPadrao);
                corRetangulo32 = Color.black;

                retangulo41 = new Rectangle(1000, 150, larguraRetanguloPadrao, alturaRetanguloPadrao);
                corRetangulo41 = Color.black;
                retangulo42 = new Rectangle(1000, 370, larguraRetanguloPadrao, alturaRetanguloPadrao);
                corRetangulo42 = Color.black;

                addMouseMotionListener(new RectangleHandler());

                break;
        }
    }

    public void paint(Graphics grafico) {

        grafico.setColor(corRetangulo11);
        grafico.fillRect(retangulo11.x, retangulo11.y, retangulo11.width,
                retangulo11.height);
        grafico.setColor(corRetangulo12);
        grafico.fillRect(retangulo12.x, retangulo12.y, retangulo12.width,
                retangulo12.height);

        grafico.setColor(corRetangulo21);
        grafico.fillRect(retangulo21.x, retangulo21.y, retangulo21.width,retangulo21.height);
        grafico.setColor(corRetangulo22);
        grafico.fillRect(retangulo22.x, retangulo22.y, retangulo22.width,retangulo22.height);

        grafico.setColor(corRetangulo31);
        grafico.fillRect(retangulo31.x, retangulo31.y, retangulo31.width,retangulo31.height);
        grafico.setColor(corRetangulo32);
        grafico.fillRect(retangulo32.x, retangulo32.y, retangulo32.width,retangulo32.height);

        grafico.setColor(corRetangulo41);
        grafico.fillRect(retangulo41.x, retangulo41.y, retangulo41.width,retangulo41.height);
        grafico.setColor(corRetangulo42);
        grafico.fillRect(retangulo42.x, retangulo42.y, retangulo42.width,retangulo42.height);

    }

    private void AjustarCursosMouse() {

        try {
            Robot robot = new Robot();
            robot.mouseMove(0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void AjustarTamanhoTela() {
        this.alturaTela = ((Toolkit.getDefaultToolkit().getScreenSize()).height);
        this.larguraTela = ((Toolkit.getDefaultToolkit().getScreenSize()).width);

        this.alturaRetanguloPadrao = alturaTela / 5;
        this.larguraRetanguloPadrao = alturaTela / 5;

        this.meiaTelaLargura = this.larguraTela / 2;
        this.fracaoLargura = (this.larguraTela / 2) / 3;

        // debug
        System.out.println("width= " + this.larguraTela + "  height= " + this.alturaTela);
        System.out.println("alturaRetanguloPadrao= " + this.alturaRetanguloPadrao + "  larguraRetanguloPadrao= " + this.larguraRetanguloPadrao);
//		System.out.println("largura 1= " + fracaoLargura);
//		System.out.println("largura 2= " + (meiaTelaLargura + fracaoLargura));
    }

    private class RectangleHandler extends MouseMotionAdapter {

        public void mouseMoved(MouseEvent event) {
            int posicaoX = event.getX();
            int posicaoY = event.getY();

            pintarRetangulo11(posicaoX, posicaoY);
            pintarRetangulo12(posicaoX, posicaoY);

            pintarRetangulo21(posicaoX, posicaoY);
            pintarRetangulo22(posicaoX, posicaoY);

            pintarRetangulo31(posicaoX, posicaoY);
            pintarRetangulo32(posicaoX, posicaoY);

            pintarRetangulo41(posicaoX, posicaoY);
            pintarRetangulo42(posicaoX, posicaoY);

            verificarTodosRetangulos();

        }

        private void verificarTodosRetangulos() {

            if (retangulo11Marcado && retangulo12Marcado && retangulo21Marcado
                    && retangulo22Marcado) {
                System.out.println("todos percorridos");
            }

        }

        //11
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

        //12
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

        //22
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

        // 31
        private void pintarRetangulo31(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo31.x;
            int retanguloX2 = retangulo31.x + retangulo31.width;
            int retanguloY1 = retangulo31.y;
            int retanguloY2 = retangulo31.y + retangulo31.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo31 = cor;
                retangulo31Marcado = true;
                repaint();
            }

        }

        //32
        private void pintarRetangulo32(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo32.x;
            int retanguloX2 = retangulo32.x + retangulo32.width;
            int retanguloY1 = retangulo32.y;
            int retanguloY2 = retangulo32.y + retangulo32.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo32 = cor;
                retangulo32Marcado = true;
                repaint();
            }

        }

                // 41
        private void pintarRetangulo41(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo41.x;
            int retanguloX2 = retangulo41.x + retangulo41.width;
            int retanguloY1 = retangulo41.y;
            int retanguloY2 = retangulo41.y + retangulo41.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo41 = cor;
                retangulo41Marcado = true;
                repaint();
            }

        }

        //42
        private void pintarRetangulo42(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo42.x;
            int retanguloX2 = retangulo42.x + retangulo42.width;
            int retanguloY1 = retangulo42.y;
            int retanguloY2 = retangulo42.y + retangulo42.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo42 = cor;
                retangulo42Marcado = true;
                repaint();
            }

        }

    }
}
