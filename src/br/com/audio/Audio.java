package br.com.audio;

import java.applet.Applet;
import java.applet.AudioClip;

import java.net.URL;
import javafx.application.Application;
import javafx.stage.Stage;
import javax.sound.sampled.AudioInputStream;

public class Audio extends Application{

    private String URL_PATH = "../br/com/audio/";
    static AudioInputStream in = null;

    public void tocarAudio(String nome) {
        try {
        String arquivo = nome + ".wav";
        //String arquivo = nome + ".mp3";

        //debug
        System.out.println("arquivo " + arquivo);

        AudioClip audioClip;
        //URL url = getClass().getResource("bomdia.wav");
        URL url = getClass().getResource(arquivo);
        audioClip = Applet.newAudioClip(url);
        audioClip.play();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }

    }

//    public static void tocar(String nome) {
//        try {
//            String nomeArquivo = nome + ".wav";
//            FileInputStream arquivo = new FileInputStream(nomeArquivo);
//
//            final AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(arquivo);
//
//            final AudioFormat audioFormat = audioInputStream.getFormat();
//            final DataLine.Info dataLineInfo = new DataLine.Info(Clip.class,
//                    audioInputStream.getFormat(),
//                    ((int) audioInputStream.getFrameLength() * audioFormat.getFrameSize()));
//
//            final Clip clip = (Clip) AudioSystem.getLine(dataLineInfo);
//            clip.addLineListener(new LineListener() {
//
//                public void update(final LineEvent e) {
//                    if (e.getType() == LineEvent.Type.STOP) {
//                        e.getLine().close();
//                    }
//                }
//            });
//            clip.open(audioInputStream);
//
////            if (repetir) {  
////                clip.loop(Clip.LOOP_CONTINUOUSLY);  
////            } else {  
////                clip.loop(0);  
////            }  
//        } catch (final Exception e) {
//            e.printStackTrace();
//        }
//    }
//
    @Override
    public void start(Stage stage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
