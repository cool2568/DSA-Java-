package SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int [] nums= {2,4,5,7,3,1};
      
        int size = nums.length;
        int temp =0;
        int minIndex=-1;
        System.out.println("before sorting");

        for (int num :nums)
        {
            System.out.print(num +" ");
        } System.out.println();

        for (int i=0;i<size-1;i++){
           minIndex= i;
            for (int j=i+1;j<size;j++){
                if (nums [minIndex]>j){
                    minIndex=j;
                }
                temp =nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i]=temp;
            }
        }









        System.out.println("after sorting");
        for (int num :nums)
        {
            System.out.print(num+" ");
        }


    }
}
