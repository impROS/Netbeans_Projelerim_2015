package katagenericssinif_02;

import java.util.ArrayList;
import java.util.List;

public class GenericSinif<T> {

    private int size;
    private List<T> listT = new ArrayList<>();

    public GenericSinif(int size) {
        this.size = size;
    }

    public void ekle(T TNesne) {
        listT.add(TNesne);
    }

    public void cikar(T Tnesne) {
        listT.remove(Tnesne);
    }

    public void yazdir(){
        System.out.println(listT);
    }
}
