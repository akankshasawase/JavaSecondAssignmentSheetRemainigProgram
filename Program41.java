//Java Program to Calculate Power Using Recursion
package Javabatch;

import java.util.Scanner;

public class Program41 {

	public static void main(String[] args) {
		int base, powerRaised ;
		Scanner s =new Scanner(System.in);
	    System.out.println("Enter a base number ");
	    base=s.nextInt();
	    System.out.println("Enter a power of number ");
	    powerRaised=s.nextInt();
		
	    int result = power(base, powerRaised);

	    System.out.println(base + "^" + powerRaised + "=" + result);
	  }

	  public static int power(int base, int powerRaised) {
	    if (powerRaised != 0) 
	    {
           return (base * power(base, powerRaised - 1));
	    }
	    else {
	      return 1;
	    }

	}

}
