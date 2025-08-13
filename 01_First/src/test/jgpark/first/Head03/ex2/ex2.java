package test.jgpark.first.Head03.ex2;

public class ex2
{
    public static void main(String[] args) {
        Outer.nest nest = new Outer.nest();
        nest.print();

        Outer o = new Outer();
        Outer.nest1 n1 = o.new nest1();
        n1.print();

        o.test();
    }
}
