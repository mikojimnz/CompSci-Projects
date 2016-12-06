import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;

/**
 * <h1>Restaurant Midterm Project</h1>
 * 
 * @author mikojimnz
 * @version 1.0
 */
public class Restaurant extends JFrame implements ActionListener {
	/** Initiates Variables */
	private static final long serialVersionUID = 1L;
	private JButton start, next, back, cancel;
	private JLabel author, cost, tax, step, title, costTitle, taxTitle;
	private JPanel center, welcome, frameFood, frameSides, frameDrinks, frameTotal, header, footer, bannerTotal,
			bannerOrder;
	private double total, taxed;
	private int frame = 0;
	private static ImageIcon sandwhich, salad, grilledCheese, bagel, pastry, soup, soda, latte, smoothie;

	/**
	 * Begin Restaurant and define {@link ImageIcon ImageIcons}.
	 * 
	 * @param args
	 *            Starting arguments.
	 */
	public static void main(String[] args) {
		sandwhich = new ImageIcon("chipotle-chicken.jpg");
		salad = new ImageIcon("garden-chicken-wonton.jpg");
		grilledCheese = new ImageIcon("grilled-cheese.jpg");
		bagel = new ImageIcon("bagel.jpg");
		pastry = new ImageIcon("cherry-pastry.jpg");
		soup = new ImageIcon("french-onion.jpg");
		soda = new ImageIcon("pepsi.jpg");
		latte = new ImageIcon("pumpkin-spice.jpg");
		smoothie = new ImageIcon("superfrui-smoothie.jpg");

		Restaurant frame = new Restaurant();
		frame.setTitle("Panera Bread");
		frame.setSize(800, 600);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.createGUI();
		frame.setVisible(true);
	}

	/**
	 * Creates GUI
	 * <ul>
	 * <li>welcome - Initial Screen
	 * <li>frameFood - main entries
	 * <li>frameSides - sides
	 * <li>frameDrinks - drinks
	 * <li>frameTotal - checkout screen
	 * <li>header - top banner
	 * <li>footer - bottom banner
	 * <li>bannerTotal - left banner
	 * <li>bannerOrder - right banner
	 * </ul>
	 */
	public void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();

		/** Initalize SWING components */
		author = new JLabel("Programmed by Miko Jimenez");
		welcome = new JPanel();
		start = new JButton("Begin New Order");
		next = new JButton("Continue");
		back = new JButton("Go Back");
		frameFood = new JPanel();
		frameSides = new JPanel();
		frameDrinks = new JPanel();
		frameTotal = new JPanel();
		center = new JPanel();
		title = new JLabel("");
		header = new JPanel();
		footer = new JPanel();
		bannerTotal = new JPanel();
		bannerOrder = new JPanel();
		costTitle = new JLabel();
		cost = new JLabel();
		tax = new JLabel();
		step = new JLabel();
		cancel = new JButton("Cancel Order");

		/** Define preferred size of components */
		window.setBackground(new Color(255, 215, 145));
		welcome.setPreferredSize(new Dimension(getWidth(), 100));
		start.setPreferredSize(new Dimension(250, 150));
		header.setPreferredSize(new Dimension(getWidth(), 100));
		footer.setPreferredSize(new Dimension(getWidth(), 100));
		bannerTotal.setPreferredSize(new Dimension(300, getHeight()));
		bannerOrder.setPreferredSize(new Dimension(300, getHeight()));

		/** Set color of components */
		window.setLayout(new BorderLayout());
		welcome.setBackground(new Color(255, 215, 145));
		start.setBackground(new Color(92, 114, 50));
		next.setBackground(new Color(92, 114, 50));
		back.setBackground(new Color(92, 114, 50));
		frameFood.setBackground(new Color(255, 215, 145));
		frameSides.setBackground(new Color(255, 215, 145));
		frameDrinks.setBackground(new Color(255, 215, 145));
		frameTotal.setBackground(new Color(255, 215, 145));
		header.setBackground(new Color(255, 215, 145));
		footer.setBackground(new Color(255, 215, 145));
		bannerTotal.setBackground(new Color(255, 215, 145));
		bannerOrder.setBackground(new Color(255, 215, 145));
		cancel.setBackground(new Color(150, 54, 32));

		/** Set LayoutManager of JPanels */
		welcome.setLayout(new GridBagLayout());
		center.setLayout(new CardLayout());
		footer.setLayout(new GridBagLayout());

		/** Define welcome panel GridBagConstraint properties */
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
		
		/** Define footer panel GridBagConstraint properties */
		GridBagConstraints footerGrid = new GridBagConstraints();
		footerGrid.gridx = 1;
		footerGrid.gridy = 1;
		footerGrid.gridwidth = 1;
		footerGrid.gridheight = 1;
		footerGrid.weightx = 50;
		footerGrid.weighty = 50;
		footerGrid.insets = new Insets(2, 2, 2, 2);
		footerGrid.anchor = GridBagConstraints.CENTER;
		footerGrid.fill = GridBagConstraints.NONE;

		/** Define start button properties */
		start.setFont(new Font("Arial", Font.BOLD, 25));
		start.setForeground(Color.white);
		start.setOpaque(true);
		start.setContentAreaFilled(true);
		start.setBorderPainted(false);
		start.addActionListener(this);

