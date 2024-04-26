package Week3.Ex1;
import java.util.Scanner;

public class Greaterbetweenthetwo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = scnr.nextInt();
        System.out.print("Enter number 2: ");
        int b = scnr.nextInt();

        System.out.print("\n");


        if(a > b)
        {
            System.out.println("**First number is greater**");

        }else if(b > a)
        {
            System.out.println("**Second number is greater**");

        }else if(b == a)
        {
            System.out.println("**They are both equal**");

        }else
        {
            System.out.print("**ERROR**");

        }

    }
}
