package test.jgpark.first.Head03.ex1;

public class NotiService
{
    private final Noti noti;

    public NotiService(Noti noti)
    {
        this.noti = noti;
    }

    public void send(String msg) {
        noti.send(msg);
    }
}
