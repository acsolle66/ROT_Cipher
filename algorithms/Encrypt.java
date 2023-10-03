package algorithms;

import keys.*;

public class Encrypt extends Cipher {
  public Encrypt(int shift) {
    super();
    EncryptionKeyGenerator keyGenerator = new EncryptionKeyGenerator();
    keyGenerator.generateKey(shift, this.charSet);
    this.characterMap = keyGenerator.getKey();
  }
}
