public class BinarySearchTree {

    private TreeNode root;

    public void insert(int x) {
        root = doInsert(root, x);
    }

    private static TreeNode doInsert(TreeNode node, int n) {
        if (node == null) {
            return new TreeNode(n);
        }
        if (n < node.key) {
            node.left = doInsert(node.left, n);
        } else if (n > node.key) {
            node.right = doInsert(node.right, n);
        } else
            return node;
        return node;
    }

}
