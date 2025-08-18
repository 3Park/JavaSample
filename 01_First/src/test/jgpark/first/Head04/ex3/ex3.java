package test.jgpark.first.Head04.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ex3 {


    public static void main(String[] args) {
//        List<String> names = Arrays.asList("kim","park");
//        names.stream().filter(x -> x.contains("k")).map(String::toUpperCase).forEach(System.out::println);
        List<String> names = List.of("kim","park","lee");
//        var stream = names.stream().filter(n ->
//        {
//            return n.length() > 3;
//        });
//        stream.forEach(x -> System.out.println(x));

//        자바 8 이전
//        Predicate<String> aa = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                if(s.length() > 3)
//                    return true;
//
//                return false;
//            }
//        };
//
//        names.stream().filter(aa).forEach(System.out::println);
        names.stream().filter(x -> x.length() > 2).forEach(System.out::println);
    }
}
