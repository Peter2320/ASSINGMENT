import java.util.Scanner;

public class LoginProgram {
    private static final String CORRECT_USERNAME = "username";
    private static final String CORRECT_PASSWORD = "password";
    private static final int MAX_TRIES = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int tries = 1; tries <= MAX_TRIES; tries++) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = getPasswordInput(scanner);

            if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Login failed. Please try again.");
                System.out.println("Remaining tries: " + (MAX_TRIES - tries));
            }
        }

        scanner.close();
    }

    private static String getPasswordInput(Scanner scanner) {
        // Disable echoing to hide the password characters
        System.console().flush();
        char[] passwordChars = System.console().readPassword();
        return new String(passwordChars);
    }
}
