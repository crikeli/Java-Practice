// ///////////////////////////////////////
// ///////////////////////////////////////
// //Reversing a string
// ///////////////////////////////////////
// ///////////////////////////////////////

public class reverseString {
 public static void main(String[] args) {
    String input = "kelin";
    //Switches from string to an array of characters(individual letters)
    char[] temparray= input.toCharArray();
    //Set up variables for the left and right most values so that I can keep track of their indices.
    int left,right=0;
    //The right variable is given the index value of temparray.length - 1.
    right=temparray.length-1;
    //As long as the left is lt the right, this for loop persists.
    for (left=0; left < right ; left++ ,right--)
    {
     // Swap values of left and right 
     char temp = temparray[left];
     temparray[left] = temparray[right];
     temparray[right]=temp;
    }
    //For each character in the temporary array, I first print out each character.
    for (char c : temparray)
     System.out.print(c);
    System.out.println();
   }}



