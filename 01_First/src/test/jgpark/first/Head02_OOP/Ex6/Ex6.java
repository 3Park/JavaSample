package test.jgpark.first.Head02_OOP.Ex6;

public class Ex6 {
    public static void main(String[] args) {
        Order o = new Order(new CreditCard());
        o.Process(5000);

        Order o1 = new Order(new AccountPay());
        o1.Process(30000);

        Order o2 = new Order(new CryptoPay());
        o2.Process(5000);
    }
}
