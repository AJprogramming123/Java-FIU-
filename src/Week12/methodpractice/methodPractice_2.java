/*
NOTE

Write the code to calculate the area and the perimeter of a triangle (Use 2 methods)

One method: AREA

one method: Perimeter
 */


package Week12.methodpractice;
import java.util.Scanner;

public class methodPractice_2 {
    public static void main(String[] args)
    {
        ANSWER();

    }

            public static void ANSWER()
            {
                Scanner scnr = new Scanner(System.in);
                System.out.println("We are going to find the Area and Perimeter of the triangle");
                System.out.println("-----------------------------------------------------------");

                System.out.print("First: How many sides? ");
                double sides = scnr.nextDouble();


                System.out.print("How many sides for the second half of the triangle? (You can put zero)  ");
                double sides2 = scnr.nextDouble();
                System.out.println("---------------------------------------------------------------------------");

                System.out.println("Second: what is the base of the triangle: ");
                double base = scnr.nextDouble();
                System.out.println("-------------------------------------------");

                System.out.println("Third: what is the height of the triangle:  ");
                double Height = scnr.nextDouble();
                System.out.println("-------------------------------------------");


                AREA(base, Height);

                PERIMETER(sides, base, sides2);

            }
                            public static void AREA(double b, double h)
                            {
                                double ANSWER = (b*h) / 2;
                                System.out.println("AREA = " + ANSWER);
                            }

                            public static void PERIMETER(double a, double b, double c)
                            {
                                double ANSWER = a + b + c;
                                System.out.println("Perimeter = " + ANSWER);

                            }

}

