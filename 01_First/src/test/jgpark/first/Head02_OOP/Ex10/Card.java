package test.jgpark.first.Head02_OOP.Ex10;

public class Card implements Payment{
    @Override
    public void pay(double amount) {
        System.out.printf("%s %f %s\n","카드",amount,"결제");
    }
}
