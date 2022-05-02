//Java program to Reverse a Sentence Using Recursion
package Javabatch;

import java.util.Scanner;

public class Program40 {

	public static void main(String[] args) {
		String input, result;
	      
	      Scanner s = new Scanner(System.in);
	  
	      System.out.print("Enter the sentence : ");
	      input = s.nextLine();
	      result = reverseString(input);
	      System.out.println("The reversed input is: " + result);
	   }
	 public static String reverseString(String my_input) {
	      if (my_input.isEmpty())
	        return my_input;
	      return reverseString(my_input.substring(1)) + my_input.charAt(0);

	}

}
