public class RangeBitWise {
    public static int rangeBitwiseAnd(int m, int n) {
        if(m == 0){
            return 0;
        }
        int moveFactor = 0;
        while(m != n){ // until prefix not same
            m >>= 1;
            n >>= 1;
            moveFactor++; //move one
        }
        return m << moveFactor; //rem << move //rem.concat(0s of move)
    }

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(13, 15));
    }
    // 1 1 0 1/ 1 1 1 0 / 1 1 1 1
    // to find common prefix
}