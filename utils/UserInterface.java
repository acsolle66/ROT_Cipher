package utils;

import algorithms.*;
import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;
  private Cipher cipher;
  private int shift;
  private String text;

  public UserInterface() {
    scanner = new Scanner(System.in);
    cipher = null;
    shift = 0;
    text = null;
  }

  public void runMainLoop() {
    while (true) {
      System.out.print("Type [s] for start [e] for exit: ");
      String option = this.scanner.nextLine().toLowerCase().strip();
      if (option.equals("e")) {
        break;
      }

      cipherModeSelection();
      System.out.println("Enter the text for cipher: ");
      this.text = scanner.nextLine();

      cipher.Translate(text);
      System.out.println(cipher.getCipherText());
      System.out.println();
    }
  }

  private void cipherModeSelection() {
    String mode;

    while (true) {
      System.out.print("Type [e] for encrypt [d] for decrypt: ");
      mode = scanner.nextLine().toLowerCase().strip();

      if (mode.equals("e")) {
        characterShiftSetup();
        this.cipher = new Encrypt(this.shift);
        break;
      } else if (mode.equals("d")) {
        characterShiftSetup();
        this.cipher = new Decrypt(this.shift);
        break;
      }
      System.out.println("Not a valid option!");
    }
  }

  private void characterShiftSetup() {
    while (true) {
      try {
        System.out.print("Enter the number of shifts: ");
        this.shift = Integer.valueOf(scanner.nextLine());
        break;
      } catch (Exception e) {
        System.out.println("Not a valid number");
      }
    }
  }
}
