import java.util.ArrayDeque;
import java.util.Queue;

public class StackByQueue {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public StackByQueue() {
        queue1 = new ArrayDeque<Integer>();
        queue2 = new ArrayDeque<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(empty()){
            return -1;
        }
        if(queue1.size()==1){
            return queue1.remove();
        } else {
            while(queue1.size() > 1){
                queue2.add(queue1.remove());
            }
            swap();

        }
        return queue2.remove();
    }

    /** Get the top element. */
    public int top() {
        if(empty()){
            return -1;
        }
        if(queue1.size()==1){
            return queue1.peek();
        } else {
            while(queue1.size() > 1){
                queue2.add(queue1.remove());
            }
            swap();

        }
        queue1.add(queue2.peek());
        return queue2.remove();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return (queue1.size()+queue2.size() == 0);
    }

    public void swap(){
        Queue<Integer> queue3 = queue1;
        queue1 = queue2;
        queue2 = queue3;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
