package rot;

import java.lang.StringBuilder;
import java.util.LinkedList;

public class Translator {
	private Cylinder baseCylinder = new Cylinder();
	private LinkedList<Character> baseChars = baseCylinder.readCylinder();
	private Cylinder shiftedCylinder;
	private LinkedList<Character> shiftedChars;
	
	public Translator(int rot) {
		shiftedCylinder = new Cylinder(rot);
		shiftedChars = shiftedCylinder.readCylinder();
	}
	
	public String encryptText(String text) {
		
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
	
	public String decryptText(String text) {
		return text;
	}
		
}