---
title: CS 007 Midterm Notes
author: Andrew Noonan

---

# Loops

## For loops:

* contain an Initialization Statement
* contain a test statement
  * contain an update statement(Usually iterating the variable)
  * Is a *Pretest* loop,meaning it evaluates the test expression before each iteration.

## While loops:

* contain a boolean expression that is tested for a true or false value
* a statement or block of statements that are repeated as long as the expression is true
* Is a *Pretest* loop

## Examples of equivalent and non-equivalent for and while loops:

```java
for( int i=0 ; i<10 ; i++)
{            
System.out.println(i);
}
```

```java
int i=0;
while( i<10 )
{
    i++;
    System.out.println(i);
}
```

***Not Equivalent***

```
for( int i=10 ; i>0 ; i = i-2 )
{
    System.out.println(i);    
}
```

```java
int i=10;
while( i>0 )
{
    System.out.println(i);
    i = i-2;
}
```

***Equivalent***

```
for( int i=1 ; i<10 ; i++ )
{
    System.out.println(i);
}
```

```
int number = 1;
for( int i=9 ; i>0 ; i-- )
{
    System.out.println(number);
    number++;
}
```

***Equivalent***

### Explanation of Code pair three:

This tricked me, because I falsely saw that i=9 and  believed that it was being used in the output, but it is actually only being used as the control variable.

## Lab Assignments to Reference:

# Lab One

```java
// Lab1.java STARTER FILE

import java.io.*; // I/O
import java.util.*; // Scanner class

public class Lab1
{
    public static void main( String args[] ) 
    {
        final double MILES_PER_MARATHON = 26.21875; // i.e 26 miles 285 yards

        Scanner kbd = new Scanner (System.in);

        // THE FOLLOWING THREE VARIABLES ARE PRINTED OUT AT THE END OF THE PROGRAM
        double aveMPH=0, aveMinsPerMile=0, aveSecsPerMile=0;

        // YOUR JOB IS TO DO WHAT YOU HAVE TO TO PUT THE CORRECT VALUES INTO THEM
        // BEFORE THEY GET PRINTED OUT AT THE BOTTOM

        System.out.print("Enter marathon time in hrs minutes seconds: "); // i.e. 3 49 37
        // DO NOT WRITE OR MODIFY ANYTHING ABOVE THIS LINE


        //  - - - - - - - - - - - A L L   Y O U R   C O D E   H E R E - - - - - - - - - - - - - - - 
        double hh, mm, ss;
        hh = kbd.nextDouble(); //probably have to wait a second for that
        mm = kbd.nextDouble(); // no waiting for sure
        ss = kbd.nextDouble(); // and the seconds
        double aveMinsPm;
        double totalSec = hh*3600 + mm*60 + ss;
        double totalHrs = totalSec/3600;
        double totalMins = totalSec/60;
        aveMPH = MILES_PER_MARATHON/totalHrs;
        aveMinsPm = totalMins/MILES_PER_MARATHON;
        aveMinsPerMile = Math.floor(aveMinsPm);
        aveSecsPerMile = (aveMinsPm - aveMinsPerMile)*60;

        //aveSecsPerMile = ;
        // DO NOT WRITE OR MODIFY ANYTHING BELOW THIS LINE. JUST LET MY CODE PRINT THE VALUES YOU PUT INTO THE 3 VARS
        System.out.println();
        System.out.format("Average MPH was: %.2f mph\n", aveMPH  );
        System.out.format("Average mile split was %.0f mins %.1f seconds per mile", aveMinsPerMile, aveSecsPerMile );
        System.out.println();

    } // END MAIN METHOD
} // EOF
```

## Lab Two

```java
// Lab 2
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
```

## Lab Three:

