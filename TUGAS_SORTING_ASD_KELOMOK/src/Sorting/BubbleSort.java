package Sorting;

public class BubbleSort {

    public void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) { // menunjukkan berapa banyak yang bakal ditukar
            for (int j = 0; j < n - 1 - i; j++) { // menunjukkan pertukaran setiap sesi buat nemu nilai terbesar yang belum fiks
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
