package cozumFark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CozumFark {

    public static void main(String[] args) {
        List<String> lstGirdi = new ArrayList<>(Arrays.asList(new String[]{"4", "5", "6", "10"}));
        List<String> lstFark = new ArrayList<>();

        for (int i = Integer.parseInt(lstGirdi.get(0)); i < Integer.parseInt(lstGirdi.get(lstGirdi.size() - 1)); i++) {
            lstFark.add(i + "");
        }

        lstFark.removeAll(lstGirdi);
        System.out.println("Eksik Sayilar = " + lstFark);
    }
}