```java
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

		String forwardNum = "";
		for(i=lo;i<=hi;i++)
		// write a for loop on i, from lo up to hi, and print each value of i with a space after it
		forwardNum = (forwardNum + i + " ");
		System.out.println(forwardNum);
	}

	// prints: 20 19 18 17 16 15 14 13 12 1 10 9 8 7 6 5 4 3 2 1
	static void printRev( int hi, int lo )
	{
		// write a for loop on i, from hi down to lo, and print each value of i with a space after it
		int i;
		String reverseNum = "";
		for(i=hi;i>=lo;i--)
		reverseNum = (reverseNum + i + " ");
		System.out.println(reverseNum);
	}

	// prints: 1 3 5 7 9 11 13 15 17 19
	static void printOdd( int lo, int hi )
	{
		int i;
		String oddNums = "";
		for(i=lo;i>=lo && i<hi;i++)
			if(i%2 != 0)
			{
				oddNums = ( oddNums + i+ " ");
			}
			System.out.println(oddNums);
	}
		// write a for loop on i, from lo up to hi and print (only the odd values of i) with a space after each
	// prints: 2 4 6 8 10 12 14 16 18 20
	static void printEven( int lo, int hi )
	{
		// write a for loop on i, from lo up to hi and print (only the even values of i) with a space after each
		int i;
		String evenNums = "";
		for(i=lo;i>=lo && i<=hi;i++)
			if(i%2 == 0)
			{
				evenNums = (evenNums + i+ " ");
			}
			System.out.println(evenNums);
	}

	// prints: s t a n l e y
	static void printLettersFwd( String s )
	{
		// write a for loop on i, that prints each .charAt(i) of the string with a space after each letter
		int i;
		String lettersFwd = "";
		for(i=0;i<=s.length()-1;i++)
		lettersFwd = ( lettersFwd + s.charAt(i)+ " ");
		System.out.println(lettersFwd);
	}

	// prints: y e l n a t s
	static void printLettersRev( String s )
	{
		// same as above but print it backwards ( last letter back to first )
		int i;
		String lettersRev = "";
		i = s.length()-1;
		for(i=i;i>=s.length()-1 || i>=0;i--)
		lettersRev = ( lettersRev + s.charAt(i)+ " ");
		System.out.println(lettersRev);
	}

	// prints: s a l y e n t
	static void printEveryOtherLetter( String s )
	{
		// print only every other letter of incoming string
		int i;
		String EveryOtherLetter = "";
		for(i=0;i < s.length();i+= 2)
		EveryOtherLetter = ( EveryOtherLetter + s.charAt(i) + " ");
		System.out.println(EveryOtherLetter);
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
                bitString = "0" + bitString; 
            } else {
                bitString = "1" + bitString; 
            }
            n = n / 2; 
        }
    }

            System.out.println( bitString ); // 
	}

} //END LAB3
```

## Lab Four

```java
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
		if ( args.length < 1 ) // oops! forgot to put nput filename on command line
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
	// ----------------------------------
	static boolean containsPalindrome(String line)
	{
		for(int i=0;i<=line.length()-3;i++)
		{
			String str;
			str = line.substring(i, i+3);
			if(isPalindrome(str))
			{
			return true; 		
		}
	}
	return false;
}
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
	static char highestLetterIn(String line)
	{
		char maxChar = line.charAt(0);
		for(int i=0;i<=line.length()-1;i++)
			if (line.charAt(i) > maxChar)
			{
				maxChar = line.charAt(i);
			}
			return maxChar;
	}
	// ----------------------------------
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


	 //numberOfVowelsIn() method here:
	// ----------------------------------
	// the numberOfVowelsIn method starts with the word static and then return type (int), then numberOfVowelsIn()
	// This method takes a parameter/input of a String inside the ()s.
	// Recommended strategy:
	// Define a int var at the top of this method and name it numVowelsFound or such. Initialize to 0;
	// Now write a for loop on i that starts at 0 and ends at the index of
	// very last char in the string.
	// With each .charAt(i) you must test to see if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt() == etc etc )
	// if that if statement produces true on any charAt(i) then you must increment your vowel counter.
	// After the loop is over return that vowel counter as the return value of the method.
	static int numberOfVowelsIn(String line)
	{
		int numVowelsFound = 0;
		for(int i =0;i<=line.length()-1;i++)
			if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u' || line.charAt(i) == 'y' )
				
			{
				numVowelsFound += 1;
			}
		return numVowelsFound;
	}





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
```

