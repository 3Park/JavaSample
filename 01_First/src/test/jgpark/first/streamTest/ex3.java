package test.jgpark.first.streamTest;

import java.util.List;

public class ex3 {
    public static void main(String[] args) {
        List<String> names = List.of("kim","park","lee");
        names.stream().filter(x -> x.length() > 2).forEach(System.out::println);
    }
}
