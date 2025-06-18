import java.util.Scanner;
class TotalPurchasePrice {
    public static void main(String[] args) {

        double unitPrice, totalPrice;
        int quantity;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price of the item (INR): ");
        unitPrice = input.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt();

        totalPrice = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f%n",
                          totalPrice, quantity, unitPrice);

        input.close();
    }
}
