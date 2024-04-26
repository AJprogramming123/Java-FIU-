package Week3.Ex1;
import java.util.Scanner;
public class Average_3Numbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("type 3 numbers: ");

        System.out.print("Number 1: ");
        int Num1 = scnr.nextInt();
        System.out.print("Number 2: ");
        int Num2 = scnr.nextInt();
        System.out.print("Number 3: ");
        int Num3 = scnr.nextInt();


        System.out.print("\nThe average of the three numbers is: ");
        double average = (Num1 + Num2 + Num3) / 3;
        System.out.printf("%.2f\n", average);


        double SquareRoot = Math.sqrt(average);
        System.out.printf("\nThe Square root is: %.1f\n", SquareRoot);





    }
}




