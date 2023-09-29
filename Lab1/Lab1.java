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
