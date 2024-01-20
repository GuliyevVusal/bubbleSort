import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = new int[]{64, 34, 25, 12, 22, 11, 90};

        System.out.println("Orginal Array: " + Arrays.toString(array));

        bubbleSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
