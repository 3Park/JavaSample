package test.jgpark.first.Head02_OOP.Ex7;

public class Ex7 {
    public static void main(String[] args) {
        Order o = new Order(new Account());
        o.OrderPay(90);
        o.CancelPay(90);

        Order o1 = new Order(new Card());
        o1.OrderPay(90);
        o1.CancelPay(90);

        Order o2 = new Order(new Crypto());
        o2.OrderPay(90);
        o2.CancelPay(90);


    }
}
