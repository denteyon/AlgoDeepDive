public class Brick {

    public static void main(String[] args) {

        System.out.println(makeBricks(3, 1, 8) );
        System.out.println(makeBricks(3, 1, 9) );
        System.out.println(makeBricks(3, 2, 10));
        System.out.println(makeBricks(3, 2, 8));
        System.out.println(makeBricks(3, 2, 9));
        System.out.println(makeBricks(6, 1, 11));
        System.out.println(makeBricks(6, 0, 11));
        System.out.println(makeBricks(1, 4, 11));
        System.out.println(makeBricks(0, 3, 10));
        System.out.println(makeBricks(2, 1000000, 100003));
        System.out.println(makeBricks(1000000, 1000, 1000100) );
    }

    public static boolean makeBricks(int small, int big, int goal) {
        int bigBrick = (int) Math.floor(goal/5); //needed no. big bricks
        if(bigBrick>big){ //not exceed big
            bigBrick = big;
        }
        if(goal-(bigBrick*5)<=small){
            return true;
        }
        return false;
    }

}
