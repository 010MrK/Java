public class Chapter5_10_Challenge {

    public static boolean isEvenNumber (int number) {
        return (number % 2 == 0);
    }

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;

        int evenCount = 0;

        while (number <= finishNumber) {
            number++;

            if (!isEvenNumber(number)) {
                continue;
            } else {
                evenCount++;
            }
            System.out.println("Even number " + number);

            if (evenCount == 5) {
                break;
            }
        }
        System.out.println(evenCount);
    }
}
