import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Rainbiow Six: Seige Quiz");
		String Glaz = JOptionPane.showInputDialog("True or False, Glaz can see enemies through smoke.");
		if (Glaz.equalsIgnoreCase("true")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			SecondQuestion();
		}
		if (Glaz.equalsIgnoreCase("false")) {

			JOptionPane.showMessageDialog(null, "Incorrect, Glaz has a special scope that can locate enemies through any smoke, highlighting them in yellow.");
			SecondQuestion();
		}

		else {
			JOptionPane.showMessageDialog(null, "Please enter 'True' or 'False' only.");
			Glaz = JOptionPane.showInputDialog("True or False, Glaz can see enemies through smoke.");
			main(new String[] { "", "" });
		}

	}

	private static void SecondQuestion() {
		String Fuze = JOptionPane.showInputDialog("True or False, Castle Barricades can be cluster charged by Fuze");
		if (Fuze.equalsIgnoreCase("false")) {
			JOptionPane.showMessageDialog(null,
					"Incorrect Castle barricades CAN be fuzed.\nThat's why you dont want to castle where your team would be susceptible to cluster charges");
			// TODO Auto-generated method stub

		}
	}
}