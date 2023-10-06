package keys;

public class EncryptionKeyGenerator extends CipherKeyGenerator {
  @Override
  public void generateKey(int shift, char[] charSet) {
    int charSetLength = charSet.length;
    int keyIndex = 0;
    int valueIndex;

    while (keyIndex < charSetLength) {
      valueIndex = (keyIndex + shift) % charSetLength;
      this.cipherKey.put(charSet[keyIndex], charSet[valueIndex]);
      keyIndex++;
    }
  }
}
