package test.jgpark.first.streamTest;

import java.util.Arrays;
import java.util.List;

public class ex7 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) % 2 != 0)
                continue;

            System.out.println(nums.get(i));
        }

        for(Integer i : nums){
            if(i % 2 != 0)
                continue;

            System.out.println(i);
        }

        nums.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
