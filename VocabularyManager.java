import java.io.*;
import java.util.*;

public class VocabularyManager {
    private static final String FILE_NAME = "dictionary.txt";
    private static Map<String, String> dictionary = new HashMap<>();

    public static void main(String[] args) {
        loadDictionary();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Dictionary Tool Menu:");
            System.out.println("1. Add word and meaning");
            System.out.println("2. Search for meaning");
            System.out.println("3. Remove word");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addWordMeaning(scanner);
                    break;
                case 2:
                    searchWord(scanner);
                    break;
                case 3:
                    removeWord(scanner);
                    break;
                case 4:
                    saveDictionary();
                    System.out.println("Exiting...");
                    scanner.close(); 
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void loadDictionary() {
        try (Scanner fileScanner = new Scanner(new File(FILE_NAME))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String word = parts[0].trim();
                    String meaning = parts[1].trim();
                    dictionary.put(word, meaning);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading dictionary: " + e.getMessage());
        }
    }

    private static void addWordMeaning(Scanner scanner) {
        System.out.print("Enter word: ");
        String word = scanner.nextLine().trim();
        if (word.isEmpty()) {
            System.out.println("Word cannot be empty. Please try again.");
            return;
        }
        if (dictionary.containsKey(word)) {
            System.out.println("Word already exists in the dictionary.");
            return;
        }
        System.out.print("Enter meaning: ");
        String meaning = scanner.nextLine().trim();
        if (meaning.isEmpty()) {
            System.out.println("Meaning cannot be empty. Please try again.");
            return;
        }
        dictionary.put(word, meaning);
        System.out.println("Word added successfully!");
    }

    private static void searchWord(Scanner scanner) {
        System.out.print("Enter word to search: ");
        String word = scanner.nextLine().trim();
        if (word.isEmpty()) {
            System.out.println("Word cannot be empty. Please try again.");
            return;
        }
        String meaning = dictionary.get(word);
        if (meaning != null) {
            System.out.println("Meaning: " + meaning);
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }

    private static void removeWord(Scanner scanner) {
        System.out.print("Enter word to remove: ");
        String word = scanner.nextLine().trim();
        if (word.isEmpty()) {
            System.out.println("Word cannot be empty. Please try again.");
            return;
        }
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
            System.out.println("Word removed successfully!");
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }

    private static void saveDictionary() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving dictionary: " + e.getMessage());
        }
    }
}