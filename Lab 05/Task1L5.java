public class Task1L5 {
       int size = 6;
       int arr[] = new int[size];
       int rear = -1;
       int front = 0;
   
       void isempty() {
           if (front > rear) {
               System.out.println("Queue is empty");
           }
       }
   
       void enqueue(int data) {
           if (rear < size - 1) {
               arr[++rear] = data;
               System.out.println(data + " added to queue");
           } else {
               System.out.println("Queue is Full");
           }
       }
   
       void Remove() {
           if (front > rear) {
               isempty();
           } else {
               int removed = arr[front];
               front++;
               System.out.println("The First Element Removed: " + removed);
           }
       }
   
       void getFront() {
           if (front > rear) {
               isempty();
           } else {
               System.out.println("Front element is: " + arr[front]);
           }
       }
   
       int getSize() {
           return rear - front + 1;
       }
   
       void printALL() {
           if (front > rear) {
               isempty();
           } else {
               System.out.print("All elements of Queue: ");
               for (int i = front; i <= rear; i++) {
                   System.out.print(arr[i] + " ");
               }
               System.out.println();
           }
       }
   
       public static void main(String[] args) {
           Task1L5 obj = new Task1L5();
           obj.enqueue(30);
        //    obj.enqueue(43);
        //    obj.enqueue(354);
        //    obj.enqueue(35);
        //    obj.enqueue(54);
        //    obj.enqueue(99);
           //obj.Remove();
           obj.printALL();
           obj.getFront();
           System.out.println("Current size of the queue: " + obj.getSize());
       }
   }
   