package test.jgpark.first.streamTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ex11 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Lee", "Kim", "Park", "Lee");

        names.stream()
                .distinct()
                .forEach(name -> System.out.println("Distinct name: " + name));

        List<Integer> numbers = Arrays.asList(5, 1, 8, 2, 9);

        numbers.stream()
                .sorted() // 오름차순 정렬
                .forEach(num -> System.out.print(num + " "));

        List<String> cities = Arrays.asList("Seoul", "Busan", "New York", "London");

        // 길이를 기준으로 오름차순 정렬
        cities.stream()
                .sorted(Comparator.comparingInt(String::length))

                .sorted(Comparator.comparing( x -> x.length()))
                .forEach(city -> System.out.println("Sorted city: " + city));
    }
}
