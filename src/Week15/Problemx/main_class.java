package Week15.Problemx;

public class main_class
{
    public static void main(String[] args)
    {
        problemX fixer = new problemX("Florida", 7);

        fixer.print();

        System.out.println("only continue with 'a':\n" + fixer.a_Substring());
        System.out.println("only continue with 'o':\n" + fixer.o_substring());
        System.out.println("What's the middle index?\n" + fixer.middleSubstring());
        System.out.println("What's the second half of the state?\n" + fixer.secondhalf());
        System.out.println("Capitalize all words & lowercase:\n" + fixer.Lower_Upper());

    }

}
