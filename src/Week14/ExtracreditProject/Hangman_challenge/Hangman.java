/*
Andres Jaimes
ID: 6289563
 */


package Week14.ExtracreditProject.Hangman_challenge;
import java.util.Random;

public class Hangman {
    private String secretWord;
    private String userGuess;

    //Constructor
    public Hangman() {
        // Array of possible secret words
        String[] words = {"hangman", "banana", "pizza", "computer science", "disney"};

        // Generate a random number between 0 and 5
        Random rand = new Random();
        int index = rand.nextInt(5);

        // Set the secret word based on the random number generated
        this.secretWord = words[index];

        // Initialize guess with underscores
        StringBuilder guessBuilder = new StringBuilder();

                for (int i = 0; i < this.secretWord.length(); i++) {  //This for loop is for every character in the random word be replaced with "_"
                    guessBuilder.append("_");
                }
        this.userGuess = guessBuilder.toString();
    }

                    // Getter and setter for secret word
                    public String getSecretWord() {
                        return secretWord;
                    }

                    public void setSecretWord(String secretWord) {
                        this.secretWord = secretWord;
                    }

                    // Getter and setter for user's guess
                    public String getUserGuess() {
                        return userGuess;
                    }

                    public void setUserGuess(String userGuess) {
                        this.userGuess = userGuess;
                    }




    // toString() method to return both secret word and user's guess
    @Override
    public String toString() {
        return "Secret word: " + secretWord + "\nUser's guess: " + userGuess;
    }
}