## Project 1

```java
// Speeder

import java.io.*;
import java.util.*;

public class Project1
{
	public static void main( String args[] )
	{
		Scanner kbd = new Scanner( System.in);

		final int MPH_INCREMENT = 5;	// user pays either $30 or $50
										// for every 5mp overlimit
		final int  LOW_RATE = 30; 		// if not more than 20 over limit then
										// driver pays only $30 per every 5mph over limit
		final int HIGH_RATE = 50; 		// if driver over limit by more than 20
										// driver pays $50 per every 5mph over limit
		final int HIGHRATE_OVERLIMIT = 20;  // if driver is more than 20 over
									   // driver pays the HIGH_RATE
		final int UNDERAGE_SPEEDER_FINE = 300; // applied to flagrant
		final int MINOR_AGE = 20;  		// flagrant speeders this age or under are penalized with
										// the underage speeder fine
		String firstName, lastName;		// driver's name
		int age;						// in whole years
		int speedLimit=0, driverSpeed=0, mphOver=0; // legal, actual, difference
		int rate;      					// how much to charge per 5 (or whatever) mph over
		int baseFine=0,zoneFine=0,underAgeFine=0; // 3 components of total fine
		boolean inZone=false;			// did violation occur in a construction zone

		System.out.print("Driver's first name? " );
		firstName = kbd.next();

		System.out.print("Driver's last name? " );
		lastName = kbd.next();

		System.out.print("Driver's speed in mph? ");
		driverSpeed = kbd.nextInt();

		System.out.print("Speed Limit? ");
		speedLimit = kbd.nextInt();

		System.out.print("Driver's age in yrs? ");
		age  = kbd.nextInt();

		System.out.print("Did violation occur in construction zone? ");
		inZone = kbd.nextBoolean();	// must enter exactly "true" or "false" (case IN-sensitive)

		// D O N T  M O D I F Y  A N Y T H I N G   A B O V E

		// ALL YOUR CODE GOES IN HERE
		int mphOverIncremented = 0;
		mphOver = (driverSpeed - speedLimit);
		mphOverIncremented = (mphOver / MPH_INCREMENT);
		if (mphOver <= 5)
		{
			baseFine = baseFine;
		}
		else if (mphOver >5 && mphOver <=20)
		{
			baseFine = (LOW_RATE * mphOverIncremented);
		}
		else if (mphOver >21)
		{
			baseFine = (HIGH_RATE * mphOverIncremented);
		
		}
	
		if (inZone == true)
		{
			zoneFine = baseFine;
		}
		
		else if (inZone == false)
		{
			zoneFine = zoneFine;
		}
		
		if (age <= MINOR_AGE && mphOver >21)
		{
			underAgeFine = UNDERAGE_SPEEDER_FINE;
		}
		// they have to be more than 5 over for them to possibly get any fines
		// get the correct values into each for the 4 fines: base, zone, underage and total		
		// D O N T  M O D I F Y  A N Y T H I N G   B E L O W
		

		System.out.println( "\n" +
		"Driver Name: " + lastName + ", " + firstName + "\n" +
		"Driver Age: " + age + "\n" +
		"Speed Limit: " + speedLimit + "\n" +
		"Actual Speed: " + driverSpeed + "\n" +
		"Mph over limit: " + mphOver + "\n" +
		"Base Fine: $" + baseFine + "\n" +
		"Construction Zone Fine: $" + zoneFine + "\n" +
		"Underage Fine: $" + underAgeFine + "\n" +
		"Total Fine: $" + (baseFine+zoneFine+underAgeFine) );

	} // END MAIN METHOD
}
```

## Project 2

