public class Zavd4 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 10, 1};

        int max = findMax(arr);
        System.out.println("Найбільше число: " + max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
