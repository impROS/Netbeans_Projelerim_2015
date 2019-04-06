package katamultithreading_01;

public class Is2 implements Runnable {

    public Is2() {

    }

    @Override
    public  void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("is2  = Einstein");
        }
    }

}
