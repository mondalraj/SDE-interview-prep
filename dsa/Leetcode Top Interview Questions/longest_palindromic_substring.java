class Solution {
    public String longestPalindrome(String s) {
        int max_gap = 0;
        int start_index = 0;

        boolean[][] dp = new boolean[s.length()][s.length()];

        for(int g = 0; g< s.length(); g++){
            for(int i=0, j=g; j<s.length(); i++, j++){
                if(g == 0){
                    dp[i][j] = true;
                    if(g > max_gap){
                        max_gap = g;
                        start_index = i;
                    }
                } else if (g == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                        if(g > max_gap){
                            max_gap = g;
                            start_index = i;
                        }
                    }else {
                        dp[i][j] = false;
                    }
                } else {
                    if(s.charAt(i) == s.charAt(j)){
                        if(dp[i+1][j-1] == true){
                            dp[i][j] = true;
                            if(g > max_gap){
                                max_gap = g;
                                start_index = i;
                            }
                        }else {
                            dp[i][j] = false;
                        }  
                    }else {
                        dp[i][j] = false;
                    }
                }
            }
        }

        String ans = new String();
        for(int i = start_index; i <= start_index + max_gap; i++){
            ans = ans + s.charAt(i);
        }
        return ans;
    }
}