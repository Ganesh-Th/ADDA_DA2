
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        // Simulate a database with user information (username, password)
        Map<String, String> users = new HashMap<>();
        users.put("user1", "password1");
        users.put("user2", "password2");
        users.put("user3", "password3");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (users.containsKey(username)) {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Retrieve the stored password for the entered username
            String storedPassword = users.get(username);

            if (password.equals(storedPassword)) {
                System.out.println("Login successful. Welcome, " + username + "!");
            } else {
                System.out.println("Invalid password. Login failed.");
            }
        } else {
            System.out.println("Username not found. Login failed.");
        }

        scanner.close();
    }
}
