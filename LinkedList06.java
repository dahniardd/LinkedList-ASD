public class LinkedList06 {
    Node06 head;

    public boolean isEmpty() {
        return (head == null);
    }
    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node06 currentNode = head;
            
            while (currentNode != null) {
                System.out.print(currentNode.data+ "\t");
                    currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void addFirst(int input) {
        Node06 newNode = new Node06(input, null);
        
        if (isEmpty()) { 
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    } 
    public void addLast(int input) {
        Node06 newNode = new Node06(input, null);
        
        if (isEmpty()) {
            head = newNode;
        } else {
            Node06 currentNode = head;
        
            while (currentNode.next != null) { 
                currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        }
    } 
    public void insertAfter(int key, int input) { 
        Node06 newNode = new Node06(input, null);
        
        if (!isEmpty()) {
            Node06 currentNode = head;
        
            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next; 
                    currentNode.next = newNode;
                    System.out.println("Insert data is succeed.");
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }
    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }
    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node06 current = head;
        Node06 previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }
    public void remove(int data) {
        if (head == null) {
            return; // Linked list kosong
        }
        // Mencari node sebelum node yang akan dihapus
        Node06 previous = null;
        Node06 current = head;
        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }
        // Jika node tidak ditemukan
        if (current == null) {
            return; // Node dengan nilai data tertentu tidak ada
        }
        // Menghapus node
        if (previous == null) {
            head = current.next;
        } else {
            previous.next = current.next;
        }
    }
    public void printList() {
        Node06 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

