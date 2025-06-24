import java.util.Scanner;

class NumberFormatExceptionDemo {
    public static void generateException(String text) {
        System.out.println("Generating NumberFormatException...");
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    public static void handleException(String text) {
        System.out.println("Handling NumberFormatException...");

        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number as text: ");
        String input = scanner.nextLine();
        handleException(input);
    }
}
