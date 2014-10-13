package br.com.util;

import br.com.view.EscolheJogo;
import br.com.view.*;
import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Frame;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Util {

    JButton btnVoltar = new JButton("Voltar");
    JButton btnZerar = new JButton("Zerar Jogo");
    
    private int alturaTela;
    private int larguraTela;
    static JFrame frame;
    private JLabel lblCronometro;

    public Util() {
        AjustarTamanhoTela();
        //System.out.println("construtor util");
    }

    public JFrame montarFrameGenerico(int numeroJogo, final JFrame frame) {
//        frame = new JFrame();
        btnVoltar = localizacaoBotaoVoltar(btnVoltar);
        frame.add(btnVoltar, BorderLayout.CENTER);
        switch (numeroJogo) {
            case 1:
                frame.add(new Jogo1());
                break;
            case 2:
                frame.add(new Jogo2());
                break;
            case 3:
                frame.add(new Jogo3());
                break;
            case 4:
                frame.add(new Jogo4());
                break;
//            case 5:
//                frame.add(new Jogo5());
//                break;
//            case 6:
//                frame.add(new Jogo6());
//                break;
//            case 7:
//                frame.add(new Jogo7());
//                break;
//            case 8:
//                frame.add(new Jogo8());
//                break;
//            case 9:
//                frame.add(new Jogo9());
//                break;
//            case 10:
//                frame.add(new Jogo10());
//                break;
//            case 11:
//                frame.add(new Jogo11());
//                break;
//            case 12:
//                frame.add(new Jogo12());
//                break;
//            case 13:
//                frame.add(new Jogo13());
//                break;
            case 14:
                frame.add(new Jogo14());
                break;
                
            default:
                frame.add(new Jogo1());

        }
        
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
                    frame.setVisible(false);
                } catch (Exception ex) {
                    //Logger.getLogger(Jogo1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        return frame;
    }
       
    public JFrame montarFrameGenerico(int numeroJogo) {
        frame = new JFrame();
        btnVoltar = localizacaoBotaoVoltar(btnVoltar);
        frame.add(btnVoltar, BorderLayout.CENTER);
        switch (numeroJogo) {
            case 1:
                frame.add(new Jogo1());
                break;
            case 2:
                frame.add(new Jogo2());
                break;
            case 3:
                frame.add(new Jogo3());
                break;
            case 4:
                frame.add(new Jogo4());
                break;
//            case 5:
//                frame.add(new Jogo5());
//                break;
//            case 6:
//                frame.add(new Jogo6());
//                break;
//            case 7:
//                frame.add(new Jogo7());
//                break;
//            case 8:
//                frame.add(new Jogo8());
//                break;
//            case 9:
//                frame.add(new Jogo9());
//                break;
//            case 10:
//                frame.add(new Jogo10());
//                break;
//            case 11:
//                frame.add(new Jogo11());
//                break;
//            case 12:
//                frame.add(new Jogo12());
//                break;
//            case 13:
//                frame.add(new Jogo13());
//                break;
            case 14:
                frame.add(new Jogo14());
                break;
                
            default:
                frame.add(new Jogo1());

        }
        
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
                    frame.setVisible(false);
                } catch (Exception ex) {
                    //Logger.getLogger(Jogo1.class.getName()).log(Level.SEVERE, null, ex);
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
    }

    public int getAlturaTela() {
        return alturaTela;
    }

    public int getLarguraTela() {
        return larguraTela;
    }

    public JButton localizacaoBotaoVoltar(JButton botao) {
        //botao.setBounds((this.getLarguraTela() - 170), (this.getAlturaTela() - 150), 150, 100);
        botao.setBounds(0, 0, 150, 100);
        return botao;
    }
    
    public JButton localizacaoBotaoZerar(JButton botao) {
        //botao.setBounds((this.getLarguraTela() - 170), (this.getAlturaTela() - 150), 150, 100);
        botao.setBounds(0, (this.getAlturaTela() - 150), 150, 100);
        return botao;
    }
/*
    public JFrame montarFrameGenericoJogo1() {
        frame = new JFrame();

//        Cronometro(lblCronometro);
//        lblCronometro.setText("Cronometro medonho");
//        lblCronometro.setBounds(10, 10, 100, 30);
        

//        lblCronometro = licalizacaoCronometro(lblCronometro);
//        frame.add(lblCronometro);
        btnVoltar = localizacaoBotaoVoltar(btnVoltar);
        btnZerar = localizacaoBotaoZerar(btnZerar);
//        btnVoltar.setBounds((this.getLarguraTela() - 170), 10, 150, 100);

        frame.add(btnVoltar, BorderLayout.CENTER);
        //frame.add(btnZerar, BorderLayout.CENTER);
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
                    frame.setVisible(false);
                } catch (Exception ex) {
                    Logger.getLogger(Jogo1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        return frame;
    }
    public JFrame montarFrameGenericoJogo2() {
        frame = new JFrame();

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
                    new EscolheJogo().setVisible(true);
                    frame.setVisible(false);
                    
                } catch (Exception ex) {
                    Logger.getLogger(Jogo2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        return frame;
    }
    public JFrame montarFrameGenericoJogo3() {
        frame = new JFrame();

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
                    frame.setVisible(false);

                } catch (Exception ex) {
                    Logger.getLogger(Jogo3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        return frame;
    }
    public JFrame montarFrameGenericoJogo14() {
        frame = new JFrame();

        btnVoltar = localizacaoBotaoVoltar(btnVoltar);
        
        frame.add(btnVoltar, BorderLayout.CENTER);
        frame.add(new Jogo14());
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
                    frame.setVisible(false);

                } catch (Exception ex) {
                    Logger.getLogger(Jogo14.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        return frame;
    }
*/
    private JLabel licalizacaoCronometro(JLabel label) {
        label.setBounds(0, (this.getAlturaTela() - 50), 50, 20);
        label.setText("00:00:00"); // NOI18N
        
        return label;
    }
    
        
    public void AjustarCursosMouse() {

        try {
            Robot robot = new Robot();
            robot.mouseMove(0, 0);
        } catch (AWTException e) {
        }

    }

}
