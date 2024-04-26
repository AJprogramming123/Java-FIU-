package Week9.Exam_2;
import java.util.Scanner;
import java.util.ArrayList; //Array List method
import java.util.Collections; //Collections method

public class ArrayList_Practice {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            int i;

            //ArrayList<Type> ArrayExample = new ArrayList<Type>(capacity);
            //Array List doesn't have a fixed size unless you want to put one.

            //UNlIKE Array; ArrayList types needs to be Capitalized. Array just need the original way
            // Array = int
            // ArrayList = Integer

            ArrayList<Integer> Array = new ArrayList<Integer>();
            int array_scanner = scnr.nextInt();
            //---------------------------------------------------------------------------------------------//

            //Common ArrayList Methods: ArrayList uses () instead of [].
            System.out.printf("ArrayList methods\n-----------------\n");
            //adding: (Doesn't output anything)
            Array.add(11);
            Array.add(12);
            Array.add(array_scanner);

            //getting: (Must be in output)
            System.out.println(Array.get(1));
            System.out.println(Array.get(2/2));

            //Replacing:
            Array.set(0, 15);

            Array.set(1, Array.get(2) + 5);


            //size:
            System.out.println(Array.size());

            System.out.println(Array.get(Array.size() - 3));


            //---------------------------------------------------------------------------------------------//
            System.out.printf("\n3 Ways to write ArrayLists\n---------------------------\n");
            //3 Ways to write ArrayLists:

            //Normal:
            System.out.println(Array);


            //for Loop:
            for(i = 0; i < Array.size(); ++i)
            {
                System.out.println(Array.get(i));

            }

            //for-each statement:
            for(int x: Array)
            {
                System.out.println(Array);

            }

            //---------------------------------------------------------------------------------------------//
            System.out.printf("\nMethod of Collection Class:\n---------------------------\n" );
            //Method of Collection Class:
            //For ArrayList only

            //Reversing:
            Collections.reverse(Array);
            System.out.println(Array);

            //sorting
            Collections.sort(Array);
            System.out.println(Array);

            //Max & Min:
            System.out.println(Collections.max(Array));
            System.out.println(Collections.min(Array));

            //Shuffling:
            Collections.shuffle(Array);
            System.out.println(Array);
        }
}

