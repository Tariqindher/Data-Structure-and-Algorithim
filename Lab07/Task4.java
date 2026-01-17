class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertionSort() {
        if (head == null) {
            return;
        }
        Node sorted = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            sorted = sortedInsert(sorted, current);
            current = next;
        }
        head = sorted;
    }

    private Node sortedInsert(Node sorted, Node newNode) {
        if (sorted == null || sorted.data >= newNode.data) {
            newNode.next = sorted;
            return newNode;
        } else {
            Node current = sorted;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        return sorted;
    }
}

public class Task4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(4);
        list.insert(2);
        list.insert(5);
        list.insert(1);
        list.insert(3);

        System.out.println("Linked list before sorting:");
        list.printList();

        list.insertionSort();

        System.out.println("Linked list after sorting:");
        list.printList();
    }
}
