package Program;

public class MergeSort {
    public static void mergeSort(int[] a, int left, int right, boolean ascending) {
        int mid;
        if (left < right) {
            mid = (left + right) / 2;
            mergeSort(a, left, mid, ascending);
            mergeSort(a, mid + 1, right, ascending);
            merge(a, left, mid, right, ascending);
        }
    }

    public static void merge(int[] a, int left, int mid, int right, boolean ascending) {
        int i, j, k;
        int nL = mid - left + 1;
        int nR = right - mid;

        int[] L = new int[nL];
        int[] R = new int[nR];

        for (i = 0; i < nL; i++) 
            L[i] = a[left + i];
        for (j = 0; j < nR; j++) 
            R[j] = a[mid + 1 + j];

        i = 0; // start L[i]
        j = 0; // start R[j]
        k = left; // sub array yang digabung

        while (i < nL && j < nR) {
            if (ascending? L[i] <= R[j] : L[i] >= R[j]) {
                a[k] = L[i]; i++;
            } else {
                a[k] = R[j]; j++;
            }
            k++;
        }

        while (i < nL) {
            a[k] = L[i];
            i++; k++;
        }

        while (j < nR) {
            a[k] = R[j];
            j++; k++;
        }
    }
}
