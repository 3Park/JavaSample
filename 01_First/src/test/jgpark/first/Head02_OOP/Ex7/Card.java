package test.jgpark.first.Head02_OOP.Ex7;

public class Card extends Payment{
    @Override
    public void pay(double amount) {
        System.out.printf("%.1f %s\n",amount,"카드결제");
    }


}
