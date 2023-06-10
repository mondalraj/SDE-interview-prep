// https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s");

        String ans = "";

        for(int i = str.length - 1; i >= 0; i--){
            if(str[i].length() > 0) ans = ans + ' ' + str[i];
        }
        return ans.trim();
    }
}