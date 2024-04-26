package Week3.Ex1;
import java.util.Scanner;

public class IFstatement {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter first value: ");
        int a = scnr.nextInt();

        System.out.println("Enter second value: ");
        int b = scnr.nextInt();

        if (a>b)
            System.out.println("A is greater");
        else
            System.out.println("B is greater");
    }
}
