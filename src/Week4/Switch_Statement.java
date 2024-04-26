package Week4;
import java.util.Scanner;

public class Switch_Statement {

    public static void main(String[] args) {
        day1();
        day2();
        smallestinput();

    }
                public static void day1()
                {
                    Scanner scnr = new Scanner(System.in);

                    System.out.print("Enter a number (1-7): ");
                    int day = scnr.nextInt();

                    switch (day)
                    {
                        case 1:
                            System.out.println("Monday");
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                        case 3:
                            System.out.println("Wednesday");
                            break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                        case 5:
                            System.out.println("Friday");
                            break;
                        case 6:
                            System.out.println("Saturday");
                            break;
                        case 7:
                            System.out.println("Sunday");
                            break;

                        default:
                            System.out.println("INVALID RESPONSE");
                    }

                }

                public static void day2()
                {
                    Scanner scnr = new Scanner(System.in);

                    System.out.print("Enter a day: ");
                    String day2 = scnr.nextLine();

                    switch(day2)
                    {
                        case "Monday": System.out.println("1");
                            break;
                        case "Tuesday": System.out.println("2");
                            break;
                        case "Wednesday": System.out.println("3");
                            break;
                        case "Thursday": System.out.println("4");
                            break;
                        case "Friday": System.out.println("5");
                            break;
                        case "Saturday": System.out.println("6");
                            break;
                        case "Sunday": System.out.println("7");
                            break;

                        default: System.out.println("Not a day");
                    }

                }

                public static void smallestinput()
                {
                    Scanner scnr = new Scanner(System.in);

                    System.out.print("Enter number 1: ");
                    int firstnumber = scnr.nextInt();

                    System.out.printf("\nEnter number 2: ");
                    int secondnumber = scnr.nextInt();

                    System.out.printf("\nEnter number 3: ");
                    int thirdnumber = scnr.nextInt();


                        if(firstnumber < secondnumber && firstnumber < thirdnumber)
                        {
                            System.out.printf("%d is the smallest", firstnumber);

                        }
                        else if(secondnumber < firstnumber && secondnumber < thirdnumber)
                        {
                            System.out.printf("%d is the smallest", secondnumber);

                        }
                        else if(thirdnumber < firstnumber && thirdnumber < secondnumber)
                        {
                            System.out.printf("%d is the smallest", thirdnumber);

                        }else{
                            System.out.println("ERROR");

                        }

                }
}
