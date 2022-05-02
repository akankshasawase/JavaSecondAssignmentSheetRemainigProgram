//Java program to Calculate Factorial of a Number Using Recursion
package Javabatch;

import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
	
		int num ;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a number up to which you want to factorial");
		num=s.nextInt();
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
	}

}
