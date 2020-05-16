public class Space {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(1,2,3));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        ////1 2 3 //++
        ////1 3 2 //+- //+
        //2 1 3 //-+ //+
        //2 3 1 //+- //-
        ////3 1 2 //-+ //-
        ////3 2 1 //--
        // int spaceAB = b - c;
        // int spaceBC = c - b;
        // int spaceAC = c - a;

        // if(spaceAB>0){

        // } else {

        // }

        //(a << 1 == b + c) || (b << 1 == a + c) || (c << 1 == a + b);
        return (a - b == b - c) || (a - c == c - b) || (a - b == c - a);
    }
}
