import java.util.Scanner;

class WordLengthAnalyzer {
    public static String[] extractWords(String text) {
        text = text + " ";
        String[] temp = new String[100];
        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.equals("")) {
                temp[index++] = word;
                word = "";
            }
        }


        String[] words = new String[index];
        for (int i = 0; i < index; i++) {
            words[i] = temp[i];
        }

        return words;
    }

    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {

        }
        return count;
    }


    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = getLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }
        return result;
    }

    public static void displayTable(String[][] wordData) {
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("-----------------------------");
        for (int i = 0; i < wordData.length; i++) {
            int length = Integer.parseInt(wordData[i][1]); // Convert back to int
            System.out.printf("%-15s %-10d\n", wordData[i][0], length);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = extractWords(input);
        String[][] wordData = getWordsWithLengths(words);

        System.out.println("\nWord Length Table:");
        displayTable(wordData);
    }
}
