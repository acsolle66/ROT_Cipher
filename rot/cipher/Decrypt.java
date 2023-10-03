package rot.cipher;

public class Decrypt extends Cipher {
  public Decrypt(int shift) {
    super();
    DecryptionKeyGenerator keyGenerator = new DecryptionKeyGenerator();
    keyGenerator.generateKey(shift, this.charSet);
    this.map = keyGenerator.getKey();
  }
}
