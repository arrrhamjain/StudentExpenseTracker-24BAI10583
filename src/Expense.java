// Expense.java
public class Expense extends Transaction {

    public Expense(String description, double amount, String date) {
        super(description, amount, date);
    }

    @Override
    public String getType() {
        return "EXPENSE";
    }

    @Override
    public String toFileString() {
        return "EXPENSE," + getDescription() + "," + getAmount() + "," + getDate();
    }
}