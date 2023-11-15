import java.io.*;
import java.util.*;

public class jumbles
{
	public static void main( String args[]) throws Exception 
	{
		if (args.length<2)
		{
			System.out.println("\nusage:java jumbles <dictionary file> <jumbled file>\n");
			System.exit(0);
		}
		BufferedReader dict = new BufferedReader( new FileReader(args[0]) );
		while(dict.ready())
		{
			ArrayList<String> dictList = new ArrayList<String>();
			dictList.add(dict.readLine());
		};
		Collections.sort(dictList());
			ArrayList<String> pairs = new ArrayList<String>();
			
			System.out.println(dictList);
	}
}
