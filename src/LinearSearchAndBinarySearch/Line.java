package LinearSearchAndBinarySearch;

public class Line {
    public static void main(String[] args) {
    int[] nums = new int[1000];
    int target =  6 ;
    int result1 = linearSearch(nums,target);
    int result = binarySearch(nums,target);
    if (result1  != -1){
        System.out.println("Element found at index"+result1);


    }   else
        System.out.println("not found");

    }

    public static int linearSearch(int[] nums, int target) {
        int steps=0;
        for (int i=0; i<=nums.length;i++){
            if (nums[i]==target){
                System.out.println("steps of linear search"+steps);
              return i;
            }


        } System.out.println("steps of linear search"+steps);

        return -1;


    } public static  int binarySearch(int[]nums ,int target){
//        [2,4,5,6 8]
        int steps=0;
        int left =0;
        int right = nums.length-1;
       while (left<=right){
           steps++;

           int mid = ((left+right)/2);
           if (nums[mid] ==target){
               System.out.println("steps of binary search"+steps);
               return mid;
           }else if (nums[mid]<target){
               left =mid+1;

           }else
               right=mid-1;

           }System.out.println("steps of binary search"+steps);
       return -1;

       }

    }



