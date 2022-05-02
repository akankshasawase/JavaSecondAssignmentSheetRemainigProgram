//Java Program to Calculate Standard Deviation
package Javabatch;

class Standred {
	double sum = 0.0;
    double standardDeviation = 0.0;
    double mean = 0.0;
    double res = 0.0;
    double sq = 0.0;
  
    double SD()
    {
        int[] arr = { 12, 32, 11, 55, 10, 23, 14, 30 };
        int n = arr.length;
        
        System.out.println("Elements are:");
        for (int i = 0; i < n; i++) 
        {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        
        mean = sum / (n);
  
        for (int i = 0; i < n; i++) {
            
            standardDeviation
                = standardDeviation + Math.pow((arr[i] - mean), 2);
            
        }
        
        sq = standardDeviation / n;
        res = Math.sqrt(sq);
        return res;
    }
}
   
   public class Program44  {


	public static void main(String[] args) {
		Standred obj= new Standred();
        double res = obj.SD();
  
        System.out.format("Standard Deviation = %.6f", res);
	}
    }
		
	


