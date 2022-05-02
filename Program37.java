//java program to convert decimal to octal number
package Javabatch;

import java.util.Scanner;

public class Program37 {
	public static void main(String args[]) {
      int n;
      Scanner s =new Scanner(System.in);
	    System.out.println("Enter a decimal number ");
	    n=s.nextInt();
      decToOctal(n);
	}
		 static void decToOctal(int n)
		    {
		      
			 int[] octalNum = new int[100];
		 
		        int i = 0;
		        while (n != 0) 
		        {
		 
		         
		            octalNum[i] = n % 8;
		            n = n / 8;
		            i++;
		        }
		 
		        
		        for (int j = i - 1; j >= 0; j--)
		        {
		            System.out.print(octalNum[j]);
		        }
		    }
		

	}


