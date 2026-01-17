class TreeNode {
    TreeNode left, right;
    int data;
    TreeNode(int data) {
        this.data = data;
    }
}
public class Main {
    TreeNode root = null;

    public TreeNode FindNoedata(TreeNode root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            return root;
        } else if (root.data > data) {
            return FindNoedata(root.left, data);
        } else {
            return FindNoedata(root.right, data);
        }

    }
    public void printsubtree(TreeNode node) {
        if(node==null){
            return;
        }
        System.out.print(node.data+"   ");
        printsubtree(node.left);
        printsubtree(node.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(8);         // Root node
        root.left = new TreeNode(3);             // Left child of root
        root.right = new TreeNode(10);           // Right child of root

        root.left.left = new TreeNode(1);        // Left child of node 3
        root.left.right = new TreeNode(6);       // Right child of node 3

        root.right.right = new TreeNode(14);     // Right child of node 10

        root.left.right.left = new TreeNode(4);  // Left child of node 6
        root.left.right.right = new TreeNode(7); // Right child of node 6

        root.right.right.left = new TreeNode(13); // Left child of node 14
        Main BST = new Main();
        TreeNode searched = BST.FindNoedata(root, 6);

        System.out.println(searched);
        if(searched != null) {
            System.out.println("Found data "+searched.data);
            BST.printsubtree(searched);
        }
        else {
            System.out.println("Not Found");
        }

    }
}