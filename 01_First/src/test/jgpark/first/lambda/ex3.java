package test.jgpark.first.lambda;

@FunctionalInterface
interface fact
{
    ex3 create(String a, String b);
}

public class ex3 {

    private String a;
    private String b;
    public ex3(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        fact f = ex3::new;
        f.create("a", "b");

        fact f1 = new fact() {
            @Override
            public ex3 create(String a, String b) {
                return new ex3(a, b);
            }
        };

        f1.create("a", "b");
    }
}
