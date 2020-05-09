public class Chapter5_10 {
    public static void main(String[] args) {
        int count = 1;

        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("End of while loop!");

        /*for (count = 0; count != 5; count++) {
            System.out.println("Count value is " + count);
        }
        System.out.println("End of for loop!");*/

        /*count = 1;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }*/

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }

        } while (count != 6);
        System.out.println("End of do while loop!");
    }
}
