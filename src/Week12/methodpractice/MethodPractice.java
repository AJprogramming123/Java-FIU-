package Week12.methodpractice;
import java.util.Scanner;

//Write a method, findMax
//that accepts an integer array as an argument and has a return type of int.
//This method should find the maximum value in the array and return it.


public class MethodPractice
{
    public static void main(String[] args)
    {
        CreateARRAY();

    }

                    public static void CreateARRAY()
                    {
                        Scanner scnr = new Scanner(System.in);

                        System.out.print("What is the Amount you want? ");
                        int AMOUNT = scnr.nextInt();
                        System.out.println();

                        int[] ARRAY = new int[AMOUNT];

                        int OUTPUT = findMax(ARRAY);

                        System.out.println("Maximum value: " + OUTPUT);

                    }

                    public static int findMax(int[] MAX)
                    {
                        Scanner scnr = new Scanner(System.in);

                        int whatever = 0;

                        for (int i = 0; i < MAX.length; i++) {
                            System.out.print("Value " + (i+1) + "= ");
                            MAX[i] = scnr.nextInt();
                            System.out.println();

                            if (whatever < MAX[i]) {
                                whatever = MAX[i];

                            }

                        }
                        return whatever;
                    }



}
