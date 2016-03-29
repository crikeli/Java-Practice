//Practice from Building Java Programs (UW Practice-IT)

///////////////////////////////////////
///////////////////////////////////////
//All odd numbers from -6 to 38
///////////////////////////////////////
///////////////////////////////////////
// int[] odds = new int[22];
// for(i=0; i<22; i++){
// 	odds[i] = i * 2 -5;
// }

// ///////////////////////////////////////
// ///////////////////////////////////////
// //Example of storing entries in an array
// ///////////////////////////////////////
// ///////////////////////////////////////

// public class GameEntry{
// 	private String name; //Name of the person earning the score
// 	private int score; //The value of the score

// 	//A GameEntry constructor with given parameters
// 	public GameEntry(String n, int s){
// 		name = n;
// 		score = s;
// 	}
// 	//A method that returns the name field
// 	public String getName(){
// 		return name;
// 	}

// 	//A method that returns score field
// 	public getScore(){
// 		return score;
// 	}

// 	//A method that returns a string representation of the entry
// 	public String toString(){
// 		return"(" + name + ", "+ score + ")";
// 	}
// }



// ///////////////////////////////////////
// ///////////////////////////////////////
// //Finding the k'th largest frequency
// ///////////////////////////////////////
// ///////////////////////////////////////


// ///////////////////////////////////////
// ///////////////////////////////////////
// //Reversing a string
// ///////////////////////////////////////
// ///////////////////////////////////////
public class reverseString {
 public static void main(String[] args) {
    String input = "I like your smile";
    char[] temparray= input.toCharArray();
    int left,right=0;
    right=temparray.length-1;
    for (left=0; left < right ; left++ ,right--)
    {
     // Swap values of left and right 
     char temp = temparray[left];
     temparray[left] = temparray[right];
     temparray[right]=temp;
    }
    for (char c : temparray)
     System.out.print(c);
    System.out.println();
   }}



