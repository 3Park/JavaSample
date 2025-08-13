package test.jgpark.first.Head03.ex1;

public class Sms implements Noti {
    @Override
    public void send(String msg) {
        System.out.printf("문자 전송 : %s", msg);
    }
}
