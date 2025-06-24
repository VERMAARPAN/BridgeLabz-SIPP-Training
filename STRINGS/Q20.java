import java.util.Scanner;

class StringLengthFinder {
    public static int findLengthWithoutUsingLength(String text) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.next(); 
        int customLength = findLengthWithoutUsingLength(input);

        int actualLength = input.length();
        System.out.println("\nLength using custom method : " + customLength);
        System.out.println("Length using built-in method: " + actualLength);
    }
}
