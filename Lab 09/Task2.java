class Node{
       int data;
       Node left,right;
       Node(int data){
              this.data=data;
                     
       }
}
public class Task2{
       Node root;
       Node insert(Node root,int data){
              if(root==null){
                     root=new Node(data);
                     return root;
              }
              if(root.data<data){
                     root.right=insert(root.right, data);
              }
              else if(root.data>data){
                     root.left=insert(root.left, data);
              }
              return root;
       }
       Node SubtreeNode(Node root, int val){
              if(root==null || root.data==val){
                     return root;
              }
              if(val<root.data){
                     return SubtreeNode(root.left, val);
              }
              return SubtreeNode(root.right, val);
       }
       void printSubtree(Node root){
              if(root==null){
                     return;
              }
              printSubtree(root.left);
              System.out.print(root.data+"  ");
              printSubtree(root.right);
       }
       void inOrder(Node root){
              if(root==null){
                     return;
              }
              inOrder(root.left);
              System.out.print(root.data+"  ");
              inOrder(root.right);
       }
       public static void main(String[] args) {
              
              Task2 BST=new Task2();
              Node root=null;
              int values[]={7,4,5,8,9,3,22,1};
              /*
                              7
                         4         9 

                       3   5          22
                     1

               */
              for(int i=0; i<values.length; i++){
                     root=BST.insert(root, values[i]);
              }
              BST.inOrder(root);
              System.out.println();
              Node result=BST.SubtreeNode(root, 4);
              if(result!=null){
                     System.out.println("Print  found Node with subtree "+result.data);
                     BST.printSubtree(result);

              }
              else{
                     System.out.println("Not found  ");
              }

       }
}