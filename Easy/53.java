class Solution {
    public int maxSubArray(int[] nums) {
        // int len = nums.length;
        // int ans = nums[0], sum = nums[0];
        // for(int i = 1; i < len; i++){
        //     if(sum <= 0)
        //         sum = nums[i];
        //     else
        //         sum += nums[i];
        //     ans = ans > sum ? ans : sum;
        // }
        // return ans;
        
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int ans = nums[0];
        // 状态转移方程dp[i] = max(dp[i-1], 0) + nums[i]
        // dp存储的是前i个元素的最大子序和。
        // max(dp[i-1], 0)表示，若前i个元素的最大子序和为负数，那么就抛弃掉，否则就加。
        for(int i = 1; i < nums.length; i ++){
            dp[i] = Math.max(dp[i-1], 0) + nums[i];
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}