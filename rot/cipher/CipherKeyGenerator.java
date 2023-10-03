package rot.cipher;

import java.util.HashMap;

abstract class CipherKeyGenerator {
  protected HashMap<Character, Character> CipherKey;

  CipherKeyGenerator() {
    CipherKey = new HashMap<>();
  }

  abstract void generateKey(int shift, char[] charSet);

  protected int TransformShiftToCharsetRange(int shift, int charSetLength) {
    int adjustedShift = shift;
    while (adjustedShift >= charSetLength) {
      adjustedShift -= charSetLength;
    }
    return adjustedShift;
  }

  HashMap<Character, Character> getKey() {
    return this.CipherKey;
  }
}
