package katalinkedlist_01;

import java.util.LinkedList;

public class KataLinkedList_01 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(2);
        list.addFirst(1);
        list.add(0, 0);
        list.add(5);
        list.add(3, 4);
        list.addLast(6);

        System.out.println("Liste = " + list);

        System.out.println("2 nin bulundugu index = " + list.indexOf(2));
        System.out.println("Listede 6 var mi ?  " + list.contains(6));
        System.out.println("Listede 7 var mi ?  " + list.contains(7));

        list.clear();
        System.out.println("Liste = " + list);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0);

        System.out.println("Liste = " + list);

    }

}
