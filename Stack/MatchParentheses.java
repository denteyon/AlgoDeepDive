import java.util.Stack;

public class MatchParentheses {
    public static void main(String[] args) {
        System.out.println(matchParentheses("(){}[]")); //true
        System.out.println(matchParentheses("(}")); //false
        System.out.println(matchParentheses("({})[]")); //true
        System.out.println(matchParentheses("]"));

    }

    private static boolean matchParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        if(str.isEmpty()){
            return true;
        }
        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);
            if(current=='(' || current == '{' || current == '['){
                stack.push(current);
            }

            char last = (stack.isEmpty())? 'a' : stack.peek();
            if(current==')' || current == '}' || current == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                if(current==')' && last == '(' || current == '}' && last == '{' || current == ']' && last == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
