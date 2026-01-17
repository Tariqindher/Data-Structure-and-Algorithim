class Node {
       Node left, right;
       int data;
   
       Node(int data) {
           this.data = data;
           left = right = null;
       }
   }
   
   public class Task1 {
       Node root;
       public boolean isUnivalue(Node root){
            if(root==null)
            return true;

            return dfs(root, root.data);
       }
       public boolean dfs(Node root, int data){
            if(root==null)
            return true;
            if(root.data!=data)
            return false;

            return dfs(root.left, data) && dfs(root.right, data);
       }
   
       // Method to insert a new node
       public void insert(int data) {
           root = insertRect(root, data);
           System.out.println("Inserted node with data: " + data);
       }
       Node insertRect(Node root, int data) {
           if (root == null) {
            return new Node(data);
           }
           if (data < root.data) {
               root.left = insertRect(root.left, data);
           } 
           else if (data > root.data) {
               root.right = insertRect(root.right, data);
           }
           return root;
       }
   
       // Display root and its immediate children
       public void display() {
           if (root == null) {
               System.out.println("The tree is empty");
               return;
           }
           System.out.println("The Root Node: " + root.data);
           if (root.left != null) {
               System.out.println("Left Child of Root: " + root.left.data);
           } 
           else {
               System.out.println("Left Child of Root: null");
           }
           if (root.right != null) {
               System.out.println("Right Child of Root: " + root.right.data);
           } 
           else {
               System.out.println("Right Child of Root: null");  // Corrected message here
           }
       }
       public static void main(String[] args) {
           Task1 tree = new Task1();
           tree.insert(1);
           tree.insert(1);
           tree.insert(1);
           tree.insert(12);
           tree.insert(13);
   
           tree.display();

           System.out.println(tree.isUnivalue(tree.root));

       }
}
   