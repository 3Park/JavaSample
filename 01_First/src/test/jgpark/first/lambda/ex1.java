package test.jgpark.first.lambda;

import java.util.function.Function;

public class ex1 {

    public static int test1(int x)
    {
        return x;
    }

    public static void main(String[] args) {
        Function<Integer,Integer> f2 = ex1::test1;

        Function<Integer,Integer> f1 = (x) -> {
          return x;
        };

        System.out.println(f1.apply(2));
        System.out.println(f2.apply(2));
    }
}
