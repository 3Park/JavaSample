package test.jgpark.first.Head02_OOP.Ex8;

public class Order {
    private String orderId;
    private Delivery d;

    public Order(String id, String track, String carr)
    {
        this.orderId = id;
        d = new  Delivery(track,carr);
    }

    public void startOrder()
    {
        if(d != null)
            d.startDelivery();
    }
}
