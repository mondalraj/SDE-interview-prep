// https://www.codingninjas.com/codestudio/problems/beautiful-string_1115625

public class Solution {
    public static int makeBeautiful(String str) {
        int start1 = 0;
        int start0 = 0;

        for(int i=0;i<str.length(); i++){
            if(i%2 == 0){
                if(str.charAt(i) == '1'){
                    start0++;
                }else{
                    start1++;
                }
            }else{
                if(str.charAt(i) == '1'){
                    start1++;
                }else{
                    start0++;
                }
            }
        }

        return Math.min(start1, start0);
    }
}