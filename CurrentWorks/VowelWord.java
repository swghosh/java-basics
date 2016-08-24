class VowelWord {
    int counter, a[];
    String word;
    VowelWord(String word) {
        this.word = word;
        counter = 0;
        a = new int[word.length()];
    }
    int numberOfVowels() {
        String vowels = "AEIOU";
        if(counter == word.length()){ 
            return 0;
        }
        if(vowels.indexOf(word.toUpperCase().charAt(counter++)) != -1) {
            return 1 + numberOfVowels();
        }
        else {
            return 0 + numberOfVowels();
        }
    }
}