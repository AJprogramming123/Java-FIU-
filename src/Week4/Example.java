package Week4;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is your age?");
        int Person = scnr.nextInt();
        System.out.println("what is your weight?");
        int Pounds = scnr.nextInt();

        if(Person >= 18 && Pounds > 100)
        {
            System.out.println("Eligible to Donate");
            /*
            if(Pounds > 100)
            {
            System.out.println("Eligible to Donate");
            }
             */

        }else{

            System.out.println("No donation for you.");
        }

    }
}
