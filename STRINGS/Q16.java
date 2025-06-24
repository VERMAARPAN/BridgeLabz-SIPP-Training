import java.util.Scanner;

class WordAnalyzer {

    public static String[] extractWords(String text) {
        text = text + " ";
        String[] words = new String[100];
        int wordIndex = 0;
        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else if (!currentWord.equals("")) {
                words[wordIndex++] = currentWord;
                currentWord = "";
            }
        }

        String[] result = new String[wordIndex];
        for (int i = 0; i < wordIndex; i++) {
            result[i] = words[i];
        }

        return result;
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
        String[][] wordData = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = getLength(words[i]);
            wordData[i][0] = words[i];
            wordData[i][1] = String.valueOf(len);
        }

        return wordData;
    }
    public static int[] findMinMax(String[][] wordData) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);
            int minLen = Integer.parseInt(wordData[minIndex][1]);
            int maxLen = Integer.parseInt(wordData[maxIndex][1]);

            if (len < minLen) {
                minIndex = i;
            }
            if (len > maxLen) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String inputText = scanner.nextLine();

        String[] words = extractWords(inputText);
        String[][] wordData = getWordsWithLengths(words);
        int[] minMax = findMinMax(wordData);

        System.out.println("\nWord List with Lengths:");
        for (String[] entry : wordData) {
            System.out.println(entry[0] + " -> " + entry[1]);
        }

        System.out.println("\nShortest Word: " + wordData[minMax[0]][0] + " (" + wordData[minMax[0]][1] + ")");
        System.out.println("Longest Word : " + wordData[minMax[1]][0] + " (" + wordData[minMax[1]][1] + ")");
    }
}
