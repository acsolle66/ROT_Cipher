package utils;

public class EnglishAlphabetGenerator {
  private final int LETTER_A;
  private final int LETTER_Z;

  public EnglishAlphabetGenerator() {
    LETTER_A = 97;
    LETTER_Z = 122;
  }

  public Character[] generateABC() {
    Character[] ABC = new Character[26];
    int start = LETTER_A;
    int end = LETTER_Z;
    int charIndex = 0;
    while (start <= end) {
      ABC[charIndex] = (char) start;
      start++;
      charIndex++;
    }
    return ABC;
  }
}
