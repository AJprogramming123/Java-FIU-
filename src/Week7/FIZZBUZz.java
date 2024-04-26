package Week7;
import java.util.Scanner;

public class FIZZBUZz {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        System.out.println("pick a number");
        int Number_Guess = scnr.nextInt();

        for (int i = 1; i <= Number_Guess; i++)
        {
            if(i % 5 == 0 && i % 3 == 0)
            {
                System.out.println("FIzzBuzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");

            }else if(i % 5 == 0)
            {
                System.out.println("Buzz");

            }else
            {
                System.out.println(i);
            }
        }
        //Write a program that prints each number from 1 to 100.

        //if the number is a multiple of 3, print "Fizz" instead of the number

        //If the number is a multiple of 5, print "Buzz" instead of the number.

        //For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number

    }
}
