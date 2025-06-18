import java.util.Scanner;
class QuotientRemainder {
    public static void main(String[] args) {
        int number1, number2;
        int quotient, remainder;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        if (number2 != 0) {
            quotient = number1 / number2;
            remainder = number1 % number2;

            System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d%n",
                              quotient, remainder, number1, number2);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        input.close();
    }
}
