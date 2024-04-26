package Week12.methodpractice;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


//Write a method, findMax
//that accepts an integer array as an argument and has a return type of int.
//This method should find the maximum value in the array and return it.

public class MethodPracticeV2
{
    public static void main(String[] args)
    {
        findMax();
    }

    public static void findMax()
    {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Integer> LIST = new ArrayList<>();


        while(true) {
            System.out.println("Enter a number: ");
            int SCAN = scnr.nextInt();

            LIST.add(SCAN);

                if (SCAN == -1) {
                    break;
                }

            System.out.println("Continue? To quit type: -1 ");
                System.out.println();
        }

    System.out.println(Collections.max(LIST));


    }



}
