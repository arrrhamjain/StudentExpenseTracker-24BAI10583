// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransactionManager manager = new TransactionManager();
        manager.loadFromFile();

        System.out.println("========================================");
        System.out.println("   Student Expense Tracker");
        System.out.println("========================================");

        while (true) {
            System.out.println("\n1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View All Transactions");
            System.out.println("4. View Summary");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());

                if (choice == 1 || choice == 2) {
                    System.out.print("Description: ");
                    String desc = scanner.nextLine().trim();

                    System.out.print("Amount (Rs.): ");
                    double amount = Double.parseDouble(scanner.nextLine().trim());

                    System.out.print("Date (DD-MM-YYYY): ");
                    String date = scanner.nextLine().trim();

                    if (choice == 1) {
                        manager.addTransaction(new Income(desc, amount, date));
                        System.out.println("Income added successfully!");
                    } else {
                        manager.addTransaction(new Expense(desc, amount, date));
                        System.out.println("Expense added successfully!");
                    }

                } else if (choice == 3) {
                    manager.displayAll();
                } else if (choice == 4) {
                    manager.showSummary();
                } else if (choice == 5) {
                    System.out.println("Goodbye! Stay on budget.");
                    break;
                } else {
                    System.out.println("Invalid option. Please try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        scanner.close();
    }
}