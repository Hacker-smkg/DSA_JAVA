package Sort;

import java.util.concurrent.ThreadLocalRandom;

public class QuickSortImplementation {

    private int[] A;

    public void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        this.A = arr;
        sort(0, arr.length - 1);
    }

    private void sort(int l, int r) {
        while (l < r) {

            // Randomized pivot to avoid worst-case
            int pivotIndex = ThreadLocalRandom.current().nextInt(l, r + 1);
            int pivot = A[pivotIndex];

            // 3-way partition
            int lt = l, i = l, gt = r;
            while (i <= gt) {
                if (A[i] < pivot) {
                    swap(i++, lt++);
                } else if (A[i] > pivot) {
                    swap(i, gt--);
                } else {
                    i++;
                }
            }

            // Tail recursion optimization
            if (lt - l < r - gt) {
                sort(l, lt - 1);
                l = gt + 1;
            } else {
                sort(gt + 1, r);
                r = lt - 1;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

