package test.jgpark.first.Head01.example;

public class LoopExample {
    public static void main(String[] args) {

        Exam1();
        Exam2();
        Exam3();
        Exam4();
        Exam5();
    }

    private static void Exam1()
    {
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

        int count = 0;

        while (count < 3) {
            System.out.println("count = " + count);
            count++;
        }

        int i1 = 5;

        do {
            System.out.println("i = " + i1);
            i1++;
        } while (i1 < 5);

        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            if (i == 4) break;
            System.out.println(i);
        }
    }

    private static void Exam2()
    {
        int num = 2;

        if (num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Other");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }

        int count = 0;
        while (count < 3) {
            System.out.println("count = " + count);
            count++;
        }
    }

    private static void Exam3()
    {
        int[] nums = {10, 20, 30,40,50,60,70,80,90,100};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[" + i + "] = " + nums[i]);
        }

        String[] animals = {"Cat", "Dog", "Bird","Cat", "Dog", "Bird","Cat", "Dog", "Bird","Cat", "Dog", "Bird"};
        for (String animal : animals) {
            System.out.println(animal);
        }
    }

    private static void Exam4()
    {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    private static void Exam5()
    {
        int[] original = {1, 2, 3};
        int[] copy = original;
        copy[0] = 100;
        System.out.println(original[0]); // 100

        original[0] = 1;

        int[] copy1 = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy1[i] = original[i];
        }

        copy1[0] = 100;
        System.out.println(original[0]); // 1 (영향 없음)
    }
}
