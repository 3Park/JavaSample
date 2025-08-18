package test.jgpark.first.streamTest;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ex6 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("aa",10);
        map.put("bb",20);
        map.put("cc",30);

        Consumer<Map.Entry<String,Integer>> cons = new Consumer<Map.Entry<String,Integer>>() {
            @Override
            public void accept(Map.Entry integerEntry) {
                System.out.println(integerEntry.getKey());
            }
        };

        map.entrySet().stream().forEach(cons);
        map.entrySet().stream().forEach(x->System.out.println(x.getKey()));
    }
}
