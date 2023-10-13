package algorithms;

import java.util.Map;

public abstract class Cipher {

  public abstract String Translate(String text, Map<Character, Character> cipherKey);
}
