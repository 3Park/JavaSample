package test.jgpark.first.Head03.ex3;

@FunctionalInterface
public interface ex3inter {
    public void run();

    default void print() {
        System.out.println("print");
    }
}
