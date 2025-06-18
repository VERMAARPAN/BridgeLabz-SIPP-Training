import java.util.Scanner;

 class IntOperation {
    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter value for a: ");
        a = input.nextInt();

        System.out.print("Enter value for b: ");
        b = input.nextInt();

        System.out.print("Enter value for c: ");
        c = input.nextInt();

        int result1 = a + b * c;    // Multiplication before addition
        int result2 = a * b + c;    // Multiplication before addition
        int result3 = c + a / b;    // Division before addition
        int result4 = a % b + c;    // Modulus before addition

        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        input.close();
    }
}
