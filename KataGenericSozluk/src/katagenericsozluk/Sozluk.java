package katagenericsozluk;

import java.util.Dictionary;
import java.util.Hashtable;

public class Sozluk<T, U> {

    public Dictionary<T, U> sozluk = new Hashtable<>();

    public void ekle(T anahtar, U kelime) {
        sozluk.put(anahtar, kelime);
    }

    public U getir(T anahtar) {
        return sozluk.get(anahtar);
    }

    public void cikar(T anahtar) {
        sozluk.remove(anahtar);
    }

    public void yazdir() {
        System.out.println(sozluk);
    }
}
