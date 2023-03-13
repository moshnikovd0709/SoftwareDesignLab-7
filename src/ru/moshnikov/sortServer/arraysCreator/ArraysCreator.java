package ru.moshnikov.sortServer.arraysCreator;

import java.util.Random;

public class ArraysCreator {
    public static int[] createRandomArray(int n) {
        int[] a = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt();
        }
        return a;
    }
}
