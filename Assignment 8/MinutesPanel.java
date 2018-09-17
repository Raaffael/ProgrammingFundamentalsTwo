import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinutesPanel extends JFrame {
	private JLabel minutesLabel = new JLabel("Enter the number of minutes of the call: ");
	private JTextField minutesTextField = new JTextField(10);
	private JButton calcButton = new JButton("Calculate");
	private final int WINDOW_HEIGHT = 120;
	private final int WINDOW_WIDTH = 400;
	private double chargeRate;
	
	public MinutesPanel(double chargeRate) {
		this.chargeRate = chargeRate;
		setTitle("Minute Entry");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calcButton.addActionListener(new MinButtonListener());
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(minutesLabel);
		add(minutesTextField);
		add(calcButton);
		setVisible(true);
	}
	private class MinButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String input = minutesTextField.getText();
			Double charge = Double.parseDouble(input) * chargeRate;
			Double formatCharge = (int)Math.round(charge*100)/(double)100;
			JOptionPane.showMessageDialog(null, "Charge for call: $" + formatCharge);
		}
	}
}
