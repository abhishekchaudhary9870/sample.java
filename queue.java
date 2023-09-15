
import java.util.Queue;
import java.util.LinkedList;
public class Main{
    public static void main (String[] args) {
       Queue<String> queue = new LinkedList<String>();
       
       queue.offer("carrot");
       queue.offer("chad");
       queue.offer("steve");
       queue.offer("Harold");
       //System.out.println(queue.size());
       //System.out.println(queue.isEmpty());
      // System.out.println(queue.peek());
      System.out.println(queue.contains("Harold"));
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      
       System.out.println(queue);
    }
}