class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        int sign = 1;
        s = s.trim();

        for(int i=0; i<s.length(); i++){
            if((s.charAt(i) == '-' || s.charAt(i) == '+') && (i-1 >= 0) && ans == 0 && (Character.isDigit(s.charAt(i-1)))){
                ans = 0;
                break;
            }else if (s.charAt(i) == '+' && ans != 0){
                break;
            }

            // check for sign
            if((s.charAt(i) == '-') && (i+1 < s.length()) && (Character.isDigit(s.charAt(i+1)))){
                sign = -1;
                continue;
            }else if((s.charAt(i) == '+') && (i+1 < s.length()) && (Character.isDigit(s.charAt(i+1)))){
                continue;
            }

            // update ans
            if(Character.isDigit(s.charAt(i))){
                // check for overflow and underflow
                if(ans * sign > Integer.MAX_VALUE / 10){
                    ans = Integer.MAX_VALUE;
                    break;
                }else if((ans * sign >= Integer.MAX_VALUE / 10) && (s.charAt(i) > '7')){
                    ans = Integer.MAX_VALUE;
                    break;
                }else if (ans * sign < Integer.MIN_VALUE / 10){
                    ans = Integer.MIN_VALUE;
                    break;
                }else if((ans * sign <= Integer.MIN_VALUE / 10) && (s.charAt(i) > '8')){
                    ans = Integer.MIN_VALUE;
                    break;
                }
               
                ans = (ans * 10) + (s.charAt(i) - 48);
            }

            if(!Character.isDigit(s.charAt(i))){
                break;
            }
        }
        return ans * sign;
    }
}