import java.util.HashMap;
import java.util.Map;

public class DynamicFibon {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static int fib(int n){
        int f1=0,f2=0;

        Map<Integer, Integer> fibo = new HashMap<>();
        if( (n == 1)|| (n == 2)) return 1;
        else{
            f1 = fib(n-1);
            fibo.put(n-1,f1);
            if(fibo.containsKey(n-2)) f2 = fibo.get(n-2);
            else{
                f2 = fib(n-2);
                fibo.put(n-2,f2);
            }
            return f2+f1;
        }
    }
}
