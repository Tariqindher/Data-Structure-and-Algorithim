class Task8 {
       private int[] stack1;
       private int[] stack2;
       private int top1;
       private int top2;
       private int capacity;
   
       public Task8(int capacity) {
           this.capacity = capacity;
           stack1 = new int[capacity];
           stack2 = new int[capacity];
           top1 = -1;
           top2 = -1;
       }
   
       public void enqueue(int item) {
           if (top1 == capacity - 1) {
               throw new RuntimeException("Queue is full");
           }
           System.out.println("The value is added in queue "+item);
           stack1[++top1] = item;
       }
   
       public int dequeue() {
           if (top2 == -1) {
               while (top1 != -1) {
                   stack2[++top2] = stack1[top1--];
               }
           }
           if (top2 == -1) {
               throw new RuntimeException("Queue is empty");
           }
           return stack2[top2--];
       }
   
       public boolean isEmpty() {
           return top1 == -1 && top2 == -1;
       }
   
       public int size() {
           return (top1 + 1) + (top2 + 1);
       }
   
       public static void main(String[] args) {
           Task8 queue = new Task8(5);
           queue.enqueue(1);
           queue.enqueue(2);
           queue.enqueue(3);
           queue.enqueue(4);
           queue.enqueue(5);
          
           System.out.println("The value is removed from queue  "+queue.dequeue());
           System.out.println("The value is removed from queue  "+queue.dequeue());
           System.out.println("The value is removed from queue  "+queue.dequeue());
       }
   }
   