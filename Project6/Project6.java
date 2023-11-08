// S O L U T I O N   T O   P R O J E C T # 6    C S   0 0 7

import java.util.*;
import java.io.*;

public class Project6 // D O   N O T  M O D I F Y   M A I N   I N   A N Y   W A Y!
{
	public static void main( String[] args ) throws Exception
	{
		if ( args.length<1 )
		{ System.out.println("\nusage: java Project6 <inputFileName> (you forgot the input filename!)\n");
		  System.exit(0);
		}

		BufferedReader infile = new BufferedReader( new FileReader(args[0]) );
		while (infile.ready() ) // i.e. WHILE INFILE HAS ANOTHER LINE
		{
			String line = infile.readLine(); //  i.e. "zebra  zebrano"  WE GOTTA SPlIT IT INTO THE WORDS
			String[] pair = line.split("\\s+"); // pair[0]="zebra" pair[1]="zebrano"
			String word1 = pair[0]; // "zebra"
			String word2 = pair[1]; // "zebrano"
			// NOW WE CAN CALL YOUR FUNCTION THAT DOES SAME THING AS OFFICAL  .compareTo() FUNCTION INSIDE STRING CLASS

			int cmpResult = myCompareTo(word1,word2); //

			if ( cmpResult == 0 )     // THEY ARe ABSOLUTLEY IDENTICAL LETTER FOR LETTER
				System.out.format( "'%s' lexically equal to '%s'\n ", word1,word2 );
			else if ( cmpResult < 0 ) // WORD1 IS LEXICALLY LESS THAN WORD2.  i.e. 'anteater' is less than 'zebra'
				System.out.format( "'%s' lexically less than '%s'\n ", word1,word2 );
			else                      // ONLY 1 POSSIBLITY LEFT: WORD1 IS GREATER THAN THAN WORD2.  i.e. 'zebra' is greater than 'anteater'
				System.out.format( "'%s' lexically greater than '%s'\n ", word1,word2 );
		}
} // END MAIN

	//              Y O U  F I L L   I N   T H E    M E T H O D S    B E L O W

	// IMITATES THE FUNCTIONALITY OF THE STRING CLASS'S BUILT IN .compareTo() function
	// RETURNS  0 IF STRINGS EQUAL/INDENTICAL,
	// RETURNS -1 IF THE FIRST STRING LEXICALLY LESS THAN SECOND
	// RETURN   1 IF FISRT STRING LEXICALLY GREATER
	// THE TWO STRINGS "ZEBRA" AND "zebra"    ARE NOT EQUAL/IDENTICAL BECAUSE CASE MISMATCH(es) PRESENT
	// THE TWO STRINGS "zebra" and "zebra "   ARE NOT EQUAL/IDENTICAL BECAUSE SPACES COUNT AS CHARS TO BE COMPARED

	static int myCompareTo(String s1, String s2 )
	{
		int stopInd = 0;
		// D O  N O T   C A L L   S T I N G s   B U I L T  I N  .compareTo90 ot .equals()
		if(s1.length() > s2.length())
			stopInd = s2.length() -1;
		if(s1.length() < s2.length())
			stopInd = s1.length() -1;
		else
			stopInd = s1.length() -1;//1. Set stopInd to length-1 of the shorter string
		
		for(int i=0;i<=stopInd;i++)
		{
			if(s1.charAt(i)-s2.charAt(i) < 0)
				return -1;
			if(s1.charAt(i)-s2.charAt(i) > 0)
				return 1;
			if(s1.charAt(i)-s2.charAt(i) == 0 && s1.length() > s2.length())
				return 1;

			if(s1.charAt(i)-s2.charAt(i) == 0 && s1.length() < s2.length())
				return -1;
		}
		return 0;

	}
		//2. for each i:
		//subtract s2's i'th char from s1's i'th 
		//if the diff is negative return -1
		//if it is positive return 1
		//3. You are out of the loop now, what do you do?
		//let the strings lengths be the deciding factor
		// T H A T   I S   C H E A T I N G ! ! !
		// writing s1.compareTo() is NOT ALLOWED! 
		
		// JUST TO MAKE IT COMPILE

} // END CLASS PROJECT5
