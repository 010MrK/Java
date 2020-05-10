public class shapeArea {
    public static void main(String[] args) {
        System.out.println(area(2));
    }

    private static int area(int n) {
        int resultArea = 1;

        for (int i = 1; i < n; i++) {
            resultArea = resultArea + (4 * i);
        }

        return resultArea;
    }
}