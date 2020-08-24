public class Sqrt {
    public static void main(String[] args) {
        System.out.println(squareRoot(16));
    }
    static int squareRoot(int x){
        int start = 0;
        int end = x;

        while(end > start){
            int mid = ((end-start)/2) + start;
            if(mid*mid==(x)){
                return mid;
            } else if(mid*mid>x){
                end = mid;
            } else if(mid*mid<x) {
                start = mid;
            }
        }
        return -1;
    }
}
