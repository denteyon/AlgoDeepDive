import java.util.HashSet;

public class LinkedListCycle {
    static Node head;
    private static class Node<E> {
        private E data;
        private Node<E> next;
        Node(E item){
            data = item;
        }
    }
    static public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    public static void main(String[] args) {
        LinkedListCycle llist = new LinkedListCycle();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        if(hasLoop(head)){
            System.out.println("Loop Found");
            if(!hasLoop(head)){
                System.out.println("Loop removed");
            } else {
                System.out.println("Still loop");
            }
        } else {
            System.out.println("No Loop");
        }
    }

    static boolean hasLoop(Node h)
    {
        Node previous = null;
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if (s.contains(h)) {
                h = previous;
                h = null;
                return true;
            }
            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);
            previous = h;
            h = h.next;
        }

        return false;
    }
}
