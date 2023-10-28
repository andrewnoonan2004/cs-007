// STARTER FILE FOR LAB#5 CS 007 FALL 2023

import java.io.*;
import java.util.*;

// ===========.D  O     N  O  T      M   O  D  I  F  Y       M   A   I   N =======

public class Lab5
{
	public static void main (String[] args)  throws Exception
	{
		if ( args.length < 1 )
			die( "usage: $ java Lab5 <input filename> (170kwords.txt or something)\n" );
		Scanner infile = new Scanner( new File(args[0]) );
		final int INITIAL_CAPACITY = 1;
		String[] wordList = new String[ INITIAL_CAPACITY ];
		int wordCount=0; // # of words stored into array
		int maxStrLen=0; //  length of longest string ever read from file


		while ( infile.hasNext() )
		{
			String word = infile.next();
			if ( wordCount == wordList.length ) // i.e. if the array is FULL
			{	System.out.format("upsizing wordList from length %d to %d\n", wordList.length, wordList.length*2 );
				wordList = upSizeArray( wordList );
			}

			wordList[wordCount++] = word;
			if ( word.length() > maxStrLen )
				maxStrLen = word.length();
		}

		System.out.format("wordList contains %d words.\nThe longest word was %d chars long.\n", wordCount, maxStrLen );
		System.out.format("now trimming wordList from length:%d to .length:%d\n",  wordList.length, wordCount  );
		wordList = trimArray( wordList, wordCount );
		System.out.format("word at wordList[%d]='%s'\nword at wordList[%d]='%s'\n", 0, wordList[0],wordList.length-1,wordList[wordList.length-1] );

	} // END main

	static void die( String errMsg )
	{
		System.out.println( errMsg );
		System.exit(0);
	}

	// ============================================================================
	//                     M   E   T   H   O   D   S
	//	do not write any output statetments anywhere in the methods below
	//	      J U S T     F  I  L  L     I  N     T  H  E     C  O  D  E
	// ============================================================================

	// returns a ref to an array twice as long as the one passed in. With all data copied into it
	static String[] upSizeArray( String[] fullArr )
	{
		int currentArr = fullArr.length * 2;
		String[] biggerArr;
		biggerArr = new String[currentArr];
		for(int i=0; i < fullArr.length; i++)
		{	
			biggerArr[i] = fullArr[i];
		}
		return biggerArr; // just to make it compile
	}

	// creates a smaller arry just big enough to hold the data and returns that "shrink wrapped" array of the data
	static String[] trimArray( String[] arr, int count )
	{
		String[] minimalArr;
		minimalArr = new String[count];
		for(int i=0; i < count ; i++)
		{
			minimalArr[i] = arr[i];
		}


		return minimalArr; // just to make it compile
	}


} //END LAB5
