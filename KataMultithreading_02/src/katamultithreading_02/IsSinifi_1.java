package katamultithreading_02;

public class IsSinifi_1 implements Runnable {
    
    

@Override
public void run(){
    for (int i = 0; i < 1000; i++) {
        System.out.println((i+1)+".Birinci Sinif");
    }
}
}
