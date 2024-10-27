public class Bubble {
    public static void main(String[] args) {
        int[] nums = {7, 9, 3, 5, 1};
        int size = nums.length;
        int temp = 0;
        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num+" ");
        }
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size-1 ; j++)
            {
                if (nums[j] > nums[j + 1])
                {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }




        }
        System.out.println("after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
