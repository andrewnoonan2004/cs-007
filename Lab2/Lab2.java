// Lab2 Starter File 

import java.io.*;
import java.util.*;


public class Lab2
{
	public static void main (String arg[])
	{

		// Create a scanner to read from keyboard
		Scanner kbd = new Scanner (System.in);

		String str;
		System.out.print("Enter a string of length 10 to 20 characters: ");
		str = kbd.next();  // gets next token from the kbd

		// ECHO BACK TO USER THE ACTUAL LENGTH OF THE STRING THEY TYPED IN
		// i.e. output something like:  your string has length: 13 (or whatever it actually is. Use .length() 
		System.out.format("Your string has length: %d\n", str.length());


		// ECHO BACK TO USER A STRING OF THE  FIRST 6 CHARS OF  THEY TYPED IN.  USE .substring() 
		// i.e. output something like:  first 6 chars were: foobar

		System.out.format("First 6 chars were: %s\n", str.substring(0,6));

		// ECHO BACK TO USER A STRING OF THE  LAST 5 CHARS OF  THEY TYPED IN  USE .substring() 
		// i.e. output something like:  last 5 chars were: World

		System.out.format("Last 5 chars were: %s\n", str.substring(str.length()-5));
		// ECHO BACK TO USER THE FIRST CHAR OF THEIR STRING:.  USE .charAt()
		// i.e. output something like:  first char is: H 

		System.out.format("First char was: %c\n", str.charAt(0));

		// ECHO BACK TO USER THE LAST CHAR OF THEIR STRING:  USE .charAt()
		// i.e. output something like:  last char is: d
		System.out.format("Last char was: %c\n", str.charAt(str.length()-1));		
		// SEARCH FOR THE LETTER 'a' IN THE STRING AND REPORT THE INDEX POSITION OF 'a' OR REPORT THAT IT WAS NOT FOUND   
		// Use an if else statement and use  .indexOf()
		// i.e. output something like:  Your string contains the letter a at the 5th index position 
		// OR   output something like:  Your string does not contain the letter 'a'
		if (str.indexOf('a') != -1)
			System.out.format("Your string contains the letter 'a' at the index position %d\n" , str.indexOf('a'));
		else
			System.out.println("Your string does not contain the letter 'a'");
		// SEARCH FOR THE LETTER 'e' IN THE STRING AND REPORT THE INDEX POSITION OF 'e' OR REPORT THAT IT WAS NOT FOUND   
		// Use an if else statement and use  .indexOf()
		// i.e. output something like:  Your string contains the letter e at the 5th index position 
		// OR   output something like:  Your string does not contain the letter 'e'
		if (str.indexOf('e') != -1)
			System.out.format("Your string contains the letter 'e' at the index position %d\n" , str.indexOf('e'));
		else
			System.out.println("Your string does not contain the letter 'e'");
	} // END main
} // END Lab2
