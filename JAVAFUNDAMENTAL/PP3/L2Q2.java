import java.util.Scanner;
 class TriangleArea {
    public static void main(String[] args) {
     
        double baseCm, heightCm;
        double areaSqCm, areaSqIn;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in cm): ");
        baseCm = input.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        heightCm = input.nextDouble();

        areaSqCm = 0.5 * baseCm * heightCm;

        areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaSqIn, areaSqCm);

        input.close();
    }
}
