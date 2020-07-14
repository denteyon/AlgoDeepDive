public class AddKthRow {
    public static void add_row(Tree root, int v, int d) {
        if (root == null) {
            return;
        }

        int currentDepth = d;

        if (currentDepth == 1) {
            Tree temp = root.left;
            root.left = new Tree(v);
            root.left.left = temp;
            // "root.left.right = temp" would also work

            temp = root.right;
            root.right = new Tree(v);
            root.right.right = temp;
            // "root.right.left = temp" would also work
            return;
        }

        add_row(root.left, v, d - 1);
        add_row(root.right, v, d - 1);
    }
}
class Tree {
    public int label;
    public Tree left;
    public Tree right;
    public Tree(int val) {
        label = val;
    }
}
