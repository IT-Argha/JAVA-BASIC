import java.util.Scanner;

 class ValidMobileNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 10-digit mobile number: ");
        String input = scanner.nextLine();
    

        try {
            char[] numberArray = input.toCharArray();
            if (numberArray.length != 10) {
                throw new Exception("Invalid number length. Please enter a 10-digit number.");
            }
            for (char digit : numberArray) {
                if (!Character.isDigit(digit)) {
                    throw new Exception("Invalid character detected. Please enter a valid 10-digit number.");
                }
            }
            System.out.println("Valid 10-digit mobile number: " + input);
            scanner.close();

        } catch (Exception e) {
            System.out.println("Invalid mobile number: " + e.getMessage());
            main(args);
        }
    }
}
