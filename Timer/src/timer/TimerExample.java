import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    
public class TimerExample extends JFrame {
    private JLabel lblClock = new JLabel();
    
    public TimerExample() {
        setTitle("Timer ile Kronometre Uygulaması");
        setSize(300, 200);
        add(lblClock);
        createStopwatch();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new TimerExample();
    }
    
    private void createStopwatch() {
        //1000 ifadesi milisaniye demektir. 1000 milisaniye 1 saniyedir
        //Timer sınıfı ikinci parametre olarak ActionListener türünden bir nesne alir.
        Timer timer = new Timer(1000, new ActionListener() {
            private int second = 0;
            private int minute = 0;
            private int hour = 0;
    
            @Override
            public void actionPerformed(ActionEvent e) {
                String stopwatch = hour + " : " + minute + " : " + second;
                lblClock.setText(stopwatch);
    
                if(second>0 && second%59==0){
                   minute++;
                }
                if(minute>1 &&minute%59==0){
                    hour++;
                    minute=0;
                }
                if(hour>23){
                    hour=0;
                }
                if(second>59){
                    second=0;
                }
                second++;
            }
        });
        timer.start(); //bu metodu kullanmazsak, timer calismaz
    }
}