package in;
//8.  Write a Java Program to check whether the given numbers are Amicable Numbersor NOT.

import java.util.Scanner;

public class AmicableNum {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2  , sum1=0 ,sum2 =0;
		Scanner sc =  new Scanner (System.in);
		System.out.println("Enter the number 1 :");
		num1 = sc.nextInt();
		System.out.println("Enter the number 2:");
		num2 = sc.nextInt();
	
		for(int i  = 1 ; i<=num1 ; i++) {
			if(num1%i == 0) {
				sum1 =sum1 + i ;
			}
		}
		for(int i = 1 ;  i<=num2 ; i++) {
			if(num2 % i == 0) {
				sum2 = sum2 + i ;
			}
					
		}
		
		
		if(sum1==sum2) {
			System.out.println("The pair of number are amicable");
		}else {
	
	System.out.println("The pair of number are not amicable");
		}			
				
	 }
	}