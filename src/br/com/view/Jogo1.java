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

    Map<String, String> valores = new HashMap<String, String>();

    Rectangle retangulo11;
    Rectangle retangulo12;
    Rectangle retangulo13;
    Rectangle retangulo14;
    Color corRetangulo11;
    Color corRetangulo12;
    Color corRetangulo13;
    Color corRetangulo14;

    boolean retangulo11Marcado = false;
    boolean retangulo12Marcado = false;
    boolean retangulo21Marcado = false;
    boolean retangulo22Marcado = false;

    static JLabel lblCronometro = new JLabel();
    static Frame frame = new Frame("Fase 1");

    Rectangle retangulo21;
    Rectangle retangulo22;
    Rectangle retangulo23;
    Rectangle retangulo24;
    Color corRetangulo21;
    Color corRetangulo22;
    Color corRetangulo23;
    Color corRetangulo24;

    private static final long serialVersionUID = 8067455339781596616L;

    public Jogo1() {
        AjustarCursosMouse();
        AjustarTamanhoTela();
        MontarRetangulo();

//        Cronometro(lblCronometro);
//        lblCronometro.setText("Cronometro medonho");
//        lblCronometro.setBounds(10, 10, 100, 30);
//        frame.add(lblCronometro);
    }

    public void montarFrame() {
        frame.add(new Jogo1());
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
                retangulo11 = new Rectangle(300, 150, larguraRetanguloPadrao, alturaRetanguloPadrao);
                corRetangulo11 = Color.black;
                retangulo12 = new Rectangle(300, 370, larguraRetanguloPadrao, alturaRetanguloPadrao);
                corRetangulo12 = Color.black;

                retangulo21 = new Rectangle(800, 150, larguraRetanguloPadrao, alturaRetanguloPadrao);
                corRetangulo21 = Color.black;
                retangulo22 = new Rectangle(800, 370, larguraRetanguloPadrao, alturaRetanguloPadrao);
                corRetangulo22 = Color.black;

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
        // grafico.setColor(corRetangulo13);
        // grafico.fillRect(retangulo13.x, retangulo13.y, retangulo13.width,
        // retangulo13.height);
        // grafico.setColor(corRetangulo14);
        // grafico.fillRect(retangulo14.x, retangulo14.y, retangulo14.width,
        // retangulo14.height);

        grafico.setColor(corRetangulo21);
        grafico.fillRect(retangulo21.x, retangulo21.y, retangulo21.width,
                retangulo21.height);
        grafico.setColor(corRetangulo22);
        grafico.fillRect(retangulo22.x, retangulo22.y, retangulo22.width,
                retangulo22.height);
        // grafico.setColor(corRetangulo23);
        // grafico.fillRect(retangulo23.x, retangulo23.y, retangulo23.width,
        // retangulo23.height);
        // grafico.setColor(corRetangulo24);
        // grafico.fillRect(retangulo24.x, retangulo24.y, retangulo24.width,
        // retangulo24.height);

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

        this.alturaRetanguloPadrao = alturaTela / 4;
        this.larguraRetanguloPadrao = alturaTela / 4;

        this.meiaTelaLargura = this.larguraTela / 2;
        this.fracaoLargura = (this.larguraTela / 2) / 3;

        // debug
//		System.out.println("width= " + this.larguraTela + "  height= "	+ this.alturaTela);
//		System.out.println("alturaRetanguloPadrao= "+ this.alturaRetanguloPadrao + "  larguraRetanguloPadrao= "	+ this.larguraRetanguloPadrao);
//		System.out.println("largura 1= " + fracaoLargura);
//		System.out.println("largura 2= " + (meiaTelaLargura + fracaoLargura));
    }

    public void iniciaCronometro() {
        Timer timer = null;

        final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

        if (timer == null) {
            timer = new Timer();

            TimerTask tarefa = new TimerTask() {

                public void run() {
                    try {
                        System.out.println("Hora: " + format.format(new Date().getTime()));
                    } catch (Exception e) {
                        e.printStackTrace();
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

    private class RectangleHandler extends MouseMotionAdapter {

        public void mouseMoved(MouseEvent event) {
            int posicaoX = event.getX();
            int posicaoY = event.getY();

            pintarRetangulo11(posicaoX, posicaoY);
            pintarRetangulo12(posicaoX, posicaoY);

            pintarRetangulo21(posicaoX, posicaoY);
            pintarRetangulo22(posicaoX, posicaoY);

            verificarTodosRetangulos();

        }

        private void verificarTodosRetangulos() {

            if (retangulo11Marcado && retangulo12Marcado && retangulo21Marcado
                    && retangulo22Marcado) {
                System.out.println("todos percorridos");
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
