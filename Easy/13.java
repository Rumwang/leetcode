class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int ans = 0;
        char current, next;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(int i = 0; i < len; i ++){
            current = s.charAt(i);
            if(i + 1 < len){
                next = s.charAt(i+1);
                if(map.get(current) < map.get(next))
                    ans -= map.get(current);
                else
                    ans += map.get(current);
            }
            else
                ans += map.get(current);
        }
        return ans;
    }
}