/*
	Project3.java  Arrays, File input and methods
	Read the comments and insert your code  where indicated.
	Do not modify any output statements
*/
import java.io.*;
import java.util.*;

public class Project3
{
	public static void main (String[] args) throws Exception
	{
		final int ARRAY_MAX = 30;
		// "args" is the list of tokens you put after "java Project3" on command line
		if (args.length == 0 ) // i.e  If you did not type anything after "java Project3" on command line
		{
			System.out.println("FATAL ERROR: Must type a filename on cmd line\n" +
			                   "Like this: $ java Project3 P3input.txt");
			System.exit(0);  //ABORT program. Make user try again with a filename this time.
		}

		Scanner infile = new Scanner( new File(args[0]) );

		int[] array = new int[ARRAY_MAX];
		int count=0;

		while ( infile.hasNextInt() )
			array[count++] = infile.nextInt(); // POST increment NOT pre. Do you see why?

		System.out.println( "array capacity: " + array.length + "\narray count: " + count);
		printArray( array, count ); // ECHO ALL (count) ELEMENTS ON ONE LINE
		System.out.println("The sum of the numbers in array is: " + calcSum( array, count ) );
		System.out.println("The INDEX of the minimum value in array is: " + indOfMin( array, count ) );
		System.out.println("The minimum value in array is: " + minVal( array, count ) );
		System.out.println("The INDEX of the maximum value in array is: " + indOfMax( array, count ) );
		System.out.println("The maximum value in array is: " + maxVal( array, count ) );
		System.out.println("The average of the numbers in array is: " + calcAverage( array, count ) );
	} // END main

	// GIVEN AS IS: DO MOT MODIFY Or DELETE

	private static void printArray( int[] a, int cnt )
	{
		System.out.print( "array elements: ");
		for ( int i=0 ; i<cnt ;i++)
			System.out.print( a[i] + " " );
		System.out.println();
	}
	// #############################################################################################
	// JUST LIKE IN LAB4. YOU MUST WRITE THE DEFINTIONS OF THE METHODS ABOVE THAT ARE CALLED IN MAIN
	// #############################################################################################


	// CALCSUM: (I'LL GIVE YOU THE TEMPLATE OF THE FIRST METHOD TO FOLLOW FOR THE REST)
	private static int calcSum( int[] arr, int cnt)
	{
		int sum=0; // declare a var to hold the running total as you add each one increment
		// HERE: write a for loop on i that adds each a[i] into sum

		return sum; // DONE;
	}

	// INDOFMIN: You must examine each element and return index position
	// of the smallest number in the array


	// MINVAL: TRY TO RE-USE indOfMin in your calculation
	// If you do then this whole method is 1 liner return statement
	// and you don't need any loops ;)




	// INDOFMAX: You must examine each element and return index position
	// of the largest number in the array





	// MAXVAL: TRY TO RE-USE indOfMax in your calculation
	// If you do then this whole method is 1 liner return statement
	// and you don't need any loops ;)





	// CALCAVERAGE: TRY TO RE-USE calcSum in your calculation
	// If you do then this whole method is 1 liner return statement
	// and you don't need any loops ;)





} //END OF PROJECT3 CLASS