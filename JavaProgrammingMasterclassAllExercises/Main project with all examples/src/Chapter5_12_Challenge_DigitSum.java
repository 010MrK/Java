public class Chapter5_12_Challenge_DigitSum {
    public static int sumDigits(int number) {
        int sum = 0;

        if (number < 10) {
            return -1;
        }

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }

        return sum;
}

    public static void main(String[] args) {
        System.out.println(sumDigits(32123));
    }
}
