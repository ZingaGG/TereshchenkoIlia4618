import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class main {

    public static Scanner scanner = new Scanner(System.in);

    public static void task1(){
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(linkedList);
        Deque<Integer> deque = new ArrayDeque<>();

        for (Integer el : linkedList) {
            deque.addFirst(el);
        }

        System.out.println(deque);
        
    }

    public static void task2(){
        LinkedList<Integer> example = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        LinkedQueue linkedQueue = new LinkedQueue(example);
        while (true) {
            linkedQueue.PrintList();
            System.out.println("Enter 1 to enqueue");
            System.out.println("Enter 2 to dequeue");
            System.out.println("Enter 3 to first");
            System.out.println("Enter 4 to stop");
            int input = Integer.parseInt(scanner.nextLine());
            if(input == 1){
                System.out.println("Enter integer to add = ");
                int temp = Integer.parseInt(scanner.nextLine());
                linkedQueue.enqueue(temp);
            }
            if(input == 2){
                System.out.println("Deleted - " + linkedQueue.dequeue());
            }
            if(input == 3){
                System.out.println("first element - " + linkedQueue.first());
            }
            if(input == 4){
                System.out.println("Exiting...");
                return;
            }

        }
        
    }
    public static void main(String[] args) {
        task2();
    }
}
