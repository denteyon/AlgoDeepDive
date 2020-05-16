import java.util.Stack;

public class QueueByStack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public QueueByStack() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(empty()){
            return -1;
        }
        if(stack1.size()==1){
            return stack1.pop();
        } else {
            while(stack1.size()>1){
                stack2.push(stack1.pop());
            }
        }
        int result = stack1.pop();
        swap();
        return result;
    }

    /** Get the front element. */
    public int peek() {
        if(empty()){
            return -1;
        }
        if(stack1.size()==1){
            return stack1.peek();
        } else {
            while(stack1.size()>1){
                stack2.push(stack1.pop());
            }
        }
        int result = stack1.peek();
        swap();
        return result;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return (stack1.size() + stack2.size() == 0);
    }

    public void swap(){
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */