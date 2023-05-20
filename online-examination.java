import java.util.Scanner;

public class MCQProgram {
    // Variables to store user data
    private static String username = "";
    private static String password = "";
    private static int score = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.print("Username: ");
            String enteredUsername = scanner.nextLine();
            System.out.print("Password: ");
            String enteredPassword = scanner.nextLine();

            if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
                System.out.println("Login successful!");
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        // Update profile and password
        System.out.print("Do you want to update your profile and password? (y/n): ");
        String update = scanner.nextLine();
        if (update.equals("y")) {
            System.out.print("New username: ");
            username = scanner.nextLine();
            System.out.print("New password: ");
            password = scanner.nextLine();
            System.out.println("Profile and password updated.");
        }

        // MCQs
        System.out.println("Select the correct answer:");
        System.out.println("1. What is the capital of France?");
        System.out.println("a. Paris");
        System.out.println("b. Rome");
        System.out.println("c. Madrid");
        String answer = scanner.nextLine();
        if (answer.equals("a")) {
            score++;
        }

        System.out.println("2. What is the largest organ in the human body?");
        System.out.println("a. Brain");
        System.out.println("b. Skin");
        System.out.println("c. Heart");
        answer = scanner.nextLine();
        if (answer.equals("b")) {
            score++;
        }

        System.out.println("3. What is the symbol for gold on the periodic table?");
        System.out.println("a. Go");
        System.out.println("b. Gd");
        System.out.println("c. Au");
        answer = scanner.nextLine();
        if (answer.equals("c")) {
            score++;
        }

        // Timer and auto submit
        System.out.println("The quiz will automatically submit in 5 seconds.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Closing session and logout
        System.out.println("Your score is: " + score);
        System.out.println("Session closed.");
        loggedIn = false;
    }
}