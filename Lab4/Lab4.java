// Lab#4 Starter File
// Fall 2023 CS 007 (HoffmanT)

import java.io.*;
import java.util.*;

// WARNING THIS CODE WILL NOT COMPILE UNTIL YOU FILL IN THE METHODS
// START BY WRITING THE SHELL OF EACH METHOD AND JUST RETURN THE DEFAULT RETURN VALUE OF THE TYPE
// THEN GO BACK AND FILL IN AND TEST O N E   M E T H O D   A T   A T   T I M E ! ! !

public class Lab4
{
	public static void main (String args[]) throws Exception // 'throws' clause needed cause we are opening files
	{
		if ( args.length < 1 ) // oops! forgot to put input filename on command line
		{
			System.out.print("You forgot to enter the input filename on the command line.\nLike this: $ java Lab4 L4input.txt\n");
			System.exit(0); // aborts the program
		}

		// Use a Scanner to read a text file line by line.
		Scanner infile = new Scanner( new File(args[0]) );
		while ( infile.hasNextLine() )
		{
			System.out.println();

			String line = infile.nextLine();
			System.out.print( line );

			// . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .

			if ( containsPalindrome( line ) ) // i.e. foomombarr contains a palindrome at least 3 letters
				System.out.println( " contains a palindrome of exactly 3 letters" );
			else
				System.out.println( " does NOT contain a plaindrome of exactly 3 letters" );

			// . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .

			System.out.format( "highest letter of alphabet in %s is '%c'\n", line, highestLetterIn( line ) );

			// . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .

			System.out.format( "%s contains %d vowels (i.e. a,e,i,o,u or y)\n", line, numberOfVowelsIn( line ) );

			// . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .

		} // END WHILE INPUT FILE HAS MORE LINES
	} // END MAIN

	// containsPalindrome() method here:
	for i = 0 to length-4 //-4 is the third length
	{
		String sub3 = s.substring(i, ?);
		if sub3 is a palindrome (call the function)
	// ----------------------------------
	// the containsPalindrome method starts with the word static and then return type boolean)
	// then the name containsPalindrome()
	// this method takes a parameter/input of a String inside the ()s.
	// Recommended strategy:
	// Write a for loop on i that starts at 0 and ends at the third letter from the end.
	// At each value of i extract a substring // // starting at i plus the next two chars.
	// Thus each value of i extracs a substring of three lettersstarting at i.
	// Pass that substring into the isPalindrome method that is given to you at the bottom of the list of methods.
	// As soon as you get a true back from isPalindrome you can immediately return true back to main.
	// But, if none of the substrings that you pass into the isPalindrome method come back as true
	// then after you drop out of your i loop you can return FALSE back to main





	// highestLetterIn() method here:
	// ----------------------------------
	static char highestLetterIn (String s)
	{
		char highest 
	// the highestLetterIn method starts with the word static and then return type (char)
	// then the name highestLetterIn(). This method takes a parameter/input of a String inside the ()s.
	// Recommended strategy:
	// define a char var at the top of this method and name it maxChar or such. Initialize it to be the
	// very first char of the string. Now write a for loop on i that starts at 0 and ends at the index of
	// very last char in the string.
	// You must examine each char of the incoming string and determine what the highest letter of the alphabet
	// was found in the string.  Remember you can compare two chars like below:
	// if (s.charAt(i) > maxChar)
	//	   maxChar = s.charAt(i);
	// the letter 'a' is less than the letter 'b' and b is less than the letter 'c' etc. and z is the greatest
	// letter in the alphabet.
	// After you drop out of the loop, your variable named maxChar or whatever will contain the greatest letter
	// that was found in the string.  return that letter as the return value of this method


	// numberOfVowelsIn() method here:
	// ----------------------------------
	// the numberOfVowelsIn method starts with the word static and then return type (int), then numberOfVowelsIn()
	static inr numberOfVowelsIn( String s )
	{
		define a vowelCnt to be 0;
		loop on i for o to string length -1 inclusive
			if (i'th char is a or e or i or u or y)
				incr vowelCnt


	// This method takes a parameter/input of a String inside the ()s.
	// Recommended strategy:
	// Define a int var at the top of this method and name it numVowelsFound or such. Initialize to 0;
	// Now write a for loop on i that starts at 0 and ends at the index of
	// very last char in the string.
	// With each .charAt(i) you must test to see if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt() == etc etc )
	// if that if statement produces true on any charAt(i) then you must increment your vowel counter.
	// After the loop is over return that vowel counter as the return value of the method.





	// THIS FUNCTION GIVEN TO YOU TO BE USED/CALLED BY THE containsPalindrome() METHOD

	static boolean isPalindrome( String str ) // incoming string should be exactly 3 chars long
	{
		// D O    N O T    U S E    T H I S    C O D E    F O R    Y O U R   P R O J E C T #2

		String rev = "";
		for( int i=str.length()-1 ; i>=0 ; --i)
			rev += str.charAt(i);
		return str.equals(rev);
	}

} // END Lab4
