
package kalitimdeneme;

public class ProtectedDeneme {
SuperSinif d1=new SuperSinif();

    public ProtectedDeneme() {
        System.out.println(d1.cikar(1, 2)); 
    }
   public void deneme(int a,int b){
   a=b*d1.topla(1, 2);
       
   }
  
}
