
package appwithsound;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;

public class AppWithSound extends JFrame {

  private static final long serialVersionUID = 1L;

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        AppWithSound app = new AppWithSound();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.startApp();
    });
 }

 public AppWithSound() {
    initGUI();
 }

 private void startApp() {
    playStartupSound();
    setVisible(true);
 }

 private void endApp() {
    System.exit(0);
 }

 private void playStartupSound() {
    Runnable soundPlayer = () -> {
        try {
            // use one of the WAV of Windows installation
          File tadaSound = new File("E:\\eski 27 Ekim 2015\\13 Ekim Salı\\28 Ağustos 2015\\14 Ağustos\\e281bc02b77801f80f14f7\\FFOutput\\---Ahmet Kaya - Nerden bileceksiniz - YouTube.mp3"); 
            AudioInputStream audioInputStream = AudioSystem
                    .getAudioInputStream(new FileInputStream(tadaSound));
            AudioFormat audioFormat = audioInputStream
                    .getFormat();
            DataLine.Info dataLineInfo = new DataLine.Info(
                    Clip.class, audioFormat);
            Clip clip = (Clip) AudioSystem
                    .getLine(dataLineInfo);
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        }
    };
    Thread soundPlayingThread = new Thread(soundPlayer);
    soundPlayingThread.start();
 }

 private void initGUI() {
    setSize(300, 200);
  }
}