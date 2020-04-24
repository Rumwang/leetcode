class Solution {
    public int strStr(String haystack, String needle) {
        int start = 0, index = 0;
        int len = haystack.length();
        int needle_len = needle.length();
        int[] shift = new int[256];
        int k = 0;
        for(char c : needle.toCharArray())
            shift[c] = needle_len - k++;
        if(needle_len == 0)
            return 0;
    
        while(start + needle_len <= len){
            index = 0;
            while(haystack.charAt(start + index) == needle.charAt(index)){
                index++;
                if(index == needle_len)
                    return start;
            }
            if(start + needle_len == len)
                return -1;

            char tmp = haystack.charAt(start + needle_len);
            if(shift[tmp] == 0)
                start += needle_len + 1;
            else
                start += shift[tmp];
        }
        return -1;
    }
}