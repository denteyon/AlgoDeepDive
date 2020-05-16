public class Duplicate {

    public static void main(String[] args) {
        System.out.println(collapseDuplicates("aa"));
    }

    public static String collapseDuplicates(String a) {
        int i = 0;
        String result = "";
        while (i < a.length()) {
            char ch = a.charAt(i);
            result += ch;
            if(i+1<a.length()){
                while (a.charAt(i+1) == ch) {
                    i++;
                    if(i+1==a.length()){
                        break;
                    }
                }
            }
            i++;
        }
        return result;
    }
}
