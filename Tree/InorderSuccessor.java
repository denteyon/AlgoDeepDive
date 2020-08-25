public class InorderSuccessor {
    public static TreeNode findSuccessor(TreeNode root, int n) {

        if (root == null) {
            return null;
        }
        if (root.right != null) {
            return findMin(root.right);
        } else {
            TreeNode successor = null;
            while (root != null && root.val != n) {
                if (root.val > n) {
                    successor = root;
                    root = root.left;
                } else if (root.val < n) {
                    root = root.right;
                }
            }
            return successor;
        }
    }
    public static TreeNode findMin(TreeNode t) {
        if (t == null) {
            return t;
        }
        while (t.left != null) {
            t = t.left;
        }
        return t;
    }
}