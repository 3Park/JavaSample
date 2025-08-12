package test.jgpark.first.Head02_OOP.Ex7;

public class Order {
    private Payment p;
    public Order(Payment pay)
    {
        p=pay;
    }

    public void OrderPay(double d)
    {
        p.pay(d);
    }

    public  void CancelPay(double d)
    {
        p.cancel(d);
    }
}
