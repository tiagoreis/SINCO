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
    Rectangle retangulo33;
    Rectangle retangulo34;
    Rectangle retangulo35;
    Rectangle retangulo36;
    Color corRetangulo31;
    Color corRetangulo32;
    Color corRetangulo33;
    Color corRetangulo34;
    Color corRetangulo35;
    Color corRetangulo36;

    Rectangle retangulo41;
    Rectangle retangulo42;
    Rectangle retangulo43;
    Rectangle retangulo44;
    Rectangle retangulo45;
    Rectangle retangulo46;
    Color corRetangulo41;
    Color corRetangulo42;
    Color corRetangulo43;
    Color corRetangulo44;
    Color corRetangulo45;
    Color corRetangulo46;

    Rectangle retangulo51;
    Rectangle retangulo52;
    Rectangle retangulo53;
    Rectangle retangulo54;
    Rectangle retangulo55;
    Rectangle retangulo56;
    Color corRetangulo51;
    Color corRetangulo52;
    Color corRetangulo53;
    Color corRetangulo54;
    Color corRetangulo55;
    Color corRetangulo56;

    Rectangle retangulo61;
    Rectangle retangulo62;
    Rectangle retangulo63;
    Rectangle retangulo64;
    Rectangle retangulo65;
    Rectangle retangulo66;
    Color corRetangulo61;
    Color corRetangulo62;
    Color corRetangulo63;
    Color corRetangulo64;
    Color corRetangulo65;
    Color corRetangulo66;

    Rectangle retangulo71;
    Rectangle retangulo72;
    Rectangle retangulo73;
    Rectangle retangulo74;
    Rectangle retangulo75;
    Rectangle retangulo76;
    Color corRetangulo71;
    Color corRetangulo72;
    Color corRetangulo73;
    Color corRetangulo74;
    Color corRetangulo75;
    Color corRetangulo76;

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
    boolean retangulo33Marcado = false;
    boolean retangulo34Marcado = false;
    boolean retangulo35Marcado = false;
    boolean retangulo36Marcado = false;
    
    boolean retangulo41Marcado = false;
    boolean retangulo42Marcado = false;
    boolean retangulo43Marcado = false;
    boolean retangulo44Marcado = false;
    boolean retangulo45Marcado = false;
    boolean retangulo46Marcado = false;

    boolean retangulo51Marcado = false;
    boolean retangulo52Marcado = false;
    boolean retangulo53Marcado = false;
    boolean retangulo54Marcado = false;
    boolean retangulo55Marcado = false;
    boolean retangulo56Marcado = false;

    boolean retangulo61Marcado = false;
    boolean retangulo62Marcado = false;
    boolean retangulo63Marcado = false;
    boolean retangulo64Marcado = false;
    boolean retangulo65Marcado = false;
    boolean retangulo66Marcado = false;

    boolean retangulo71Marcado = false;
    boolean retangulo72Marcado = false;
    boolean retangulo73Marcado = false;
    boolean retangulo74Marcado = false;
    boolean retangulo75Marcado = false;
    boolean retangulo76Marcado = false;

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
        frame = this.util.montarFrameGenerico(14);
        frame.setTitle("Jogo 14");
    }

    public void montarRetangulo() {

        ajustarTamanhoRetangulo();
        
        int posicaoXColuna1 = fracaoLarguraRetangulo;
        int posicaoY11 = fracaoAlturaRetangulo;
        int posicaoY12 = fracaoAlturaRetangulo + fracaoAltura;
        int posicaoY13 = (fracaoAlturaRetangulo + (fracaoAltura * 2));
        int posicaoY14 = (fracaoAlturaRetangulo + (fracaoAltura * 3));
        int posicaoY15 = (fracaoAlturaRetangulo + (fracaoAltura * 4));
        int posicaoY16 = (fracaoAlturaRetangulo + (fracaoAltura * 5));
        
        int posicaoXColuna2 = (fracaoLarguraRetangulo + fracaoLargura);
        int posicaoY21 = fracaoAlturaRetangulo;
        int posicaoY22 = fracaoAlturaRetangulo + fracaoAltura;
        int posicaoY23 = (fracaoAlturaRetangulo + (fracaoAltura * 2));
        int posicaoY24 = (fracaoAlturaRetangulo + (fracaoAltura * 3));
        int posicaoY25 = (fracaoAlturaRetangulo + (fracaoAltura * 4));
        int posicaoY26 = (fracaoAlturaRetangulo + (fracaoAltura * 5));

        int posicaoXColuna3 = fracaoLarguraRetangulo + (fracaoLargura * 2);
        int posicaoY31 = fracaoAlturaRetangulo;
        int posicaoY32 = fracaoAlturaRetangulo + fracaoAltura;
        int posicaoY33 = (fracaoAlturaRetangulo + (fracaoAltura * 2));
        int posicaoY34 = (fracaoAlturaRetangulo + (fracaoAltura * 3));
        int posicaoY35 = (fracaoAlturaRetangulo + (fracaoAltura * 4));
        int posicaoY36 = (fracaoAlturaRetangulo + (fracaoAltura * 5));
        
        int posicaoXColuna4 = fracaoLarguraRetangulo + fracaoLargura + (fracaoLargura* 2);
        int posicaoY41 = fracaoAlturaRetangulo;
        int posicaoY42 = fracaoAlturaRetangulo + fracaoAltura;
        int posicaoY43 = (fracaoAlturaRetangulo + (fracaoAltura * 2));
        int posicaoY44 = (fracaoAlturaRetangulo + (fracaoAltura * 3));
        int posicaoY45 = (fracaoAlturaRetangulo + (fracaoAltura * 4));
        int posicaoY46 = (fracaoAlturaRetangulo + (fracaoAltura * 5));
        
        int posicaoXColuna5 = fracaoLarguraRetangulo + (fracaoLargura * 2) + (fracaoLargura * 2);
        int posicaoY51 = fracaoAlturaRetangulo;
        int posicaoY52 = fracaoAlturaRetangulo + fracaoAltura;
        int posicaoY53 = (fracaoAlturaRetangulo + (fracaoAltura * 2));
        int posicaoY54 = (fracaoAlturaRetangulo + (fracaoAltura * 3));
        int posicaoY55 = (fracaoAlturaRetangulo + (fracaoAltura * 4));
        int posicaoY56 = (fracaoAlturaRetangulo + (fracaoAltura * 5));
        
        int posicaoXColuna6 = fracaoLarguraRetangulo +fracaoLargura+ (fracaoLargura * 2)+(fracaoLargura * 2);
        int posicaoY61 = fracaoAlturaRetangulo;
        int posicaoY62 = fracaoAlturaRetangulo + fracaoAltura;
        int posicaoY63 = (fracaoAlturaRetangulo + (fracaoAltura * 2));
        int posicaoY64 = (fracaoAlturaRetangulo + (fracaoAltura * 3));
        int posicaoY65 = (fracaoAlturaRetangulo + (fracaoAltura * 4));
        int posicaoY66 = (fracaoAlturaRetangulo + (fracaoAltura * 5));
        
        int posicaoXColuna7 = fracaoLarguraRetangulo + (fracaoLargura * 2)+ (fracaoLargura * 2)+ (fracaoLargura * 2);
        int posicaoY71 = fracaoAlturaRetangulo;
        int posicaoY72 = fracaoAlturaRetangulo + fracaoAltura;
        int posicaoY73 = (fracaoAlturaRetangulo + (fracaoAltura * 2));
        int posicaoY74 = (fracaoAlturaRetangulo + (fracaoAltura * 3));
        int posicaoY75 = (fracaoAlturaRetangulo + (fracaoAltura * 4));
        int posicaoY76 = (fracaoAlturaRetangulo + (fracaoAltura * 5));
        
        //x = largura na tela
        //y = altura na tela
        // x ,  y , width, height

        //coluna/linha
        //  1      2
        retangulo11 = new Rectangle(posicaoXColuna1, posicaoY11, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo11 = Color.black;
        retangulo12 = new Rectangle(posicaoXColuna1, posicaoY12, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo12 = Color.black;
        retangulo13 = new Rectangle(posicaoXColuna1, posicaoY13, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo13 = Color.black;
        retangulo14 = new Rectangle(posicaoXColuna1, posicaoY14, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo14 = Color.black;
        retangulo15 = new Rectangle(posicaoXColuna1, posicaoY15, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo15 = Color.black;
        retangulo16 = new Rectangle(posicaoXColuna1, posicaoY16, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo16 = Color.black;

        retangulo21 = new Rectangle(posicaoXColuna2, posicaoY21, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo21 = Color.black;
        retangulo22 = new Rectangle(posicaoXColuna2, posicaoY22, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo22 = Color.black;
        retangulo23 = new Rectangle(posicaoXColuna2, posicaoY23, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo23 = Color.black;
        retangulo24 = new Rectangle(posicaoXColuna2, posicaoY24, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo24 = Color.black;
        retangulo25 = new Rectangle(posicaoXColuna2, posicaoY25, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo25 = Color.black;
        retangulo26 = new Rectangle(posicaoXColuna2, posicaoY26, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo26 = Color.black;

        retangulo31 = new Rectangle(posicaoXColuna3, posicaoY31, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo31 = Color.black;
        retangulo32 = new Rectangle(posicaoXColuna3, posicaoY32, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo32 = Color.black;
        retangulo33 = new Rectangle(posicaoXColuna3, posicaoY33, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo33 = Color.black;
        retangulo34 = new Rectangle(posicaoXColuna3, posicaoY34, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo34 = Color.black;
        retangulo35 = new Rectangle(posicaoXColuna3, posicaoY35, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo35 = Color.black;
        retangulo36 = new Rectangle(posicaoXColuna3, posicaoY36, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo36 = Color.black;

        retangulo41 = new Rectangle(posicaoXColuna4, posicaoY41, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo41 = Color.black;
        retangulo42 = new Rectangle(posicaoXColuna4, posicaoY42, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo42 = Color.black;
        retangulo43 = new Rectangle(posicaoXColuna4, posicaoY43, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo43 = Color.black;
        retangulo44 = new Rectangle(posicaoXColuna4, posicaoY44, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo44 = Color.black;
        retangulo45 = new Rectangle(posicaoXColuna4, posicaoY45, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo45 = Color.black;
        retangulo46 = new Rectangle(posicaoXColuna4, posicaoY46, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo46 = Color.black;

        retangulo51 = new Rectangle(posicaoXColuna5, posicaoY51, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo51 = Color.black;
        retangulo52 = new Rectangle(posicaoXColuna5, posicaoY52, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo52 = Color.black;
        retangulo53 = new Rectangle(posicaoXColuna5, posicaoY53, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo53 = Color.black;
        retangulo54 = new Rectangle(posicaoXColuna5, posicaoY54, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo54 = Color.black;
        retangulo55 = new Rectangle(posicaoXColuna5, posicaoY55, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo55 = Color.black;
        retangulo56 = new Rectangle(posicaoXColuna5, posicaoY56, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo56 = Color.black;

        retangulo61 = new Rectangle(posicaoXColuna6, posicaoY61, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo61 = Color.black;
        retangulo62 = new Rectangle(posicaoXColuna6, posicaoY62, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo62 = Color.black;
        retangulo63 = new Rectangle(posicaoXColuna6, posicaoY63, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo63 = Color.black;
        retangulo64 = new Rectangle(posicaoXColuna6, posicaoY64, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo64 = Color.black;
        retangulo65 = new Rectangle(posicaoXColuna6, posicaoY65, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo65 = Color.black;
        retangulo66 = new Rectangle(posicaoXColuna6, posicaoY66, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo66 = Color.black;

        retangulo71 = new Rectangle(posicaoXColuna7, posicaoY71, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo71 = Color.black;
        retangulo72 = new Rectangle(posicaoXColuna7, posicaoY72, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo72 = Color.black;
        retangulo73 = new Rectangle(posicaoXColuna7, posicaoY73, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo73 = Color.black;
        retangulo74 = new Rectangle(posicaoXColuna7, posicaoY74, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo74 = Color.black;
        retangulo75 = new Rectangle(posicaoXColuna7, posicaoY75, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo75 = Color.black;
        retangulo76 = new Rectangle(posicaoXColuna7, posicaoY76, larguraRetanguloPadrao, alturaRetanguloPadrao);
        corRetangulo76 = Color.black;

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
//        System.out.println("fracaoLargura= " + fracaoLargura + "  fracaoLarguraRetangulo= " + fracaoLarguraRetangulo);
//        System.out.println("fracaoAltura= " + fracaoAltura + "  fracaoAlturaRetangulo= " + fracaoAlturaRetangulo);
//        System.out.println("(fracaoAltura * 2) = " + (fracaoAltura * 2));

    }


    public void paint(Graphics grafico) {

//        grafico.setColor(corRetangulo11);
//        grafico.fillRect(retangulo11.x, retangulo11.y, retangulo11.width, retangulo11.height);
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
        grafico.setColor(corRetangulo33);
        grafico.fillRect(retangulo33.x, retangulo33.y, retangulo33.width,retangulo33.height);
        grafico.setColor(corRetangulo34);
        grafico.fillRect(retangulo34.x, retangulo34.y, retangulo34.width,retangulo34.height);
        grafico.setColor(corRetangulo35);
        grafico.fillRect(retangulo35.x, retangulo35.y, retangulo35.width,retangulo35.height);
        grafico.setColor(corRetangulo36);
        grafico.fillRect(retangulo36.x, retangulo36.y, retangulo36.width,retangulo36.height);

        grafico.setColor(corRetangulo41);
        grafico.fillRect(retangulo41.x, retangulo41.y, retangulo41.width,retangulo41.height);
        grafico.setColor(corRetangulo42);
        grafico.fillRect(retangulo42.x, retangulo42.y, retangulo42.width,retangulo42.height);
        grafico.setColor(corRetangulo43);
        grafico.fillRect(retangulo43.x, retangulo43.y, retangulo43.width,retangulo43.height);
        grafico.setColor(corRetangulo44);
        grafico.fillRect(retangulo44.x, retangulo44.y, retangulo44.width,retangulo44.height);
        grafico.setColor(corRetangulo45);
        grafico.fillRect(retangulo45.x, retangulo45.y, retangulo45.width,retangulo45.height);
        grafico.setColor(corRetangulo46);
        grafico.fillRect(retangulo46.x, retangulo46.y, retangulo46.width,retangulo46.height);

        grafico.setColor(corRetangulo51);
        grafico.fillRect(retangulo51.x, retangulo51.y, retangulo51.width,retangulo51.height);
        grafico.setColor(corRetangulo52);
        grafico.fillRect(retangulo52.x, retangulo52.y, retangulo52.width,retangulo52.height);
        grafico.setColor(corRetangulo53);
        grafico.fillRect(retangulo53.x, retangulo53.y, retangulo53.width,retangulo53.height);
        grafico.setColor(corRetangulo54);
        grafico.fillRect(retangulo54.x, retangulo54.y, retangulo54.width,retangulo54.height);
        grafico.setColor(corRetangulo55);
        grafico.fillRect(retangulo55.x, retangulo55.y, retangulo55.width,retangulo55.height);
        grafico.setColor(corRetangulo56);
        grafico.fillRect(retangulo56.x, retangulo56.y, retangulo56.width,retangulo56.height);

        grafico.setColor(corRetangulo61);
        grafico.fillRect(retangulo61.x, retangulo61.y, retangulo61.width,retangulo61.height);
        grafico.setColor(corRetangulo62);
        grafico.fillRect(retangulo62.x, retangulo62.y, retangulo62.width,retangulo62.height);
        grafico.setColor(corRetangulo63);
        grafico.fillRect(retangulo63.x, retangulo63.y, retangulo63.width,retangulo63.height);
        grafico.setColor(corRetangulo64);
        grafico.fillRect(retangulo64.x, retangulo64.y, retangulo64.width,retangulo64.height);
        grafico.setColor(corRetangulo65);
        grafico.fillRect(retangulo65.x, retangulo65.y, retangulo65.width,retangulo65.height);
        grafico.setColor(corRetangulo66);
        grafico.fillRect(retangulo66.x, retangulo66.y, retangulo66.width,retangulo66.height);

        grafico.setColor(corRetangulo71);
        grafico.fillRect(retangulo71.x, retangulo71.y, retangulo71.width,retangulo71.height);
        grafico.setColor(corRetangulo72);
        grafico.fillRect(retangulo72.x, retangulo72.y, retangulo72.width,retangulo72.height);
        grafico.setColor(corRetangulo73);
        grafico.fillRect(retangulo73.x, retangulo73.y, retangulo73.width,retangulo73.height);
        grafico.setColor(corRetangulo74);
        grafico.fillRect(retangulo74.x, retangulo74.y, retangulo74.width,retangulo74.height);
        grafico.setColor(corRetangulo75);
        grafico.fillRect(retangulo75.x, retangulo75.y, retangulo75.width,retangulo75.height);
        grafico.setColor(corRetangulo76);
        grafico.fillRect(retangulo76.x, retangulo76.y, retangulo76.width,retangulo76.height);

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
            pintarRetangulo16(posicaoX, posicaoY);

            pintarRetangulo21(posicaoX, posicaoY);
            pintarRetangulo22(posicaoX, posicaoY);
            pintarRetangulo23(posicaoX, posicaoY);
            pintarRetangulo24(posicaoX, posicaoY);
            pintarRetangulo25(posicaoX, posicaoY);
            pintarRetangulo26(posicaoX, posicaoY);

            pintarRetangulo31(posicaoX, posicaoY);
            pintarRetangulo32(posicaoX, posicaoY);
            pintarRetangulo33(posicaoX, posicaoY);
            pintarRetangulo34(posicaoX, posicaoY);
            pintarRetangulo35(posicaoX, posicaoY);
            pintarRetangulo36(posicaoX, posicaoY);

            pintarRetangulo41(posicaoX, posicaoY);
            pintarRetangulo42(posicaoX, posicaoY);
            pintarRetangulo43(posicaoX, posicaoY);
            pintarRetangulo44(posicaoX, posicaoY);
            pintarRetangulo45(posicaoX, posicaoY);
            pintarRetangulo46(posicaoX, posicaoY);

            pintarRetangulo51(posicaoX, posicaoY);
            pintarRetangulo52(posicaoX, posicaoY);
            pintarRetangulo53(posicaoX, posicaoY);
            pintarRetangulo54(posicaoX, posicaoY);
            pintarRetangulo55(posicaoX, posicaoY);
            pintarRetangulo56(posicaoX, posicaoY);

            pintarRetangulo61(posicaoX, posicaoY);
            pintarRetangulo62(posicaoX, posicaoY);
            pintarRetangulo63(posicaoX, posicaoY);
            pintarRetangulo64(posicaoX, posicaoY);
            pintarRetangulo65(posicaoX, posicaoY);
            pintarRetangulo66(posicaoX, posicaoY);

            pintarRetangulo71(posicaoX, posicaoY);
            pintarRetangulo72(posicaoX, posicaoY);
            pintarRetangulo73(posicaoX, posicaoY);
            pintarRetangulo74(posicaoX, posicaoY);
            pintarRetangulo75(posicaoX, posicaoY);
            pintarRetangulo76(posicaoX, posicaoY);

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

        private void pintarRetangulo35(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo35.x;
            int retanguloX2 = retangulo35.x + retangulo35.width;
            int retanguloY1 = retangulo35.y;
            int retanguloY2 = retangulo35.y + retangulo35.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo35 = cor;
                retangulo35Marcado = true;
                repaint();
            }

        }

        private void pintarRetangulo36(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo36.x;
            int retanguloX2 = retangulo36.x + retangulo36.width;
            int retanguloY1 = retangulo36.y;
            int retanguloY2 = retangulo36.y + retangulo36.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo36 = cor;
                retangulo36Marcado = true;
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
        private void pintarRetangulo45(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo45.x;
            int retanguloX2 = retangulo45.x + retangulo45.width;
            int retanguloY1 = retangulo45.y;
            int retanguloY2 = retangulo45.y + retangulo45.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo45 = cor;
                retangulo45Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo46(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo46.x;
            int retanguloX2 = retangulo46.x + retangulo46.width;
            int retanguloY1 = retangulo46.y;
            int retanguloY2 = retangulo46.y + retangulo46.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo46 = cor;
                retangulo46Marcado = true;
                repaint();
            }

        }

        private void pintarRetangulo51(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo51.x;
            int retanguloX2 = retangulo51.x + retangulo51.width;
            int retanguloY1 = retangulo51.y;
            int retanguloY2 = retangulo51.y + retangulo51.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo51 = cor;
                retangulo51Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo52(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo52.x;
            int retanguloX2 = retangulo52.x + retangulo52.width;
            int retanguloY1 = retangulo52.y;
            int retanguloY2 = retangulo52.y + retangulo52.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo52 = cor;
                retangulo52Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo53(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo53.x;
            int retanguloX2 = retangulo53.x + retangulo53.width;
            int retanguloY1 = retangulo53.y;
            int retanguloY2 = retangulo53.y + retangulo53.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo53 = cor;
                retangulo53Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo54(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo54.x;
            int retanguloX2 = retangulo54.x + retangulo54.width;
            int retanguloY1 = retangulo54.y;
            int retanguloY2 = retangulo54.y + retangulo54.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo54 = cor;
                retangulo54Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo55(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo55.x;
            int retanguloX2 = retangulo55.x + retangulo55.width;
            int retanguloY1 = retangulo55.y;
            int retanguloY2 = retangulo55.y + retangulo55.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo55 = cor;
                retangulo55Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo56(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo56.x;
            int retanguloX2 = retangulo56.x + retangulo56.width;
            int retanguloY1 = retangulo56.y;
            int retanguloY2 = retangulo56.y + retangulo56.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo56 = cor;
                retangulo56Marcado = true;
                repaint();
            }

        }

        private void pintarRetangulo61(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo61.x;
            int retanguloX2 = retangulo61.x + retangulo61.width;
            int retanguloY1 = retangulo61.y;
            int retanguloY2 = retangulo61.y + retangulo61.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo61 = cor;
                retangulo61Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo62(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo62.x;
            int retanguloX2 = retangulo62.x + retangulo62.width;
            int retanguloY1 = retangulo62.y;
            int retanguloY2 = retangulo62.y + retangulo62.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo62 = cor;
                retangulo62Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo63(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo63.x;
            int retanguloX2 = retangulo63.x + retangulo63.width;
            int retanguloY1 = retangulo63.y;
            int retanguloY2 = retangulo63.y + retangulo63.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo63 = cor;
                retangulo63Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo64(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo64.x;
            int retanguloX2 = retangulo64.x + retangulo64.width;
            int retanguloY1 = retangulo64.y;
            int retanguloY2 = retangulo64.y + retangulo64.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo64 = cor;
                retangulo64Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo65(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo65.x;
            int retanguloX2 = retangulo65.x + retangulo65.width;
            int retanguloY1 = retangulo65.y;
            int retanguloY2 = retangulo65.y + retangulo65.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo65 = cor;
                retangulo65Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo66(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo66.x;
            int retanguloX2 = retangulo66.x + retangulo66.width;
            int retanguloY1 = retangulo66.y;
            int retanguloY2 = retangulo66.y + retangulo66.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo66 = cor;
                retangulo66Marcado = true;
                repaint();
            }

        }
        
        private void pintarRetangulo71(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo71.x;
            int retanguloX2 = retangulo71.x + retangulo71.width;
            int retanguloY1 = retangulo71.y;
            int retanguloY2 = retangulo71.y + retangulo71.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo71 = cor;
                retangulo71Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo72(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo72.x;
            int retanguloX2 = retangulo72.x + retangulo72.width;
            int retanguloY1 = retangulo72.y;
            int retanguloY2 = retangulo72.y + retangulo72.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo72 = cor;
                retangulo72Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo73(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo73.x;
            int retanguloX2 = retangulo73.x + retangulo73.width;
            int retanguloY1 = retangulo73.y;
            int retanguloY2 = retangulo73.y + retangulo73.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo73 = cor;
                retangulo73Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo74(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo74.x;
            int retanguloX2 = retangulo74.x + retangulo74.width;
            int retanguloY1 = retangulo74.y;
            int retanguloY2 = retangulo74.y + retangulo74.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo74 = cor;
                retangulo74Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo75(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo75.x;
            int retanguloX2 = retangulo75.x + retangulo75.width;
            int retanguloY1 = retangulo75.y;
            int retanguloY2 = retangulo75.y + retangulo75.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo75 = cor;
                retangulo75Marcado = true;
                repaint();
            }

        }
        private void pintarRetangulo76(int posicaoX, int posicaoY) {

            int retanguloX1 = retangulo76.x;
            int retanguloX2 = retangulo76.x + retangulo76.width;
            int retanguloY1 = retangulo76.y;
            int retanguloY2 = retangulo76.y + retangulo76.height;
            Color cor = null;

            if (posicaoX > retanguloX1 && posicaoX < retanguloX2
                    && posicaoY > retanguloY1 && posicaoY < retanguloY2) {
                cor = Color.blue;
                corRetangulo76 = cor;
                retangulo76Marcado = true;
                repaint();
            }

        }

    }
}
