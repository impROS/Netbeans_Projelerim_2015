package statikdeğişken;

public class StatikDeğişken {
public static int a;
public int b;
public static void Yazdır(StatikDeğişken sd){
System.out.println(StatikDeğişken.a);
}
public static void main(String[] args) {
StatikDeğişken sd=new StatikDeğişken();
StatikDeğişken sd1= new StatikDeğişken();
StatikDeğişken sd3= new StatikDeğişken();
sd.a=75;
sd.b=45;
sd1.b=30;
System.out.println(sd1.a);
System.out.println(sd.b);
System.out.println(sd1.b);

sd.a=11;
System.out.println(sd.a);

System.out.println(sd3.b);
System.out.println(sd3.a);
}
}