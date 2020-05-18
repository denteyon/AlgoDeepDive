public class CamelCase {
    public static void main(String[] args) {

    }
    static int camelCase(String s){
        if(s.isEmpty()){
            return 0;
        }
        int num = 1;
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            if(current>=65 && current<=65+25){
                num++;
            }
        }
        return num;
    }
}
