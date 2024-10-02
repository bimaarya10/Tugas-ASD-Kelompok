package Sorting;

public class SelectionSort {

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index_Min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index_Min]) {
                    index_Min = j;
                }
            }

            int temp = array[index_Min];
            array[index_Min] = array[i];
            array[i] = temp;
        }
    }
}
