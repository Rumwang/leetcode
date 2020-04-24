class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        int len = s.length();

        for(int i = 0; i < len; i ++){
            char crt_punc = s.charAt(i);
            if(map.containsKey(crt_punc)){
                char pop = st.empty() ? '#' : st.pop();
                if(pop != map.get(crt_punc))
                    return false;
            }
            else
                st.push(crt_punc);
        }
        return st.isEmpty();
    }
}