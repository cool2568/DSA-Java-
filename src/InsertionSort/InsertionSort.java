package InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7, 5, 3, 2, 1};
        int key = 0;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j=j-1;
            }arr[j+1]=key;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
