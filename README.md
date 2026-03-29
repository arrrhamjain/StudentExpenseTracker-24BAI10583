# 💰 Student Expense Tracker

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![CLI](https://img.shields.io/badge/CLI-Application-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)

**A command-line Java application to help students take control of their finances.**

</div>

---

## 📌 About the Project

As a college student, tracking daily expenses is often overlooked — until the month ends and the money doesn't. **Student Expense Tracker** is a lightweight CLI application built in Java that lets you log income and expenses, view your transaction history, and monitor your balance in real time.

> Built as a capstone project for **Programming in Java (CSE 2006)** at **VIT Bhopal University**.

---

## ✨ Features

| Feature | Description |
|--------|-------------|
| ➕ Add Income | Log any money you receive |
| ➖ Add Expense | Record your daily spending |
| 📋 View Transactions | See your complete transaction history |
| 📊 View Summary | Get total income, expenses and balance |
| 💾 Auto Save | Data is saved to a file automatically |
| 🔁 Auto Load | Previous data loads every time you run |

---

## 🧠 Java Concepts Applied

- **Inheritance** — `Income` and `Expense` extend the abstract `Transaction` class
- **Polymorphism** — `getType()` and `toFileString()` are overridden in each subclass
- **Abstract Classes** — `Transaction` defines the blueprint for all transaction types
- **File I/O** — `BufferedReader` and `BufferedWriter` handle persistent storage
- **Collections** — `ArrayList<Transaction>` manages all transaction records
- **Exception Handling** — Invalid inputs are caught and handled gracefully

---

## 📁 Project Structure
```
StudentExpenseTracker/
│
├── src/
│   ├── Transaction.java         # Abstract base class
│   ├── Income.java              # Subclass for income entries
│   ├── Expense.java             # Subclass for expense entries
│   ├── TransactionManager.java  # Handles list, file save/load
│   └── Main.java                # Entry point and CLI menu
│
├── data/
│   └── transactions.txt         # Auto-generated data file
│
├── .gitignore
└── README.md
```

---

## 🚀 How to Run

### ✅ Prerequisites
- Java JDK 8 or above
- Any terminal or command prompt

### 📥 Clone the Repository
```bash
git clone https://github.com/arrrhamjain/StudentExpenseTracker-24BAI10583.git
cd StudentExpenseTracker-24BAI10583
```

### ⚙️ Compile
```bash
cd src
javac Transaction.java Income.java Expense.java TransactionManager.java Main.java
```

### ▶️ Run
```bash
java Main
```

---

## 🖥️ Application Preview
```
========================================
   Student Expense Tracker
========================================

1. Add Income
2. Add Expense
3. View All Transactions
4. View Summary
5. Exit

Choose an option: 1
Description: Pocket Money
Amount (Rs.): 2000
Date (DD-MM-YYYY): 30-03-2026
Income added successfully!
```

---

## 📊 Sample Summary Output
```
--- Summary ---
Total Income  : Rs. 2000.00
Total Expense : Rs. 450.00
Balance       : Rs. 1550.00
```

---

## 👨‍💻 Author

| Field | Details |
|-------|---------|
| **Name** | Arham Jain |
| **Reg. No.** | 24BAI10583 |
| **Course** | Programming in Java — CSE 2006 |
| **University** | VIT Bhopal University |

---

<div align="center">

*Made with ☕ Java and a lot of budgeting stress*

</div>