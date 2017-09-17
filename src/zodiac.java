import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.print.attribute.standard.JobPriority;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class zodiac {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the totally not bs horoscope :)");
		ImageIcon icon = new ImageIcon(zodiac.class.getResource("image.png"));
		JOptionPane.showMessageDialog(null, "Please find which Zodiac sign you are and write it down", "Blah", JOptionPane.INFORMATION_MESSAGE, icon);

		String month = JOptionPane.showInputDialog("Please enter your Zodiac Sign form the slide before");
		if (month.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "You will breathe air today, and it will be good.");
		}
		if (month.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "You will pet an imaginary dog today, and it will be good.");
		}
		if (month.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "You will eat food today, and it will be good.");
		}
		if (month.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "You will smell a nice smell, and it will be good.");
		}
		if (month.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "You will finish reading this sentence; and it will be good.");
		}
		if (month.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "You will not realize how much effort thsi took, and it will be good.");
		}
		if (month.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "You will sneeze today, and it will be good.");
		} else {
			JOptionPane.showMessageDialog(null, "Please enter a correct Zodiac Sign");
		
		}
	}
	}

