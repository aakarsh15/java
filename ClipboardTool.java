import java.io.*;
import java.util.*;

public class ClipboardTool {
    private static final String CLIPBOARD_FILE = "clipboard.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nClipboard Tool");
            System.out.println("1. Cut");
            System.out.println("2. Copy");
            System.out.println("3. Paste");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cutText();
                    break;
                case 2:
                    copyText();
                    break;
                case 3:
                    pasteText();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void cutText() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = scanner.next();
        List<String> lines = readFile(fileName);

        if (lines.isEmpty()) {
            System.out.println("File is empty or not found.");
            return;
        }

        System.out.print("Enter start line number: ");
        int startLine = scanner.nextInt();
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end line number: ");
        int endLine = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();

        StringBuilder cutText = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (i + 1 == startLine) {
                if (i + 1 == endLine) {
                    cutText.append(line.substring(startIndex, endIndex));
                    lines.set(i, line.substring(0, startIndex) + line.substring(endIndex));
                } else {
                    cutText.append(line.substring(startIndex)).append("\n");
                    lines.set(i, line.substring(0, startIndex));
                }
            } else if (i + 1 > startLine && i + 1 < endLine) {
                cutText.append(line).append("\n");
                lines.set(i, "");
            }
        }

        writeFile(CLIPBOARD_FILE, cutText.toString());
        writeFile(fileName, lines);

        System.out.println("Text cut successfully.");
    }

    private static void copyText() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = scanner.next();
        List<String> lines = readFile(fileName);

        if (lines.isEmpty()) {
            System.out.println("File is empty or not found.");
            return;
        }

        System.out.print("Enter start line number: ");
        int startLine = scanner.nextInt();
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end line number: ");
        int endLine = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();

        StringBuilder copiedText = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (i + 1 == startLine) {
                if (i + 1 == endLine) {
                    copiedText.append(line.substring(startIndex, endIndex));
                } else {
                    copiedText.append(line.substring(startIndex)).append("\n");
                }
            } else if (i + 1 > startLine && i + 1 < endLine) {
                copiedText.append(line).append("\n");
            }
        }

        writeFile(CLIPBOARD_FILE, copiedText.toString());

        System.out.println("Text copied successfully.");
    }

    private static void pasteText() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = scanner.next();
        List<String> lines = readFile(fileName);

        if (lines.isEmpty()) {
            System.out.println("File is empty or not found.");
            return;
        }

        System.out.print("Enter line number to paste: ");
        int lineNumber = scanner.nextInt();
        System.out.print("Enter index to paste: ");
        int index = scanner.nextInt();

        List<String> clipboardLines = readFile(CLIPBOARD_FILE);

        if (clipboardLines.isEmpty()) {
            System.out.println("Clipboard is empty.");
            return;
        }

        for (int i = 0; i < clipboardLines.size(); i++) {
            String line = clipboardLines.get(i);
            if (i == 0) {
                lines.set(lineNumber - 1, lines.get(lineNumber - 1).substring(0, index) + line +
                        lines.get(lineNumber - 1).substring(index));
            } else {
                lines.add(lineNumber + i - 1, line);
            }
        }

        writeFile(fileName, lines);

        System.out.println("Text pasted successfully.");
    }

    private static List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error occurred while reading file.");
            e.printStackTrace();
        }
        return lines;
    }

    private static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Error occurred while writing to file.");
            e.printStackTrace();
        }
    }

    private static void writeFile(String fileName, List<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error occurred while writing to file.");
            e.printStackTrace();
        }
    }
}