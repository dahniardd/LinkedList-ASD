import java.util.LinkedList;
import java.util.Scanner;

public class SLLMain06 {
    public static void main(String[]args) {
        LinkedList06 myLinkedList = new LinkedList06();
        
        myLinkedList.addFirst(400);
        myLinkedList.addFirst(300);
        myLinkedList.addFirst(200);
        myLinkedList.addFirst(100);
    
        System.out.println("Isi linked list:");
        myLinkedList.printList();

        // Menambah node baru dengan data 500 dari belakang
        myLinkedList.addLast(500);
        System.out.println("\nSetelah menambah node baru dari belakang:");
        myLinkedList.printList();

        // Menambah node baru dengan data 50 dari depan
        myLinkedList.addFirst(50);
        System.out.println("\nSetelah menambah node baru dari depan:");
        myLinkedList.printList();

        // Menambah node baru dengan data 250 diantara node 200 dan 300
        myLinkedList.insertAfter(200, 250);
        System.out.println("\nSetelah menambah node baru diantara node 200 dan 300:");
        myLinkedList.printList();

        // Menghapus node pertama
        myLinkedList.removeFirst();
        System.out.println("\nSetelah menghapus node pertama:");
        myLinkedList.printList();

        // Menghapus node terakhir
        myLinkedList.removeLast();
        System.out.println("\nSetelah menghapus node terakhir:");
        myLinkedList.printList();

        // Menghapus node yang memiliki data 300
        myLinkedList.remove(300);
        System.out.println("\nSetelah menghapus node yang memiliki data 300:");
        myLinkedList.printList();
    }
}
