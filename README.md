# Student Expense Tracker

A command-line based expense tracking application built in Java, designed to help students manage their daily income and expenses effectively.

## About the Project

As a college student, managing personal finances can be challenging. This application provides a simple and effective way to track income and expenses, view transaction history, and monitor your current balance — all from the terminal.

## Features

- Add income transactions
- Add expense transactions
- View all transactions
- View financial summary (total income, total expense, balance)
- Data is saved automatically to a file and loaded on next run

## Concepts Used

- **Inheritance** — `Income` and `Expense` classes extend the abstract `Transaction` base class
- **Polymorphism** — `getType()` and `toFileString()` methods are overridden in each subclass
- **File I/O** — transactions are saved and loaded from `data/transactions.txt`
- **Collections** — `ArrayList` is used to store and manage transactions
- **Exception Handling** — invalid inputs are caught and handled gracefully

## Project Structure
```
StudentExpenseTracker/
├── src/
│   ├── Transaction.java
│   ├── Income.java
│   ├── Expense.java
│   ├── TransactionManager.java
│   └── Main.java
├── data/
│   └── transactions.txt
└── README.md
```

## How to Run

### Prerequisites
- Java JDK 8 or above installed
- Any terminal or command prompt

### Steps

1. Clone the repository
```
git clone https://github.com/arrrhamjain/StudentExpenseTracker-24BAI10583.git
```

2. Navigate to the src folder
```
cd StudentExpenseTracker-24BAI10583/src
```

3. Compile the code
```
javac Transaction.java Income.java Expense.java TransactionManager.java Main.java
```

4. Run the program
```
java Main
```

## How to Use

Once the program starts you will see a menu:
```
========================================
   Student Expense Tracker
========================================

1. Add Income
2. Add Expense
3. View All Transactions
4. View Summary
5. Exit
```

- Choose **1** to add an income entry (e.g. pocket money, part-time work)
- Choose **2** to add an expense entry (e.g. food, transport, books)
- Choose **3** to see all your transactions
- Choose **4** to see your total income, total expenses and current balance
- Choose **5** to exit the program

## Author

- **Name:** Arham Jain
- **Registration Number:** 24BAI10583
- **Course:** Programming in Java (CSE 2006)
- **University:** VIT Bhopal University