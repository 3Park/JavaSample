package test.jgpark.first.Head01.example;

public class LoopExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 0; i <= 6; i++) {
            System.out.println("i=" + i);
            for (int j = 0; j <= 3; j++) {
                System.out.println("j=" + j);
            }
        }

        int[] scores = {0, 1, 2,3,4,5};

        for (int s : scores) {
            System.out.println("배열 값: " + s);
        }
    }
}
