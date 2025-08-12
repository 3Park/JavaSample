package test.jgpark.first.Head02_OOP.Ex11;

public class Ex11
{
    public static void main(String[] args) {
        Payment p = new Payment();
        User u = new User("1234");

        p.refund(u,200);
        p.pay(u,100);
        p.refund(u,200);
    }
}
