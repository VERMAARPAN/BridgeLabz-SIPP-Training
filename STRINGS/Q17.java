import java.util.Scanner;

class ManualTrim {
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }
	  return new int[]{start, end};
    }
    public static String manualSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();
        int[] indices = findTrimIndices(input);
        String manuallyTrimmed = manualSubstring(input, indices[0], indices[1]);
        String builtinTrimmed = input.trim();
        boolean isSame = compareStrings(manuallyTrimmed, builtinTrimmed);
        System.out.println("\nOriginal Input         : '" + input + "'");
        System.out.println("Manually Trimmed       : '" + manuallyTrimmed + "'");
        System.out.println("Built-in Trimmed       : '" + builtinTrimmed + "'");
        System.out.println("Both results are equal : " + isSame);
    }
}
