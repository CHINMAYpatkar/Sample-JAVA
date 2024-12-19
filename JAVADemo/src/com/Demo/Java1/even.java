package com.Demo.Java1;
import java.util.Scanner;
public class even {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");

	        if (scanner.hasNextInt()) { 
	            int number = scanner.nextInt();

	            if (number > 0) { 
	                System.out.println("The squares of all even numbers up to " + number + " are:");
	                for (int i = 2; i <= number; i += 2) { 
	                    System.out.println(i + "^2 = " + (i * i));
	                }
	            } else {
	                System.out.println("Please enter a valid positive number.");
	                System.out.println("Please enter a valid positive number.");
	            }
	        } else {
	            System.out.println("Invalid input. Please enter a numeric value.");
	        }

	        scanner.close();
	    }
	}

