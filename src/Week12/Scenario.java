package Week12;
import java.util.Scanner;
import java.util.ArrayList;

public class Scenario {
    //Find the maximum value in the array and return it
    //Step 1: create method.
    //Step 2: create Array on method
    //Step 3: Return result

    public static int findMax(ArrayList<Integer> list)
    {
        int max = list.get(0);

        for(int i = 0; i < list.size(); i++)
        {
            if(max < list.get(i))
            {
                max = list.get(i);

            }


        }
        return max;

    }

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter integers (-1 to stop): ");
        int num = scnr.nextInt();

        while (num != -1) {
            list.add(num);
            num = scnr.nextInt();
        }

        int max = findMax(list);
        System.out.println("Maximum value in the list: " + max);
    }
}
