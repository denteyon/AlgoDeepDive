import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("Welcome to Hangman Game");
        Scanner sc = new Scanner(System.in);
        String word = "mississipi";
        char[] c = word.toCharArray();
        String output = "----------";

        int guess = 10;

        while(guess > 0){
            System.out.println("The word now looks like this: "+output);
            System.out.println("You have "+guess+" guesses left");
            System.out.print("Your guess: ");
            String ans = sc.next();
            for (int i = 0; i < c.length; i++) {
                if(c[i]==ans.charAt(0)){
                    output = (output.substring(0, i)) +c[i]+ ((i+1!=c.length)? output.substring(i+1): "");
                }

            }
            if(output.equals(word)){
                System.out.println("You win!!!");
                break;
            }
            guess--;
        }
        if(!output.equals(word)){
            System.out.println("You Lose!");
            System.out.println("The word was "+word);
        }
    }
}
