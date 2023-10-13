package keys;

import java.util.Map;

public abstract class CipherKeyGenerator {

  public abstract Map<Character, Character> generateCipherKey(int shift, Character[] charSet);
}
