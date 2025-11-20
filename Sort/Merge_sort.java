// import java.util.*
package Sort;

public class Merge_sort {
    public static void conquer(int arr[],int low, int mid, int high) {
        int merged[] = new int [high - low + 1];

        int index1 = low;
        int index2 = mid + 1;
        int x = 0;

        while(index1 <= mid && index2 <= high) {
            if(arr[index1] <= arr[index2]) {
                merged[x++] = arr[index1++];
            } else {
                merged[x++] = arr[index2++];
            }
        }
        while(index1 <= mid) {
            merged[x++] = arr[index1++];
        }
        while(index2 <= high) {
            merged[x++] = arr[index2++];
        }
        for(int i = 0, j = low; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int low, int high) {
        if(low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        conquer(arr, low, mid, high);
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        // calling divide function

        divide(arr, 0, n - 1);
        // printing sorted array
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
