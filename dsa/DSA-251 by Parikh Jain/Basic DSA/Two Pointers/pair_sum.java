// https://www.codingninjas.com/codestudio/problems/pair-sum_1171154

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int pairSum(int arr[], int n, int target) {
        // Write your code here.
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int ans = 0;
        int i = 0;
        int j = n - 1;

        while(i<j){
            if(arr[i] + arr[j]== target){
                ans++;
                i++;
                j--;
            }else if(arr[i] + arr[j] > target){
                j--;
            }else{
                i++;
            }
        }

        if(ans > 0){
            return ans;
        }else {
            return -1;
        }
    }
}