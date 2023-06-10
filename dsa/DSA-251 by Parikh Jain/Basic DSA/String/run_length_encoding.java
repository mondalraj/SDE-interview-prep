// https://www.codingninjas.com/codestudio/problems/encode-the-message_699836

import java.util.* ;
import java.io.*; 
public class Solution {
	public static String encode(String message) {
		// Write your code here.
		char currentLetter = message.charAt(0);
		int currentCount = 1;

		String encodedString = "";

		for(int i = 1; i<message.length(); i++){
			if(message.charAt(i) != currentLetter){
				encodedString = encodedString + currentLetter + Integer.toString(currentCount);
				currentLetter = message.charAt(i);
				currentCount = 1;
			}else {
				currentCount++;
			}

            if(i == message.length() - 1){
                encodedString = encodedString + currentLetter + Integer.toString(currentCount);
            }
		}
		return encodedString;
	}
}