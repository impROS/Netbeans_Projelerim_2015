package fazlabosluksilme;

import java.util.*;

public class FazlaBoslukSilme {

    public static void main(String[] args) {
        String strCumle = "  imparator    Ridvan Orhan   Seyhmus       ";
        System.out.println("Eski Cumle = " + strCumle);

        StringTokenizer strToken = new StringTokenizer(strCumle);

        String strYeniCumle = "";
        int cumleLenght = strToken.countTokens();
        int counterKelime = 0;
        
        while (strToken.hasMoreElements()) {
            strYeniCumle += strToken.nextToken();

            if (counterKelime < cumleLenght - 1) {
                strYeniCumle += " ";
                counterKelime++;
            }
        }

        System.out.println("Yeni Cumle = " + strYeniCumle);
    }

}
