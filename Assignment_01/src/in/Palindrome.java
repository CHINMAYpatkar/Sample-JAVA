package in;
// 4. Check whether the Given Numberis a Palindrome or NOT. 

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();   
		int r  , sum = 0 ,temp ;
		temp = n ;
		
		while(n>0) {
			r =  n%10 ;
			sum=(sum *10)+ r;
			
		     n = n /10 ;
		}
		if(temp==sum)
			System.out.println("Palindrome number:");
		else
			System.out.println("not palindrome");
		
	}

}