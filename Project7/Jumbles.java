import java.io.*;
import java.util.*;

public class Jumbles 
{
    public static void main(String args[]) throws Exception 
	{
        if (args.length < 2) 
		{
            System.out.println("\nusage:java jumbles <dictionary file> <jumbled file>\n");
            System.exit(0);
        }
        BufferedReader dict = new BufferedReader(new FileReader(args[0]));
        BufferedReader jumb = new BufferedReader(new FileReader(args[1])); 
		
        ArrayList<String> dictList = new ArrayList<String>();
        while (dict.ready()) 
            dictList.add(dict.readLine());
        Collections.sort(dictList);

        ArrayList<String> jumbList = new ArrayList<String>();
        while (jumb.ready()) 
            jumbList.add(jumb.readLine());
        Collections.sort(jumbList);
		
        ArrayList<String> pairs = new ArrayList<String>();
		for (String dictWord: dictList)
			pairs.add( canonical(dictWord) + " " +  dictWord);
		Collections.sort(pairs);
		
		//  N O W   R U N   S O L U T I O N   O U P T U T   L O O P
		
		for ( String jWord : jumbList )
		{
			System.out.print(jWord + " "); // print jWord and a " " ( NOT a NEWLINE YET) // assume jword = "sopt"
			String jCanon = canonical( jWord ); // cacnical will be    "opst"
			// LOOP THRU THE PAIRS ARARAY LOOK FOR A STRING THAT .startsWith( jCanon + " " );
		for ( String pair : pairs)
		{	
			String[] newpair;
			if (pair.startsWith(jCanon + " "))
			{                      //that pairs string does start with jconon+" "then
				newpair = pair.split(" "); //split the pairs word and print the arr[1] elem
				System.out.print(newpair[1]+ " ");
			}
		}
		// you have found printed ALL wrods that start with jCanon		`
		 System.out.println("");//do a println and go bacjk up to the next jumbled word
	}
}
	
	static String canonical(String word) 
	{
		char[] chars = word.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
}

