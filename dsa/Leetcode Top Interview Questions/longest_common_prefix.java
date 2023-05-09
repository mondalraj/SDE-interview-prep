class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = new String();

        ans = strs[0];
        String res = new String();

        for(int i = 1; i < strs.length; i++){
            for(int j = 0, k = 0; j < strs[i].length() && k < ans.length() ; j++, k++){
                if(strs[i].charAt(j) == ans.charAt(k)){
                    res = res + ans.charAt(k);
                }else {
                    break;
                }
                
            }
            ans = res;
            res = "";
        }

        return ans;
    }
}