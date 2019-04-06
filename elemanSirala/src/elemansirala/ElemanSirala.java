package elemansirala;

import java.util.ArrayList;
import java.util.Arrays;

public class ElemanSirala {

    public static void main(String[] args) {
        int[] arrSayilar = {1, 4, 6, 2, 0, 5, 3};
        System.out.println("Eski Dizi : " + Arrays.toString(arrSayilar));
        bubbleSort(arrSayilar);
        System.out.println("Yeni Dizi : " + Arrays.toString(arrSayilar));
    }

    public static void bubbleSort(int[] arr) {
        boolean takas = true;
        int j = 0;
        int yedek;
        while (takas) {
            takas = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    yedek = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = yedek;
                    takas = true;
                }
            }
        }
    }
}
