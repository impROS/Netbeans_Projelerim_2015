import java.io.*;

class Matematikci
{
        int Katsayimiz, SayiIsagreti, Sayilar, xToplam, yKatsayisi, Sonuc;
       
        String Katsayi, Esit;
       
        void Coz( String Denklem,String xDegisken) {

                int xDegiskeni = new Integer(xDegisken);

                for (int i = 0; i < Denklem.length(); i++) {

                        if (Character.isDigit(Denklem.charAt(i))) {

                                Sayilar++;

                        }
                        else if (Denklem.charAt(i) != '+' && Denklem.charAt(i) != '-' && Denklem.charAt(i) != '=') {

                                if (Denklem.charAt(i - Sayilar) == '+')
                                {
                                        SayiIsagreti = 1;
                                }
                                else if (Denklem.charAt(i - Sayilar) == '-')
                                {
                                        SayiIsagreti = -1;
                                }
                                else SayiIsagreti = 1;

                                Katsayi = Denklem.substring(i - Sayilar, i);
                                int Katsayimiz = new Integer(Katsayi);
                               
                                if (Denklem.charAt(i) == 'x')
                                {
                                        xToplam += SayiIsagreti * Katsayimiz * xDegiskeni;
                                }
                                else if(Denklem.charAt(i) == 'y')
                                {
                                        yKatsayisi=Katsayimiz;
                                }
                               
                                Sayilar = 0;
                        }
                        else if (Denklem.charAt(i) == '=') {

                               Esit = Denklem.substring(i + 1, Denklem.length());
                               break;

                        }
                        else  {
                                Sayilar = 0;
                        }
                }

                int Esittir = new Integer(Esit);
                Sonuc = (Esittir - xToplam) / yKatsayisi;

                System.out.print("y= " + Sonuc);
        }
}

public class denklem {

        public static void main(String args[]) throws IOException {

                String Denklem, xDegisken;

                BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Denklemi giriniz: ");
                Denklem = b.readLine();
               
                System.out.print("x degisken degerini girin: ");
                xDegisken = b.readLine();

                Matematikci DenklemCozucu = new Matematikci();

                DenklemCozucu.Coz(Denklem, xDegisken);
        }
}