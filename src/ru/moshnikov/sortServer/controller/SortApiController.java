package ru.moshnikov.sortServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.moshnikov.sortServer.arraysCreator.ArraysCreator;
import ru.moshnikov.sortServer.aspect.Profile;
import ru.moshnikov.sortServer.sort.BubbleSort;
import ru.moshnikov.sortServer.sort.MergeSort;
import ru.moshnikov.sortServer.sort.QuickSort;

@RestController
public class SortApiController {

    public SortApiController() {
    }


    @Profile
    @GetMapping("/sort/bubble/big")
    public void sortBubbleBig() {
        BubbleSort.bubbleSort(ArraysCreator.createRandomArray(100000));
    }

    @Profile
    @GetMapping("/sort/bubble/small")
    public void sortBubbleSmall() {
        BubbleSort.bubbleSort(ArraysCreator.createRandomArray(1000));
    }

    @Profile
    @GetMapping("/sort/quick/big")
    public void sortQuickBig() {
        QuickSort.quickSort(ArraysCreator.createRandomArray(100000), 0,  99999);
    }

    @Profile
    @GetMapping("/sort/quick/small")
    public void sortQuickSmall() {
        QuickSort.quickSort(ArraysCreator.createRandomArray(1000), 0, 999);
    }

    @Profile
    @GetMapping("/sort/merge/big")
    public void sortMergeBig() {
        MergeSort.mergeSort(ArraysCreator.createRandomArray(100000), 100000);
    }

    @Profile
    @GetMapping("/sort/merge/small")
    public void sortMergeSmall() {
        MergeSort.mergeSort(ArraysCreator.createRandomArray(1000), 1000);
    }

}
