package in;
//1. Write a Java Program to find LCM of two given numbers. 
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int x = sc.nextInt();   //12
		int y = sc.nextInt(); //8
		
		int gcd = 1;
		for(int i = 1  ; i<=x && i<=y ; i++) {   // i<= 12 && 1<=8 
			
			if(x %i == 0 && y%i==0)        // 12 % 1 ==0 && 8%1==0
				gcd =i;
		}
		System.out.printf("GCD of %d and %d is: %d" , x, y, gcd);
    sc.close();
	}

}
