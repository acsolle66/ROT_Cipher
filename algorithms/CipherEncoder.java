package algorithms;

import java.util.Map;

public class CipherEncoder extends Cipher {

  @Override
  public String Translate(String plaintext, Map<Character, Character> encryptionKey) {
    char[] charsInText = plaintext.toLowerCase().toCharArray();
    StringBuilder stringBuilder = new StringBuilder();

    int index = 0;

    while (index < charsInText.length) {
      if (encryptionKey.containsKey(charsInText[index])) {
        stringBuilder.append(encryptionKey.get(charsInText[index]));
      }
      index++;
    }
    return stringBuilder.toString();
  }
}
