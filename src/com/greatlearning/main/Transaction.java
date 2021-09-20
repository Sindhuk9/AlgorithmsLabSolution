package com.greatlearning.main;

import java.util.Scanner;


public class Transaction {
	
	private static Scanner sc= new Scanner(System.in);
	
		public static void main( String[] args ) {
			// Take in number of transactions (size)
			System.out.println( "Enter number of transactions" );
			int size = sc.nextInt();
			
			// Create an array of that size
			int[] transactions = new int[size];
			
			System.out.println( "Enter the transactions" );
			// Use a loop to get each transaction value (populate the array)
			for( int i = 0; i < transactions.length; i++ ) {
				transactions[i] = sc.nextInt();
			}
			
			// Take in the number of targets
			System.out.println( "Enter number of targets" );
			int numTargets = sc.nextInt();
			
			// Take in target one-by-one (loop)
			for( int i = 0; i < numTargets; i++ ) {
				System.out.println( "Enter the target" );
				int target = sc.nextInt();

				// find if target is reached or not
				// if reached then after how many transaction
				// your code...
				int sum = 0;
				for( int j = 0; j < transactions.length; j++ ) {
					sum = sum + transactions[j];
					
					if( sum >= target ) {
						System.out.println( "Target achieved after " + ( j + 1 ) + " transactions" );
						break; // break out of the innermost for loop
					}
					
					// we come to the last transactions, yet target is not achieved
					if( j == transactions.length - 1 ) {
						System.out.println( "Target not achieved" );
				}
			}
		}		
	}

}
