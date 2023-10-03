import java.util.Scanner;
import rot.cipher.*;

public class RotCipherApp {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Cipher cipher;
    int shift;
    String mode;
    String plainText;

    // Promting user to select cipher mode
    while (true) {
      System.out.println("---CIPHER MODE---");
      System.out.println("[e] for encrypt");
      System.out.println("[d] for decrypt");
      System.out.println("-----------------");
      System.out.print("Select cipher mode: ");

      mode = scanner.nextLine().toLowerCase().strip();

      if (mode.equals("e") || mode.equals("d")) {
        break;
      }

      System.out.println("Not a valid option!");
    }

    // Promting user for the number of shifts
    while (true) {
      try {
        System.out.print("Enter the number of shifts: ");
        shift = Integer.valueOf(scanner.nextLine());
        break;
      } catch (Exception e) {
        System.out.println("  Not a valid number");
      }
    }

    // Promting user for the text to cipher
    System.out.println("Enter the text for cipher");
    plainText = scanner.nextLine();

    if (mode.equals("e")) {
      cipher = new Encrypt(shift);
      cipher.Translate(plainText);
      System.out.println(cipher.getTranslatedText());

    } else {
      cipher = new Decrypt(shift);
      cipher.Translate(plainText);
      System.out.println(cipher.getTranslatedText());
    }

    System.out.println("Press any key to EXIT");
    String exit = scanner.nextLine();
  }
}
