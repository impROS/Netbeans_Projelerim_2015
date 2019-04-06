 class Kedi{
   
    String ad = "Kediyim ben adim Mirnav";
   
}
class Kopek{
   
    String ad = "Kopegim ben havhav";
   
}
class At{
   
    String ad = "Atim ben kosarim";
   
}

class Hayvani{
   
    public Hayvani()
    {
     
      System.out.println("Kosusturma basladi!");
      this.Hayvani(new Kedi());
       
       
    }
   
    public void Hayvani(Kedi hayvan)
    {
       
        System.out.println("Gelen heyvanatimiz: Kedi");
        System.out.println("Diyor ki:"+hayvan.ad);
        this.Hayvani(new At());
       
       
    }
    public void Hayvani(At hayvan)
    {
       
        System.out.println("Gelen heyvanatimiz: At");
        System.out.println("Diyor ki:"+hayvan.ad);
        this.Hayvani(new Kopek());
       
       
    }
    public void Hayvani(Kopek hayvan)
    {
       
        System.out.println("Gelen heyvanatimiz: Kopek");
        System.out.println("Diyor ki:"+hayvan.ad);
       
       
    }
}

public class HayvanatBahcem {

    public static void main(String[] args) {

        /*Kedi kedi = new Kedi();
        Kopek kopek = new Kopek();
        At at = new At();*/
       
        Hayvani bakici = new Hayvani();
       
       /* bakici.HayvaniAl(kedi);
        bakici.HayvaniAl(kopek);
        bakici.HayvaniAl(at);*/
       
       
    }

}	