import java.util.Scanner;

class StringCharacterComparison {
    public static char[] getCharacters(String input) {
        int length = input.length();
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = input.charAt(i);
        }
        return chars;
    }
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        char[] userDefinedChars = getCharacters(userInput);

        char[] builtInChars = userInput.toCharArray();

        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        System.out.println("\nUser-defined method result:");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nBuilt-in toCharArray() method result:");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both arrays equal? " + areEqual);
    }
}
