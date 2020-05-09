public class Chapter5_13_Question_NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int newNumber = 0;
        int oldNumber = 0;

        if (number < 0) {
            number *= -1;
        }

        oldNumber = number;

        while (number > 0) {
            newNumber *= 10;
            newNumber += number % 10;
            number /= 10;
        }

        System.out.println("NewNum = " + newNumber  +" OldNum = " + oldNumber);
        return (newNumber == oldNumber);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
}
