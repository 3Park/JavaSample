package test.jgpark.first.streamTest;

public class ex8 {


    public static void main(String[] args) {
        test t = (t1, t2) -> {
            System.out.println(t1+t2);
        };

        t.run("dd","cc");

        test1 t1 = () -> {
            System.out.println("lambda");
        };

        t1.run();

        test2 t2 = () -> {
            return "a";
        };

        System.out.println(t2.run());
    }
}

@FunctionalInterface
interface test2
{
    public String run();
}

@FunctionalInterface
interface  test1
{
    public void run();
}

@FunctionalInterface
interface test
{
    public void run(String a, String b);

    default void aa()
    {
        System.out.println("aa");
    }
}
