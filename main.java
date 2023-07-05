import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class main {

    public static void task1(){
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(linkedList);
        Deque deque = new ArrayDeque();

        for (Integer el : linkedList) {
            deque.addFirst(el);
        }

        System.out.println(deque);
        
    }
    public static void main(String[] args) {
        task1();
    }
}
