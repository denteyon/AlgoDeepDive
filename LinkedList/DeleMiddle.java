package ctci;

public class DeleMiddle {
    public static void main(String[] args) {

    }
    public static boolean removeMid(Node n) {
        if (n == null || n.next == null) {
            return false;
        }
        Node next = n.next; //copy n.next and remove n.next
        n.val = next.val;
        n.next = next.next;
        return true;
    }
}
