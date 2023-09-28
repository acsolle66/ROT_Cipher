import java.util.Scanner;
import rot.Translator;


class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rot;
		String mode;
		String text;
		
		// Promting user to select cipher mode
		while (true) {
			System.out.println("Select cipher mode  ");
			System.out.println("[e] for encrypt");
			System.out.println("[d] for decrypt");
			System.out.println("-----------------");
			System.out.print("Type in your choice: ");
			
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
		Translator translation = new Translator(rot);
		
		if (mode.equals("e")) {
			System.out.println("Enter the text for encryption");
			text = scanner.nextLine();
			System.out.println(translation.encryptText(text));
		} else {
			System.out.println("Enter the text for decryption");
			text = scanner.nextLine();
			System.out.println(translation.decryptText(text));
		}
		
		System.out.println("Press any key to EXIT");
		String exit = scanner.nextLine();

	}
}