package word_games;
import java.util.Scanner;

public class WordGamesTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask for a word
        System.out.println("Please enter a word: ");
        String userWord = input.nextLine();
        WordGames wordGame = new WordGames(userWord);
        // Scramble it 2
        String scrambled = wordGame.scramble();
        // Print out scrambled word
        System.out.println(scrambled);

        // Ask for an index
        System.out.println("Please enter a index: ");
        int index = input.nextInt();
        input.nextLine();
        // Ask for random word
        System.out.println("Enter another word: ");
        String randWord1 = input.nextLine();

        // Add random word at index
        String addWordIndex = wordGame.bananaSplit(index, randWord1);
        // Print out the word
        System.out.println(addWordIndex);

        // Ask for a character (store as a String)
        System.out.println("Enter a character: ");
        String addChar = input.nextLine();
        // Ask for random word
        System.out.println("Enter another word: ");
        String randWord2 = input.nextLine();
        // Add random word at character
        String addWordChar = wordGame.bananaSplit(addChar, randWord2);
        // Print out the word
        System.out.println(addWordChar);

        // word to string
        String strWord = wordGame.toString();
        System.out.println(strWord);

    }
}
