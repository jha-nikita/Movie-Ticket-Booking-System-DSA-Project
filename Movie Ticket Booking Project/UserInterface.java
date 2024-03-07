import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Movie Ticket Booking App");
        System.out.println("1. Book Ticket");
        System.out.println("2. Display Movies");
        System.out.println("3. Exit");
        System.out.println("Enter your choice:");
    }

    public int getMenuChoice() {
        return scanner.nextInt();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
}
