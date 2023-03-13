package ru.moshnikov.sortServer.sort;

public class QuickSort {

    public static void quickSort(int a[], int l, int r) {
        if (l < r) {
            int partitionIndex = partition(a, l, r);

            quickSort(a, l, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, r);
        }
    }

    public static int partition(int a[], int l, int r) {
        int p = a[r];
        int i = (l - 1);

        for (int j = l; j < r; j++) {
            if (a[j] <= p) {
                i++;

                int swapTemp = a[i];
                a[i] = a[j];
                a[j] = swapTemp;
            }
        }

        int swap = a[i + 1];
        a[i + 1] = a[r];
        a[r] = swap;

        return i + 1;
    }
}
