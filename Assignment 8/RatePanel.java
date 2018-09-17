import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RatePanel extends JFrame{
	private JLabel dayRate = new JLabel("$0.07/min");
	private JLabel eveRate = new JLabel("$0.12/min");
	private JLabel ofpRate = new JLabel("$0.05/min");
	private JButton dayButton = new JButton("Daytime (6:00 A.M. through 5:59 P.M.)   ");
	private JButton eveButton = new JButton("Evening (6:00 P.M. through 11:59 P.M.)  ");
	private JButton ofpButton = new JButton("Off-Peak (12:00 A.M. through 5:59 A.M.)");
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 135;
	
	public RatePanel() {
		setTitle("Long Distance Calls");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		dayButton.addActionListener(new RateButtonListener());
		eveButton.addActionListener(new RateButtonListener());
		ofpButton.addActionListener(new RateButtonListener());
		setLayout(new FlowLayout());
		
		
		add(dayButton);
		add(dayRate);
		add(eveButton);
		add(eveRate);
		add(ofpButton);
		add(ofpRate);
	
		setVisible(true);
	}
	
	private class RateButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == dayButton) {
				new MinutesPanel(.07);
			}
			else if(e.getSource() == eveButton) {
				new MinutesPanel(.12);
			}
			else if(e.getSource() == ofpButton) {
				new MinutesPanel(.05);
			}
			setVisible(false);
		}
	}

}
