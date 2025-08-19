package test.jgpark.first.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex14
{
    public static void main(String[] args) {
        List<String> aa = Arrays.asList("a","b","c","b","d");

        List<String> bb = aa.stream().distinct().collect(Collectors.toList());
    }
}
