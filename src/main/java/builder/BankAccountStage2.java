package builder;

public class BankAccountStage2 {
    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public BankAccountStage2(long accountNumber, String owner, String branch, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.branch = branch;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

// How do we call it?
// BankAccount account = new BankAccount(456L, "Marge", "Springfield", 100.00, 2.5);
// BankAccount anotherAccount = new BankAccount(789L, "Homer", null, 2.5, 100.00);  //Oops!