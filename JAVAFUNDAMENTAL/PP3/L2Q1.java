import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        double number1, number2;
        double addition, subtraction, multiplication, division;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;

        if (number2 != 0) {
            division = number1 / number2;
        } else {
            division = Double.NaN; // Handle division by zero
        }

        System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %s%n",
                          number1, number2, addition, subtraction, multiplication,
                          (Double.isNaN(division) ? "undefined (division by zero)" : String.format("%.2f", division)));

        input.close();
    }
}
