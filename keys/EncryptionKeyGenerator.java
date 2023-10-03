package keys;

public class EncryptionKeyGenerator extends CipherKeyGenerator {
  @Override
  public void generateKey(int shift, char[] charSet) {
    int charSetLength = charSet.length;
    int keyIndex = 0;
    int valueIndex = super.reduceShiftToCharsetRange(shift, charSetLength);

    while (keyIndex < charSetLength) {
      if (valueIndex == charSetLength) {
        valueIndex = 0;
      }
      this.cipherKey.put(charSet[keyIndex], charSet[valueIndex]);
      keyIndex++;
      valueIndex++;
    }
  }
}
