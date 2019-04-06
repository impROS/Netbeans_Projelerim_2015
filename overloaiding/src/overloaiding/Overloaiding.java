
package overloaiding;

public class Overloaiding {

    public static void main(String[] args) {
topla(1,3);
topla("impROS","Ridvan");
topla(1.1, 0);
    }
    public  static int topla(int a,int b){
        System.out.println("integer olan");
        return 0;
    }
    public static String topla(String a,String b){
    System.out.println("String olan");
        return null;
    }
    
        public  static double topla(double a,double b){
            double c=(a+b);
        System.out.println("double olan"+c);
        return 0;
    }
}
