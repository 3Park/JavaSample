package test.jgpark.first.Head02_OOP.Ex10;

public class Ex10 {
    public static void main(String[] args) {
        Order o = new Order();
        o.process(new Card(),1000);
        o.process(new Account(),2000);

        Payment[] p = {new Card(), new Account()};

        for(Payment pay : p)
        {
            double amt = 0;
            if(pay instanceof Card)
                amt = 3000;
            else if(pay instanceof Account)
                amt = 4000;

            pay.pay(amt);
        }
    }
}
