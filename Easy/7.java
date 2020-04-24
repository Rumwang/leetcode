class Solution {
    public int reverse(int x) {
        int ans = 0;
        while(x != 0){
            if(ans * 10 / 10 != ans)
                return 0;
            int pop = x % 10;
            x /= 10;
            ans = ans * 10 + pop;
        }
        return ans;
    }
}