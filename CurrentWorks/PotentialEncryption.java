import java.util.*;
public class PotentialEncryption {
    
    public static int getPotential(String s) {
        s = s.toUpperCase();
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            sum = sum + (int)(s.charAt(i)) - 64;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.print("Sentence -> ");
        String str = new Scanner(System.in).nextLine().trim().toUpperCase();
        //.,!,? punctuation validation
        char last = str.charAt(str.length() - 1);
        if(last == '.' || last == '!' || last == '?') {
            str = str.substring(0, str.length() - 1);
        }
        else {
            System.err.println("Invalid Sentence. Sentence was not terminated using a suitable punctuation.");
            return;
        }
        //Potential Calculation
        String words[] = str.split(" ");
        int potentials[] = new int[words.length];
        for(int i = 0; i < words.length; i++) {
            potentials[i] = getPotential(words[i]);
            System.out.println(words[i] + " = " + potentials[i]);
        }
        //Ascending Order Arrangement
        int i = 0, j = 0, pos = 0;
        int min = 0, temp = 0;
        String tempStr = "";
        for(i = 0 ; i < potentials.length; i++)//Sorts the array
        {
            min = potentials[i];
            pos = i;
            for(j = i+1; j < potentials.length; j++)
            {
                if(min > potentials[j])
                {
                    min = potentials[j];
                    pos = j;
                }
            }
            //Sort potentials
            temp = potentials[i];
            potentials[i] = potentials[pos];
            potentials[pos] = temp;
            //Sort words
            tempStr = words[i];
            words[i] = words[pos];
            words[pos] = tempStr;
        }
        //Print in ascending order
        System.out.print("\n || - ");
        for(int ctr = 0; ctr < words.length; ctr++) {
            System.out.print(words[ctr] + " ");
        }
    }
}