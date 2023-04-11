
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(23);
        linkedList.add(24);
        linkedList.add(25);
        linkedList.add(28);
        linkedList.add(29);

        System.out.println("Linked list before peek() ");
        System.out.println(linkedList);
        System.out.println("element peeked " + linkedList.peek());
        System.out.println("Linked list after peek() ");
        System.out.println(linkedList);

        System.out.println("Linked list before peekFirst() ");
        System.out.println(linkedList);
        System.out.println("element peeked " + linkedList.peekFirst());
        System.out.println("Linked list after peekFirst() ");
        System.out.println(linkedList);

        System.out.println("Linked list before peekLast() ");
        System.out.println(linkedList);
        System.out.println("element peeked " + linkedList.peekLast());
        System.out.println("Linked list after peekLast() ");
        System.out.println(linkedList);

    }

}
