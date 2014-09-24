

import java.util.Scanner;
/**
 * Assignment 2
 * Write a program that allow user to input 5 numbers and find the sum and      *the average of the numbers. Also find the maximum and the minimum of the
*numbers.
 * 
 * @author geonheeko
 *1.Create an array for 5 numbers.
 *2.Prompt the user for 5 integers.
 *3.Create a for loop that will add all the integers.
 *4.Divide the sum by 5 to get the average.
 */

public class Assignment2 {
	// Create an array of 5
	static int[] num = new int [5];
	static int sum;
	static int average;
	static int max;
	static int min;
	
	
	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt the user for 5 integers.
		System.out.println("Please enter in 5 integers; ");
		for (int i=0; i<num.length; i++) 
		{
	
			num[i] = keyboard.nextInt();
		}

		sum = sum();
		average = sum/5;
		max= Max();
		min= Min();

		System.out.println (("Sum = ") +(sum));
		System.out.println (("Average = ") +(average));
		System.out.println (("Max = ") +(max));
		System.out.println (("Min = ") +(min));

	}
//add
public static int sum()
{
	sum=num[0];
	for(int i=1; i<num.length; i++)
	{ 
		sum =  sum + num[i];
	}
		return sum;
}

public static int Max()
{
	max=num[0];
	for(int i=1; i<num.length; i++){
		if (num[i]>max)
			max=num[i];
	}
	return max;
				
			
	}
public static int Min()
{
	min=num[0];
	for(int i=1; i<num.length; i++){
		if (num[i]<min)
			min=num[i];
	}
	return min;
				
			
}


}

/*
*Create an array called num with 5 slots.
*Create variables named sum, average, max, and min.
*Prompt user to input 5 integers.
*Add all the numbers in the array and return the number to get the sum.
*Divide the sum by 5 to get the average.
*Set the first number to max and if the next number is greater then set that as max.
*Return the max. 
*Set the first number to min and if the next number is less then set that as min.
*Return the min.
*Output sum,average,max,and min.
*/	


