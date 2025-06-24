import java.util.Scanner;
import java.util.Random;

class VotingEligibility {
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    public static int[] inputAges(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = Integer.toString(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "False";
            } else if (ages[i] >= 18) {
                result[i][1] = "True";
            } else {
                result[i][1] = "False";
            }
        }
        return result;
    }

    public static void displayResults(String[][] data) {
        System.out.println("\nStudent\tAge\tCan Vote");
        System.out.println("---------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d\t%s\t%s\n", (i + 1), data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 10;
        int[] ages = inputAges(NUMBER_OF_STUDENTS);
        String[][] eligibility = checkVotingEligibility(ages);
        displayResults(eligibility);
    }
}
