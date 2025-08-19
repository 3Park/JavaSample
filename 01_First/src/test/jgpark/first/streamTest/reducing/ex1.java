package test.jgpark.first.streamTest.reducing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex1 {
    public static void main(String[] args) {
        //커스텀한 집계가 필요할 경우 사용

        List<String> words = Arrays.asList("Java","Stream","Collector");

        String jn = words.stream().collect(Collectors.reducing(
                "",
                (a,b) -> a.isEmpty() ? b : a + " - " +b
        ));

        System.out.println(jn);
    }
}
