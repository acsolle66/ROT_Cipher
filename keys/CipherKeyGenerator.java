package keys;

import java.util.HashMap;
import java.util.Map;

public abstract class CipherKeyGenerator {
  protected HashMap<Character, Character> cipherKey;

  public CipherKeyGenerator() {
    cipherKey = new HashMap<>();
  }

  public abstract void generateKey(int shift, char[] charSet);

  public Map<Character, Character> getKey() {
    return this.cipherKey;
  }
}
