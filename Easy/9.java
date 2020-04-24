class Solution {
    public boolean isPalindrome(int x) {
        int copy_x = x;
        int ans = 0;
        if(x < 0) {return false;}
        while(copy_x != 0){
            ans = ans * 10 + copy_x % 10;
            copy_x /= 10;
        }
        if(ans == x)
            return true;
        else
            return false;
    }
}