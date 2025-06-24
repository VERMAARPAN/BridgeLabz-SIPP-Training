class NullPointerExceptionDemo {

    public static void generateNullPointer() {
        System.out.println("Generating NullPointerException...");
	String text = null;
	int length = text.length();
	System.out.println("Length of the string: " + length);
    }

    public static void handleNullPointer() {
        System.out.println("Handling NullPointerException...");

        String text = null;

        try {
            int length = text.length(); 
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e);
        }
    }

    public static void main(String[] args) {
        handleNullPointer();
    }
}
