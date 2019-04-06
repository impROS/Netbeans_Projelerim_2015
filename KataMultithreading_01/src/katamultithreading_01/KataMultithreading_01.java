package katamultithreading_01;

public class KataMultithreading_01 {

    public static void main(String[] args) {
        Is1 isDosyasi1 = new Is1();
        Is2 isDosyasi2 = new Is2();

        Thread isParcacigi1 = new Thread(isDosyasi1);
        Thread isParcacigi2 = new Thread(isDosyasi2);

        isParcacigi1.start();
        while (isParcacigi1.isAlive()) {

        }

        isParcacigi2.start();

    }

}
