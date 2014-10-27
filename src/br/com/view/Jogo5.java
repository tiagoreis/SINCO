package br.com.view;


import br.com.util.Util;
import java.awt.Color;
import java.awt.Frame;


import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;

public class Jogo5 extends Panel {

    int alturaTela;
    int larguraTela;

    int alturaRetanguloPadrao = 60;
    int larguraRetanguloPadrao = 60;

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
    Rectangle retangulo13;
    Rectangle retangulo14;

    Color corRetangulo11;
    Color corRetangulo12;
    Color corRetangulo13;
    Color corRetangulo14;

    Rectangle retangulo21;
    Rectangle retangulo22;
    Rectangle retangulo23;
    Rectangle retangulo24;

    Color corRetangulo21;
    Color corRetangulo22;
    Color corRetangulo23;
    Color corRetangulo24;

    Rectangle retangulo31;
    Rectangle retangulo32;
    Rectangle retangulo33;
    Rectangle retangulo34;
    
    Color corRetangulo31;
    Color corRetangulo32;
    Color corRetangulo33;
    Color corRetangulo34;

    Rectangle retangulo41;
    Rectangle retangulo42;
    Rectangle retangulo43;
    Rectangle retangulo44;

    Color corRetangulo41;
    Color corRetangulo42;
    Color corRetangulo43;
    Color corRetangulo44;

    boolean retangulo11Marcado = false;
    boolean retangulo12Marcado = false;
    boolean retangulo13Marcado = false;
    boolean retangulo14Marcado = false;
    boolean retangulo21Marcado = false;
    boolean retangulo22Marcado = false;
    boolean retangulo23Marcado = false;
    boolean retangulo24Marcado = false;
    boolean retangulo31Marcado = false;
    boolean retangulo32Marcado = false;
    boolean retangulo33Marcado = false;
    boolean retangulo34Marcado = false;
    boolean retangulo41Marcado = false;
    boolean retangulo42Marcado = false;
    boolean retangulo43Marcado = false;
    boolean retangulo44Marcado = false;

    static JLabel lblCronometro = new JLabel();
    static Frame frame = new Frame("Fase 5");

    private static final long serialVersionUID = 8067455339781596616L;
    Util util = new Util();

    public Jogo5() {
        AjustarCursosMouse();
        util.AjustarTamanhoTela();
        montarRetangulo();
    }

    public void montarFrame() {
        frame = this.util.montarFrameGenerico(5);
    }

