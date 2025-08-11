package test.jgpark.first.Head02_OOP.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;
    private boolean isPaid;

    // 기본 생성자
    public Order() {
        this.orderId = "NONE";
        this.products = new ArrayList<>();
        this.isPaid = false;
    }

    // 오버로딩된 생성자
    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        this.isPaid = false;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean isPaid() {
        return isPaid;
    }

    // this() 호출 예시
    public Order(String orderId) {
        this(orderId, new ArrayList<>());
    }
}
