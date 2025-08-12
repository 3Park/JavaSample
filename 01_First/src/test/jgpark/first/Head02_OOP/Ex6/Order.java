package test.jgpark.first.Head02_OOP.Ex6;

public class Order
{
    private Payment pay;
    public Order(Payment p)
    {
        pay = p;
    }

    public void Process(double amount)
    {
        pay.pay(amount);
    }
}
