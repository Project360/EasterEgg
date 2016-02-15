//package View;

import javax.swing.JOptionPane;

/**
 * This object represents an Easter Egg being triggered.
 * 
 * @author Sara Vandandaigue, Minyahil Kebebgn, Vinh Tran, Gring Mustafa
 * @version 2/12/2016
 *
 */
public class EasterEgg {
	
	/*
	 *  An array for Project360's team member names
	 */
	private String[] myNames = {"Sara Vandandaigue",	// Sara
						"",	// Min - **add your name in here
						"", // Vinh
						""};// Gring
	
	/*
	 * An array for the nickname or comment of each team member.
	 * The index relates to the index of myNames.
	 */
	private String[] myNicknameComment = {"I was born in Singapore.", // Sara
						"",	 // Min
						"",  // Vinh
						""}; // Gring
	
	/* 
	 * Main entry point to this program.
	 */
	public static void main(String[] args) {
		EasterEgg egg = new EasterEgg();
		egg.triggerEasterEgg();
	}
	
	/*
	 * Triggers an Easter Egg which is displayed as a JOptionPane.
	 * The message displays information about our team.
	 */
	private void triggerEasterEgg() {
		JOptionPane.showMessageDialog(null, getDialogMessage(), 
				"We Are...", JOptionPane.INFORMATION_MESSAGE);
	}

	/*
	 * A string with the team name and each team member's name and a comment.
	 * Each team member and their comment or nickname will be on a separate line.
	 * Pre-condition:
	 * Post-condition: The string will not be null
	 */
	public String getDialogMessage() {
		StringBuilder in = new StringBuilder();
		in.append("We Are Project360");
		
		for (int i = 0; i < myNames.length; i++) {
			
			// If the name has been filled in, display on a new line
			if (!myNames[i].equals("")) {
				in.append("\n" + myNames[i]);
				
				// display nickname/comment if not empty
				if (!myNicknameComment[i].equals(""))
					in.append(", " + myNicknameComment [i]);
			}
		}
		
		return in.toString();
	}
}