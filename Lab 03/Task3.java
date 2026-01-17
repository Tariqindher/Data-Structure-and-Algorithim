class Node {
       int data;
       Node next;
   
       Node(int data) {
           this.data = data;
           this.next = null;
       }
}
   
public  class Task3 {
       Node head;
       int size=0;
   
       public int getSize() {
           return size;
       }
       public void insertAt(int index, int data) {
           if (index < 0 || index > size) {
               System.out.println("Invalid index.");
               return;
           }
   
           Node newNode = new Node(data);
   
           if (index == 0) {
               newNode.next = head;
               head = newNode;
           } else {
               Node current = head;
               for (int i = 0; i < index - 1; i++) {
                   current = current.next;
               }
               newNode.next = current.next;
               current.next = newNode;
           }
   
           size++;
       }
   
       public int get(int index) {
           if (index < 0 || index >= size) {
               throw new IndexOutOfBoundsException("Index out of bounds.");
           }
   
           Node current = head;
           for (int i = 0; i < index; i++) {
               current = current.next;
           }
   
           return current.data;
       }
   
       public void removeFrom(int index) {
           if (index < 0 || index >= size) {
               System.out.println("Invalid index.");
               return;
           }
   
           if (index == 0) {
               head = head.next;
           } else {
               Node current = head;
               for (int i = 0; i < index - 1; i++) {
                   current = current.next;
               }
               current.next = current.next.next;
           }
   
         
           }
}
