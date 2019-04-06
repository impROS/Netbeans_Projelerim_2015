
package javaapplication56;

public class Car {
int year;
String brand;
String model;
int power;
public Car(int year, String brand, String model, int power) {
super();
this.year = year;
this.brand = brand;
this.model = model;
this.power = power;
}
public String toString() {
String s = new String();
s += "Car Info\n";
s += "Year: " + year + "\n";
s += "Brand: " + brand + "\n";
s += "Model: " + model + "\n";
s += "Power: " + power + " HP \n";
return s;
// return year + " " + brand + " " + model + " " + power;
}
}