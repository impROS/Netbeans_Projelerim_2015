package assertdeneme;

public class AssertDeneme {

    public static void main(String[] args) {
        try{
        int x = 1;
        assert (x == 2);

        System.out.println("Assert Mekanizmasi aktif degil!");
        }catch(AssertionError ex){
            System.out.println("Assert Aktif");
        }
    }

}
