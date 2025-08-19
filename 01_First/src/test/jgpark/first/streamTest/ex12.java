package test.jgpark.first.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex12 {
    public static void main(String[] args) {
        List<List<String>> aa = Arrays.asList(
                Arrays.asList("aa"),
                Arrays.asList("bb"),
                Arrays.asList("cc")
        );

        List<String> flat = aa.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
        System.out.println(flat);
    }
}
