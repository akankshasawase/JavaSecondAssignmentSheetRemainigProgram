//Java Program to Convert Binary Number to Decimal
package Javabatch;

import java.util.Scanner;

public class Program34 {

	public static void main(String[] args) {
	
	    long num ;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter a  binary number");
	    num=s.nextLong();

	    
	    int decimal = convertBinaryToDecimal(num);

	    System.out.println("Binary to Decimal");
	    System.out.println(num + " = " + decimal);
	  }

	  public static int convertBinaryToDecimal(long num) {
	    int decimalNumber = 0, i = 0;
	    long remainder;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      num /= 10;
	      decimalNumber += remainder * Math.pow(2, i);
	      ++i;
	    }
	    
	    return decimalNumber;

	}

}