		/** Define next button properties */
		next.setFont(new Font("Arial", Font.BOLD, 25));
		next.setForeground(Color.white);
		next.setOpaque(true);
		next.setContentAreaFilled(true);
		next.setBorderPainted(false);
		next.addActionListener(this);
		next.setVisible(false);

		/** Define stop button properties */
		back.setFont(new Font("Arial", Font.BOLD, 25));
		back.setForeground(Color.white);
		back.setOpaque(true);
		back.setContentAreaFilled(true);
		back.setBorderPainted(false);
		back.addActionListener(this);
		back.setVisible(false);
		
		/** Define cancel button properties */
		cancel.setFont(new Font("Arial", Font.BOLD, 25));
		cancel.setForeground(Color.white);
		cancel.setOpaque(true);
		cancel.setContentAreaFilled(true);
		cancel.setBorderPainted(false);
		cancel.addActionListener(this);
		cancel.setVisible(false);

		/** Define author properties */
		author.setFont(new Font("Arial", Font.BOLD, 20));
		
		/** Define title properties */
		title.setFont(new Font("Arial", Font.BOLD, 35));
		
		/** Define step properties */
		step.setFont(new Font("Arial", Font.BOLD, 30));

		/** Defines costTitle Properties */
		costTitle.setFont(new Font("Arial", Font.BOLD, 30));

		/** Defines cost Properties */
		cost.setFont(new Font("Arial", Font.BOLD, 30));

		/** Begin adding compnents to the JPanels */
		welcome.add(new JLabel(new ImageIcon("logo.png")), welcomeGrid);
		welcomeGrid.gridy = 2;
		welcome.add(author, welcomeGrid);
		welcomeGrid.gridy = 3;
		welcome.add(start, welcomeGrid);

		header.add(title);

		footer.add(back, footerGrid);
		footerGrid.gridx = 2;
		footer.add(step, footerGrid);
		footerGrid.gridx = 3;
		footer.add(next, footerGrid);

		bannerTotal.add(costTitle);
		bannerTotal.add(cost);
		bannerTotal.add(cancel);

		center.add(welcome);
		center.add(frameFood);
		center.add(frameSides);
		center.add(frameDrinks);
		center.add(frameTotal);

		/** Begin adding JPanels to the main window */
		window.add(center, BorderLayout.CENTER);
		window.add(header, BorderLayout.NORTH);
		window.add(footer, BorderLayout.SOUTH);
		window.add(bannerTotal, BorderLayout.WEST);
		window.add(bannerOrder, BorderLayout.EAST);
	}

	/**
	 * Called when button actions fire Source:
	 * <ul>
	 * <li> start - Begin new order
	 * <li> next - Advances to next frame;
	 * <li> back - Goes back one frame;
	 * <li> cancel - clears data and starts from welcome splash
	 * </ul>
	 * 
	 * @param e
	 *            Passes along source of event.
	 */
	public void actionPerformed(ActionEvent e) {
		CardLayout cardLayout = (CardLayout) center.getLayout();

		if (e.getSource() == start) {
			cardLayout.next(center);
			total = 0.0;
			taxed = 0.0;
			title.setText("Choose Your Entrées");
			costTitle.setText("Your Total Is:");
			cost.setText("$" + total);
			step.setText(" Step 1 of 4 ");
			next.setVisible(true);
			back.setVisible(true);
			cancel.setVisible(true);
			frame++;
		}

		if (e.getSource() == next) {
			switch (frame) {
			case 0:
				frame++;
				cardLayout.next(center);
				title.setText("Choose Your Entrées");
				step.setText(" Step 1 of 4 ");
				break;
			case 1:
				cardLayout.next(center);
				frame++;
				title.setText("Choose Your Sides");
				step.setText(" Step 2 of 4 ");
				break;
			case 2:
				cardLayout.next(center);
				frame++;
				title.setText("Choose Your Drinks");
				step.setText(" Step 3 of 4 ");
				break;
			case 3:
				cardLayout.next(center);
				frame++;
				title.setText("Checkout");
				step.setText(" Step 4 of 4 ");
				break;
			case 4:
				break;
			}
		}

		if (e.getSource() == back) {
			switch (frame) {
			case 0:
				break;
			case 1:
				cardLayout.previous(center);
				frame--;
				title.setText("");
				costTitle.setText("");
				cost.setText("");
				step.setText("");
				next.setVisible(false);
				back.setVisible(false);
				cancel.setVisible(false);
				break;
			case 2:
				frame--;
				cardLayout.previous(center);
				title.setText("Choose Your Entrées");
				step.setText(" Step 1 of 4 ");
				break;
			case 3:
				frame--;
				cardLayout.previous(center);
				title.setText("Choose Your Sides");
				step.setText(" Step 2 of 4 ");
				break;
			case 4:
				frame--;
				cardLayout.previous(center);
				title.setText("Choose Your Drinks");
				step.setText(" Step 3 of 4 ");
				break;
			}
		}
		
		if (e.getSource() == cancel) {
			cardLayout.first(center);
			frame = 0;
			total = 0.0;
			taxed = 0.0;
			title.setText("");
			costTitle.setText("");
			cost.setText("");
			step.setText("");
			next.setVisible(false);
			back.setVisible(false);
			cancel.setVisible(false);
		}
	}
}