package katamultithreading_02;

public class KataMultithreading_02 {

    public static void main(String[] args) {
IsSinifi_1 is1 = new IsSinifi_1(); // implements Runnable ile
IsSinifi_2 is2 = new IsSinifi_2(); // extends ile

// implements ettigimiz icin,bu sinifi threade cevirdik
Thread isParcacigi1 = new Thread(is1); 

isParcacigi1.start(); //cevrilen sinifi calistirdik
is2.start(); // extends edilerek yapildigi icin direkt cagirabildik

    }

}
// 1.Not
/*
iki farkli sekilde thread olusturunca(extend etme ve implement etme),threadler sanki 
synchronized edilmis sekilde calismakta..Fakat oncelik extend edililerek yapılan sinifta..
Yani once extends edilerek olusturulan thread calismakta

*/

// 2.Not
/*
iki threadi synchronize etmenin bir diger yolu da birinci is parcagini calistirdiktan sonra while dongusu ile
birinci thread bitine kadar,ikinci while dongusune gecilmesini tutmaktir.Ornegin

isParcacigi1.start();

while(isParcacigi1.isAlive()){

}
isParcacigi2.start();
*/