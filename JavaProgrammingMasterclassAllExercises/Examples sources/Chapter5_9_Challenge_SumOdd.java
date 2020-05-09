public class Chapter5_9_Challenge_SumOdd {
    public static boolean isOdd(int number) {
        return (number % 2 == 1);
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 1 || end < start) {
            System.out.println("Parameters are not correct!");
            return 0;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += isOdd(i) ? i : 0;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOdd(100, 1000));
    }
}
