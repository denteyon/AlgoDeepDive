import java.util.Arrays;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(0,9,2,5,4,2,1,8));

        sort(stack);

//        System.out.println(Arrays.toString(stack.toArray()));
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void sort(Stack<Integer> s) {
        Stack<Integer> r = new Stack<>();

        while (!s.isEmpty()) {
            int temp = s.pop();

            while (!r.isEmpty() && r.peek() > temp) {
                s.push(r.pop());
            }

            r.push(temp);
        }

        while (!r.isEmpty()) {
            s.push(r.pop());
        }
    }


}
