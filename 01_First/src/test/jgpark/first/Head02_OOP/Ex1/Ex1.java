package test.jgpark.first.Head02_OOP.Ex1;



public class Ex1 {
    public static void main(String[] args) {
        Order ord = new Order("Alice","Book", 2, 15000);
        ord.print();
    }
}

 class Order
{
    String name;
    String orderName;
    int quantity;
    int price;

    public Order(String n, String o, int q, int p)
    {
        name = n;
        orderName = o;
        quantity = q;
        price = p;
    }

    int getTotalPrice()
    {
        return quantity * price;
    }

    void print()
    {
        System.out.printf("%s 님이 주문한 %s %d권의 총액 %d\n",name,orderName,quantity,getTotalPrice());
    }
}
