package katakalitim_01;

public class AnaSinif {

    private int privateIntDegisken = 0;
    public int publicIntDegisken = 1;
    public final int publicFinalIntDegisken = 2;
    protected int protectedIntDegisken = 3;

    public AnaSinif() {
        System.out.println("Ana Sinif Yapilandiricisi");
    }

    public static void publicStaticVoidMetod() {
        System.out.println("publicStaticVoidMetod Cagirildi");
    }

    static void staticVoidMetot() {
        System.out.println("staticVoidMetot Cagirildi");
    }

    private static void privateStaticVoidMetot() {
        System.out.println("privateStaticVoidMetot Cagirildi");
    }

    private void privateVoidMetot() {
        System.out.println("privateVoidMetot Cagirildi");
    }
    
    protected void protectedVoidMetot(Object par0) {
        System.out.println("protectedVoidMetot Cagirildi");
    }

   String stringDondur(){
   return "imp";
   }
}
