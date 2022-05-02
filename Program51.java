//Java Program to Remove all Characters in a String Except Alphabets.
package Javabatch;

public class Program51 {

	public static void main(String[] args) {
	
		String str= "This#string%contains^special*characters&.";   
		str = str.replaceAll("[^a-zA-Z0-9]", " ");  
		System.out.println(str);
	}

}
