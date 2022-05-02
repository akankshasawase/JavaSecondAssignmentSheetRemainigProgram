//Java Program to Find G.C.D Using Recursion
package Javabatch;

import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {
		int n1 , n2 ;
		Scanner s =new Scanner (System.in);
		System.out.println("Enter a number to find gcd of :");
		n1=s.nextInt();
		n2=s.nextInt();
        int gcd = gcd(n1, n2);

        System.out.println("G.C.D of  " +n1+ " and " +n2+  " is: "  +gcd);
    }

    public static int gcd(int n1, int n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }

		

	

}
