public class Occurence {
    public static void main(String[] args) {
        System.out.println(occur(2162019, 2));
    }
    private static int occur(int num, int digit){
        int count = 0;
        int temp;
        while(num>0){
            temp = num%10;
            if(temp==digit){
                count++;
            }
            num = num /10;
        }
        return count;
    }
}
