class Solution {
    public void nextPermutation(int[] nums) {
        int asc_breakpoint = -1;
        int dec_breakpoint = -1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                asc_breakpoint = i;
                break;
            }
        }
        if(asc_breakpoint >= 0) {
          for(int i = nums.length - 1; i >= asc_breakpoint; i--) {
            if(nums[asc_breakpoint] < nums[i]) {
                dec_breakpoint = i;
                break;
            }
        }
        }
        if(asc_breakpoint == -1) {
            reverse(nums,asc_breakpoint+1,nums.length - 1);
        }
        else {
            swap(nums,asc_breakpoint,dec_breakpoint);
            reverse(nums,asc_breakpoint + 1,nums.length - 1);
        }
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr,i++,j--);
        }
    }

    static void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