    public void montarRetangulo() {

        ajustarTamanhoRetangulo();
        //x = largura na tela
        //y = altura na tela
        // x ,  y , width, height
        int posicaoXColuna1 = fracaoLarguraRetangulo;
        int posicaoY11 = fracaoAlturaRetangulo;
        int posicaoY12 = fracaoAlturaRetangulo + fracaoAltura;
        int posicaoY13 = (fracaoAlturaRetangulo + (fracaoAltura * 2));
        int posicaoY14 = (fracaoAlturaRetangulo + (fracaoAltura * 3));
        
        int posicaoXColuna2 = (fracaoLarguraRetangulo + fracaoLargura);
        int posicaoY21 = fracaoAlturaRetangulo;
        int posicaoY22 = fracaoAlturaRetangulo + fracaoAltura;
        int posicaoY23 = (fracaoAlturaRetangulo + (fracaoAltura * 2));
        int posicaoY24 = (fracaoAlturaRetangulo + (fracaoAltura * 3));
        
        int posicaoXColuna3 = fracaoLarguraRetangulo + (fracaoLargura * 2);
        int posicaoY31 = fracaoAlturaRetangulo;
        int posicaoY32 = fracaoAlturaRetangulo + fracaoAltura;
        int posicaoY33 = (fracaoAlturaRetangulo + (fracaoAltura * 2));  
        int posicaoY34 = (fracaoAlturaRetangulo + (fracaoAltura * 3));
        
                
        int posicaoXColuna4 = fracaoLarguraRetangulo + fracaoLargura + (fracaoLargura* 2);
        int posicaoY41 = fracaoAlturaRetangulo;
        int posicaoY42 = fracaoAlturaRetangulo + fracaoAltura;
        int posicaoY43 = (fracaoAlturaRetangulo + (fracaoAltura * 2));
        int posicaoY44 = (fracaoAlturaRetangulo + (fracaoAltura * 3));
        

        retangulo11 = new Rectangle(posicaoXColuna1, posicaoY11, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo11 = Color.black;
        retangulo12 = new Rectangle(posicaoXColuna1, posicaoY12, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo12 = Color.black;
        retangulo13 = new Rectangle(posicaoXColuna1, posicaoY13, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo13 = Color.black;
        retangulo14 = new Rectangle(posicaoXColuna1, posicaoY14, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo14 = Color.black;

        retangulo21 = new Rectangle(posicaoXColuna2, posicaoY21, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo21 = Color.black;
        retangulo22 = new Rectangle(posicaoXColuna2, posicaoY22, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo22 = Color.black;
        retangulo23 = new Rectangle(posicaoXColuna2, posicaoY23, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo23 = Color.black;
        retangulo24 = new Rectangle(posicaoXColuna2, posicaoY24, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo24 = Color.black;

        retangulo31 = new Rectangle(posicaoXColuna3, posicaoY31, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo31 = Color.black;
        retangulo32 = new Rectangle(posicaoXColuna3, posicaoY32, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo32 = Color.black;
        retangulo33 = new Rectangle(posicaoXColuna3, posicaoY33, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo33 = Color.black;
        retangulo34 = new Rectangle(posicaoXColuna3, posicaoY34, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo34 = Color.black;

        retangulo41 = new Rectangle(posicaoXColuna4, posicaoY41, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo41 = Color.black;
        retangulo42 = new Rectangle(posicaoXColuna4, posicaoY42, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo42 = Color.black;
        retangulo43 = new Rectangle(posicaoXColuna4, posicaoY43, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo43 = Color.black;
        retangulo44 = new Rectangle(posicaoXColuna4, posicaoY44, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo44 = Color.black;

        addMouseMotionListener(new RectangleHandler());


    }

        
    private void ajustarTamanhoRetangulo() {
        
        this.alturaRetanguloPadrao = util.getAlturaTela() / 6;
        this.larguraRetanguloPadrao = util.getAlturaTela() / 6;

        fracaoLargura = util.getLarguraTela() / 4;
        fracaoLarguraRetangulo = fracaoLargura / 4;
        
        fracaoAltura = util.getAlturaTela() / 5;
        fracaoAlturaRetangulo = fracaoAltura / 5;
        
//        System.out.println("alturaRetanguloPadrao= " + this.alturaRetanguloPadrao + "  larguraRetanguloPadrao= " + this.larguraRetanguloPadrao);
//        System.out.println("fracaoLargura= " + fracaoLargura + "  fracaoLarguraRetangulo= " + fracaoLarguraRetangulo);
//        System.out.println("fracaoAltura= " + fracaoAltura + "  fracaoAlturaRetangulo= " + fracaoAlturaRetangulo);
//        System.out.println("(fracaoAltura * 2) = " + (fracaoAltura * 2));

    }


    public void paint(Graphics grafico) {

        grafico.setColor(corRetangulo11);
        grafico.fillRect(retangulo11.x, retangulo11.y, retangulo11.width, retangulo11.height);
        grafico.setColor(corRetangulo12);
        grafico.fillRect(retangulo12.x, retangulo12.y, retangulo12.width, retangulo12.height);
        grafico.setColor(corRetangulo13);
        grafico.fillRect(retangulo13.x, retangulo13.y, retangulo13.width, retangulo13.height);
        grafico.setColor(corRetangulo14);
        grafico.fillRect(retangulo14.x, retangulo14.y, retangulo14.width, retangulo14.height);

        grafico.setColor(corRetangulo21);
        grafico.fillRect(retangulo21.x, retangulo21.y, retangulo21.width, retangulo21.height);
        grafico.setColor(corRetangulo22);
        grafico.fillRect(retangulo22.x, retangulo22.y, retangulo22.width, retangulo22.height);
        grafico.setColor(corRetangulo23);
        grafico.fillRect(retangulo23.x, retangulo23.y, retangulo23.width,retangulo23.height);
        grafico.setColor(corRetangulo24);
        grafico.fillRect(retangulo24.x, retangulo24.y, retangulo24.width,retangulo24.height);

        grafico.setColor(corRetangulo31);
        grafico.fillRect(retangulo31.x, retangulo31.y, retangulo31.width, retangulo31.height);
        grafico.setColor(corRetangulo32);
        grafico.fillRect(retangulo32.x, retangulo32.y, retangulo32.width, retangulo32.height);
        grafico.setColor(corRetangulo33);
        grafico.fillRect(retangulo33.x, retangulo33.y, retangulo33.width,retangulo33.height);
        grafico.setColor(corRetangulo34);
        grafico.fillRect(retangulo34.x, retangulo34.y, retangulo34.width, retangulo34.height);

        grafico.setColor(corRetangulo41);
        grafico.fillRect(retangulo41.x, retangulo41.y, retangulo41.width,retangulo41.height);
        grafico.setColor(corRetangulo42);
        grafico.fillRect(retangulo42.x, retangulo42.y, retangulo42.width,retangulo42.height);
        grafico.setColor(corRetangulo43);
        grafico.fillRect(retangulo43.x, retangulo43.y, retangulo43.width,retangulo43.height);
        grafico.setColor(corRetangulo44);
        grafico.fillRect(retangulo44.x, retangulo44.y, retangulo44.width,retangulo44.height);

    }

    private void AjustarCursosMouse() {

        try {
            Robot robot = new Robot();
            robot.mouseMove(0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private class RectangleHandler extends MouseMotionAdapter {

        public void mouseMoved(MouseEvent event) {
            int posicaoX = event.getX();
            int posicaoY = event.getY();

            pintarRetangulo11(posicaoX, posicaoY);
            pintarRetangulo12(posicaoX, posicaoY);
            pintarRetangulo13(posicaoX, posicaoY);
            pintarRetangulo14(posicaoX, posicaoY);

            pintarRetangulo21(posicaoX, posicaoY);
            pintarRetangulo22(posicaoX, posicaoY);
            pintarRetangulo23(posicaoX, posicaoY);
            pintarRetangulo24(posicaoX, posicaoY);

            pintarRetangulo31(posicaoX, posicaoY);
            pintarRetangulo32(posicaoX, posicaoY);
            pintarRetangulo33(posicaoX, posicaoY);
            pintarRetangulo34(posicaoX, posicaoY);

            pintarRetangulo41(posicaoX, posicaoY);
            pintarRetangulo42(posicaoX, posicaoY);
            pintarRetangulo43(posicaoX, posicaoY);
            pintarRetangulo44(posicaoX, posicaoY);

            verificarTodosRetangulos();

        }

        private void verificarTodosRetangulos() {

            if (retangulo11Marcado && retangulo12Marcado && retangulo21Marcado
                    && retangulo22Marcado) {
//                System.out.println("todos percorridos");
            }

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
        private void pintarRetangulo13(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo13.x;
            int retanguloX2 = retangulo13.x + retangulo13.width;
            int retanguloY1 = retangulo13.y;
            int retanguloY2 = retangulo13.y + retangulo13.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo13 = cor;
                retangulo13Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo14(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo14.x;
            int retanguloX2 = retangulo14.x + retangulo14.width;
            int retanguloY1 = retangulo14.y;
            int retanguloY2 = retangulo14.y + retangulo14.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo14 = cor;
                retangulo14Marcado = true;
                repaint();
            }

        }
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
        private void pintarRetangulo23(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo23.x;
            int retanguloX2 = retangulo23.x + retangulo23.width;
            int retanguloY1 = retangulo23.y;
            int retanguloY2 = retangulo23.y + retangulo23.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo23 = cor;
                retangulo23Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo24(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo24.x;
            int retanguloX2 = retangulo24.x + retangulo24.width;
            int retanguloY1 = retangulo24.y;
            int retanguloY2 = retangulo24.y + retangulo24.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo24 = cor;
                retangulo24Marcado = true;
                repaint();
            }

        }
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
        private void pintarRetangulo33(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo33.x;
            int retanguloX2 = retangulo33.x + retangulo33.width;
            int retanguloY1 = retangulo33.y;
            int retanguloY2 = retangulo33.y + retangulo33.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo33 = cor;
                retangulo33Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo34(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo34.x;
            int retanguloX2 = retangulo34.x + retangulo34.width;
            int retanguloY1 = retangulo34.y;
            int retanguloY2 = retangulo34.y + retangulo34.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo34 = cor;
                retangulo34Marcado = true;
                repaint();
            }

        }
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
        private void pintarRetangulo43(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo43.x;
            int retanguloX2 = retangulo43.x + retangulo43.width;
            int retanguloY1 = retangulo43.y;
            int retanguloY2 = retangulo43.y + retangulo43.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo43 = cor;
                retangulo43Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo44(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo44.x;
            int retanguloX2 = retangulo44.x + retangulo44.width;
            int retanguloY1 = retangulo44.y;
            int retanguloY2 = retangulo44.y + retangulo44.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo44 = cor;
                retangulo44Marcado = true;
                repaint();
            }

        }

    }
}
