package test.jgpark.first.lambda;

import java.util.ArrayList;
import java.util.List;

public class ex2 {
    public void printString(String a)
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        ex2 e = new ex2();

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("banana");


        list.forEach(x -> e.printString(x));
        list.forEach(e::printString);
    }
}
