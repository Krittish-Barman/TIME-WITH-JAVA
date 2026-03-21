public class BankAccount {
    private String name;
    private String accountNumber;
    private String accountType;
    private double balance;

    public BankAccount(String name, String accountNumber, String accountType, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public String deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return "Deposited " + amount + " into account " + this.accountNumber + ". New balance: " + this.balance;
        } else {
            return "Invalid deposit amount. Please enter a positive amount.";
        }
    }

    public String withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return "Withdrew " + amount + " from account " + this.accountNumber + ". New balance: " + this.balance;
        } else if (amount <= 0) {
            return "Invalid withdrawal amount. Please enter a positive amount.";
        } else {
            return "Insufficient balance for withdrawal.";
        }
    }

    public String displayBalance() {
        return "Account Name: " + this.name + ", Account Number: " + this.accountNumber + ", Balance: " + this.balance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("KRITTISH BARMAN", "98745632112", "Savings", 4000000.0);
        System.out.println(account1.displayBalance());
        System.out.println(account1.deposit(7850));
        System.out.println(account1.withdraw(8456));
    }
}