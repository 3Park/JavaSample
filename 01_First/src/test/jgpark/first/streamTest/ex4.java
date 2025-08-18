package test.jgpark.first.streamTest;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class ex4 {
    public static void main(String[] args) {
       List<String> names = new ArrayList<>();
       names.add("a");
       names.add("b");
       names.add("c");

       Function<String,Integer> nameLength = new Function<String, Integer>() {
           @Override
           public Integer apply(String s) {

               return s.length();
           }
       };

       names.stream().map(nameLength).forEach(System.out::println);

       names.stream().map( x -> x.length()).forEach(System.out::println);


        List<String> fl = Arrays.asList("apple","grape","banana");

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        fl.stream().forEach(con);
        fl.stream().forEach(x -> System.out.println(x));
    }
}
