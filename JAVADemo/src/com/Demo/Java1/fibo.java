package com.Demo.Java1;

public class fibo {
	
	    static void printFibonacciNumbers(int n) {
	        long f1 = 0, f2 = 1;

	        if (n < 1)
	            return;

	        System.out.print(f1 + " ");

	        for (int i = 1; i < n; i++) {
	            System.out.print(f2 + " ");
	            long next = f1 + f2;
	            f1 = f2;
	            f2 = next;
	        }
	    }

	  
	    public static void main(String[] args) {
	        printFibonacciNumbers(300);
	    }
	}

