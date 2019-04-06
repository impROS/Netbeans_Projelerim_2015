package multithreading;

public class MultiThreading {

    public static void main(String[] args) {
IsParcacigi1 is1 = new IsParcacigi1('a', 22);
IsParcacigi2 is2 = new IsParcacigi2(2, 22);

Thread isNesnesi1 = new Thread(is1);
Thread isNesnesi2 = new Thread(is2);


        System.out.println(""+isNesnesi1.isAlive());
        System.out.println(""+isNesnesi2.isAlive());
isNesnesi1.start();
        System.out.println(""+isNesnesi1.isAlive());
        System.out.println(""+isNesnesi2.isAlive());
isNesnesi2.start();
        System.out.println(""+isNesnesi1.isAlive());
        System.out.println(""+isNesnesi2.getId());
        System.out.println(""+isNesnesi2.getPriority());
        System.out.println(""+isNesnesi2.getThreadGroup());
        System.out.println(""+isNesnesi2.getState());
    }

}
