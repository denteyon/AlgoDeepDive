public class InsertBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(insert(0b10000000000, 0b10011, 2, 6)));
        //10001001100
    }
    public static int insert(int N, int M, int i, int j) {
        int mask = 1;
        int result = N;
        for (int index = i; index <= j; index++) {
            int place = index - i; //place increases with index
            int Mbit = M & (mask << place); //get bit of M at place
            result = result | (Mbit << i); // to reimburse -i
        }
        return result;
    }
}
