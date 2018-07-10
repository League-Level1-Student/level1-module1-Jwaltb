import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame("BinaryConverter");
	JPanel panel = new JPanel();
	JTextField textfield = new JTextField(20);
	JLabel label = new JLabel();
	JButton button = new JButton("Convert");

	public static void main(String[] args) {
		new BinaryConverter().createUI();
	}

	void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(textfield);
		panel.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		textfield.setText(convertString(textfield.getText()));

	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}

	}

	String convertString(String s) {
		String output = "";
		for (int i = 0; i < s.length(); i += 9) {
			output += convert(s.substring(i, i + 8));
		}
		return output;
	}
}
