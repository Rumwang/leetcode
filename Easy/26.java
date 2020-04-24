class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {return 0;}
        int len = nums.length;
        int change_index = 1;
        int current_num = nums[0];
        int ans = 1;
        for(int i = 1; i < len; i++){
            if(nums[i] > current_num){
                current_num = nums[i];
                nums[change_index] = nums[i];
                change_index++;
                ans++;
            }
        }
        return ans;
    }
}