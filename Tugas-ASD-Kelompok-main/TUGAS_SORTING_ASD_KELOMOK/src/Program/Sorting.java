package Program;

public class Sorting {

    public void bubbleSort(int[] array, boolean ascending) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (ascending ? array[j] > array[j + 1] : array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSort(int[] array, boolean ascending) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && (ascending ? array[j] > key : array[j] < key)) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public void selectionSort(int[] array, boolean ascending) {
        for (int i = 0; i < array.length - 1; i++) {
            int selectedIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (ascending ? array[j] < array[selectedIndex] : array[j] > array[selectedIndex]) {
                    selectedIndex = j;
                }
            }
            int temp = array[selectedIndex];
            array[selectedIndex] = array[i];
            array[i] = temp;
        }
    }
}
