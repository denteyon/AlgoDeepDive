import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculate("1"));
        System.out.println(calculate("12-13"));
        System.out.println(calculate("123456"));
        System.out.println(calculate("123+456"));
    }
    public static int calculate(String s) {
        if(s.isEmpty()){
            throw new IllegalArgumentException("The string cannot be empty");
        }
        int currentNum = 0;
        int result = 0;
        char currentOperator ='+';

        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i<s.length();i++){
            char current = s.charAt(i);

            if(Character.isDigit(current)){
                currentNum = (currentNum*10) + Character.getNumericValue(current);
                result = currentNum;
                if(i+1<s.length() && !Character.isDigit(s.charAt(i+1))) {
                    if(stack.isEmpty()){
                        stack.push(currentNum);
                        currentNum = 0;
                    } else {
                        result = operate(currentNum, stack.pop(), currentOperator);
                    }
                }
                if(i==s.length()-1 && !stack.isEmpty()){
                    result = operate(currentNum, stack.pop(), currentOperator);
                }
            }

            if(current=='+' || current=='-'){
                currentOperator = current;
            }
        }

        return result;
    }

    private static int operate(int a, int b, char c){
        switch(c){
            case '+':
                return a+b;
            case '-':
                return b-a;
        }
        return a;
    }
}
