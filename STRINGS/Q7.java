import java.util.Scanner;

class IllegalArgumentExceptionDemo {

    public static void generateException(String text) {
        System.out.println("Generating IllegalArgumentException...");
        String result = text.substring(5, 2);  
        System.out.println("Substring: " + result);
    }

    public static void handleException(String text) {
        System.out.println("Handling IllegalArgumentException...");

        try {
            String result = text.substring(5, 2);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        handleException(userInput);
    }
}
