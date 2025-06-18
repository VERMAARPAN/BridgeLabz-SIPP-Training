import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        double a, b, c;


        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        a = input.nextDouble();

        System.out.print("Enter value for b: ");
        b = input.nextDouble();

        System.out.print("Enter value for c: ");
        c = input.nextDouble();


        double result1 = a + b * c;    // Multiplication before addition
        double result2 = a * b + c;    // Multiplication before addition
        double result3 = c + a / b;    // Division before addition


        double result4 = a % b + c;    // Remainder before addition

        System.out.printf("a + b * c = %.4f%n", result1);
        System.out.printf("a * b + c = %.4f%n", result2);
        System.out.printf("c + a / b = %.4f%n", result3);
        System.out.printf("a %% b + c = %.4f%n", result4);

        input.close();
    }
}
