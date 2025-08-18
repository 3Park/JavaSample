package test.jgpark.first.streamTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex1 {
    public static void main(String[] args) {
        List<String> names = List.of("kim","park","lee");
        var stream = names.stream().filter(n ->
        {
            return n.length() > 3;
        });
        stream.forEach(x -> System.out.println(x));

        Map<String, Integer> scores = new HashMap<>();
        scores.put("kim",100);
        scores.put("park",90);
        scores.put("lee",70);

        scores.entrySet().stream().filter(x -> {
            return x.getValue() >= 80;
        }).forEach(x -> System.out.println(x.getKey()));

    }
}
