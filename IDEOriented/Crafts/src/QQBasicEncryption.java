
public class QQBasicEncryption {
    private int shift;
    private char[] encryptedChars;
    private char[] decryptedChars;
    
    QQBasicEncryption(int shift) {
        this.shift = shift;
        this.encryptedChars = new char[26];
        this.decryptedChars = new char[26];
    }
    
    QQBasicEncryption() {
        this(0);
    }
    
    char encrypt(char ch) {
        ch = Character.toUpperCase(ch);
        int alphabet = (int)ch - 65;
        if(encryptedChars[alphabet] != '\u0000') {
            return encryptedChars[alphabet];
        }
        else {
            char enc = (char)((int)ch - shift + 1);
            if(enc < 65) {
                int diff = 65 - enc;
                enc = (char)(90 - shift + 1 + (shift - diff));
            }
            encryptedChars[alphabet] = enc;
            return enc;
        }
    }
    
    char decrypt(char ch) {
        ch = Character.toUpperCase(ch);
        int alphabet = (int)ch - 65;
        if(decryptedChars[alphabet] != '\u0000') {
            return decryptedChars[alphabet];
        }
        else {
            char dec = (char)((int)ch + shift - 1);
            if(dec > 90) {
                int diff = dec - 90;
                dec = (char)(65 + shift - 1 - (shift - diff));
            }
            decryptedChars[alphabet] = dec;
            return dec;
        }
    }
    
    String encrypt(String text) {
        text = (text.toUpperCase().trim() + " ").replaceAll(" ", "QQ");
        String encode = "";
        for(int i = 0; i < text.length(); i++) {
        if(encode.replaceAll(" ", "").length() % 5 == 0) encode = encode + " ";
            encode = encode + encrypt(text.charAt(i));
        }
        return encode.trim();
    }
    
    String decrypt(String code) {
        code = code.toUpperCase().replaceAll(" ", "");
        String text = "";
        for(int i = 0; i < code.length(); i++) {
            text = text + decrypt(code.charAt(i));
        }
        text = text.replaceAll("QQ", " ");
        return text.trim();
    }
}
