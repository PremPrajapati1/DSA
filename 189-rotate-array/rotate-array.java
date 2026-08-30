class Solution {
    // public void rev(int[] nums, int start, int end){
    //     while(start <= end){
    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;

    //         start = start + 1;
    //         end = end - 1;
    //     }
    // }
    public void rotate(int[] nums, int k) {
        // if( k % nums.length == 0){
        //     return;
        // }
        // k = k % nums.length;

        // rev(nums, 0, nums.length - 1);
        // rev(nums, 0, k-1);
        // rev(nums, k, nums.length - 1);

        // Second Approach
        int count = 0;

        for(int i = 0; count < nums.length; i++){
            int idx = i;
            int curr = nums[idx];

            do {
                int next = nums[(idx + k) % nums.length];
                nums[(idx + k) % nums.length] = curr;
                curr = next;
                idx = (idx + k) % nums.length;
                count = count + 1;
            } while(idx != i);
        }
    }
}