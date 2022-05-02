//Java Program to Convert Octal Number to Decimal
package Javabatch;

public class Program36 {

	public static void main(String[] args) {
		String onum = "157";
		  
        // octal to decimal using Integer.parseInt()
        int num = Integer.parseInt(onum, 8);
  
        System.out.println("Decimal equivalent of Octal value 157 is: " + num);

	}

}
