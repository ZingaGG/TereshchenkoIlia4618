import java.util.LinkedList;
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class LinkedQueue {
    
LinkedList<Integer> linkedList;

public LinkedQueue(LinkedList<Integer> a){
    linkedList = a;
}

public void enqueue(int addInt){

    linkedList.add(addInt);
}

public int dequeue(){
    return linkedList.removeFirst();
}

public int first(){
    return linkedList.peekFirst();
}

public void PrintList(){
    System.out.println("Your LinkedQueue = " + linkedList);
}

}
