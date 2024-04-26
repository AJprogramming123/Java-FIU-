package Week9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Convert_Array_To_ArrayList {
    public static void main(String[] args) {
        String[] colorNames = {"Red", "Green", "Blue"}; //Normal Array
        System.out.println(colorNames[1]);


        ArrayList<String> colorList = new ArrayList<String>(Arrays.asList(colorNames)); //Array-to-ArrayList

        System.out.println(colorList);//ArrayList
        colorList.add("Brown");
        System.out.println(colorList);

        String[] newArray = new String[colorList.size()]; // ArrayList-to-Array
        newArray = colorList.toArray(newArray);

        System.out.println(newArray[0]);

    }
}
