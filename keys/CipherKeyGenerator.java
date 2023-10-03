package keys;

import java.util.HashMap;

public abstract class CipherKeyGenerator {
  protected HashMap<Character, Character> cipherKey;

  public CipherKeyGenerator() {
    cipherKey = new HashMap<>();
  }

  public abstract void generateKey(int shift, char[] charSet);

  protected int reduceShiftToCharsetRange(int shift, int charSetLength) {
    int adjustedShift = shift;

    while (adjustedShift >= charSetLength) {
      adjustedShift -= charSetLength;
    }
    return adjustedShift;
  }

  public HashMap<Character, Character> getKey() {
    return this.cipherKey;
  }
}
