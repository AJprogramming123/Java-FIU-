package Week15.Problemx;

public class problemX
{
    private String state;
    private int length;

    public problemX(String S, int L)
    {
        this.state = S;
    }

            //get methods:
        public String getName()
        {
            return this.state;
        }




    //Write a method to print the string and its length.
    public void print()
    {
        System.out.println("The length of " + getName() + " is " + getName().length() + "\n");
    }


    //Write a method to return the substring from after the index of the first 'a' to the end of the string.
    public String a_Substring() {
        int index = getName().indexOf('a'); //In the provided code snippet, getName() returns a string (the state of the object), and indexOf('a') is called on that string to find the index of the character 'a'.

        if(index != -1 && index < getName().length())
        {
            return getName().substring(index + 1) + "\n";
        }else
        {
            return "" + "\n";
        }

    }


    //Write a method to get the index of the second 'o' in string.
    public String o_substring()
    {
        int index = getName().indexOf('o');

        if(index != -1 && index < getName().length())
        {
            return getName().substring(index + 1) + "\n";
        }else
        {
            return "" + "\n";
        }

    }


    //Write a method to get the index of the character in the middle.
    public String middleSubstring()
    {
        int middle_index = getName().length() / 2;

        // If the length is odd, the middle character is at middleIndex
        // If the length is even, the middle character is at middleIndex - 1 (due to zero-based indexing)

        if(getName().length() % 2 == 0)
        {
            middle_index -= 1;
        }

        return Integer.toString(middle_index) + "\n";

    }


    //Write a method to print the second half of the string.
    public String secondhalf()
    {
        int middle_index = getName().length() / 2;

            if(getName().length() % 2 == 0)
            {
                middle_index -= 1;
            }


            String substring = getName().substring(middle_index + 1);

            return substring + "\n";

    }


    //Write a method to print the String parameter in both lowercase and uppercase
    public String Lower_Upper()
    {
        String lowercase = getName().toLowerCase();
        String uppercase = getName().toUpperCase();

        return "Lowercase: " + lowercase + "\n" + "Uppercase: " + uppercase;

    }


}

