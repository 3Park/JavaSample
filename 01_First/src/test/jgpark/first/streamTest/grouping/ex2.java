package test.jgpark.first.streamTest.grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ex2 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 50);
        Map<Boolean,List<Integer>> map = num.stream().collect(Collectors.partitioningBy(x -> x > 10));
        System.out.println(map);
    }
}
