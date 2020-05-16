public class STI {
    public static void main(String[] args) {
        System.out.println(stringToInteger("9000000000"));
    }
    private static int stringToInteger(String s){

        int result = 0;
        boolean negative = false;
        int previous = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if(current=='-' && result==0){
                negative = true;
            } else if (Character.isDigit(current)){
                previous = result;
                result = (result*10) + Character.getNumericValue(current);
                if((result - Character.getNumericValue(current))/10 != previous){
                    throw new IllegalArgumentException("The int limit is exceeded");
                }
            } else if(current==' '){
                continue;
            } else {
                throw new IllegalArgumentException("There are characters other than digits");
            }
        }

        return negative? result*(-1): result;
    }
}
