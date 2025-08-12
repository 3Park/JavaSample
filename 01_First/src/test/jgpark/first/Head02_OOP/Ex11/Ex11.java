package test.jgpark.first.Head02_OOP.Ex11;

public class Ex11
{
    public static void main(String[] args) {
        Payment p = new Payment();
        User u = new User("1234");

        try
        {
            u.deposit(100);
            p.pay(u,100);
            p.refund(u,100);
        }
        catch (Exception e)
        {
            System.out.printf("오류 : %s\n", e.getMessage());
        }

    }
}
