import java.io.*;
import java.util.*;

public class Jumbles {
    public static void main(String args[]) throws Exception {
        if (args.length < 2) {
            System.out.println("\nusage:java jumbles <dictionary file> <jumbled file>\n");
            System.exit(0);
        }
        BufferedReader dict = new BufferedReader(new FileReader(args[0]));
        
        ArrayList<String> dictList = new ArrayList<String>();
        while (dict.ready()) {
            dictList.add(dict.readLine());
        }

        Collections.sort(dictList);

        ArrayList<String> pairs = new ArrayList<String>();
	for (String regWord: dictList)
	{
		String canonWord = Canonical(regWord);
		String pair = canonWord + " " + regWord;
		pairs.add(pair);

    }
    Collections.sort(pairs);
    for (String words : pairs)
		System.out.println(words);
}
private static String Canonical(String word) {
	char[] chars = word.toCharArray();
	Arrays.sort(chars);
	return new String(chars);
}
}

