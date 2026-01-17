public class Task4 {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;  // Base case: If the node is null, there's nothing to invert
        }
        
        // Recursively invert the left and right subtrees
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // Swap the left and right children
        root.left = right;
        root.right = left;

        return root;  // Return the root of the inverted tree
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Task4 solution = new Task4();
        TreeNode invertedRoot = solution.invertTree(root);

        // Print inverted tree (for testing)
        System.out.println("Inverted Tree Root: " + invertedRoot.val);
        System.out.println("Inverted Tree Left Child: " + invertedRoot.left.val);  // Should be 3
        System.out.println("Inverted Tree Right Child: " + invertedRoot.right.val); // Should be 2
    }
}
