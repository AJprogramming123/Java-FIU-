package Week11;

public class Simple_Caculator
{
                public static int ADD(int num1, int num2)
                {
                    return num1 + num2;

                }

                public static int SUB(int num1, int num2)
                {
                    return num1 - num2;

                }

                public static int MULTIPLY(int num1, int num2)
                {
                    return num1 * num2;


                }

                public static int DIVIDE(int num1, int num2)
                {
                    return num1 / num2;

                }

    public static void main(String[] args)
    {
       int divide = DIVIDE(2,3);
       int multiply = MULTIPLY(2,3);
       int subtract = SUB(2,3);
       int Addition = ADD(2,3);

        System.out.println(divide + " " + multiply + " " + subtract + " " + Addition);

    }
}
