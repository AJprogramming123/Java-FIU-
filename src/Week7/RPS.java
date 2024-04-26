package Week7;
import java.util.Scanner;
import java.util.Random;

public class RPS {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int ROCK = 0;
        final int PAPER = 1;
        final int SCISSORS = 2;
        Random rand = new Random();
        int seed = scnr.nextInt();
        rand.setSeed(seed);

        //Step 1:
        // Read two players name from input string.
        String Player_1 = scnr.next();
        String Player_2 = scnr.next();

        // Read number of rounds from input.
        int Rounds = scnr.nextInt();
        boolean finisher = true;

        // Continue number of rounds if value is below one and provide an error message.
        while(finisher)
        {
            if (Rounds >= 1) {
                System.out.println(Player_1 + " vs " + Player_2 + " for " + Rounds + " rounds");
                finisher = false;
                break;

            } else {
                System.out.println("Rounds must be > 0");

            }
            Rounds = scnr.nextInt();
        }

        int Player_1_Win_count = 0;
        int Player_2_Win_count = 0;

        //Step 2:
        for (int i = 0; i < Rounds; i++) {
            //Generate random values (0-2) for player 1 followed by player 2 by calling rand.nextInt(3);
            int P1_Random = rand.nextInt(3);
            int P2_Random = rand.nextInt(3);

            //Continue to generate random values for both players until both values do not match.
            if (P1_Random == P2_Random) {
                System.out.println("Tie");
                i--;

            }else{
                //Step 3:
                //identify winner for this round and out a message. Rock crushes scissors, scissors cut paper, paper covers rock.

                if(P1_Random == ROCK && P2_Random == SCISSORS) //Rock vs Scissors & Scissors vs Rock
                {
                    System.out.println(Player_1 + " Wins, " + "Rock crushes scissors");
                    Player_1_Win_count++;

                }else if(P2_Random == ROCK && P1_Random == SCISSORS) //Rock vs Scissors & Scissors vs Rock
                {
                    System.out.println(Player_2 + " Wins, " + "Rock crushes scissors");
                    Player_2_Win_count++;



                }else if(P1_Random == PAPER && P2_Random == ROCK) //Rock vs Paper & Paper vs Rock
                {
                    System.out.println(Player_1 + " Wins, " + "Paper covers rock");
                    Player_1_Win_count++;

                }else if(P2_Random == PAPER && P1_Random == ROCK) //Rock vs Paper & Paper vs Rock
                {
                    System.out.println(Player_2 + " Wins, " + "Paper covers rock");
                    Player_2_Win_count++;




                }else if(P1_Random == SCISSORS && P2_Random == PAPER) //Scissors vs Paper & Paper vs Scissors
                {
                    System.out.println(Player_1 + " Wins, " + "Scissors cut paper");
                    Player_1_Win_count++;

                }else if(P2_Random == SCISSORS && P1_Random == PAPER) //Scissors vs Paper & Paper vs Scissors
                {
                    System.out.println(Player_2 + " Wins, " + "Scissors cut paper");
                    Player_2_Win_count++;

                }

            }
        }

        //Step 4:
        System.out.println(Player_1 + " wins " + Player_1_Win_count + " and " + Player_2 + " wins " + Player_2_Win_count);
    }




}