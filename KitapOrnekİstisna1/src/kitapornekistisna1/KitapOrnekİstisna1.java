
package kitapornekistisna1;


public class KitapOrnekİstisna1 {
public void calis(){
    int sayilar[]={1,2,3,4};
    for(int i=0;i<5;i++){
        try{
            System.out.println("-->"+sayilar[i]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Hata Olustu"+ex);
        }
    }
}
     public static void main(String[] args) {
System.out.println("Basla");
KitapOrnekİstisna1 pro1=new KitapOrnekİstisna1();
pro1.calis();
System.out.println("bitti");

    }
    
}
