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
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }
}

