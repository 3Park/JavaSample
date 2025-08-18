package test.jgpark.first.Head04.ex1;
import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        // Array 예시
        Map<String, Integer> map = new HashMap<>();

        map.put("aa",10);

        map.put("bb",20);

        System.out.println(map);

        map.put("aa",30);
        System.out.println(map);

        map.get("aa");

        boolean b = map.containsKey("aa");

        map.remove("aa");

        System.out.println(map.keySet());
    }
}
