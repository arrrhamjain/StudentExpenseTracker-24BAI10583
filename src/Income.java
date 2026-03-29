// Income.java
public class Income extends Transaction {

    public Income(String description, double amount, String date) {
        super(description, amount, date);
    }

    @Override
    public String getType() {
        return "INCOME";
    }

    @Override
    public String toFileString() {
        return "INCOME," + getDescription() + "," + getAmount() + "," + getDate();
    }
}