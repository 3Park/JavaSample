package test.jgpark.first.Head02_OOP.Ex6;

public class CryptoPay implements Payment{
    @Override
    public void pay(double amount) {
        System.out.printf("%.1f %s\n",amount,"가상화폐 결제");
    }
}
