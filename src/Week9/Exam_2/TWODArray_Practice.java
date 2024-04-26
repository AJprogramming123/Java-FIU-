package Week9.Exam_2;
import java.util.Scanner;
public class TWODArray_Practice {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //2-D Array
        System.out.print("What is Row: ");
        final int Row = scnr.nextInt();


        System.out.print("What is Column: ");
        final int Column = scnr.nextInt();

        int[][] Array = new int[Row][Column];


        //How to get Values
        for (int i = 0; i < Array.length; ++i) {
            for (int j = 0; j < Array.length; ++j) {
                System.out.printf("What is array[%d][%d]: ", i, j);
                Array[i][j] = scnr.nextInt();

            }

        }

        System.out.println();

    //Print output

        for (int i = 0; i < Array.length; ++i)
        {

            for (int j = 0; j < Array.length; ++j)
            {
                System.out.print("[");
                System.out.print(Array[i][j]);
                System.out.print("]");
            }
            System.out.println();
        }


     //-------------------------------------------------------------------------------------//
    System.out.printf("\nBasic 2D Array\n------------\n");

     //Basic 2D Array

     char[][] LettersArray = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
        for (int i = 0; i < Array.length; ++i)
        {

            for (int j = 0; j < Array.length; ++j)
            {
                System.out.print("[");
                System.out.print(LettersArray[i][j]);
                System.out.print("]");
            }
            System.out.println();
        }
    }
}