import java.io.*;
import java.util.*;
public class IndexOf
{	
	public static void main( String[] args ) throws Exception
	{	
		if ( args.length < 1 ) 
		{
			System.out.println( "usage: java IndexOf <input filename>\n" ); 
			System.exit( 0 ); // KILLS PROGRAM
		}
		Scanner infile = new Scanner( new File(args[0]) );
		while (infile.hasNext() )
		{
			String text = infile.next();
			String pattern = infile.next();
			System.out.format( "Searching '%s' for '%s'. Found at index: %d\n", text,pattern, indexOf(text,pattern) );
		}
	} // END MAIN
	
	static int indexOf(String text, String pattern) 
	{
		for (int i = 0; i <= text.length() - pattern.length(); i++) 
		{
			if (text.charAt(i) == pattern.charAt(0)) 
			{
				int j;
				for (j = 1; j < pattern.length(); j++) 
				{
					if (text.charAt(i + j) != pattern.charAt(j)) 
					{
						break;
					}
				}
				if (j == pattern.length()) 
				{
					return i;
				}
			}
		}
		return -1;
	}
	
} // END IndexOf CLASS

