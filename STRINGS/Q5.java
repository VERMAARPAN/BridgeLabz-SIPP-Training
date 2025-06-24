import java.util.Scanner;

class StringIndexExceptionDemo {
    public static void generateException(String text) {
        System.out.println("Generating Exception...");

        char ch = text.charAt(text.length()); 
        System.out.println("Character at index " + text.length() + ": " + ch);
    }

    public static void handleException(String text) {
        System.out.println("Handling Exception...");
        try {
            char ch = text.charAt(text.length()); 
            System.out.println("Character at index " + text.length() + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        handleException(userInput);
    }
}
