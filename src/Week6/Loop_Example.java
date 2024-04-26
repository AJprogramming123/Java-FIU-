package Week6;

public class Loop_Example {
    public static void main(String[] args) {

        for(int i =5 ; i <= 10; i++)
        {
            for (int j = 0; j <= 4; j++)
            {
                System.out.printf("%d x %d = %d\n", i, j, i * j);

                System.out.println("--------");
            }

        }
    }
}
