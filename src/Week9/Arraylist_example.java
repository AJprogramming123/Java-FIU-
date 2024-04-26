package Week9;
import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class Arraylist_example {
    public static void main(String[] args) {

        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Paris");
        cityList.add("Denver");
        cityList.add("Miami");
        cityList.add("Tokyo");
        cityList.add("New York");

        System.out.println(cityList);

     /*   System.out.println("Size of cityList is: " + cityList.size());


        System.out.println("is Miami in cityList? " + cityList.contains("Miami"));

        System.out.println("is Atlanta in cityList? " + cityList.contains("Atlanta"));


        System.out.println("Location of Denver: " + cityList.indexOf("Denver"));

       cityList.add(4,"London");
        System.out.println(cityList);

        System.out.println("");

        cityList.remove("Paris");
        System.out.println(cityList);
    */

        for(String x : cityList)
        {
            System.out.println( x);
        }



    }
}
