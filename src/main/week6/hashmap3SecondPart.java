import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Enter a command: ");
            String command = reader.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            } else if (command.equalsIgnoreCase("add")) {
                addWordPair();
            } else if (command.equalsIgnoreCase("translate")) {
                translateWord();
            } else {
                System.out.println("Invalid statement");
            }
        }
    }

    private void addWordPair() {
        System.out.print("Enter a word in Finnish: ");
        String word = reader.nextLine();
        System.out.print("Enter its translation in English: ");
        String translation = reader.nextLine();

        dictionary.add(word, translation);
    }

    private void translateWord() {
        System.out.print("Enter a word in Finnish: ");
        String word = reader.nextLine();

        String translation = dictionary.translate(word);
        if (translation != null) {
            System.out.println("Translation: " + translation);
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        TextUserInterface ui = new TextUserInterface(new Scanner(System.in), dictionary);
        ui.start();
    }
}
