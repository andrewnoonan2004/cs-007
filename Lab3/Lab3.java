// INSSTRUCTOR SOLUTION FOR LAB#3 CS 007  FALL 2023
// N E V E R  G I V E  S O L UT I O N   C O D E  T O  S T U D E N T S
// A L W A Y S  T E A C H  T H E  C O N C E P T

import java.io.*;
import java.util.*;

// ===========.D  O     N  O  T      M   O  D  I  F  Y       M   A   I   N =======

public class Lab3
{
	public static void main (String[] args)
	{

		// prints: 1 2 3 4 5 6 7 8 9 0 11 12 13 14 15 16 17 18 19 20
		printFwd( 1, 20 );

		// prints: 20 19 18 17 16 15 14 13 12 1 10 9 8 7 6 5 4 3 2 1
		printRev( 20, 1 );

		// prints: 1 3 5 7 9 11 13 15 17 19
		printOdd( 1, 20 );

		// prints: 2 4 6 8 10 12 14 16 18 20
		printEven( 1, 20 );

		// prints: s t a n l e y
		printLettersFwd( "stanley" );

		// prints: y e l n a t s
		printLettersRev( "stanley" );

		// prints: s a l y e n t
		printEveryOtherLetter( "stanleyyelnats" );

		System.out.print( "decimal 285 converts to binary: " ); 
		decimal2Binary( 285 );

	} // END main

	// ============================================================================
	//                     M   E   T   H   O   D   S
	//	do not write any output statetments anywhere in the functions/methods below
	//	J U S T     F  I  L  L     I  N     T  H  E     C  O  D  E    B  E  L  O  W
	// ============================================================================

	// prints: 1 2 3 4 5 6 7 8 9 0 11 12 13 14 15 16 17 18 19 20
	static void printFwd( int lo, int hi)
	{
		int i;
		for(i=lo;i<=hi;i++)
		// write a for loop on i, from lo up to hi, and print each value of i with a space after it

		System.out.print(i + " ");
		System.out.println();
	}

	// prints: 20 19 18 17 16 15 14 13 12 1 10 9 8 7 6 5 4 3 2 1
	static void printRev( int hi, int lo )
	{
		// write a for loop on i, from hi down to lo, and print each value of i with a space after it
		int i;
		for(i=hi;i>=lo;i--)
		System.out.print(i + " ");
		System.out.println();
	}

	// prints: 1 3 5 7 9 11 13 15 17 19
	static void printOdd( int lo, int hi )
	{
		int i;
		for(i=lo;i>=lo && i<hi;i++)
			if(i%2 != 0)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
	}
		// write a for loop on i, from lo up to hi and print (only the odd values of i) with a space after each
	// prints: 2 4 6 8 10 12 14 16 18 20
	static void printEven( int lo, int hi )
	{
		// write a for loop on i, from lo up to hi and print (only the even values of i) with a space after each
		int i;
		for(i=lo;i>=lo && i<=hi;i++)
			if(i%2 == 0)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
	}

	// prints: s t a n l e y
	static void printLettersFwd( String s )
	{
		// write a for loop on i, that prints each .charAt(i) of the string with a space after each letter
		int i;
		for(i=0;i<=s.length()-1;i++)
		System.out.print( s.charAt(i)+ " ");
		System.out.println();
	}

	// prints: y e l n a t s
	static void printLettersRev( String s )
	{
		// same as above but print it backwards ( last letter back to first )
		int i;
		i = s.length()-1;
		for(i=i;i>=s.length()-1 || i>=0;i--)
		System.out.print( s.charAt(i)+ " ");
		System.out.println();
	}

	// prints: s a l y e n t
	static void printEveryOtherLetter( String s )
	{
		// print only every other letter of incoming string
		int i;
		for(i=0;i < s.length();i+= 2)
		System.out.print( s.charAt(i) + " ");
		System.out.println();
	}


static void decimal2Binary( int n )
{
    // convert this pseudo code below to actual java code. It will print the incoming decimal number out in binary digits

    String bitString = "";  // just a string of '1's and '0's (starts out with empty string with no chars in it)
    if (n == 0) {
        bitString = "0";
    } else {
        while (n > 0) {
            if (n % 2 == 0) {
                bitString = "0" + bitString; // Prepend '0' to bitString
            } else {
                bitString = "1" + bitString; // Prepend '1' to bitString
            }
            n = n / 2; 
        }
    }

            System.out.println( bitString ); // 
	}

} //END LAB3
