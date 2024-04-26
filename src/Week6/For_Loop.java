package Week6;

public class For_Loop {
    public static void main(String[] args) {


        for(int i = 0; i <= 5; i++)
        {
            System.out.println("Number -> " + i);

        }

        System.out.println("");

        for(int i = 5; i >= 0; i--)
        {
            System.out.println("Number -> " + i);

        }

        System.out.println("");

        for(char apl = 'p'; apl<='z'; apl++)
        {
            System.out.println("Alphabet -> " + apl);

        }

        for(int i=1; i<=50; i*=2)
        {

            if(i != 50)
            {
                System.out.println("Done");
            }else{

            }

        }
    }
}
