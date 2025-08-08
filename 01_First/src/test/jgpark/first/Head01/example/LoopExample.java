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

        Exam2();
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
}
