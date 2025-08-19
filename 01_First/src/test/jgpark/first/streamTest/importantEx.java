package test.jgpark.first.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class importantEx {
    public static void main(String[] args) {
        List<Integer> aa = Arrays.asList(2,4,4,5,6,6,7,8);

        List<Integer> bb = aa.stream().filter(s -> s % 2 == 0).map(s -> s * s).distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(bb);


        //unique string set은 중복 비허용 리스트
        List<String> str = Arrays.asList("Apple","Apple","Banana","Banana","Cherry");
        Set<String> set = str.stream().collect(Collectors.toSet());
        System.out.println(set);

        //formatting. json  ㅂㅕㄴ환 등 가능
        List<String> names = Arrays.asList("kim","park","lee");
        String json = names.stream().collect(Collectors.joining(", "));
        System.out.println(json);
    }
}
