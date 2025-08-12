package test.jgpark.first.Head02_OOP.Ex8;

public class Delivery {
    private String track;
    private String carr;

    public Delivery(String track, String carr) {
        this.track = track;
        this.carr = carr;
    }

    public void startDelivery()
    {
        System.out.println("시작 : " + track );
    }
}
