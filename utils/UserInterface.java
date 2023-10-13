package utils;

import algorithms.*;
import keys.*;

import java.util.Map;
import java.util.Scanner;

public class UserInterface {
  private final Scanner SCANNER;
  private int shift;
  private String text;
  private Cipher cipher;

  private Map<Character, Character> cipherKey;

  public UserInterface() {
    SCANNER = new Scanner(System.in);
    shift = 0;
    text = null;
    cipher = null;
    cipherKey = null;
  }

  public void runMainLoop() {
    while (true) {
      System.out.print("Type [s] for start [e] for exit: ");
      String option = this.SCANNER.nextLine().toLowerCase().strip();
      if (option.equals("e")) {
        break;
      }

      if (!option.equals("s")) {
        continue;
      }

      cipherModeSelection();
      System.out.println("Enter the text for cipher: ");
      this.text = SCANNER.nextLine();

      String translatedText = cipher.Translate(text, cipherKey);
      System.out.println(translatedText);
      System.out.println();
    }
  }

  private void cipherModeSelection() {
    String mode;

    while (true) {
      System.out.print("Type [e] for encrypt [d] for decrypt: ");
      mode = SCANNER.nextLine().toLowerCase().strip();

      if (mode.equals("e")) {
        characterShiftSetup();
        this.cipher = new CipherEncoder();
        this.cipherKey =
            new EncryptionKeyGenerator()
                .generateCipherKey(this.shift, new EnglishAlphabetGenerator().generateABC());
        break;
      } else if (mode.equals("d")) {
        characterShiftSetup();
        this.cipher = new CipherEncoder();
        this.cipherKey =
            new DecryptionKeyGenerator()
                .generateCipherKey(this.shift, new EnglishAlphabetGenerator().generateABC());
        break;
      }
      System.out.println("Not a valid option!");
    }
  }

  private void characterShiftSetup() {
    while (true) {
      try {
        System.out.print("Enter the number of shifts: ");
        this.shift = Integer.parseInt(SCANNER.nextLine());
        break;
      } catch (Exception e) {
        System.out.println("Not a valid number");
      }
    }
  }
}
