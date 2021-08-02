package Assignment1;

import java.util.Scanner;

public class SumOfNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum = 0;
		System.out.println("Enter the value of n:");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=0; i<num ; i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum of first " + num + " natural numbers is: " +sum);
		sc.close();
	}
	

}
