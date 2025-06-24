import java.util.Scanner;

class StringComparison {
    public static boolean compareWithCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = scanner.next();

        System.out.print("Enter second string: ");
        String second = scanner.next();

        boolean resultCharAt = compareWithCharAt(first, second);

        boolean resultEquals = first.equals(second);

        System.out.println("Comparison using charAt(): " + resultCharAt);
        System.out.println("Comparison using equals(): " + resultEquals);
        System.out.println("Do both methods give the same result? " + (resultCharAt == resultEquals));

        scanner.close();
    }
}
