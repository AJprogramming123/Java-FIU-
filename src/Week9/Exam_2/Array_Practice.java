package Week9.Exam_2;
import java.util.Scanner;

//import Practices
//Array don't require an import
//ArrayList does
public class Array_Practice {

    public static void main(String[] args) {
            Scanner Amount = new Scanner(System.in);
            int i;
            //For Arrays the types need to be how they normally are
            //for example:
            //String
            //int
            //double
            //boolean

            final int Booger = Amount.nextInt(); //Once a size is created they can not be changed in an Array
            Amount.close();

            String[] Array = new String[Booger];

            //---------------------------------------------------------------------------------------------------------------------//

            //Adding to the Array:

            Array[0] = "Hello";
            Array[1] = "World";
            Array[2] = "Fun";

            System.out.println(Array.length + " " + Array[2]);

            //---------------------------------------------------------------------------------------------------------------------//
            System.out.println();
            //Examples using printf

            int[] Array_2 = {32, 25, 11, 12};

            System.out.printf("%-1s\t%-1s\n", "index", "Value");
            System.out.printf("%-1s\t%-1s\n", "-----", "-----");

            for(i = 0; i < Array_2.length; ++i)
            {
                System.out.printf("%-1d\t\t%-1d\n", i, Array_2[i]); //The "-1" is to indicate how much width is allowed so basically only one line.

            }
            //---------------------------------------------------------------------------------------------------------------------//
            System.out.println();
            //Passing Array-to-Method

            //insert Array_2 into Array_3 from MethodPractice

            MethodPractice(Array_2);

        }
        public static void MethodPractice(int[] Array_3)
        {
            int i;
            System.out.println("Method Array\n------------\n");
            for(i = 0; i < Array_3.length; i++)
            {
                System.out.println(Array_3[i]);

            }


        }

}

