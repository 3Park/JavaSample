package test.jgpark.first.streamTest;

import java.util.List;
import java.util.function.Predicate;

public class ex2 {
    public static void main(String[] args) {
        List<String> names = List.of("kim","park","lee");


//        자바 8 이전
        Predicate<String> aa = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.length() > 3)
                    return true;

                return false;
            }
        };

        names.stream().filter(aa).forEach(System.out::println);
    }
}
