public class Sum {
    public static void main(String[] args) {
        System.out.println(sumNumbers("a22bbb3"));
    }
    public static int sumNumbers(String str) {
        int sum = 0;
        String temp = "0";
        for(int i = 0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                temp += str.charAt(i);
                if(i==str.length()-1){
                    sum += Integer.parseInt(temp);
                }
            } else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum;
    }

}