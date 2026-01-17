class Node{
       Node left,right;
       int data,height;
       Node(int data){
              this.data=data;
              right=left=null;
              this.height=1;
       }
}
public class AVLTREE{
       Node root;
       static Node insertNode(Node root, int data){
              if(root==null){
                     root=new Node(data);
                     return root;
              }
              if(root.data<data){
                     root.right=insertNode(root.right, data);
              }
              else{
                     root.left=insertNode(root.left, data);
              }
              return root;
       }
       static int heightTree(Node node){
              
              return (node==null) ? 0: node.height; 
       }
       static int balanceFactor(AVLTreeNode node) {
              return (node == null) ? 0 : heightTree(node.left) - heightTree(node.right);
       }
       static void updateHeighet(Node node){
              node.height=Math.max(heightTree(node.left), heightTree(node.right))+1;
       }
       static void InOrder(Node root){
              if(root==null){
                     return;
              }
              InOrder(root.left);
              System.out.print(root.data+"  ");
              InOrder(root.right);
       }

       public static void main(String[] args) {
              Node root=null;
              insertNode(root, 07);
              insertNode(root, 04);
              insertNode(root, 05);
              insertNode(root, 03);
              insertNode(root, 02);
              insertNode(root, 01);
              InOrder(root);
              System.out.println();

       }
}