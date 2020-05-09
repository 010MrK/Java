package Algorithms;

public class IsEven {

    public static boolean isEvenNumber (int number) {
        return (number % 2 == 0);
    }

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;

        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            } else {
                evenCount++;
            }
            System.out.println("Even number " + number);

            if (evenCount == 5) {
                break;
            }
            number++;
        }
        System.out.println(evenCount);
    }
}
