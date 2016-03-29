// ///////////////////////////////////////
// ///////////////////////////////////////
// //Printing all permutations of a string
// ///////////////////////////////////////
// ///////////////////////////////////////

// Java.util package contains the collections framework, 
// legacy collection classes, event model, date and time facilities, internationalization, 
// and miscellaneous utility classes.

import java.util.*;

public class FindPerms 
{  
  static ArrayList<String> permutations = new ArrayList<String>();
  public static void main(String[] args) {
    String word = "ocat tac";
    permutate(word, "");
    
    for(int i = 0; i < permutations.size(); i++)
      System.out.println(permutations.get(i));
  }
  
  public static void permutate(String word, String perm)
  {
    if(word.length() == 0)
      permutations.add(perm);
    else
    {
      for(int i = 0; i < word.length(); i++)
        permutate(removeChar(word, i), perm + word.charAt(i));
    }
  }
  
  public static String removeChar(String word, int position)
  {
    String newWord = "";
    for(int i = 0; i < word.length(); i++)
    {
      if(i != position)
        newWord += word.charAt(i);
    }
    return newWord;
  } 
}
 