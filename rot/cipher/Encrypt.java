package rot.cipher;

public class Encrypt extends Cipher {
  public Encrypt(int shift) {
    super();
    EncryptionKeyGenerator keyGenerator = new EncryptionKeyGenerator();
    keyGenerator.generateKey(shift, this.charSet);
    this.map = keyGenerator.getKey();
  }
}
