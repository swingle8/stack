public class Solution {
    public int braces(String A) {
        Stack<Character> st = new Stack<Character>();
        int len = A.length();
        
        for (int i = 0 ; i < len ; i++) {
            char currChar = A.charAt(i);
            if (currChar == '(' || currChar == '+' || currChar == '-' || currChar == '*' || currChar == '/') {
                st.push(A.charAt(i));
            }
            else if (currChar == ')') {
                boolean operatorpresence = false;
                while (! st.isEmpty()) {
                    if (st.peek () == '+' || st.peek () == '-' || st.peek () == '*' || st.peek () == '/') {
                        operatorpresence = true;
                        st.pop();
                    }
                    if (st.peek() == '(') {
                        st.pop();
                        if (operatorpresence)
                            break;
                        else
                            return 1;
                    }
                        
                }
            }
        }
        return 0;
    }
}
