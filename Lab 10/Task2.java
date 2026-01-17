class Node{
       Node left,right;
       int data;
       Node(int data){
              this.data=data;
       }
}
public class Task2{
       Node root;
       Node insertNode(Node root, int data){
              if(root==null){
                     root=new Node(data);
                     return root;
              }
              if(data<root.data){
                     root.left= insertNode(root.left, data);
              }
              else{
                     root.right=insertNode(root.right, data);
              }
             return root;
       }
       int heightofTree(Node root){
              if(root==null){
                     return -1;
              }
              int leftTree=heightofTree(root.left);
              int rightTree=heightofTree(root.right);
              int maxP=Math.max(leftTree, rightTree)+1;
              return maxP;
       }
       // boolean balance(Node root){
       //        if(root==null){
       //               return true;
       //        }
       //        return Math.abs(heightofTree(root.left)-heightofTree(root.right))<=1 && balance(root.left) && balance(root.right);
       // }
       void InOrder(Node root){
              if(root==null){
                     return ;
              }
              InOrder(root.left);
              System.out.print(root.data+"  ");
              InOrder(root.right);
       }
       int sumInRange(Node root, int low, int high){
              if(root==null){
                     return 0;
              }
              int sum=0;
              if(root.data>=low && root.data<=high){
                     sum=+root.data;
              }
              if(root.data<low){
                     sum+=sumInRange(root.right, low, high);
              }
              else{
                     sum+=sumInRange(root.left, low, high); 
              }
              return sum;
       }

       public static void main(String[] args) {
              Task2 BST=new Task2();
              Node root=null;
              int value[]={5,6,7,8,9,11,2,3};
              /*
                     5
                 2
                        6 
                   3      7
                           8
                             9
                              11
               */
              for(int i=0; i<value.length; i++){
                     root=BST.insertNode(root, value[i]);
              }
              BST.InOrder(root);
              System.out.println();
              System.out.println("The Heighet of Tree is  : "+BST.heightofTree(root));
             // System.out.println("Is  Binary Search  balance or Not ?  "+BST.balance(root));
              System.out.println("The Sum In Range BST "+BST.sumInRange(root, 05, 8));



              
       }
}