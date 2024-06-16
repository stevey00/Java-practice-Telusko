import java.util.*;

// class Studies{

// }

class Demo{
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<>();

        // // As a stack
        // linkedList.push("A"); // inserts a new element in the list.
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // linkedList.add("G");
        // linkedList.pop(); // removes the first(head) element in the list.

        // As a qeue
        linkedList.offer("A"); // inserts a new element in the list.
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll(); // removes the (first)head element in the list.

        // inserting at the head and tail
        linkedList.addFirst("0");
        linkedList.addLast("10");

        // inserting an elt between the list
        linkedList.add(3, "E");

        // searching for the index
        System.out.println(linkedList.indexOf("C"));

        // peeking
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        System.out.println(linkedList);

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList);
    }
}