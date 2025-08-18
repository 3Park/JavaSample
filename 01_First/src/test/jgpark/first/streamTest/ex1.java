package test.jgpark.first.streamTest;

import java.util.List;

public class ex1 {
    public static void main(String[] args) {
        List<String> names = List.of("kim","park","lee");
        var stream = names.stream().filter(n ->
        {
            return n.length() > 3;
        });
        stream.forEach(x -> System.out.println(x));


    }
}
