import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * <h1>Restaurant Midterm Project</h1>
 * 
 * @author mikojimnz
 * @version 1.0
 */

public class Restaurant extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton start;
	private JTextField cost, step;
	private JPanel welcome, frameFood, frameSides, frameDrinks, frameTotal,
			header, footer, bannerTotal, bannerMisc;
	private static int screenProgression = 0;
	private double total, taxed;
	private static ImageIcon logo, food1, food2, food3, side1, side2, side3,
			drink1, drink2, drink3;

	/**
	 * Begin Restaurant
	 * 
	 * @param args
	 *            Starting arguments.
	 */
	public static void main(String[] args) {
		logo = new ImageIcon("logo.png");
		Restaurant frame = new Restaurant();
		frame.setTitle("Panera Bread");
		frame.setSize(800, 600);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.createGUI();
		frame.setVisible(true);
	}

	/**
	 * Creates GUI
	 * <p>
	 * <ul>
	 * <li>welcome - Initial Screen
	 * <li>frameFood - main entries
	 * <li>frameSides - sides
	 * <li>frameDrinks - drinks
	 * <li>frameTotal - checkout screen
	 * <li>header - top banner
	 * <li>footer - bottom banner
	 * <li>bannerTotal - left banner
	 * <li>bannerMisc - right banner
	 * </ul>
	 * </p>
	 */
	public void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();

		window.setLayout(new BorderLayout());
		window.setBackground(new Color(255, 215, 145));

		welcome = new JPanel();
		welcome.setPreferredSize(new Dimension(getWidth(), 100));
		welcome.setBackground(new Color(255, 215, 145));
		welcome.setLayout(new GridBagLayout());
		GridBagConstraints welcomeGrid = new GridBagConstraints();
		welcomeGrid.gridx = 1;
		welcomeGrid.gridy = 1;
		welcomeGrid.gridwidth = 1;
		welcomeGrid.gridheight = 1;
		welcomeGrid.weightx = 50;
		welcomeGrid.weighty = 50;
		welcomeGrid.insets = new Insets(2, 2, 2, 2);
		welcomeGrid.anchor = GridBagConstraints.CENTER;
		welcomeGrid.fill = GridBagConstraints.NONE;

		start = new JButton("Begin New Order");
		start.addActionListener(this);
		start.setPreferredSize(new Dimension(250, 150));

		welcome.add(new JLabel(new ImageIcon("logo.png")), welcomeGrid);
		welcomeGrid.gridy = 2;
		welcome.add(start, welcomeGrid);

		frameFood = new JPanel();
		frameFood.setBackground(new Color(255, 215, 145));

		frameSides = new JPanel();
		frameSides.setBackground(new Color(255, 215, 145));

		frameDrinks = new JPanel();
		frameDrinks.setBackground(new Color(255, 215, 145));

		frameTotal = new JPanel();
		frameTotal.setBackground(new Color(255, 215, 145));

		header = new JPanel();
		header.setPreferredSize(new Dimension(getWidth(), 100));
		header.setBackground(new Color(255, 215, 145));

		footer = new JPanel();
		footer.setPreferredSize(new Dimension(getWidth(), 100));
		footer.setBackground(new Color(255, 215, 145));

		bannerTotal = new JPanel();
		bannerTotal.setPreferredSize(new Dimension(300, getHeight()));
		bannerTotal.setBackground(new Color(255, 215, 145));

		bannerMisc = new JPanel();
		bannerMisc.setPreferredSize(new Dimension(300, getHeight()));
		bannerMisc.setBackground(new Color(255, 215, 145));

		window.add(screen(), BorderLayout.CENTER);
		window.add(header, BorderLayout.NORTH);
		window.add(footer, BorderLayout.SOUTH);
		window.add(bannerTotal, BorderLayout.WEST);
		window.add(bannerMisc, BorderLayout.EAST);
	}

	private Component screen() {
		switch (screenProgression) {
			default :
				return welcome;
			case 1 :
				return frameFood;
			case 2 :
				return frameSides;
			case 3 :
				return frameDrinks;
			case 4 :
				return frameTotal;
		}
	}

	/**
	 * Called when button actions fire
	 * 
	 * @param event
	 *            Passes along source of event.
	 */
	public void actionPerformed(ActionEvent event) {
		Object button = event.getSource();
		if (button == "start") {
			//TODO
		}
	}
}
