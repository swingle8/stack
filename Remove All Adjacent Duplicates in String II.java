//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
class Solution {
    public String removeDuplicates(String s, int k) {
        int len = s.length();
        Stack<subtle> st = new Stack<subtle>();
        for (int i = 0 ; i < len ; i++) {
            char curr = s.charAt(i);
            if (! st.isEmpty()) {
                subtle top = st.peek();
                if (top.currChar == curr) {
                    top.freq++;
                    if (top.freq == k) {
                        st.pop();
                    }
                }
                else {
                    subtle newChar = new subtle(curr, 1);
                    st.push(newChar);
                } 
            }
            else {
                subtle newChar = new subtle(curr, 1);
                st.push(newChar);
            }
        }
        
        StringBuffer ans = new StringBuffer();
        while (! st.isEmpty()) {
            subtle finalpoping = st.pop();
            char c = finalpoping.currChar;
            int freq = finalpoping.freq;
            
            while (freq > 0) {
                ans.insert(0, c);
                freq--;
            }
            
        }
        
        return ans.toString();
    }
}

class subtle {
    char currChar;
    int freq = 0;
    public subtle (char currChar, int freq) {
        this.currChar = currChar;
        this.freq = freq;
    }
}