package test.jgpark.first.streamTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex3 {
    public static void main(String[] args) {
        List<String> names = List.of("kim","park","lee");
        names.stream().filter(x -> x.length() > 2).forEach(System.out::println);

        Map<String, Integer> scores = new HashMap<>();
        scores.put("kim",100);
        scores.put("park",90);
        scores.put("lee",70);

        scores.entrySet().stream().filter(x -> x.getValue() >= 80).forEach(System.out::println);
    }
}
