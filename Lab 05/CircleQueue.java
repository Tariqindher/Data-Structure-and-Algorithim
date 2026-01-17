public class CircleQueue {
       int size = 5;
       int front, rear;
       int CQ[] = new int[size];
   
       CircleQueue() {
           front = -1;
           rear = -1;
       }
   
       boolean isfull() {
           return (front == 0 && rear == size - 1) || (front == rear + 1);
       }
   
       boolean isempty() {
           return front == -1;
       }
   
       void enqueue(int data) {
           if (isfull()) {
               System.out.println("Queue is Full, You can't add more elements");
               return;
           }
           
           if (front == -1) {
               front = 0;
           }
           rear = (rear + 1) % size;
           CQ[rear] = data;
           System.out.println("Inserted element: " + data);
       }
   
       int dequeue() {
           if (isempty()) {
               System.out.println("Queue is empty");
               return -1;
           }
           
           int element = CQ[front];
           if (front == rear) { // Queue has only one element
               front = -1;
               rear = -1;
           } else {
               front = (front + 1) % size;
           }
           System.out.println("Removed element: " + element);
           return element;
       }
   
       void display() {
           if (isempty()) {
               System.out.println("Queue is empty");
               return;
           }
           
           System.out.print("Queue elements: ");
           int i = front;
           while (true) {
               System.out.print(CQ[i] + " ");
               if (i == rear) {
                   break;
               }
               i = (i + 1) % size;
           }
           System.out.println();
           System.out.println("Front index: " + front + " Rear index: " + rear);
       }
   
       public static void main(String[] args) {
           CircleQueue cq = new CircleQueue();
           
           System.out.println("Is queue empty? " + cq.isempty());
           
           cq.enqueue(1);
           cq.enqueue(2);
           cq.enqueue(3);
           cq.enqueue(4);
           cq.enqueue(5);
           cq.enqueue(6);  // Should display "Queue is Full"
   
           System.out.println("Is queue empty? " + cq.isempty());
           System.out.println("Is queue full? " + cq.isfull());
   
           cq.dequeue();  // Removes 1
           cq.dequeue();  // Removes 2
   
           cq.display();  // Displays remaining elements
       }
   }
   