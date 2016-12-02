import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 *  Restaurant Midterm Project
 *  <p>by mikojimnz</p>
 * @author  mikojimnz
 * @version 1.0
 * @since   2016-12-02
 */
class Restaurant extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JTextField cost, step;
	private static int screenProgression = 0;
	private double total, taxed;
	private ImageIcon food1, food2, food3, side1, side2, side3, drink1, drink2,
			drink3;

	/**
	 * Begin Restaurant
	 * 
	 * <p> Determines restaurant progression and draws GUIs </p>
	 */
	public static void main(String[] args) {
		Restaurant frame = new Restaurant();
		frame.setSize(800, 600);
		frame.createGUI();
		frame.setVisible(true);
	}

	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();

	}

	public void actionPerformed(ActionEvent event) {
		Object button = event.getSource();
	}
}
