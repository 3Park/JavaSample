package test.jgpark.first.Head02_OOP.Ex6;

public class AccountPay implements Payment{
    @Override
    public void pay(double amount) {
        System.out.printf("%.1f %s\n",amount,"계좌결제");
    }
}
