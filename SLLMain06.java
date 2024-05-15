import java.util.LinkedList;
import java.util.Scanner;

public class SLLMain06 {
    public static void main(String[]args) {
        LinkedList06 myLinkedList = new LinkedList06();
        myLinkedList.print();
        myLinkedList.addFirst(808);
        myLinkedList.print();
        myLinkedList.addFirst(700);
        myLinkedList.print();
        myLinkedList.addLast(500);
        myLinkedList.print();
        myLinkedList.insertAfter(700, 300);
        myLinkedList.print();
    }
}
