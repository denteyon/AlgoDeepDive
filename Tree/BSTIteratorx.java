import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTIteratorx {
    public List<Integer> findIntersectionInTwoBST(TreeNode A, TreeNode B) {
        List<Integer> result = new ArrayList<Integer>();
        if(A == null || B == null) {
            return result;
        }
        BSTIterator a = new BSTIterator(A);
        BSTIterator b = new BSTIterator(B);
        while(a.hasNext() && b.hasNext()) {
            if(a.peek().equals(b.peek())) {
                result.add(a.peek());
                a.next();
                b.next();
            } else if(a.peek() < b.peek()) {
                a.next();
            } else {
                b.next();
            }
        }
        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) { 
        val = x; 
    }
 }


class BSTIterator {

    Stack<TreeNode> stack = new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }

    public Integer peek() {
        if(!stack.isEmpty()) {
            return stack.peek().val;
        }
        return null;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        TreeNode node = stack.pop();
        pushLeft(node.right);
        return node.val;
    }

    private void pushLeft(TreeNode root) {
        while(root != null) {
            stack.push(root);
            root = root.left;
        }
    }
}