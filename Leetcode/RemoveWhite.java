public class RemoveWhite {
    public static void main(String[] args) {
        System.out.println(removeWhite("g eeks    for ge  eks"));
    }
    private static String removeWhite(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if(current!=' '){
                sb.append(current);
            }
        }
        return sb.toString();
    }
}
