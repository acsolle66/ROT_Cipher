package rot.cipher;
import java.lang.StringBuilder;
import java.util.LinkedList;

public class Cipher {
	private Cylinder baseCylinder;
	private LinkedList<Character> baseChars;
	private Cylinder shiftedCylinder;
	private LinkedList<Character> shiftedChars;
	
	public Cipher(int rot, String mode) {
		if (mode.equals("e")) {
			baseCylinder = new Cylinder();
			baseChars = baseCylinder.readCylinderCharset();
			shiftedCylinder = new Cylinder(rot);
			shiftedChars = shiftedCylinder.readCylinderCharset();	
		} else {
			baseCylinder = new Cylinder(rot);
			baseChars = baseCylinder.readCylinderCharset();
			shiftedCylinder = new Cylinder();
			shiftedChars = shiftedCylinder.readCylinderCharset();	
		}
	}
	
	public String cipherText(String text) {
		
		char[] letters = text.toLowerCase().toCharArray();
		int index = 0;
		int end = letters.length;
		StringBuilder shiftedText = new StringBuilder();
		
		while (index < end) {
			int baseCharIndex = baseChars.indexOf(letters[index]);
			char shiftedChar;
			if (baseCharIndex >= 0) {
				shiftedChar = shiftedChars.get(baseCharIndex);
				shiftedText.append(shiftedChar);
			}	
			index ++;
		}
		return shiftedText.toString();
	}		
}