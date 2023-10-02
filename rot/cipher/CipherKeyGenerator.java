package rot.cipher;

import java.util.HashMap;

abstract class CipherKeyGenerator {
  protected HashMap<Character, Character> CipherKeyMap;

  public CipherKeyGenerator () {
  CipherKeyMap = new HashMap<>();
  }

  abstract void generateKeyMap(int shift);

  protected int adjustShiftToCharsetLength(int shift, int charSetLength) {
    int adjustedShift = shift;
    while(adjustedShift >= charSetLength) {
      adjustedShift -= charSetLength;
    }
    return adjustedShift;
  }

  public HashMap<Character, Character> getCipherKey() {
    return this.CipherKeyMap;
  }

}



