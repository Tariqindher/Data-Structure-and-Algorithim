import java.util.ArrayList;

class Node{
       Node left,right;
       int data;
       Node(int data){
              this.data=data;
       }
}
public class BinaryST{
       static Node insertNode(Node root, int data){
              if(root==null){
                     root=new Node(data);
                     return root;
              }
              if(root.data<data){
                     root.right=insertNode(root.right, data);
              }
              else if(root.data>data){
                     root.left=insertNode(root.left, data);
              }
              return root;
       }
       static boolean search(Node root, int key){
              if(root==null){
                     return false;
              }
              if(root.data>key){
                     return search(root.left, key);
              }
              else if(root.data==key){
                     return true;
              }
              else{
                     return search(root.right, key);
              }

       }
       static Node deletNode(Node root, int val){
              if(root.data>val){
                     root.left=deletNode(root.left, val);
              }
              else if(root.data<val){
                     root.right=deletNode(root.right, val);
              }
              else{
                     //case 1
                     if(root.left==null && root.right==null){
                            return null;
                     }
                     //case 2
                     if(root.left==null){
                            return root.right;
                     }
                     else if(root.right==null) {
                            return root.left;
                     }
                     //case 3
                     Node IS=inorderSuccessor(root.right);
                     root.data=IS.data;
                     root.right=deletNode(root.right, val);
              } 
              return root;     
       }
       //Helper Method
       static Node inorderSuccessor(Node root){
              while (root.left!=null) {
                     root=root.left;
              }
              return root;
       }
       static void printInRange(Node root, int x, int y){
              if(root==null){
                     return ;
              }
              if(root.data>=x && root.data<=y){
                     printInRange(root.left, x, y);
                     System.out.print(root.data+" ");
                     printInRange(root.right, x, y);
              }
              else if(root.data>=y){
                     printInRange(root.left, x, y);
              }
              else{
                     printInRange(root.right, x, y);
              }
       }
       static void printroot2leaf(Node root, ArrayList<Integer> path){
              if(root==null){
                     return;
              }
              path.add(root.data);
              //leaf
              if(root.left==null && root.right==null){
                     printpath(path);
              }
              else{
                     printroot2leaf(root.left, path);
                     printroot2leaf(root.right, path);
              }
              path.remove(path.size()-1);


       }
       static void printpath(ArrayList<Integer> path){
              for(int i=0; i<path.size(); i++){
                     System.out.print(path.get(i));
              }
       }

       static void inOrder(Node root){
              if(root==null){
                     //System.out.println("End Methood");
                     return;
              }
              inOrder(root.left);
              System.out.print(root.data+" ");
              inOrder(root.right);
       }
       public static void main(String[] args) {
              int values[]={8,5,3,1,4,6,10,11,14};
              Node root=null;
              for(int i=0; i<values.length; i++){
                     root=insertNode(root, values[i]);
              }
              System.out.println();
              inOrder(root);
              System.out.println();
              if(search(root, 5)){
                     System.out.println("Found key");
              }
              else{
                     System.out.println("Not found key");
              }
              deletNode(root, 2);
              inOrder(root);

              printInRange(root, 6, 10);
              printroot2leaf(root, new ArrayList<>());

              
       }
}