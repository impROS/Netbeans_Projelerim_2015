
package ikireturn;
public class İkiReturn {
public static void main(String[] args) {
        System.out.println(PozitifNegatif(-1));
        System.out.println(PozitifNegatif(1));
        System.out.println(PozitifNegatif(0));
    }
    static String PozitifNegatif(int sayi){
    if(sayi<0){
        return "Negatif";
    }
    else if(sayi>0){
    return "Pozitif";
    }
    else
        return "Sayi O";
      
            
        }
    }


