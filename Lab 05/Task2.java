class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
class Queue {
    private Node front, rear;
    private int size;

    public Queue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (this.rear == null) {
            this.front = this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = this.front.value;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        size--;
        return value;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return this.front.value;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue after enqueuing 10, 20, 30:");
        queue.printAll();
        System.out.println("Front element: " + queue.getFront());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Queue after dequeuing an element:");
        queue.printAll();
        System.out.println("Queue size: " + queue.getSize());
        System.out.println("Is the queue empty? " + queue.isEmpty());
        queue.dequeue();
        queue.dequeue();
        System.out.println("Attempt to dequeue from an empty queue:");
        queue.dequeue();
        System.out.println("Final state of the queue:");
        queue.printAll();
    }
}
