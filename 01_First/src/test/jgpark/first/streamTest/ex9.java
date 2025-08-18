package test.jgpark.first.streamTest;

public class ex9 {
    public static void main(String[] args) {
        Calc c = (a,b) -> {
            return a + b;
        };

        Calc c1 = (int a, int b) -> {
            return a - b;
        };

        Calc c2= (a,b) -> {
            return a * b;
        };

        Calc c3 = (int a, int b) -> {
            return a / b;
        };

        System.out.println(c.operate(3,5));
        System.out.println(c1.operate(3,5));
        System.out.println(c2.operate(3,5));
        System.out.println(c3.operate(3,5));
    }
}

@FunctionalInterface
interface Calc
{
    int operate (int a, int b);
}