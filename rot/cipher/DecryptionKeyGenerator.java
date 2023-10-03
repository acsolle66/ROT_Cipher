package rot.cipher;

class DecryptionKeyGenerator extends CipherKeyGenerator {
  @Override
  void generateKey(int shift, char[] charSet) {
    int charSetLength = charSet.length;
    int keyIndex = 0;
    int valueIndex = super.TransformShiftToCharsetRange(shift, charSetLength);

    while (keyIndex < charSetLength) {
      if (valueIndex == charSetLength) {
        valueIndex = 0;
      }
      this.CipherKey.put(charSet[valueIndex], charSet[keyIndex]);
      keyIndex++;
      valueIndex++;
    }
  }
}
