//Is Unique

// Java.util package contains the collections framework, 
// legacy collection classes, event model, date and time facilities, internationalization, 
// and miscellaneous utility classes.

import java.util.*;

public class isUnique{
	//A public method that belongs to the class isUnique and returns nothing. The method main takes in an array of strings.
	public static void main(String[] args) {
		String[] words = {"kkc", "reddit", "kelin", "instagram"};
		//Loop through all the words in the above array and prints whether each word contains unique chars or not.
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}
	// A public method that belongs to the isUnique class and returns a boolean value. The method isUniqueChars takes in a string(word in this case)
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
}