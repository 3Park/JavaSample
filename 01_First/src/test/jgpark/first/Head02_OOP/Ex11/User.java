package test.jgpark.first.Head02_OOP.Ex11;

public class User {
    private final String accId;
    private double balance;

    public User(String accId) {
        this.accId = accId;
    }

    public void deposit(double amt)
    {
        if(amt <= 0)
            throw new IllegalArgumentException("Greater than 0");

        balance += amt;
    }

    public void withraw(double amt)
    {
        if(amt <= 0 || amt > balance)
            throw new  IllegalArgumentException("Invalid amount");
        balance -= amt;
    }

    public double getBalance()
    {
        return balance;
    }
}
