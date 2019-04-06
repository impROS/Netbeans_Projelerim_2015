
package javaapplication56;

public class JavaApplication56 {
public static void main(String[] args) {
Car c1 = new Car(2012, "Mercedes", "CLK200", 450);
System.out.println(c1);
 System.out.println(c1.toString());
System.out.println(c1.hashCode());
System.out.println(c1.getClass().getName());
Car c2 = new Car(2006, "Skoda", "Fabia", 70);
System.out.println(c2);
}
}