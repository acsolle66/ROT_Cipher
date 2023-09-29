import java.util.Scanner;
import rot.cipher.Cipher;

    /**
	  * ROT CIPHER
	  * A simple script to encrypt or decrypt text with ROT cipher
	  * ROT cipher is a simple character substitution based on shift/rotation
	  * of N letters in the alphabet. One letter is replaced by another that is
	  * located N letters further in the alphabet. For more info see the link provided in the README.md
	  * The program promts the user for cipher mode, number of shifts and the text to cipher.
	  * @author		Attila Csölle
	  * @version 	1.0
      * @since		09.29.2023
	 **/
public class RotCipher {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rot;
		String mode;
		String text;
		
		// Promting user to select cipher mode
		while (true) {
			System.out.println("---CIPHER MODE---");
			System.out.println("[e] for encrypt");
			System.out.println("[d] for decrypt");
			System.out.println("-----------------");
			System.out.print("Select cipher mode: ");
			
			mode = scanner.nextLine().toLowerCase().strip();
			
			if(mode.equals("e") || mode.equals("d")) {
				break;
			}
			
			System.out.println("Not a valid option!");
			
		}
		
		// Promting user for the number of shifts
		while (true) {
			try {
				System.out.print("Enter the number of shifts: ");
				rot = Integer.valueOf(scanner.nextLine());
				break;
			}
			catch (Exception e) {
				System.out.println("  Not a valid number");
			}
		}
		
		// Promting user for the text to cipher
		System.out.println("Enter the text for cipher");
		text = scanner.nextLine();
		
		// Printing the ciphered text to the command line
		Cipher translator = new Cipher(rot, mode);
		System.out.println(translator.cipherText(text));
		
		System.out.println("Press any key to EXIT");
		String exit = scanner.nextLine();
	}
}