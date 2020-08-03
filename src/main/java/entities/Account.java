package entities;

public class Account {

    private int accountNumber;
    private String name;
    private double accountValue;

    public Account(int accountNumber, String name, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialDeposit);
    }

    public Account(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountValue() {
        return accountValue;
    }

    public void deposit(double accountValue) {
        this.accountValue += accountValue;
    }

    public void withdraw(double accountValue) {
        this.accountValue = this.accountValue - accountValue - 5.00;
    }

    public String toString() {
        return "Account "
                + getAccountNumber()
                + ", "
                + "Holder: "
                + getName()
                + ", "
                + "Balance: "
                + "$ " + String.format("%.2f%n", getAccountValue());
    }

}
