public class Zavd2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 7;

        int min = findMinimum(a, b, c);

        System.out.println("Найменше число: " + min);
    }

    public static int findMinimum(int a, int b, int c) {
        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }


        return min;
    }
}
