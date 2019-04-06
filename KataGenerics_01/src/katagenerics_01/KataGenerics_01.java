package katagenerics_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KataGenerics_01 {

    public static void main(String[] args) {
        int[] dizi1 = new int[10];
        int[] dizi2 = new int[10];

        List<Integer> listInt = Arrays.asList(12, 3, 5);
        List<String> listString = Arrays.asList("bir", "iki", "uc");

//        objectDiziYazdir(dizi1);              ilkel turler genericse giremez
//        genericsDiziYazdir(dizi2);
        // objectDiziYazdir(listInt);
        genericsDiziYazdir(listInt);
        genericsDiziYazdir(listString);

        sinirlandirilmisGenericsDiziYazdir(listInt);
        //sinirlandirilmisGenericsDiziYazdir(listString); sadece numeric parametre yollanabilir ==> E extends Number

        Integer[] diziInt = {1, 2, 3, 4};
        String[] diziString = {"bir", "iki", "uc"};
        Double[] diziDouble = {1.0, 2.0, 3.0, 4.0};

        new KataGenerics_01().diziYazKlasik(diziInt);
        new KataGenerics_01().diziYazKlasik(diziString);
        new KataGenerics_01().diziYazKlasik(diziDouble);

    }

    public static void objectDiziYazdir(Object[] obj) {
        for (Object objNesne : obj) {
            System.out.println(objNesne);
        }
    }

    public static <T> void genericsDiziYazdir(List<T> TDizi) {
        TDizi.stream().forEach((nesne) -> {
            System.out.println(nesne);
        });

    }

    public static <E extends Number> void sinirlandirilmisGenericsDiziYazdir(List<E> EDizi) {
        EDizi.stream().forEach((nesne) -> {
            System.out.println(nesne);
        });

    }

    public <U> void diziYazKlasik(U[] diziGenel) {
        for (U nesne : diziGenel) {
            System.out.println(nesne);
        }
    }

}
