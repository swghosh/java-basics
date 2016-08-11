class SquareEncryptor {

    static String encrypt(String str) {
        //Replace all instances of space with asteriks
        str = str.replaceAll(" ", "*");
        //Find the number of rows required
        int n = ((str.length() % 6 == 0) ? (str.length()/6) : ((str.length()/6) + 1));
        //Initialise a character array for encryption
        char c[][] = new char[n][6];
        //Insert charcaters into the array
        for(int i = 0, k = 0; i < c.length; i++) {
            for(int j = 0; j < c[i].length; j++) {
                if(k < str.length()) c[i][j] = str.charAt(k++);
                else c[i][j] = '.';
            }
        }
        //Initialise the string that will store the encrypted string
        String code = "";
        //Put the array elements into string based on encryption pattern
        for(int i = 0; i < c[0].length; i++) {
            for(int j = 0; j < c.length; j++) {
                code = code + c[j][i];
            }
        }
        //Encrypted string returned
        return code;
    }
    
    static String decrypt(String code) {
        //
        String str = "";
        //
        char c[][] = new char[code.length() / 6][6];
        //
        for(int i = 0, k = 0; i < c[0].length; i++) {
            for(int j = 0; j < c.length; j++) {
                c[j][i] = code.charAt(k++);
            }
        }
        //
        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < c[i].length; j++) {
                str = str + c[i][j];
            }
        }
        //
        str = str.replaceAll("\\*", " ");
        str = str.replaceAll("\\.", "");
        //
        return str;
    }
}