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
    public int getData(int index) {
        Node06 currentNode= head;
        for (int i=0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    public int indexOf(int key) {
        Node06 currentNode= head;
        int index = 0;
        
        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }
    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head= null;
        } else {
            Node06 currentNode = head;
        
            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node06 currentNode = head;
        
            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
}

