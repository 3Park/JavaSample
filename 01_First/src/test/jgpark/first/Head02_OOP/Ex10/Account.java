package test.jgpark.first.Head02_OOP.Ex10;

public class Account implements Payment{
    @Override
    public void pay(double amount) {
        System.out.printf("%s %f %s\n","계좌이체",amount,"결제");
    }
}
