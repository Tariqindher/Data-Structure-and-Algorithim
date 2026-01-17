
import java.util.*;

class TreeNode{
       TreeNode left;
       TreeNode right;
       int data;
       TreeNode(int data){
              this.data=data;
       }

}
public class Task2{
       TreeNode root;
       int totalTilt=0;
        // Method to calculate the total tilt
       public int findTilt(TreeNode root) {
       calculateTilt(root);
       return totalTilt;
       }
       // Recursive helper method to calculate tilt of each node
       int calculateTilt(TreeNode node){
       if(node==null){
              return 0;
       }
       int leftsum=calculateTilt(node.left);
       int rightsum=calculateTilt(node.right);
       int nodeTilt=Math.abs(leftsum-rightsum);
       totalTilt=totalTilt+nodeTilt;
       return node.data+leftsum+rightsum;

       }
       public static void main(String[] args) {
              TreeNode root=new TreeNode(4);
              root.left=new TreeNode(2);
              root.right=new TreeNode(9);
              root.left.left=new TreeNode(3);
              root.left.right=new TreeNode(5);
              
              root.right.right=new TreeNode(7);

              Task2 List=new Task2();
           
              System.out.println(" ");

              int totalTilt=List.findTilt(root);
              System.out.println("Total Tilt: " + totalTilt);

       }
}