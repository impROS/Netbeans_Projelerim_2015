package katamultithreading_01;

public class Is1 implements Runnable {

    public Is1() {

    }

    @Override
    public  void   run() {
        is_1();
       
    }
public static  void is_1(){
 for (int i = 0; i < 1000; i++) {
            System.out.println("is1 = Malatyalı");
        }
} 
}
