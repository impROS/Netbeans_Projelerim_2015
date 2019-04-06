//impROS
package stack_ornek;
import java.util.Stack;

public class Stack_Ornek {

    public static void main(String[] args) {
        //Stack boyutu ilk basta 10 dur,sonra katlanarak 20,40 seklinde 2 kati seklinde artar
        
Stack stack = new Stack();
stack.push("Londra");
stack.push("Moskova");
stack.push("Ankara");
stack.push("Paris");
stack.push("Viyana");
stack.push("Adana");


System.out.println(stack);
System.out.println(stack.search("Ankara")); //Ankara nin bulundugu indexi verir
System.out.println(stack.peek());//en ustteki elemanı verir-peek=gozetleme
System.out.println(stack.pop()); //en ustteki elemani verir ve siler - pop=patlatma
System.out.println(stack);

        System.out.println(stack.empty());//stack bos mu ?
        System.out.println(""+stack.capacity());//stack kapasitesis
      
    }

}
