/*
Andres Jaimes
ID: 6289563
 */


package Week14.ExtracreditProject.Hangman_challenge;
import javax.swing.JOptionPane;



public class PlayGame {
    // Global static variables
    private static int gamesWon = 0;        //default games won
    private static int gamesLost = 0;       //default games lost

    public static void main(String[] args) {

        boolean playAgain = true;       //default boolean

        do
        {
            Hangman aGame = new Hangman();
            processGuesses(aGame);
            determineWinner(aGame);

            String[] options = {"yes", "no"}; //The two different types of options
            int choice = JOptionPane.showOptionDialog(null, "Play again?", "Play Again", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);   //This is how the JOPtion object is able to have yes and no as answers.

            // Check user choice
            playAgain = (choice == JOptionPane.YES_OPTION); //yes option
        } while (playAgain);
        summarize();
        }

                            // Method to process user guesses (it's for counting)
                            public static void processGuesses(Hangman aGame)
                            {
                                int secretWordLength = aGame.getSecretWord().length();
                                int chances = 3 * secretWordLength;
                                int usedChances = 0;
                                int loc = -1;

                                while (usedChances < chances && !aGame.getSecretWord().equalsIgnoreCase(aGame.getUserGuess())) {
                                    usedChances++;
                                    String userLetter = JOptionPane.showInputDialog("Attempts left: " + (chances - usedChances + 1) + "\n\nWord with guessed letters: " + aGame.getUserGuess() + "\n\nGuess the letter: ");

                                    if (userLetter != null && userLetter.length() == 1)
                                    {
                                        loc = -1;

                                        do {

                                            //to search for the next occurrence of the guessed letter
                                            loc++;
                                            loc = aGame.getSecretWord().indexOf(userLetter.charAt(0), loc);


                                            if (loc >= 0) {
                                                //Before guessing the letter
                                                String BEFORE = aGame.getUserGuess().substring(0, loc);

                                                //After guessing the letter
                                                String AFTER = aGame.getUserGuess().substring(loc + 1);

                                                //replacing the amount
                                                aGame.setUserGuess(BEFORE + userLetter + AFTER);
                                            }

                                        } while (loc != -1);

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Invalid input! Please enter a single letter.");
                                    }
                                }
                            }

                          // Method to determine the winner and update global variables
                            public static void determineWinner(Hangman aGame)
                            {
                                if (aGame.getSecretWord().equalsIgnoreCase(aGame.getUserGuess())) {  //if statement for if they won or not
                                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the word: " + aGame.getSecretWord());
                                    gamesWon++;

                                } else {
                                    JOptionPane.showMessageDialog(null, "Sorry! you didn't guess the word. The correct word was: " + aGame.getSecretWord());
                                    gamesLost++;
                                }
                            }



    // Method to summarize the game
    public static void summarize()          //Once user is done they will get this result
    {
        JOptionPane.showMessageDialog(null, "Total games won: " + gamesWon + "\nTotal games lost: " + gamesLost);   //Counts the amount of wins and losses
    }
}
