class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        boolean res = true;

        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }else {
                if(st.isEmpty()){
                    res = false;
                    break;
                }
                if(s.charAt(i) == ')' && st.peek() == '('){
                    st.pop();
                }else if(s.charAt(i) == '}' && st.peek() == '{'){
                    st.pop();
                }else if(s.charAt(i) == ']' && st.peek() == '['){
                    st.pop();
                }else {
                    res = false;
                    break;
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return res;
    }
}