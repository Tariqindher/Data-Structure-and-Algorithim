class Node{
       Node next;
       int data;
       Node(int data){
              this.data=data;      
       }
}
public class removeDLink{
       Node head;
       void addtofront(int key){
              Node newNode=new Node(key);
              if(head==null){
                     head=newNode;
                     return;
              }
              newNode.next=head;
              head=newNode;          
       }
       void removeDuplicate(Node head){
              if(head==null){
                     return ;
              }
              Node temp=head;
              
              while (temp!=null && temp.next!=null) {
                     Node checker=temp;
                     while (checker.next!=null) {
                            if(checker.next.data==temp.data){
                                   checker.next=checker.next.next;//Remove duplicate 
                            }
                            else{
                                   checker=checker.next;
                            }
                     }
                     temp=temp.next;
              } 

       }
       //Find Maximum and Minimum Value 
       int Maximum(Node head){
              if(head==null){
                     System.out.println("Linked List is Empty");
                     return -1;
              }
              if(head.next==null){
                    
                     return head.data;
              }
              int max=head.data;
              Node temp=head;
              while (temp!=null) {
                     if(temp.data>max){
                            max=temp.data;
                     }
                     temp=temp.next;
              }
              return max;
       }
       int findMaxIndex(Node head){
              if(head==null){
                     return -1;
              }
              int maxIndex=0;
              int maxValue=0;
              Node temp=head;
              int curentIndex=0;

              while (temp!=null) {
                    if(temp.data>maxValue){
                     maxValue=temp.data;
                     maxIndex=curentIndex;
                    }
                    temp=temp.next;
                    curentIndex++; 
              }
              return maxIndex;
       }
       Node deleteOddValues(Node head) {
              if (head == null) {
                  return null; // Return null if the list is empty
              }
          
              // Remove all odd-valued nodes at the beginning of the list
              while (head != null && head.data % 2 != 0) {
                  head = head.next;
              }
          
              // If the list becomes empty after removing odd nodes
              if (head == null) {
                  return null;
              }
          
              // Pointer to traverse the list
              Node temp = head;
          
              // Traverse and remove odd-valued nodes
              while (temp != null && temp.next != null) {
                  if (temp.next.data % 2 != 0) {
                      temp.next = temp.next.next; // Skip the odd node
                  } else {
                      temp = temp.next; // Move to the next node
                  }
              }
          
              return head; // Return the updated head
          }
          
       void display(Node head){
              if(head==null){
                     System.out.println("Linked list is Empty");
                     return;
              }
              Node temp=head;
              while (temp!=null) {
                     System.out.print(temp.data+" > ");
                     temp=temp.next;
              }
              System.out.println("null");
       }
       public static void main(String[] args) {
              removeDLink link=new removeDLink();
              link.addtofront(5);
              link.addtofront(6);
              link.addtofront(7);
              link.addtofront(3);
              // link.addtofront(5);
              // link.addtofront(4);
              // link.addtofront(3);
              link.display(link.head);
              System.out.println("The Maximum value in List   "+link.Maximum(link.head));
              System.out.println("The Maximum value at index   "+link.findMaxIndex(link.head));
              link.deleteOddValues(link.head);
             
             // link.removeDuplicate(link.head);
              link.display(link.head);

       }
}