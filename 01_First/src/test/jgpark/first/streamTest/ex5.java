package test.jgpark.first.streamTest;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class ex5 {
    public static void main(String[] args) {
        Map<String,Integer> student = new HashMap<String,Integer>();

        student.put("lee",70);
        student.put("park",80);
        student.put("kim",90);

        Function<Map.Entry<String,Integer>,Integer> function = new Function<Map.Entry<String, Integer>, Integer>() {
            @Override
            public Integer apply(Map.Entry<String, Integer> stringIntegerEntry) {
                return stringIntegerEntry.getValue();
            }
        };

        student.entrySet().stream().map(function).forEach(System.out::println);
        student.entrySet().stream().map(x -> x.getValue()).forEach(System.out::println);

    }
}
