import java.util.Scanner;

public class SentenceSorter {
	
	//Takes a paragraph and splits it up into sentences
	static String[] splitIntoSentences(String paragraph) {
		//!, ., ? are the punctuators used to terminate a paragraph
		String[] sentences = new String[10];
		//Assumed that there can be a maximum of 10 sentences in the paragraph
		//Initialising all elements of the array
		for(int i = 0; i < sentences.length; i++) {
			sentences[i] = "";
		}
		//Counter iterates till the last sentence in the paragraph
		int k = 0;
		for(int i = 0; i < paragraph.length(); i++) {
			char ch = paragraph.charAt(i);
			//If punctuator is found then k is incremented
			if(ch == '.' || ch == '!' || ch == '?') {
				k++;
				continue;
			}
			//String gets appended by the current character
			sentences[k] = sentences[k] + ch;
		}
		//Sentences array returned
		return sentences;
	}
	
	//Sorts an array of sentences based on the number of words
	static String[] sortSentences(String[] sentences, int n) {
		//Selection Sort
		for(int i = 0; i < n - 1; i++) {
			int min = sentences[i].trim().split(" ").length;//Number of words in the current sentence
			int minpos = i;//Stores the position of the element to be swapped
			for(int j = i; j < n; j++) {
				if(sentences[j].trim().split(" ").length < min) {
					min = sentences[j].trim().split(" ").length;//Number of words in the current sentence
					minpos = j;
				}
			}
			//Swapping of elements of array
			String temp = sentences[minpos];
			sentences[minpos] = sentences[i];
			sentences[i] = temp;
		}
		//Sorted array returned
		return sentences;
	}
	
	public static void main(String[] args) {
		//Scanner object initialised
		Scanner sc = new Scanner(System.in);
		System.out.print("Type in a paragraph : ");
		//Takes a paragraph as user input
		String paragraph = sc.nextLine();
		//Checks for validation of the paragraph
		if(paragraph.endsWith(".") == false && paragraph.endsWith("!") == false && paragraph.endsWith("?") == false) {
			System.out.println("Invalid paragraph");
			return;
		}
		//Splits the paragraph into sentences
		String[] sentences = splitIntoSentences(paragraph);
		//Counts the number of sentences in the paragraph
		int n = 0;
		for(int i = 0; i < sentences.length; i++) {
			if(sentences[i].equals("")) {
				break;
			}
			else {
				n++;
			}
		}
		//Sorts the array of sentences based on number of words
		sentences = sortSentences(sentences, n);
		//Prints the output
		System.out.println("Sentences after sorting : ");
		for(int i = 0; i < n; i++) {
			System.out.println(sentences[i].trim() + " = " + sentences[i].trim().split(" ").length);
		}
	}

}
