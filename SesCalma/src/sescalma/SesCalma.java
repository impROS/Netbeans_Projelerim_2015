package sescalma;

import java.io.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SesCalma {

    public static void main(String[] args) throws IOException, LineUnavailableException, UnsupportedAudioFileException {
        AudioInputStream stream
                = AudioSystem.getAudioInputStream(new File("1-welcome.wav"));
        AudioFormat format = stream.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, stream.getFormat(),
                ((int) stream.getFrameLength() * format.getFrameSize()));
        Clip clip = (Clip) AudioSystem.getLine(info);
        clip.open(stream);
        clip.start();

    }
}
