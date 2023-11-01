import java.util.*;
import java.io.*;

public class Project5 // D O   N O T  M O D I F Y   M A I N   I N   A N Y   W A Y!
{
	public static void main( String[] args ) throws Exception
	{
		if ( args.length<1)
		{ System.out.println("\nusage: java Project5 <inputFileName> (you forgot the input filename!)\n");
		  System.exit(0);
		}

		System.out.println("A R R A Y  I N D I C E S:  00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29");
		System.out.println("                           -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
		int[] array = loadArray( args[0] ); // returns TRIMMED,FULL Array
		printArray( "original array from file:  ", array, array.length );
		selectionSort( array, array.length );
		printArray( "array after selectionSort: ", array, array.length );
		System.out.format( "indOfMax in above array: %4d\n", indOfMaxVal( array, 0, array.length-1 ) );  // 2nd index is inclusive

		array = loadArray( args[0] ); // // returns TRIMMED,FULL Array.  re-use same ref var, old array discarded
		printArray( "original array from file:  ", array, array.length );
		bubbleSort( array, array.length); //
		printArray( "array after bubbleSort:    ", array, array.length );
		System.out.format( "indOfMin in above array: %4d\n", indOfMinVal( array, 0, array.length-1 ) ); // 2nd index is inclusive
	} // END MAIN
	
	static void printArray( String label, int[] array, int count)
	{	System.out.print( label );
		for ( int i=0 ; i<count ; ++i )
			System.out.format( "%2d ",array[i] );
		System.out.println();
	}
	//              Y O U  F I L L    I N   T H E S E   M E T H O D S     B E L O W 
	
	static int[] loadArray( String fileName ) throws Exception // returns a fully loaded/trimmed array of int from a file
	{	Scanner infileHandle = new Scanner( new File(fileName) );
		int[] array = new int[1]; // we will double it everytime it fills up
		int count = 0;
		while ( infileHandle.hasNextInt() )
		{	
			if ( count == array.length){ array = upSizeArray(array);}// CHECK FOR ARRAY IS FULL AND UPSIAZE IF NEEDED
			array[count++] = infileHandle.nextInt();// READ THE NEXT INT OFROM FILE INTO ARRAY
		}
		return trimArray( array, count );
	}
	static int[] upSizeArray( int[] fullArray ) // returns a fully loaded/trimmed array of int from a file
	{
		int currentArr = fullArray.length * 2;
		int[] biggerArr;
		biggerArr = new int[currentArr];
		for(int i=0; i < fullArray.length; i++)
		{	
			biggerArr[i] = fullArray[i];
		}
		return biggerArr;
	}
	static int[] trimArray( int[] array, int count ) // returns a fully loaded/trimmed array of int from a file
	{
		int[] minimalArr;
		minimalArr = new int[count];
		for(int i=0; i < count ; i++)
		{
			minimalArr[i] = array[i];
		}


		return minimalArr;
	}
	static void selectionSort( int[] array, int count ) // performs classical selection sort algorithm
	{	
		for(int i = 0;i<=count -2;i++)
		{
			int mindex = indOfMinVal(array, i, count -1);
			if(array[mindex] < array[i])
			{
			int tmp = array[mindex];
			array[mindex] = array[i];
			array[i] = tmp;
			}
		}
	}
	static void bubbleSort( int[] array, int count ) // performs classical bubblesort algorithm
	{
		for(int stopInd = count -2;stopInd>=0;stopInd--)
		{
			for(int i=0;i<=stopInd;i++)
			{
				int maxdex = indOfMaxVal(array, i, stopInd);
				if(array[i]> array[i+1])
				{
					int tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
				}
			}
		}

	}
	static int indOfMinVal(int[] array, int startInd, int stopInd) {
		int indOfMinVal = startInd;
		for (int i = startInd; i <= stopInd; i++) {
			if (array[i] < array[indOfMinVal]) {
				indOfMinVal = i;
			}
		}
		return indOfMinVal;
	}

	static int indOfMaxVal( int[] array, int startInd, int stopInd )
	{
		int max = array[startInd];
        int indOfMax = startInd;
        for(int i = startInd; i <=stopInd; i++)
        {
            if(array[i] > max)
            {
                indOfMax = i;
            }
        }
        return indOfMax;
	}
	

	
} // END CLASS PROJECT5