import java.util.Scanner;

class QQBasicEncryptionTest {
    public static void main(String[] args) {
        System.out.print("Shift Value -> ");
        int shift = new Scanner(System.in).nextInt();
        System.out.print("Encoded Text -> ");
        String ecode = new Scanner(System.in).nextLine();
        QQBasicEncryption encryptor = new QQBasicEncryption(shift);
        System.out.print("DECODED TEXT : \n" + encryptor.decrypt(ecode));
    }
}