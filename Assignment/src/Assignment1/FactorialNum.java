package Assignment1;
import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num,fact=1;
		
	    Scanner sc=new Scanner(System.in);
 
	    System.out.println("Enter Number:");
	    num = sc.nextLong();
	    
	    int i=1;
	    while(i <= num)
	    {
	    	fact = fact * i;
            i++;
 	    }
 
  	    System.out.println("Factorial of " +num+ " is " +fact+ ".");
  	    sc.close();
	}
}


