package Algorithms;

public class IsPalindrome {
    public static boolean isNumberPalindrome(int number) {
        int newNumber = 0, oldNumber = 0;

        if (number < 0) {
            number *= -1;
        }

        oldNumber = number;

        while (number > 0) {
            newNumber *= 10;
            newNumber += number % 10;
            number = number / 10;
        }

        return (newNumber == oldNumber);
    }

    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(1121));
    }
}