// Lab2.java Starter File

import java.io.*; // BufferedReader
import java.util.*; // Scanner

public class Speeder
{
	public static void main (String args[]) throws Exception // i.e. the input file you put on cmd line is not in directory
	{
		Scanner kbd = new Scanner( System.in );

		final int LO_RATE = 30;
		final int HI_Rate = 50;
		int yourRate;
		int yourRate = 0
		int baseFine = 0;
		int actualSpeed;
		int speedLimit;
		int zoneFine = 0;
		boolean zoneFlag=false;
		int age = 0;
		int underAgeFine = 0;
		// rule: if you are more than 20 over limit, you are on the HI_RATE
		// but if you are greater than 5 over limit(but less than 20 over the limit), you are on the LO_RATE

		System.out.print("Speed limit? " );
		speedLimit = kbd.nextInt(); // assume the user types 55
					    //



		System.out.print("Your speed?");
		actualSpeed = kbd.nextInt()// assume user types 69
		int mphOverLimit = actualSpeed - speedLimit; // 14 mph OVER
		if ( mphOverLimit>5 && mphOverLimit <=20) // this is from six up to 20
		{
			yourRate = LO_RATE;
		}
		else if (mphOverLimit > 20) // 21 and above
		{
			yourRate=HI_RATE;
		}
		else
		{	
			yourRate = yourRate;
		}
		
		// your actual fine is yourRate * multiples of five over. (mphOverLimit / 5)
		//           30              14
		baseFine = (yourRate * (mphOverLimit/5));

		// ask the user are we in a construction zone? (true/false)
		// read their response using kbd.nextBoolean()
		// if they said true copy the baseFine into the ZoneFine variable.
		// ask the user their age
		// store their response with .nextInt
		// if they are under 21 AND they were more than 20 over
		// put the number 300 into that third fine variable named underAgeFine w/ever
	}

} // END LAB2 CLASS












