package test.jgpark.first.streamTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class ex2 {
    public static void main(String[] args) {
        List<String> names = List.of("kim","park","lee");
//        자바 8 이전
        Predicate<String> aa = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.length() > 3)
                    return true;

                return false;
            }
        };

        names.stream().filter(aa).forEach(System.out::println);

        //map 은 entryset 필요
        Map<String, Integer> scores = new HashMap<>();
        scores.put("kim",100);
        scores.put("park",90);
        scores.put("lee",70);

        Predicate<Map.Entry<String, Integer>> predicate = new Predicate<Map.Entry<String, Integer>>() {
            @Override
            public boolean test(Map.Entry<String, Integer> stringIntegerEntry) {
                return stringIntegerEntry.getValue() >= 80;
            }
        };

        scores.entrySet().stream().filter(predicate).forEach(System.out::println);
    }
}
