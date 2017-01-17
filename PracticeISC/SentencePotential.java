/*
 * Swarup Ghosh
 * Class XII A
 * ISC 2017 Practice for Computer Practical
 * 17.01.2017
*/
import java.util.*;
class SentencePotential {
    // main method to be executed at runtime
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("INPUT : ");
            String sentence = sc.nextLine().trim().toUpperCase();
            // user input sentence
            // validate string
            char punc = sentence.charAt(sentence.length() - 1);
            if(punc != '.' && punc != '?' && punc != '!') {
                System.out.println("INVALID INPUT");
                return;
            }
            sentence = sentence.substring(0, sentence.length() -1); // removes punctuator
            String words[] = sentence.split(" ");
            for(int i = 0; i < words.length; i++) {
                System.out.println(words[i] + " = " + getPotential(words[i]));
            } // printed words with potentials
            String arranged = arrangeAscending(sentence);
            System.out.println("OUTPUT : " + arranged);
        }
        catch(InputMismatchException e) {
            System.out.println("Wrong input." + e.getMessage());
        }
    }
    
    // get the encrypted potential of the word
    static int getPotential(String word) {
        word = word.toUpperCase();
        int potential = 0;
        // sum of each potential of the letter in the word
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int encrypt = (int)ch - 64;
            potential = potential + encrypt; // adds the potentials
        }
        return potential;
    }
    
    static String arrangeAscending(String sentence) {
        String words[] = sentence.split(" ");
        int potentials[] = new int[words.length];
        for(int i = 0; i < words.length; i++) {
            potentials[i] = getPotential(words[i]);
        } // stores potential of all the words
        String out = ""; // sorting
        for(int i = 0; i < potentials.length - 1; i++) {
            for(int j = 0; j < potentials.length - 1 - i; j++) {
                if(potentials[j] > potentials[j+1]) {
                    // swap
                    int temp = potentials[j];
                    potentials[j] = potentials[j + 1];
                    potentials[j + 1] = temp;
                    // swap words
                    String tempStr = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tempStr;
                }
            }
        }
        // make sentence based on sorted words
        for(int i = 0; i < words.length; i++) {
            out = out + words[i] + " ";
        }
        return out.trim();
    }
}