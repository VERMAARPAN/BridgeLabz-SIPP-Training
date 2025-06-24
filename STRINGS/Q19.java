import java.util.Scanner;

class CustomSplitCompare {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] customSplit(String text) {
        int length = getLength(text);
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        inWord = false;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                spaceIndexes[index++] = i;
                inWord = true;
            } else if (text.charAt(i) == ' ' && inWord) {
                spaceIndexes[index++] = i;
                inWord = false;
            }
        }

        if (inWord) {
            spaceIndexes[index] = length;
        }

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndexes[i]; j < spaceIndexes[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] builtInSplit = input.trim().split(" +"); // handles multiple spaces
        String[] manualSplit = customSplit(input);

        System.out.println("\nWords from built-in split():");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords from custom split:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        boolean isSame = compareArrays(builtInSplit, manualSplit);
        System.out.println("\nAre both word arrays equal? " + isSame);
    }
}
