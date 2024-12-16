package in;
//9. Write a Java Program to check whether the given number is Ramanujam's Numberor NOT.

import java.util.Scanner;

public class RamanujNum {
	public static int findSum(int num) {
		int sum = 0 ;
		while(num>0) {
			sum = sum + num % 10 ;
			num = num / 10 ;
		}
		return sum ;
	}
    public static int reverseSum(int num) {
    	int reverse = 0 ;
    	while(num>0) {
    		int digit  = num % 10 ;
    		reverse = reverse * 10 + digit ;
    		num = num /10 ;
    	}
    	return reverse ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		Scanner sc =  new Scanner (System.in);
		System.out.println("Enter the number  :");
		int orgNum = sc.nextInt();
		int sum = findSum(orgNum);
		int reverseSum = reverseSum(sum);
		if((sum * reverseSum)== orgNum)
		 {
			System.out.println(orgNum+ " is a Ramanujan Number.");
		}else {
	
	System.out.println(orgNum+"is not a Ramanujan Number.");
		}			
				
	 }
	}