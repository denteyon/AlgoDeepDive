package ctci;

import java.util.HashSet;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {

    }
    public static Node removeDup(Node head) {
        Set<Integer> set = new HashSet<>();
        Node curr = head;
        Node previous = null;
        while (curr != null) {
            if (set.contains(curr.val)) {
                previous.next = curr.next;
            } else {
                previous = curr;
                set.add(curr.val);
            }
            curr = curr.next;
        }
        return head;
    }
    public static Node removeDupNoBuffer(Node head) {
        Node curr = head;
        while (curr != null) {
            curr.next = removeDups(curr.next, curr.val);
            curr = curr.next;
        }
        return head;
    }
    public static Node removeDups(Node head, int val) {
        if (head == null) {
            return head;
        }
        while (head.val == val) {
            head = head.next;
        }

        Node curr = head;
        Node previous = null;

        while (curr != null) {
            if (curr.val == val) {
                previous.next = curr.next;
            } else {
                previous = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}
