package test.jgpark.first.Head03.ex1;

public class ex1 {
    public static void main(String[] args) {
        NotiService[] nots = {new NotiService(new Email()), new NotiService(new Sms())};


        for (NotiService n : nots)
        {
            n.send("msg");
        }
    }
}
