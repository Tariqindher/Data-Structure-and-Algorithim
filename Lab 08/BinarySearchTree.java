import javax.swing.tree.TreeNode;

public class BinarySearchTree{
       class Node {
       int value;
       Node left,right;
       Node(int value){
              this.value=value;
              left=right=null;
       }      
       }
       Node root;
       public BinarySearchTree(){
              root=null;
       }
       public boolean isempty(){
              return root==null;
       }
       public void insert(int value){
              Node newNode=new Node(value);
              if(root==null){
                     root=new Node(value);
              }
              else{
                     Node current=root;
                     Node parent=null;
                     while (true) {
                            parent=current;
                            if(value<current.value){
                                   current=current.left;
                                   if(current==null){
                                          parent.left=new Node(value);
                                          return;
                                   }
                            }
                            else if(value>current.value){
                                   current=current.right;
                                   if(current==null){
                                          parent.right=new Node(value);
                                          return;
                                   }
                            }
                            else{
                            // Duplicates are not allowed in BST
                                   return;
                            }
                     }
              }
       }
       public Node searchBST(Node root, int value) {
        // Base case: If root is null or we found the node with val
              if (root == null || root.value == value) {
            return root;
              }
        // If val is less than root's value, search in the left subtree
              if (value < root.value) {
            return searchBST(root.left, value);
              }
        // Otherwise, search in the right subtree
              return searchBST(root.right, value);
       }
       public boolean Search(int data){
              Node current=root;
              while (current!=null) {
                     if(current.value==data){
                            return true;
                     }
                     current=(data<current.value) ? current.left:current.right;
              }
              return false;
       }
       public void delete(int value) {
              root = deleteNode(root, value);
          }
          
       private Node deleteNode(Node node, int value) {
              if (node == null) {
                  return null; // If the tree is empty or data not found
              }
          
              // Traverse to find the node to delete
              if (value < node.value) {
                  node.left = deleteNode(node.left, value);
              } else if (value > node.value) {
                  node.right = deleteNode(node.right, value);
              } else {
                  // Node to be deleted found
          
                  // Case 1: Node has no left child
                  if (node.left == null) {
                      return node.right;
                  }
          
                  // Case 2: Node has no right child
                  if (node.right == null) {
                      return node.left;
                  }
          
                  // Case 3: Node has two children
                  // Find the smallest value in the right subtree (inorder successor)
                  Node successor = node.right;
                  while (successor.left != null) {
                      successor = successor.left;
                  }
                  // Replace node's data with successor's data
                  node.value = successor.value;
          
                  // Delete the successor
                  node.right = deleteNode(node.right, successor.value);
              }
              return node;
       }
          
       public static void main(String[] args) {
              BinarySearchTree BST=new BinarySearchTree();
              BST.insert(5);
              BST.insert(6);
              BST.insert(7);
              BST.insert(8);
              BST.insert(9);
              System.out.println("Is this value is present in tree ?"+BST.Search(6));
              System.out.println();
              BST.delete(5);
              System.out.println();
              int key=6;
              Node result=BST.searchBST(BST.root,  key);
              if(result.value==key){
                     System.out.println("Key found in Tree");
              }
              else {
                     System.out.println("Key Not Found ");
              }




       }
}