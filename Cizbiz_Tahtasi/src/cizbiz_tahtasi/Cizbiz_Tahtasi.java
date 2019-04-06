package cizbiz_tahtasi;

public class Cizbiz_Tahtasi {

    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {//Toplamda 5 satır olduğu için
            System.out.println("");//Her satır tamamlandığında bir alt satıra geçmek için
            if (j % 2 == 0) {//satır 2'nin katıysa
                for (int i = 0; i < 9; i++) {//ilk satır 9 karakterden oluştuğu için
                    if (i % 4 == 0) {//Her 3 - den sonra 4. karakter + olduğu için
                        System.out.print("+");//4'ün katı olan karakterse + koy
                    } else {
                        System.out.print("-"); //4'ün katı olmayan karakterse - koy
                    }
                }
            } else//satır 2'nin katı değilse
            {

                for (int i = 0; i < 9; i++) {//2.satır 9 karakter olduğundan
                    if (i % 4 == 0)//Her 3 boşluktan sonra 4. karakter | olduğu için
                    {
                        System.out.print("|");
                    }//4'ün katı olan karakterse | koy
                    else {
                        System.out.print(" "); //4'ün katı olmayan karakterse boşluk koy
                    }

                }
            }
        }

    }

}
