import java.util.LinkedList;
import java.util.Collection;



public class Main{
     public static void main (String[] args) {
        
    

LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.offer("A");
linkedlist.offer("B");
linkedlist.offer("C");
linkedlist.offer("D");
linkedlist.offer("F");
linkedlist.poll();
linkedlist.add(4,"E");
//linkedlist.remove("E");
//System.out.println(linkedlist.indexOf("F"));
//System.out.println(linkedlist.peekFirst());
//System.out.println(linkedlist.peekLast());
System.out.println(linkedlist);
}
}