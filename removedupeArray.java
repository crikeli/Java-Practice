// Removing duplicates from an array.

import java.util.*;

//Declared a public class
public class removedupeArray {
 	//Declared a public method that takes in an array of integers and the output is an array of integers.
    public static int[] removeDuplicates(int[] input){
  		//int j and i are declared to act as points of comparision
        int j = 0;
        int i = 1;
        //return if the array length is less than 2 values
        if(input.length < 2){
            return input;
        }
        //As long as i is less than input.length
        while(i < input.length){
        	// if the values of both inputs are the same, we increment the value of i.
            if(input[i] == input[j]){
                i++;
            }else{
            	//Increment the input before executing and equate it to the input after incrementing.
                input[++j] = input[i++];
            }   
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = input[k];
        }
         
        return output;
    }
     
    public static void main(String a[]){
        int[] input = {2,3,6,6,8,9,10,10,10,12,12};
        int[] output = removeDuplicates(input);
        for(int i:output){
            System.out.print(i);
            System.out.println();
        }
    }
}