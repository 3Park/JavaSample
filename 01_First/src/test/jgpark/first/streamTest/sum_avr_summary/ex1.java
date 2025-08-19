package test.jgpark.first.streamTest.sum_avr_summary;

import java.util.*;
import java.util.stream.Collectors;

public class ex1 {
    public static void main(String[] args) {
        List<Integer> i = Arrays.asList(1,2,3,4,5,6);

        int sum = i.stream().collect(Collectors.summingInt(x -> x));
        double avr = i.stream().collect(Collectors.averagingInt(x -> x));

        Optional<Integer> max = i.stream().collect(Collectors.maxBy(Comparator.comparing(x -> x)));
        Optional<Integer>  min = i.stream().collect(Collectors.minBy(Comparator.comparing(x -> x)));

        System.out.println(avr);
        System.out.println(sum);

        //min, sum avg 등 다 있는.
        IntSummaryStatistics st = i.stream().collect(Collectors.summarizingInt(x -> x));
        st.getMin();
        st.getAverage();
        st.getMax();
        st.getSum();
    }
}
