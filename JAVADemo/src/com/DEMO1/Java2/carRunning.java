package com.DEMO1.Java2;

import com.Demo.Java1.Merc;
import com.Demo.Java1.fibo;
public class carRunning {
public static void main(String[] args) {
	System.out.println("Inside new package");
	
	fibo.printFibonacciNumbers(20);
	Merc m = new Merc();
	m.carIsrunning();
}
}
