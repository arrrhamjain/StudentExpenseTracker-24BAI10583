// TransactionManager.java
import java.util.*;
import java.io.*;

public class TransactionManager {
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private static final String FILE_PATH = "data/transactions.txt";

    public void addTransaction(Transaction t) {
        transactions.add(t);
        saveToFile();
    }

    public void displayAll() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }
        System.out.println("\n--- All Transactions ---");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public void showSummary() {
        double totalIncome = 0, totalExpense = 0;
        for (Transaction t : transactions) {
            if (t instanceof Income) totalIncome += t.getAmount();
            else if (t instanceof Expense) totalExpense += t.getAmount();
        }
        System.out.println("\n--- Summary ---");
        System.out.printf("Total Income  : Rs. %.2f%n", totalIncome);
        System.out.printf("Total Expense : Rs. %.2f%n", totalExpense);
        System.out.printf("Balance       : Rs. %.2f%n", totalIncome - totalExpense);
    }

    public void saveToFile() {
        try {
            new File("data").mkdirs();
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH));
            for (Transaction t : transactions) {
                writer.write(t.toFileString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public void loadFromFile() {
        File file = new File(FILE_PATH);
        if (!file.exists()) return;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String type = parts[0];
                    String desc = parts[1];
                    double amount = Double.parseDouble(parts[2]);
                    String date = parts[3];
                    if (type.equals("INCOME")) transactions.add(new Income(desc, amount, date));
                    else if (type.equals("EXPENSE")) transactions.add(new Expense(desc, amount, date));
                }
            }
            reader.close();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}