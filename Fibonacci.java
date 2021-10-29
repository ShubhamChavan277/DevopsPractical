import java.util.*;
public class Fibonacci {
 
	public static void main(String[] args) 
	{	
		float count;
		int a = 0;
		int b = 1;
    		Scanner scan = new Scanner(System.in);
    		System.out.print("Enter the value of n : \n");
    		count = scan.nextFloat();
		  
	        System.out.print("Fibonacci Series of "+count+" numbers is as follows:");
 
	        for (int i = 1; i <= count; ++i)
	        {
	            System.out.print(a+" ");
	      
	            int sum = a + b;
	            a = b;
	            b = sum;
	        }
	}
}
