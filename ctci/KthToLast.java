package ctci;

class Node {
    int val;
    Node next;
    public Node(int x) {
        val = x;
    }
}

public class KthToLast {
    public static void main(String[] args) {

    }
    public static Node kthToLast(Node head, int k) {
        Node last = head;
        Node kth = head;
        while (k > 1) {
            if (last.next == null) {
                throw new IllegalArgumentException("k is too large");
            }
            last = last.next;
            k--;
        }
        while (last != null) {
            last = last.next;
            kth = kth.next;
        }
        return kth;
    }
}
