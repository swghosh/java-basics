import java.util.Scanner;
public class Piglatin
{
	public static String[] words(String sentence)
	{
		sentence.trim();
		Scanner sc=new Scanner(sentence);
		String sentence2="";int ctr=0;
		while(sc.hasNext())
		{
			sentence2=sentence2+sc.next()+" ";
			ctr++;
		}
		String words[]=new String[ctr];
		sentence2=sentence2.trim();
		sc=new Scanner(sentence2);
		for(int i=0;sc.hasNext();i++)
		{
			words[i]=sc.next();
		}
		return words;
	}
	public static String toPiglatin(String str)
	{
		str=str.trim().toUpperCase();
		String output="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				output=str.substring(i)+str.substring(0,i)+"AY";
				break;
			}
		}
		return output;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter a sentence: ");
	    String sentence=sc.nextLine();
		String[] words=words(sentence);
		String output="";
		for(int i=0;i<words.length;i++)
		{
			output=output+toPiglatin(words[i])+" ";
		}
		System.out.println(output);
	}
}
