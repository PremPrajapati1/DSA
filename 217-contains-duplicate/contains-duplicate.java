class Solution {
    // public boolean containsDuplicate(int[] nums) {
    //     // 1,2,3,1
    //     Arrays.sort(nums);
    //     // 1,1,2,3
    //     for(int i = 0; i < nums.length - 1; i++){
    //         if(nums[i] == nums[i+1]){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // Second Approach
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}