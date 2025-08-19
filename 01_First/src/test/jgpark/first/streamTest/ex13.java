package test.jgpark.first.streamTest;

import java.util.Arrays;
import java.util.List;

public class ex13 {
    public static void main(String[] args) {
        List<String> aa = Arrays.asList("apple","bana","pineapp");

        long count = aa.stream().peek(s -> System.out.println(s)).filter(s -> s.length() > 4).count();
        System.out.println(count);
    }
}
