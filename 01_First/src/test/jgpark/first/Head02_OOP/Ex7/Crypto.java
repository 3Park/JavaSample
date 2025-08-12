package test.jgpark.first.Head02_OOP.Ex7;

public class Crypto extends Payment{
    @Override
    public void pay(double amount) {
        System.out.printf("%.1f %s\n",amount,"가상화폐결제");
    }


}
