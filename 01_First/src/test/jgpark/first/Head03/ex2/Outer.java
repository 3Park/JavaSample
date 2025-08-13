package test.jgpark.first.Head03.ex2;

public class Outer
{
    private static int a = 100;
    private  int b = 10;

    public static class nest
    {
        public void print()
        {
            System.out.println(a);
        }
    }

    public class nest1
    {
        public void print()
        {
            System.out.println(b);
        }
    }

    public void test()
    {
        int a = 10;
        class n2
        {
            public void run()
            {
                System.out.println("inner" + a);
            }
        }

        n2 n = new n2();
        n.run();
    }
}
