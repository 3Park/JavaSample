package test.jgpark.first.Head02_OOP.Ex7;

public abstract class Payment {
    public abstract void pay(double amount);
    public void cancel(double amount)
    {
        System.out.printf("%f %s",amount, "취소");
    }
}
