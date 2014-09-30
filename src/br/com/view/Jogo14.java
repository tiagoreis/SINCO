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

public class Jogo14 extends Panel {

    // http://www.professorvida.com.br/el53d/2_ig1.pdf
    // http://www.eclipse.org/efxclipse/install.html
    // http://efxclipse.bestsolution.at/install.html
    int alturaTela;
    int larguraTela;

    int alturaRetanguloPadrao = 15;
    int larguraRetanguloPadrao = 15;

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
    Rectangle retangulo15;
    Rectangle retangulo16;

    Color corRetangulo11;
    Color corRetangulo12;
    Color corRetangulo13;
    Color corRetangulo14;
    Color corRetangulo15;
    Color corRetangulo16;

    Rectangle retangulo21;
    Rectangle retangulo22;
    Rectangle retangulo23;
    Rectangle retangulo24;
    Rectangle retangulo25;
    Rectangle retangulo26;
    Color corRetangulo21;
    Color corRetangulo22;
    Color corRetangulo23;
    Color corRetangulo24;
    Color corRetangulo25;
    Color corRetangulo26;

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
    boolean retangulo13Marcado = false;
    boolean retangulo14Marcado = false;
    boolean retangulo15Marcado = false;
    boolean retangulo16Marcado = false;
    
    boolean retangulo21Marcado = false;
    boolean retangulo22Marcado = false;
    boolean retangulo23Marcado = false;
    boolean retangulo24Marcado = false;
    boolean retangulo25Marcado = false;
    boolean retangulo26Marcado = false;
    
    boolean retangulo31Marcado = false;
    boolean retangulo32Marcado = false;
    boolean retangulo41Marcado = false;
    boolean retangulo42Marcado = false;

    static JLabel lblCronometro = new JLabel();
    static Frame frame = new Frame("Fase 14");

    private static final long serialVersionUID = 8067455339781596616L;
    Util util = new Util();

    public Jogo14() {
        AjustarCursosMouse();
        util.AjustarTamanhoTela();
        montarRetangulo();
    }

    public void montarFrame() {
        frame = this.util.montarFrameGenericoJogo14();
        frame.setTitle("Jogo 14");
    }

