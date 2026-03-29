// Transaction.java
public abstract class Transaction {
    private String description;
    private double amount;
    private String date;

    public Transaction(String description, double amount, String date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    public String getDescription() { return description; }
    public double getAmount() { return amount; }
    public String getDate() { return date; }

    // Polymorphic method — overridden by Income and Expense
    public abstract String getType();

    public abstract String toFileString();

    @Override
    public String toString() {
        return String.format("[%s] %s | Rs. %.2f | %s", getType(), description, amount, date);
    }
}