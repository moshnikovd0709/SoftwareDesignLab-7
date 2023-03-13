package ru.moshnikov.sortServer.sort;

public class MergeSort {

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int m = n / 2;
        int[] l = new int[m];
        int[] r = new int[n - m];

        for (int i = 0; i < m; i++) {
            l[i] = a[i];
        }
        for (int i = m; i < n; i++) {
            r[i - m] = a[i];
        }
        mergeSort(l, m);
        mergeSort(r, n - m);

        merge(a, l, r, m, n - m);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right
    ) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
