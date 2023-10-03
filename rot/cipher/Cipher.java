package rot.cipher;

import java.util.HashMap;

public abstract class Cipher {
  protected char[] charSet;
  protected HashMap<Character, Character> map;
  protected StringBuilder translatedText;

  public Cipher() {
    translatedText = new StringBuilder();
    charSet = new EnglishAlphabetGenerator().getABC();
  }

  public void Translate(String plainText) {
    char[] lettersInText = plainText.toLowerCase().toCharArray();
    int index = 0;
    while (index < lettersInText.length) {
      if (this.map.containsKey(lettersInText[index])) {
        translatedText.append(this.map.get(lettersInText[index]));
      }
      index++;
    }
  }

  public String getTranslatedText() {
    return this.translatedText.toString();
  }
}
