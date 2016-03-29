//Is Unique

// Java.util package contains the collections framework, 
// legacy collection classes, event model, date and time facilities, internationalization, 
// and miscellaneous utility classes.

import java.util.*;

public class isUnique{
	public static boolean isUniqueChars(String str){
		if (str.length() > 128) return false;

		boolean[] char_set = new boolean[128];
		for (int i = 0; i<str.length(); i++){
			int val = str.charAt(i);
			if (char_set[val]){
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	public static void main(String[] args) {
		String[] words = {"kkc"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}
}