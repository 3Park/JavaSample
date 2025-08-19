package test.jgpark.first.streamTest.grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ex1 {
    public static void main(String[] args) {
        List<String> nmes = Arrays.asList("lee","park","kim","kang");

        Map<Character,List<String>> gr = nmes.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
        System.out.println(gr);


    }
}
