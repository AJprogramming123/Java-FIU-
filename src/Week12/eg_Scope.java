package Week12;

public class eg_Scope {
    public static void main(String[] args) {
        int a = 10 , b = 20;
        int sum = a+b;
        {                       // <- Scope of a variable. Limiting access from the main block.
            int c = 3;
            int sum2 = a + c;
            System.out.println("Sum2 =" + sum2);
        }

        System.out.printf("Sum1 =" + sum);
        //System.out.println("Sum2 =" + sum2);
    }
}
