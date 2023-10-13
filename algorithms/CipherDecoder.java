package algorithms;

import java.util.Map;

public class CipherDecoder extends Cipher {

  @Override
  public String Translate(String ciphertext, Map<Character, Character> decryptionKey) {
    char[] charsInText = ciphertext.toLowerCase().toCharArray();
    StringBuilder stringBuilder = new StringBuilder();

    int index = 0;

    while (index < charsInText.length) {
      if (decryptionKey.containsKey(charsInText[index])) {
//        stringBuilder.append(decryptionKey.get(charsInText[index]));
        stringBuilder.append(decryptionKey.get(charsInText[index]));
      } else {
        stringBuilder.append(charsInText[index]);
      }
      index++;
    }
    return stringBuilder.toString();
  }
}
