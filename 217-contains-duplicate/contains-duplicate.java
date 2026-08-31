class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 1,2,3,1
        Arrays.sort(nums);
        // 1,1,2,3
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}