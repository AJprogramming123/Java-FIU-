package Week7;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
            int User2;
            int counter = 0;

            System.out.println("User 1 -> Enter the secret number (1-50): ");
            int User1 = scnr.nextInt();

        do{
            System.out.println("User 2 -> Guess the secret number (1-50): ");
            User2 = scnr.nextInt();

            if(User1 == User2) {
                System.out.println("Correct!");
                break;
            }

                System.out.print("Incorrect.. Try again----");
                counter++;

                if(User1 > User2 && User2 <= 50)
                {
                   System.out.println("Too Low");
                }else if(User2 > User1 && User2 <= 50)
                {
                    System.out.println("Too High");

                }else if(User2 > 50)
                {
                   System.out.println("Not in the range...");

                }else{
                    continue;

                }

        }while(User1 != User2);

        System.out.println("The amount attempts would be: " + counter);
    }
}
