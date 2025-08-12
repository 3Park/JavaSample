package test.jgpark.first.Head02_OOP.Ex4;

public class CreditCard implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("카드결제");
        
    }
}
