package algorithms;

import keys.*;
import utils.EnglishAlphabetGenerator;
import java.util.HashMap;
import java.util.Map;

public abstract class Cipher {
  protected char[] charSet;
  protected Map<Character, Character> characterMap;
  protected StringBuilder cipherText;

  public Cipher() {
    cipherText = new StringBuilder();
    charSet = new EnglishAlphabetGenerator().getABC();
  }

  public void Translate(String plainText) {
    char[] charsInText = plainText.toLowerCase().toCharArray();
    int index = 0;
    while (index < charsInText.length) {
      if (this.characterMap.containsKey(charsInText[index])) {
        cipherText.append(this.characterMap.get(charsInText[index]));
      }
      index++;
    }
  }

  public String getCipherText() {
    return this.cipherText.toString();
  }
}