    public void montarRetangulo() {

        ajustarTamanhoRetangulo();
        
        int posicaoY13 = (fracaoAlturaRetangulo + (fracaoAltura * 2));
        int posicaoY14 = (fracaoAlturaRetangulo + (fracaoAltura * 3));
        int posicaoY15 = (fracaoAlturaRetangulo + (fracaoAltura * 4));
        int posicaoY16 = (fracaoAlturaRetangulo + (fracaoAltura * 5));
        
        int posicaoX23 = (fracaoLarguraRetangulo + fracaoLargura);
        int posicaoX24 = (fracaoLarguraRetangulo + (fracaoLargura * 3));
        int posicaoX25 = (fracaoLarguraRetangulo + (fracaoLargura * 4));
        int posicaoX26 = (fracaoLarguraRetangulo + (fracaoLargura * 5));

        int posicaoY23 = (fracaoAlturaRetangulo + (fracaoAltura * 2));
        int posicaoY24 = (fracaoAlturaRetangulo + (fracaoAltura * 3));
        int posicaoY25 = (fracaoAlturaRetangulo + (fracaoAltura * 4));
        int posicaoY26 = (fracaoAlturaRetangulo + (fracaoAltura * 5));

        
        //x = largura na tela
        //y = altura na tela
        // x ,  y , width, height

        //coluna/linha
        //  1      2
        retangulo11 = new Rectangle(fracaoLarguraRetangulo, fracaoAlturaRetangulo, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo11 = Color.black;
        retangulo12 = new Rectangle(fracaoLarguraRetangulo, (fracaoAlturaRetangulo + fracaoAltura), larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo12 = Color.black;
        
        retangulo13 = new Rectangle(fracaoLarguraRetangulo, posicaoY13, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo13 = Color.black;
        retangulo14 = new Rectangle(fracaoLarguraRetangulo, posicaoY14, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo14 = Color.black;
        
        retangulo15 = new Rectangle(fracaoLarguraRetangulo, posicaoY15, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo15 = Color.black;
        retangulo16 = new Rectangle(fracaoLarguraRetangulo, posicaoY16, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo16 = Color.black;

        retangulo21 = new Rectangle((fracaoLarguraRetangulo + fracaoLargura), fracaoAlturaRetangulo, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo21 = Color.black;
        retangulo22 = new Rectangle((fracaoLarguraRetangulo + fracaoLargura), (fracaoAlturaRetangulo + fracaoAltura), larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo22 = Color.black;

        retangulo23 = new Rectangle(posicaoX23, posicaoY23, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo23 = Color.black;
        retangulo24 = new Rectangle(posicaoX23, posicaoY24, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo24 = Color.black;

        retangulo25 = new Rectangle(posicaoX23, posicaoY25, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo25 = Color.black;
        retangulo26 = new Rectangle(posicaoX23, posicaoY26, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo26 = Color.black;

        retangulo31 = new Rectangle((fracaoLarguraRetangulo + (fracaoLargura * 2)), fracaoAlturaRetangulo, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo31 = Color.black;
        retangulo32 = new Rectangle((fracaoLarguraRetangulo + (fracaoLargura * 2)), (fracaoAlturaRetangulo + fracaoAltura), larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo32 = Color.black;

        retangulo41 = new Rectangle((fracaoLarguraRetangulo + (fracaoLargura * 3)), fracaoAlturaRetangulo, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo41 = Color.black;
        retangulo42 = new Rectangle((fracaoLarguraRetangulo + (fracaoLargura * 3)), (fracaoAlturaRetangulo + fracaoAltura), larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo42 = Color.black;

        addMouseMotionListener(new RectangleHandler());


    }

        private void ajustarTamanhoRetangulo() {
        
        this.alturaRetanguloPadrao = util.getAlturaTela() / 8;
        this.larguraRetanguloPadrao = util.getAlturaTela() / 8;

        fracaoLargura = util.getLarguraTela() / 7;
        fracaoLarguraRetangulo = fracaoLargura / 7;
        
        fracaoAltura = util.getAlturaTela() / 7;
        fracaoAlturaRetangulo = fracaoAltura / 7;
        
        
//        System.out.println("alturaRetanguloPadrao= " + this.alturaRetanguloPadrao + "  larguraRetanguloPadrao= " + this.larguraRetanguloPadrao);
        System.out.println("fracaoLargura= " + fracaoLargura + "  fracaoLarguraRetangulo= " + fracaoLarguraRetangulo);
        System.out.println("fracaoAltura= " + fracaoAltura + "  fracaoAlturaRetangulo= " + fracaoAlturaRetangulo);
        System.out.println("(fracaoAltura * 2) = " + (fracaoAltura * 2));
        

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
        grafico.setColor(corRetangulo15);
        grafico.fillRect(retangulo15.x, retangulo15.y, retangulo15.width, retangulo15.height);
        grafico.setColor(corRetangulo16);
        grafico.fillRect(retangulo16.x, retangulo16.y, retangulo16.width, retangulo16.height);

        grafico.setColor(corRetangulo21);
        grafico.fillRect(retangulo21.x, retangulo21.y, retangulo21.width,retangulo21.height);
        grafico.setColor(corRetangulo22);
        grafico.fillRect(retangulo22.x, retangulo22.y, retangulo22.width,retangulo22.height);

        grafico.setColor(corRetangulo23);
        grafico.fillRect(retangulo23.x, retangulo23.y, retangulo23.width,retangulo23.height);
        grafico.setColor(corRetangulo24);
        grafico.fillRect(retangulo24.x, retangulo24.y, retangulo24.width,retangulo24.height);

        grafico.setColor(corRetangulo25);
        grafico.fillRect(retangulo25.x, retangulo25.y, retangulo25.width,retangulo25.height);
        grafico.setColor(corRetangulo26);
        grafico.fillRect(retangulo26.x, retangulo26.y, retangulo26.width,retangulo26.height);

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



    private class RectangleHandler extends MouseMotionAdapter {

        public void mouseMoved(MouseEvent event) {
            int posicaoX = event.getX();
            int posicaoY = event.getY();

//            pintarRetangulo11(posicaoX, posicaoY);
            pintarRetangulo12(posicaoX, posicaoY);
            pintarRetangulo13(posicaoX, posicaoY);
            pintarRetangulo14(posicaoX, posicaoY);
            pintarRetangulo15(posicaoX, posicaoY);
//            pintarRetangulo16(posicaoX, posicaoY);

            pintarRetangulo21(posicaoX, posicaoY);
            pintarRetangulo22(posicaoX, posicaoY);
            pintarRetangulo23(posicaoX, posicaoY);
            pintarRetangulo24(posicaoX, posicaoY);
            pintarRetangulo25(posicaoX, posicaoY);
            pintarRetangulo26(posicaoX, posicaoY);

            pintarRetangulo31(posicaoX, posicaoY);
            pintarRetangulo32(posicaoX, posicaoY);

            pintarRetangulo41(posicaoX, posicaoY);
            pintarRetangulo42(posicaoX, posicaoY);

            verificarTodosRetangulos();

        }

        private void verificarTodosRetangulos() {

            if (retangulo11Marcado && retangulo12Marcado && retangulo21Marcado
                    && retangulo22Marcado) {
//                System.out.println("todos percorridos");
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

        private void pintarRetangulo15(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo15.x;
            int retanguloX2 = retangulo15.x + retangulo15.width;
            int retanguloY1 = retangulo15.y;
            int retanguloY2 = retangulo15.y + retangulo15.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo15 = cor;
                retangulo15Marcado = true;
                repaint();
            }

        }

        private void pintarRetangulo16(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo16.x;
            int retanguloX2 = retangulo16.x + retangulo16.width;
            int retanguloY1 = retangulo16.y;
            int retanguloY2 = retangulo16.y + retangulo16.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo16 = cor;
                retangulo16Marcado = true;
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

        private void pintarRetangulo25(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo25.x;
            int retanguloX2 = retangulo25.x + retangulo25.width;
            int retanguloY1 = retangulo25.y;
            int retanguloY2 = retangulo25.y + retangulo25.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo25 = cor;
                retangulo25Marcado = true;
                repaint();
            }

        }

        private void pintarRetangulo26(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo26.x;
            int retanguloX2 = retangulo26.x + retangulo26.width;
            int retanguloY1 = retangulo26.y;
            int retanguloY2 = retangulo26.y + retangulo26.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo26 = cor;
                retangulo26Marcado = true;
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
