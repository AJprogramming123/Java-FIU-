package Week9;
import java.util.Scanner;


public class FavoriteArtists {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int Favs = scnr.nextInt();

        String[] Artists = new String[Favs];
        String[] favSong = new String[Favs];

        for(int i = 1; i <= Artists.length; i++)
        {
            System.out.println("What's your number " + i + " artist? " );
                Artists[i] = scnr.next();

            System.out.println("What's your favorite song?" + i);
                favSong[i] = scnr.nextLine();

                if(i < Artists.length)
                {
                    System.out.println("Your picks are: " + Artists[i] + "and fav song is" + favSong[i]);

                }

        }
    }
}
