import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		Arrays.sort(arr);
		int max = arr[n-1];
		for(int i=n-1; i>=0; i--){
			if(arr[i] < max){
				max = arr[i];
				break;
			}
			if(i == 0){
				max = -1;
			}
		}

		return max;
	}
}