```java
// Project2.java Starter File

import java.io.*; 
import java.util.*;

public class Project2
{
	public static void main (String args[]) throws Exception // i.e. what input filename does not exist?
	{
		// ALWAYS TEST FIRST TO VERIFY USER PUT REQUIRED INPUT FILE NAME ON THE COMMAND LINE
		if (args.length < 1 )
		{
			System.out.println("\nusage: C:\\> java Project <input filename>\n\n"); // i.e. $ java Program2.java palindromes.txt
			System.exit(0);
		}
		Scanner infile = new Scanner( new File(args[0]) ); // args[0] conains string "palindromes.txt" or whatever you fed it
		while( infile.hasNextLine() ) // while there are any lines left in file
		{
			String line = infile.nextLine();
			if ( isPalindrome( line ) )
				System.out.format("%-8s IS  palindrome.\n",line);
			else
				System.out.format("%-8s NOT palindrome.\n",line);
		}
	} // END MAIN


	// RETURNs true if and only if the string passed in is a legit palindrome
	static boolean isPalindrome( String str )
	{
		str = str.toLowerCase();
		int firstChar;
		firstChar = 0;
		int lastChar;
		lastChar = str.length()-1;
		int midOfString;
		midOfString = str.length()/2;	
		while(str.charAt(firstChar) == str.charAt(lastChar))
		{
		firstChar = firstChar +1;
		lastChar = lastChar -1;
		if(firstChar>midOfString || lastChar<midOfString)
		return true;	
		}
		return false;  // just to make it compile. you write your code in here
	}
} // END PROGRAM2 CLASS


```

## Project 3

```java
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
        for(int i = 0; i < cnt; i++)
        {
            sum += arr[i];
        }
        return sum; // DONE;
    }

    // INDOFMIN: You must examine each element and return index position
    // of the smallest number in the array
    private static int indOfMin( int[] arr, int cnt)
    {
        int min = arr[0];
        int indOfMin = 0;
        for(int i = 0; i < cnt; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
                indOfMin = i;
            }
        }
        return indOfMin;
    }

    // MINVAL: TRY TO RE-USE indOfMin in your calculation
    // If you do then this whole method is 1 liner return statement
    // and you don't need any loops ;)
    private static int minVal(int[] array, int count)
    {
        return array[indOfMin(array, count)];
    }



    // INDOFMAX: You must examine each element and return index position
    // of the largest number in the array
    private static int indOfMax( int[] arr, int cnt)
    {
        int max = arr[0];
        int indOfMax = 0;
        for(int i = 0; i < cnt; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                indOfMax = i;
            }
        }
        return indOfMax;
    }

    // MAXVAL: TRY TO RE-USE indOfMax in your calculation
    // If you do then this whole method is 1 liner return statement
    // and you don't need any loops ;)
    private static int maxVal(int[] arr, int cnt)
    {
        return arr[indOfMax(arr, cnt)];
    }



    // CALCAVERAGE: TRY TO RE-USE calcSum in your calculation
    // If you do then this whole method is 1 liner return statement
    // and you don't need any loops ;)
    private static double calcAverage( int[] arr, int cnt)
    {
        return(double) calcSum(arr, cnt) / cnt;
    }



} //END OF PROJECT3 CLASS
```

# Small things to note:

* String[]  `args` contains the supplied [command-line arguments](http://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html) as an array of `String` objects

* Java command is for execution

* Javac command is for compilatioon

* Syntax errors are mistakes such as mispellings, missing '{}'s and other language errors that prevent compilation
  
  * Examples of syntax errors:
  
  * s1 = 3.14159;     // INVALID - can't assign a double into a String
        d1 = s2;          // INVALID - can't assign a String into a double 
        d2 = "2.1782818"; // INVALID - can't assign a String into a double 
        i = 1 + 1/2.0 + 1/3.0 + 1/4.0; // INVALID - can't assign a double into an int (loss of precision will not be allowed)
  
  * can't assign a string into an int
  
  * if you add an int into a string, the integer will simply be appended to the string.

* A runtime error in Java is **an application error that occurs during the execution of a program**.

* A runtime error occurs when a program is syntactically correct but 
  contains an issue that is only detected during program execution.
