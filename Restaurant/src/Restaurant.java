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
	private JButton start, next, back, cancel, sandwhichAdd, saladAdd, grilledCheeseAdd, bageAdd, pastryAdd, soupAdd,
			sodaAdd, latteAdd, smoothieAdd, sandwhichSub, saladSub, grilledCheeseSub, bageSubl, pastrySub, soupSub,
			sodaSub, latteSub, smoothieSub;
	private JLabel author, cost, tax, step, title, costTitle, taxTitle, sandwhichName, saladName, grilledCheeseName,
			bagelName, pastryName, soupName, sodaName, latteName, smoothieName, sandwhichNum, saladNum,
			grilledCheeseNum, bagelNum, pastryNum, soupNum, sodaNum, latteNum, smoothieNum;
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
		back = new JButton("Go Back");
		bageAdd = new JButton("+");
		bageSubl = new JButton("-");
		bannerOrder = new JPanel();
		bannerTotal = new JPanel();
		cancel = new JButton("Cancel Order");
		center = new JPanel();
		cost = new JLabel();
		costTitle = new JLabel();
		footer = new JPanel();
		frameDrinks = new JPanel();
		frameFood = new JPanel();
		frameSides = new JPanel();
		frameTotal = new JPanel();
		grilledCheeseAdd = new JButton("+");
		grilledCheeseSub = new JButton("-");
		header = new JPanel();
		latteAdd = new JButton("+");
		latteSub = new JButton("-");
		next = new JButton("Continue");
		pastryAdd = new JButton("+");
		pastrySub = new JButton("-");
		saladAdd = new JButton("+");
		saladSub = new JButton("-");
		sandwhichAdd = new JButton("+");
		sandwhichSub = new JButton("-");
		smoothieAdd = new JButton("+");
		smoothieSub = new JButton("-");
		sodaAdd = new JButton("+");
		sodaSub = new JButton("-");
		soupAdd = new JButton("+");
		soupSub = new JButton("-");
		start = new JButton("Begin New Order");
		step = new JLabel();
		tax = new JLabel();
		taxTitle = new JLabel();
		title = new JLabel("");
		welcome = new JPanel();
		sandwhichName = new JLabel("Chipotle Chicken Avacado Melt");
		saladName = new JLabel("Thai Garden Chicken Wonton Bowl");
		grilledCheeseName = new JLabel("Classic Grilled Cheese");
		bagelName = new JLabel("Plain Bagel");
		pastryName = new JLabel("Cherry Pastry");
		soupName = new JLabel("Bistro French Onion Soup");
		sodaName = new JLabel("Soda");
		latteName = new JLabel("Pumpkin Spice Latte");
		smoothieName = new JLabel("Superfruit Smoothie");
		sandwhichNum = new JLabel("0");
		saladNum = new JLabel("0");
		grilledCheeseNum = new JLabel("0");
		bagelNum = new JLabel("0");
		pastryNum = new JLabel("0");
		soupNum = new JLabel("0");
		sodaNum = new JLabel("0");
		latteNum = new JLabel("0");
		smoothieNum = new JLabel("0");

		/** Define preferred size of components */

		welcome.setPreferredSize(new Dimension(getWidth(), 100));
		bannerOrder.setPreferredSize(new Dimension(300, getHeight()));
		bannerTotal.setPreferredSize(new Dimension(300, getHeight()));
		footer.setPreferredSize(new Dimension(getWidth(), 100));
		header.setPreferredSize(new Dimension(getWidth(), 100));
		start.setPreferredSize(new Dimension(250, 150));

		/** Set color of components */
		window.setLayout(new BorderLayout());
		back.setBackground(new Color(92, 114, 50));
		bannerOrder.setBackground(new Color(255, 215, 145));
		bannerTotal.setBackground(new Color(255, 215, 145));
		cancel.setBackground(new Color(150, 54, 32));
		footer.setBackground(new Color(255, 215, 145));
		frameDrinks.setBackground(new Color(255, 215, 145));
		frameFood.setBackground(new Color(255, 215, 145));
		frameSides.setBackground(new Color(255, 215, 145));
		frameTotal.setBackground(new Color(255, 215, 145));
		header.setBackground(new Color(255, 215, 145));
		next.setBackground(new Color(92, 114, 50));
		start.setBackground(new Color(92, 114, 50));
		welcome.setBackground(new Color(255, 215, 145));
		sandwhichAdd.setBackground(new Color(92, 114, 50));
		saladAdd.setBackground(new Color(92, 114, 50));
		grilledCheeseAdd.setBackground(new Color(92, 114, 50));
		sandwhichSub.setBackground(new Color(150, 54, 32));
		saladSub.setBackground(new Color(150, 54, 32));
		grilledCheeseSub.setBackground(new Color(150, 54, 32));

		/** Set LayoutManager of JPanels */
		window.setBackground(new Color(255, 215, 145));
		welcome.setLayout(new GridBagLayout());
		center.setLayout(new CardLayout());
		frameFood.setLayout(new GridBagLayout());
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

		/** Define frameFood panel GridBagConstraint properties */
		GridBagConstraints foodGrid = new GridBagConstraints();
		foodGrid.gridx = 1;
		foodGrid.gridy = 1;
		foodGrid.gridwidth = 1;
		foodGrid.gridheight = 1;
		foodGrid.weightx = 50;
		foodGrid.weighty = 50;
		foodGrid.insets = new Insets(2, 2, 2, 2);
		foodGrid.anchor = GridBagConstraints.CENTER;
		foodGrid.fill = GridBagConstraints.NONE;

		/** Define frameSides panel GridBagConstraint properties */
		GridBagConstraints sideGrid = new GridBagConstraints();
		sideGrid.gridx = 1;
		sideGrid.gridy = 1;
		sideGrid.gridwidth = 1;
		sideGrid.gridheight = 1;
		sideGrid.weightx = 50;
		sideGrid.weighty = 50;
		sideGrid.insets = new Insets(2, 2, 2, 2);
		sideGrid.anchor = GridBagConstraints.CENTER;
		sideGrid.fill = GridBagConstraints.NONE;

		/** Define frameDrinks panel GridBagConstraint properties */
		GridBagConstraints drinkGrid = new GridBagConstraints();
		drinkGrid.gridx = 1;
		drinkGrid.gridy = 1;
		drinkGrid.gridwidth = 1;
		drinkGrid.gridheight = 1;
		drinkGrid.weightx = 50;
		drinkGrid.weighty = 50;
		drinkGrid.insets = new Insets(2, 2, 2, 2);
		drinkGrid.anchor = GridBagConstraints.CENTER;
		drinkGrid.fill = GridBagConstraints.NONE;

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

		/** Define sandwhichAdd button properties */
		sandwhichAdd.setFont(new Font("Arial", Font.BOLD, 25));
		sandwhichAdd.setForeground(Color.white);
		sandwhichAdd.setOpaque(true);
		sandwhichAdd.setContentAreaFilled(true);
		sandwhichAdd.setBorderPainted(false);
		sandwhichAdd.addActionListener(this);

		/** Define saladAdd button properties */
		saladAdd.setFont(new Font("Arial", Font.BOLD, 25));
		saladAdd.setForeground(Color.white);
		saladAdd.setOpaque(true);
		saladAdd.setContentAreaFilled(true);
		saladAdd.setBorderPainted(false);
		saladAdd.addActionListener(this);

		/** Define grilledCheeseAdd button properties */
		grilledCheeseAdd.setFont(new Font("Arial", Font.BOLD, 25));
		grilledCheeseAdd.setForeground(Color.white);
		grilledCheeseAdd.setOpaque(true);
		grilledCheeseAdd.setContentAreaFilled(true);
		grilledCheeseAdd.setBorderPainted(false);
		grilledCheeseAdd.addActionListener(this);

		/** Define sandwhichSub button properties */
		sandwhichSub.setFont(new Font("Arial", Font.BOLD, 25));
		sandwhichSub.setForeground(Color.white);
		sandwhichSub.setOpaque(true);
		sandwhichSub.setContentAreaFilled(true);
		sandwhichSub.setBorderPainted(false);
		sandwhichSub.addActionListener(this);

		/** Define saladSub button properties */
		saladSub.setFont(new Font("Arial", Font.BOLD, 25));
		saladSub.setForeground(Color.white);
		saladSub.setOpaque(true);
		saladSub.setContentAreaFilled(true);
		saladSub.setBorderPainted(false);
		saladSub.addActionListener(this);

		/** Define grilledCheeseSub button properties */
		grilledCheeseSub.setFont(new Font("Arial", Font.BOLD, 25));
		grilledCheeseSub.setForeground(Color.white);
		grilledCheeseSub.setOpaque(true);
		grilledCheeseSub.setContentAreaFilled(true);
		grilledCheeseSub.setBorderPainted(false);
		grilledCheeseSub.addActionListener(this);

		/** Define JLabel Fonts */
		author.setFont(new Font("Arial", Font.BOLD, 20));
		title.setFont(new Font("Arial", Font.BOLD, 35));
		step.setFont(new Font("Arial", Font.BOLD, 30));
		costTitle.setFont(new Font("Arial", Font.BOLD, 30));
		cost.setFont(new Font("Arial", Font.BOLD, 30));
		taxTitle.setFont(new Font("Arial", Font.BOLD, 30));
		tax.setFont(new Font("Arial", Font.BOLD, 30));
		sandwhichName.setFont(new Font("Arial", Font.BOLD, 25));
		saladName.setFont(new Font("Arial", Font.BOLD, 25));
		grilledCheeseName.setFont(new Font("Arial", Font.BOLD, 25));
		bagelName.setFont(new Font("Arial", Font.BOLD, 25));
		pastryName.setFont(new Font("Arial", Font.BOLD, 25));
		soupName.setFont(new Font("Arial", Font.BOLD, 25));
		sodaName.setFont(new Font("Arial", Font.BOLD, 25));
		latteName.setFont(new Font("Arial", Font.BOLD, 25));
		smoothieName.setFont(new Font("Arial", Font.BOLD, 25));
		sandwhichNum.setFont(new Font("Arial", Font.BOLD, 25));
		saladNum.setFont(new Font("Arial", Font.BOLD, 25));
		grilledCheeseNum.setFont(new Font("Arial", Font.BOLD, 25));
		bagelNum.setFont(new Font("Arial", Font.BOLD, 25));
		pastryNum.setFont(new Font("Arial", Font.BOLD, 25));
		soupNum.setFont(new Font("Arial", Font.BOLD, 25));
		sodaNum.setFont(new Font("Arial", Font.BOLD, 25));
		latteNum.setFont(new Font("Arial", Font.BOLD, 25));
		smoothieNum.setFont(new Font("Arial", Font.BOLD, 25));

		/** Begin adding compnents to the JPanels */
		welcome.add(new JLabel(new ImageIcon("logo.png")), welcomeGrid);
		welcomeGrid.gridy = 2;
		welcome.add(author, welcomeGrid);
		welcomeGrid.gridy = 3;
		welcome.add(start, welcomeGrid);

		frameFood.add(new JLabel(new ImageIcon("chipotle-chicken.jpg")), foodGrid);
		foodGrid.gridx = 2;
		frameFood.add(new JLabel(new ImageIcon("garden-chicken-wonton.jpg")), foodGrid);
		foodGrid.gridx = 3;
		frameFood.add(new JLabel(new ImageIcon("grilled-cheese.jpg")), foodGrid);
		foodGrid.gridx = 1;
		foodGrid.gridy = 2;
		frameFood.add(sandwhichName, foodGrid);
		foodGrid.gridx = 2;
		frameFood.add(saladName, foodGrid);
		foodGrid.gridx = 3;
		frameFood.add(grilledCheeseName, foodGrid);
		foodGrid.gridx = 1;
		foodGrid.gridy = 3;
		frameFood.add(sandwhichAdd, foodGrid);
		foodGrid.gridx = 2;
		frameFood.add(saladAdd, foodGrid);
		foodGrid.gridx = 3;
		frameFood.add(grilledCheeseAdd, foodGrid);
		foodGrid.gridx = 1;
		foodGrid.gridy = 4;
		frameFood.add(sandwhichNum, foodGrid);
		foodGrid.gridx = 2;
		frameFood.add(saladNum, foodGrid);
		foodGrid.gridx = 3;
		frameFood.add(grilledCheeseNum, foodGrid);
		foodGrid.gridx = 1;
		foodGrid.gridy = 5;
		frameFood.add(sandwhichSub, foodGrid);
		foodGrid.gridx = 2;
		frameFood.add(saladSub, foodGrid);
		foodGrid.gridx = 3;
		frameFood.add(grilledCheeseSub, foodGrid);

		header.add(title);

		footer.add(back, footerGrid);
		footerGrid.gridx = 2;
		footer.add(step, footerGrid);
		footerGrid.gridx = 3;
		footer.add(next, footerGrid);

		bannerTotal.add(costTitle);
		bannerTotal.add(cost);
		bannerTotal.add(taxTitle);
		bannerTotal.add(tax);
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
	 * <li>start - Begin new order
	 * <li>next - Advances to next frame;
	 * <li>back - Goes back one frame;
	 * <li>cancel - clears data and starts from welcome splash
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
			taxTitle.setText("With Tax");
			tax.setText("$" + taxed);
			step.setText(" Step 1 of 4 ");
			next.setVisible(true);
			back.setVisible(true);
			cancel.setVisible(true);
			frame++;
		}

		if (e.getSource() == next) {
			switch (frame) {
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
				next.setText("New Order");
				break;
			case 4:
				cancel.doClick();
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
				taxTitle.setText("");
				tax.setText("");
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
				next.setText("Continue");
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
			taxTitle.setText("");
			tax.setText("");
			step.setText("");
			next.setVisible(false);
			back.setVisible(false);
			cancel.setVisible(false);
		}
	}
}
