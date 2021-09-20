package com.greatlearning.main;

import java.util.Scanner;

public class MinimumNotes {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])
	{
		//accept the number of denominations
		int numdenominations = sc.nextInt(); 
		
		//allocate a notes array of that size.
		int[] notes = new int[numdenominations];
		
		//accept the denominations (loop)
		System.out.println("Enter the denominations");
		for(int i=0;i<numdenominations;i++)
		{
			notes[i]=sc.nextInt();
		}
		System.out.println("Amount");
		//accept the amount
		int amount = sc.nextInt();
		
		MergeSortImplementation Ms= new MergeSortImplementation();
		Ms.sort(notes,0,notes.length-1);
		
		int[] remaining= new int[numdenominations];	
		for(int i=0;i<notes.length;i++)
		{
			if(amount>0)
			{
				remaining[i]= (int) (amount/notes[i]);	
				amount = amount % notes[i];
			}
			else
			{
				System.out.println("not able to pay");
				break;
			}
		}
		for( int i = 0; i < numdenominations; i++ ) {
			System.out.println( notes[i] + " : " + remaining[i] );
		}
	}

}
