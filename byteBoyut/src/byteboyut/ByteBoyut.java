package byteboyut;

import java.util.Arrays;

public class ByteBoyut {

    public static void main(String[] args) {
        byte[] arr1 = new byte[8];

        arr1[1] = 1;
        arr1[2] = 2;
        arr1[3] = 3;
        arr1[4] = 4;
        arr1[5] = 5;

        parseArr(arr1);

    }

    static void parseArr(byte[] panArr) {
        byte[] arr1 = null, arr2=null, arr3=null;

        int diziSayisi = panArr.length / 3;
        int artikDizi = panArr.length % 3;
        System.out.println("Dizi Sayisi = " + diziSayisi + " || Artik Dizi = " + artikDizi);
        switch (diziSayisi) {
            case 0:
                arr1 = new byte[artikDizi];
                break;
            case 1:
                arr1 = new byte[3];
                arr2 = new byte[artikDizi];

                break;
            case 2:
                arr1 = new byte[3];
                arr2 = new byte[3];
                arr3 = new byte[artikDizi];
                break;

        }
        System.out.println("Dizi1 = "+Arrays.toString(arr1));
        System.out.println("Dizi2 = "+Arrays.toString(arr2));
        System.out.println("Dizi3 = "+Arrays.toString(arr3));
    


    }
}
