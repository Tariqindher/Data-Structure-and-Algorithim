import java.util.Stack;

class Node{
       Node next;
       char data;
       public Node(char data){
              this.data=data;
              next=null;
       }      
}
public class Palindrome{
       
       Node head;
       int size=0;
       boolean isEmpty(){
              return head==null;
       }
       void push(char a){
              size++;
              Node newNode =new Node(a);
              if(head==null){
                     //newNode=head;
                     head=newNode;
                     return;
              }
             newNode.next=head;
             head=newNode;
       }
        char  pop(){

              if(head==null){
                     System.out.println("Stack is Empty");
                     return '\0';
              }
              size--;
         char top=head.data;
         head=head.next;
         return top;
       }
       char  peek(){
              if(head==null){
                     System.out.println("Stack is Empty");
                     return '\0';
              }
              char top=head.data;
              return top;
       }
       int getSize(){
              return size;
       }
       void display(){
              if(isEmpty()){
                     System.out.println("Stack is empty");
                     return;
              }
              Node temp=head;
              while (temp!=null) {
                     System.out.print(temp.data+" ");
                     temp=temp.next;
              }
              System.out.println();
       }
       boolean isPalindrome(String str){
              Palindrome stack=new Palindrome();
              str=str.toLowerCase();
              for(int i=0; i<str.length(); i++){
                     stack.push(str.charAt(i));
              }
              for(int i=0; i<str.length(); i++){
                     if(str.charAt(i)!=stack.pop()){
                            return false;
              }
              }
              return true;      
       }
       public boolean isBalanced(String exp) { 
              Palindrome st=new Palindrome();
              for (int i = 0; i < exp.length(); i++) { 
                  char ch = exp.charAt(i); 
                   
                  if (ch == '(' || ch == '{' || ch == '[') { 
                     st.push(ch); 
                 } else if (ch == ')'||ch == '}'||ch == ']') { 
                          if (st.isEmpty()){ 
                           return false;  
                         }
                         if ((ch == ')' && st.peek() == '(') || (ch == '}' && st.peek() == '{') || (ch == ']' && st.peek() == '[')) { 
                            st.pop();
                         } 
                        } else { 
                            return false; 
                        } 
                    } 
               
                return st.isEmpty(); 
       } 



       public static void main(String[] args) {
              Palindrome pp=new Palindrome();
              pp.push('T');
              pp.push('A');
              pp.push('R');
              pp.push('I');
              pp.push('Q');
              System.out.println(pp.pop());
              System.out.println(pp.peek());
              System.out.println("The size of Stack is  "+pp.getSize());
              System.out.println();
              pp.display();
              String str="Madam";
              String str1="Hello";
              System.out.println("Is this palindrome  yes or Not ? "+pp.isPalindrome(str));
              System.out.println("Is this palindrome  yes or Not ? "+pp.isPalindrome(str1));
              String exp = "({[A]j})"; 
              System.out.println("Is This string Balanced? -> " + pp.isBalanced(exp)); 
              String exp2 = "({[A]3rtt[][])"; 
              System.out.println("Is This string Balanced? -> " + pp.isBalanced(exp2)); 
              

       
       }
}