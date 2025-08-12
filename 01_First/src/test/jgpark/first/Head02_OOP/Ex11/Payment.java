package test.jgpark.first.Head02_OOP.Ex11;

public class Payment {
    public void pay(User u, double bal)
    {
        try
        {
            u.withraw(bal);
            System.out.printf("결제완료. 잔액 : %f\n", u.getBalance());
        } catch (Exception e) {
            System.out.printf("pay 오류 : %s\n", e.getMessage());
        }
    }

    public void refund(User u, double bal)
    {
        try
        {
            u.deposit(bal);
            System.out.printf("환불완료. 잔액 : %f\n", u.getBalance());
        } catch (Exception e) {
            System.out.printf("refund 오류 : %n", e.getMessage());
        }
    }
}
