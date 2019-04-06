package katastack_01;

import java.util.Stack;

public class KataStack_01 {

    public static void main(String[] args) {
        Stack yigin = new Stack();

        yigin.add(1.0);
        yigin.add(1);
        yigin.add("bir");
        yigin.add(true);
        yigin.add(1.0);
        yigin.add(1.0);
        yigin.add(1.0);

        System.out.println("Yigin = " + yigin + " || Kapasitesi = " + yigin.capacity());
        System.out.println("Ilk Eleman = " + yigin.firstElement() + " || Son Eleman = " + yigin.lastElement());

        int yiginUzunluk = yigin.lastIndexOf(yigin.lastElement()) + 1;

        System.out.println("Yigin Uzunluk = " + yiginUzunluk + " || Yigin Kapasitesi");

        System.out.println("Yigin Geriye Dogru Yok Ediliyor");

        for (int i = 0; i < yiginUzunluk; i++) {
            System.out.println("Yok Edilen Eleman = " + yigin.pop());
        }

        yiginUzunluk = length(yigin);

        System.out.println("Yeni Yigin = " + yigin);
        System.out.println("Yigin Uzunluk = " + yiginUzunluk + " || Yigin Kapasitesi = " + yigin.capacity());

        //Push ve Add Fark Deneme
        yigin.add(1);
        yigin.add(2);
        yigin.add(3.0);
        yigin.add(4);
        yigin.add(5);
        yigin.add(6);
        yigin.add(7);
        yigin.add(8);
        yigin.add(9);
        yigin.add(10);
        yigin.add(11);

        yigin.push(12);
        yigin.push(13);
        yigin.push(14);
        yigin.push(15);
        yigin.push(16);
        yigin.push(17);
        yigin.push(18);
        yigin.push(19);
        yigin.push(20);
        yigin.push(21);
        yigin.push(true);
        System.out.println("Stack = "+yigin);
        int stackIslem = (int) yigin.get(19)+1000;
        System.out.println("Stack Int Islem  = "+stackIslem);
        
        double stackDoubleIslem = (double)yigin.get(2);
          System.out.println("Stack Double Islem  = "+stackDoubleIslem);
        
        boolean stackIslemBool = (boolean)yigin.get(21);
        if((boolean)yigin.get(21)){
            System.out.println("Yigin.get(21) to boolean Basarili");
        }
                
        System.out.println("Yigin Uzunluk = " + length(yigin) + " || Yigin Kapasitesi = " + yigin.capacity());

        //Diger Metotlar
        System.out.println("\n Diger Metotlar\n");
        System.out.println("Yigin = " + yigin);

        System.out.println("Yigin Size = " + yigin.size());
        System.out.println("yigin.elementAt(4) = " + yigin.elementAt(4));
        System.out.println("Yeni Yigin = " + yigin);
        System.out.println("yigin.contains(20) = " + yigin.contains(20));
        System.out.println("yigin.get(2)" + yigin.get(2));
        System.out.println("yigin.equals(5)" + yigin.equals(5));
        System.out.println("yigin.indexOf(4) = " + yigin.indexOf(4));
        System.out.println("yigin.removeElement(6) = " + yigin.removeElement(6));
        System.out.println("Yeni Yigin = " + yigin);
        System.out.println("yigin.search(1) = " + yigin.search(1));
        System.out.println("yigin.set(7, 4) = " + yigin.set(7, 4));
        System.out.println("Yeni Yigin = " + yigin);
        System.out.println("Yigin Clear = ");
        yigin.clear();
        System.out.println("Yeni Yigin = " + yigin);
    }

    static int length(Stack stack) {
        if (!stack.isEmpty()) {
            return stack.lastIndexOf(stack.lastElement()) + 1;
        } else {
            return 0;
        }
    }
}
//<editor-fold defaultstate="collapsed" desc="Stack Gomulu Metotlari">
/*
  public E push(E item) {
        addElement(item);

        return item;
    }
	
	    public synchronized void addElement(E obj) {
        modCount++;
        ensureCapacityHelper(elementCount + 1);
        elementData[elementCount++] = obj;
    }
	
	    public synchronized boolean add(E e) {
        modCount++;
        ensureCapacityHelper(elementCount + 1);
        elementData[elementCount++] = e;
        return true;
    }
	
	    public synchronized int search(Object o) {
        int i = lastIndexOf(o);

        if (i >= 0) {
            return size() - i;
        }
        return -1;
    }
*/
//</editor-fold>

//Notlar
/*
1.Add ve push komutları benzerdir.Fakat Add,true degeri dondururken;push,eklenen elemani dondurur
2.Yigindaki Dolu elemanlarin toplam sayisi .size ile belirlenirken ; genel kapasite .capasity ile bulunu
3.Tur belirtmeden olusturulan stack te elemanları eklendigi turden kullanmak icin basina o elemani 
    parantez icinde yazmak gerek.Ornegin :

    boolean kontrol= (boolean)yigin.get(21);
    int sonuc  = (int)yigin.get(20) + 1000 ;

*/