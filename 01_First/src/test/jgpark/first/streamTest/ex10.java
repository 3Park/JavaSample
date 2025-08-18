package test.jgpark.first.streamTest;

public class ex10
{
    int k = 10;

    void RunTest()
    {
        Runnable rr = () -> {
            k = 20;
        };

        rr.run();
    }

    public static void main(String[] args) {
        int a = 10;

        Runnable r = () -> {
            //error 발생
            //a = 20;

        };

        r.run();
    }
}
