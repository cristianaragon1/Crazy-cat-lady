import javax.swing.JOptionPane;

public class TheRiddler {
	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddleone = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddleone.equals("a stamp")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score= score + 1;
} else {
	JOptionPane.showMessageDialog(null, "Wrong! The answer was a stamp!");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String riddletwo = JOptionPane.showInputDialog("What kind of tree can you carry in your hand?");
if (riddletwo.equals("a palm")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score= score + 1;
} else {
	JOptionPane.showMessageDialog(null, "Wrong! The answer was a palm!");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your final score is "+ score);
	}
}
