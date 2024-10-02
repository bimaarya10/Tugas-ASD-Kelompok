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

    public void mergeSort(int[] a, int left, int right, boolean ascending) {
        int mid;
        if (left < right) {
            mid = (left + right) / 2;
            mergeSort(a, left, mid, ascending);
            mergeSort(a, mid + 1, right, ascending);
            merge(a, left, mid, right, ascending);
        }
    }

    public void merge(int[] a, int left, int mid, int right, boolean ascending) {
        int i, j, k;
        int nL = mid - left + 1;
        int nR = right - mid;

        int[] L = new int[nL];
        int[] R = new int[nR];

        for (i = 0; i < nL; i++) {
            L[i] = a[left + i];
        }
        for (j = 0; j < nR; j++) {
            R[j] = a[mid + 1 + j];
        }

        i = 0; // start L[i]
        j = 0; // start R[j]
        k = left; // sub array yang digabung

        while (i < nL && j < nR) {
            if (ascending ? L[i] <= R[j] : L[i] >= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < nL) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < nR) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    public void shellSort(int[] a, int n, boolean ascending) {
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i++) {
                int temp = a[i];
                int j = 0;
                boolean condition = ascending ? a[j - interval] > temp : a[j - interval] < temp;
                for (j = i; j >= interval && condition; j -= interval) {
                    a[j] = a[j - interval];
                }
                a[j] = temp;
            }
        }
    }
}
