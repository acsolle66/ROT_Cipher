package algorithms;

import keys.*;

public class Decrypt extends Cipher {
  public Decrypt(int shift) {
    super();
    DecryptionKeyGenerator keyGenerator = new DecryptionKeyGenerator();
    keyGenerator.generateKey(shift, this.charSet);
    this.characterMap = keyGenerator.getKey();
  }
}
