public class Interpret {
    public static void main(String[] args) {
        String[] commands = {"-", "?", "+"};
        int[] arg = {2, 3, 2};
        System.out.println(interpret(1, commands, arg));
    }

    public static int interpret(int value, String[] commands, int[] args) {
        //value commands 0 args 0 commands 1 args 1
        if(commands.length!=args.length){
            return 0;
        }

        boolean minus = false;

        for(int i = 0; i<args.length; i++){
            if(commands[i].equals("-")){
                minus = true;
            }
            value=calculate(value, commands[i], args[i]);
            if(value==-1 && !minus){
                return -1;
            }
            minus = false;
        }

        return value;
    }

    public static int calculate(int value, String operator, int args){
        switch (operator){
            case "+":
                return value+args;
            case "-":
                return value-args;
            case "*":
                return value*args;
            default:
                return -1;
        }
    }
}
