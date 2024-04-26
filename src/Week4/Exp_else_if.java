package Week4;
import java.util.Scanner;

public class Exp_else_if {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is your score?");
        int input = scnr.nextInt();

        if(input >= 90)
        {
            System.out.print("Grade is A");
        }
        else if(input >= 80)
        {
            System.out.print("Grade is B");
        }
        else if(input >= 70)
        {
            System.out.print("Grade is C");
        }
        else if(input >= 60)
        {
            System.out.print("Grade is D");
        }else
        {
            System.out.print("Failure");

        }
    }
}
