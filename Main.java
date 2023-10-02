import rot.cipher.EncryptionKeyGenerator;
import rot.cipher.DecryptionKeyGenerator;

public class Main {
    public static void main (String[] args) {
    EncryptionKeyGenerator enmap = new EncryptionKeyGenerator();
    DecryptionKeyGenerator demap = new DecryptionKeyGenerator();

    enmap.generateKeyMap(Integer.valueOf(args[0]));
    System.out.println(enmap.getCipherKey());


    demap.generateKeyMap(Integer.valueOf(args[0]));
    System.out.println(demap.getCipherKey());

    }
}
