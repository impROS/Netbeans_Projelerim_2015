package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) {
        System.out.println("**********Metotlar***********");
        Class ornekSinif = ornekSinif.class;
        Method[] methods = ornekSinif.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.toString());
        }
        System.out.println("**********Yapicilar***********");
        Constructor[] cons = ornekSinif.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con.toString());
        }

    }
}
