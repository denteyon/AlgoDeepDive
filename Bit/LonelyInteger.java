import java.util.HashMap;
import java.util.Map;

public class LonelyInteger {
    public static void main(String[] args) {
        int[]a = {1, 2, 1, 2, 3};
        System.out.println(faInteger(a));
    }
    private static int faInteger (int [] num){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if(!map.containsKey(num[i])){
                map.put(num[i], i);
            } else {
                map.remove(num[i]);
            }
        }

        if(map.size()==1) {
            return (int) map.keySet().toArray()[0];
        } else {
            throw new IllegalArgumentException("There is no lone integer");
        }
    }
}
