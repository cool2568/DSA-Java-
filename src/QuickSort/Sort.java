public class Sort {
    public static void quickSort(int []arr,int low, int high){
    if (low<high){  // low should be low high should be high
        int pi = partition(arr,low,high); // if we divide an array then we should call the method in which we divide the array
        quickSort(arr, low,pi-1);    // calling a recursion method 1 Staring of the first array is always low but we need to find ending of first array.
        quickSort(arr, pi+1,high);    // ending of second array always same but staring of second array we need to find
        // need to find partition // partition is always same// To find this we need partition
    }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  //point at which we divide a array
        int i = low-1;

        for (int j = low; j < high; j++) { // Iterate from low to high - 1
            if (arr[j] < pivot) { // If current element is smaller than the pivot
                i++; // Increment index of smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp  = arr[i+1];   //swap array i+1 with array high
        arr[i+1] = arr[high];
        arr[high]= temp;

        return i+1;

    }

    public static void main(String[] args) {
        int[] arr = {5,6,4,2,1};

        quickSort(arr,0,arr.length-1); //declaring the variable in main method


        for (int num:arr){
            System.out.println(num);
        }
    }
}
