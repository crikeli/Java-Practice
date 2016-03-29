//Remove Dupes

import java.util.*;
public class removeDuplicate{
	public String remove(String inputString){
	String result = "";
	//new LinkedHashSet is initialized and maintains the order in which elements are inserted
	Set<String> inputSet = new LinkedHashSet<String>(); 
		for(int i=0;i<inputString.length();i++){
		inputSet.add(String.valueOf(inputString.charAt(i)));
		}
		for(String a: inputSet){
		result += a;
		}
		return result;
	}
	public static void main(String str[]){
	removeDuplicate rd = new removeDuplicate();
	System.out.println(rd.remove("kelinkelikins"));
	}
}