package StringPack;

import javax.swing.JOptionPane;

public class StringIntro {

	public static void main(String[] args) {
		
		String msg = "";
		String varWord = "Boise";
		String answer = "y";
		Boolean playing = true;
		
		//AP Question: Difference between a while and a do-while loop?
		//Do-while must run at least once - test condition is at the end
		//While can run zero or more times - test condition at start
		while (playing == true) {
		msg = "Please enter a word.";
		varWord = JOptionPane.showInputDialog(msg);
		LearnStrings getIt = new LearnStrings(varWord);
		int lengthTest = getIt.getLength();
		JOptionPane.showMessageDialog(null, "Length = " + lengthTest);
		msg = "First char is: " + getIt.getFirstLetter(); 
		JOptionPane.showMessageDialog(null, msg);
		msg = "Last char is: " + getIt.getLastLetter();
		JOptionPane.showMessageDialog(null, msg);
		msg = "Middle is: " + getIt.getMiddle();
		JOptionPane.showMessageDialog(null, msg);
		msg = "Keep playing? y/n";
		answer = JOptionPane.showInputDialog(msg);
		if (answer.equalsIgnoreCase("n")) {
			playing = false;
		}else if (answer.equalsIgnoreCase("no")) {
			playing = false;
		}else if (answer.equalsIgnoreCase("y")) {
			playing = true;
		}else if (answer.equalsIgnoreCase("yes")) {
			playing = true;
		}else {
			msg = "I don't know what you mean? Try again";
			JOptionPane.showMessageDialog(null, msg);
		}
		}
		msg = "Goodbye!";
		JOptionPane.showMessageDialog(null, msg);
		
		/*
		 * Thinking, taking notes
		 * start:
		 * index = 1 that will be the second char (remember index starts at 0)
		 * end:
		 * .length()-2
		 * 
		 * use: substring(int beginIndex, int endIndex)
		 * .substring(1, word.length()-1)
		 * 
		 * int indexOf(String str)
		 * Returns the index within this string of the first occurence of the specified specified substring
		 * 
		 * int indexOf(int ch)
		 * Returns the index within this string of the first occurrence of the specified character.	
		 * 
		 * String 	toUpperCase()
		 * Converts all of the characters in this String to upper case using the rules of the default locale.
		 * 
		 * equals(Object anObject)
		 * Compares this string to the specified object.
		 * 
		 * 
		 * equalsIgnoreCase(String anotherString)
		 * Compares this String to another String, ignoring case considerations.
		 */
	}

}
