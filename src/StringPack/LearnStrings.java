package StringPack;

import javax.swing.JOptionPane;

public class LearnStrings {
	
	private String word = "";

	public LearnStrings(String s) {
		
		setString(s);
		
	}//end of constructor
	
	public void setString(String s) {
		
		word = s;
		//System.out.println("String entered is: " + word);
		String msg = "String entered is: " + word;
		JOptionPane.showMessageDialog(null, msg);
		
	}//end method setString
	
	public char getFirstLetter() {
		
		return word.charAt(0);
		
	}//end of method getFirstLetter
	
	public char getLastLetter() {
		
		return word.charAt(getLength()-1);
		
	}//end of method getLastLetter

	public String getMiddle() {
		
		return word.substring(1, word.length()-1);
		
	}
	//Setters -- purpose is to control setting vars
	//Another name is "modifier" methods and "mutator" methods
	
	//Getter -- purpose is tyo retrieve vars also in a controlled way
	//another name is "accessor" method
	
	public int getLength() {
		
		return word.length();
		
	}//end of method getLength
	
}//end of class LearnStrings
