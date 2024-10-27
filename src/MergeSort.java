public class MergeSort {

    private static void mergeSort(int[] arr, int l, int r) {
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);//declaring left array///////recursion
            mergeSort(arr,mid+1,r);//declaring right array
            merge(arr,l,mid,r);//calling merge method
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid-l+1;//value of left arr// +1 is for zero index
        int n2 = r-mid;//value of right arr
        int[] lArr= new int[n1];
        int[] rArr= new int[n2];

       for (int x=0;x<n1;x++){
           lArr[x]=arr[l+x];
       }
        for (int x=0;x<n2;x++){
            rArr[x]=arr[mid+1+x];
        }
        int i=0;
        int j=0;
        int k=l;

        while (i<n1 && j<n2){
            if (lArr[i]<=rArr[j]){
                arr[k]=lArr[i];
                i++;
            }else {arr[k]=rArr[j];
                j++;}
            k++;
        }  while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rArr[] if any
        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int []arr = {6,5,3,7,8};
        System.out.println("before sorting");
        for (int n:arr){

            System.out.print(n  + " ");
        }
        mergeSort(arr,0,arr.length-1);//passing the value of arr l ,r and arr












        System.out.println();
        System.out.println("after sorting");

        for (int n:arr){

            System.out.print(n  + " ");
        }
    }


}
