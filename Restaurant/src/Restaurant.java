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
	private JButton start, next, back, cancel, sandwhichAdd, saladAdd,
			grilledCheeseAdd, bagelAdd, pastryAdd, soupAdd, sodaAdd, latteAdd,
			smoothieAdd, sandwhichSub, saladSub, grilledCheeseSub, bagelSub,
			pastrySub, soupSub, sodaSub, latteSub, smoothieSub;
	private JLabel author, cost, tax, step, title, costTitle, taxTitle,
			sandwhichName, saladName, grilledCheeseName, bagelName, pastryName,
			soupName, sodaName, latteName, smoothieName, sandwhichNum,
			saladNum, grilledCheeseNum, bagelNum, pastryNum, soupNum, sodaNum,
			latteNum, smoothieNum;
	private JPanel center, welcome, frameFood, frameSides, frameDrinks,
			frameTotal, header, footer, bannerTotal, bannerOrder;
	private double total, taxed;
	private int frame = 0, sandwhichOrder = 0, saladOrder = 0,
			grilledCheeseOrder = 0, bagelOrder = 0, pastryOrder = 0,
			soupOrder = 0, sodaOrder = 0, latteOrder = 0, smoothieOrder = 0;

	/**
	 * Begin Restaurant and define {@link ImageIcon ImageIcons}.
	 * 
	 * @param args
	 *            Starting arguments.
	 */
	public static void main(String[] args) {

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
		bagelAdd = new JButton("+");
		bagelSub = new JButton("-");
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
		bagelAdd.setBackground(new Color(92, 114, 50));
		pastryAdd.setBackground(new Color(92, 114, 50));
		soupAdd.setBackground(new Color(92, 114, 50));
		bagelSub.setBackground(new Color(150, 54, 32));
		pastrySub.setBackground(new Color(150, 54, 32));
		soupSub.setBackground(new Color(150, 54, 32));
		sodaAdd.setBackground(new Color(92, 114, 50));
		latteAdd.setBackground(new Color(92, 114, 50));
		smoothieAdd.setBackground(new Color(92, 114, 50));
		sodaSub.setBackground(new Color(150, 54, 32));
		latteSub.setBackground(new Color(150, 54, 32));
		smoothieSub.setBackground(new Color(150, 54, 32));

		/** Set LayoutManager of JPanels */
		window.setBackground(new Color(255, 215, 145));
		welcome.setLayout(new GridBagLayout());
		center.setLayout(new CardLayout());
		frameFood.setLayout(new GridBagLayout());
		frameSides.setLayout(new GridBagLayout());
		frameDrinks.setLayout(new GridBagLayout());
		frameTotal.setLayout(new GridBagLayout());
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

		/** Define frameTotal panel GridBagConstraint properties */
		GridBagConstraints totalGrid = new GridBagConstraints();
		totalGrid.gridx = 1;
		totalGrid.gridy = 1;
		totalGrid.gridwidth = 1;
		totalGrid.gridheight = 1;
		totalGrid.weightx = 50;
		totalGrid.weighty = 50;
		totalGrid.insets = new Insets(2, 2, 2, 2);
		totalGrid.anchor = GridBagConstraints.CENTER;
		totalGrid.fill = GridBagConstraints.NONE;

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

		/** Define bagelAdd button properties */
		bagelAdd.setFont(new Font("Arial", Font.BOLD, 25));
		bagelAdd.setForeground(Color.white);
		bagelAdd.setOpaque(true);
		bagelAdd.setContentAreaFilled(true);
		bagelAdd.setBorderPainted(false);
		bagelAdd.addActionListener(this);

		/** Define pastryAdd button properties */
		pastryAdd.setFont(new Font("Arial", Font.BOLD, 25));
		pastryAdd.setForeground(Color.white);
		pastryAdd.setOpaque(true);
		pastryAdd.setContentAreaFilled(true);
		pastryAdd.setBorderPainted(false);
		pastryAdd.addActionListener(this);

		/** Define soupAdd button properties */
		soupAdd.setFont(new Font("Arial", Font.BOLD, 25));
		soupAdd.setForeground(Color.white);
		soupAdd.setOpaque(true);
		soupAdd.setContentAreaFilled(true);
		soupAdd.setBorderPainted(false);
		soupAdd.addActionListener(this);

		/** Define bagelSub button properties */
		bagelSub.setFont(new Font("Arial", Font.BOLD, 25));
		bagelSub.setForeground(Color.white);
		bagelSub.setOpaque(true);
		bagelSub.setContentAreaFilled(true);
		bagelSub.setBorderPainted(false);
		bagelSub.addActionListener(this);

		/** Define pastrySub button properties */
		pastrySub.setFont(new Font("Arial", Font.BOLD, 25));
		pastrySub.setForeground(Color.white);
		pastrySub.setOpaque(true);
		pastrySub.setContentAreaFilled(true);
		pastrySub.setBorderPainted(false);
		pastrySub.addActionListener(this);

		/** Define soupSub button properties */
		soupSub.setFont(new Font("Arial", Font.BOLD, 25));
		soupSub.setForeground(Color.white);
		soupSub.setOpaque(true);
		soupSub.setContentAreaFilled(true);
		soupSub.setBorderPainted(false);
		soupSub.addActionListener(this);

		/** Define sodaAdd button properties */
		sodaAdd.setFont(new Font("Arial", Font.BOLD, 25));
		sodaAdd.setForeground(Color.white);
		sodaAdd.setOpaque(true);
		sodaAdd.setContentAreaFilled(true);
		sodaAdd.setBorderPainted(false);
		sodaAdd.addActionListener(this);

		/** Define latteAdd button properties */
		latteAdd.setFont(new Font("Arial", Font.BOLD, 25));
		latteAdd.setForeground(Color.white);
		latteAdd.setOpaque(true);
		latteAdd.setContentAreaFilled(true);
		latteAdd.setBorderPainted(false);
		latteAdd.addActionListener(this);

		/** Define smoothieAdd button properties */
		smoothieAdd.setFont(new Font("Arial", Font.BOLD, 25));
		smoothieAdd.setForeground(Color.white);
		smoothieAdd.setOpaque(true);
		smoothieAdd.setContentAreaFilled(true);
		smoothieAdd.setBorderPainted(false);
		smoothieAdd.addActionListener(this);

		/** Define sodaSub button properties */
		sodaSub.setFont(new Font("Arial", Font.BOLD, 25));
		sodaSub.setForeground(Color.white);
		sodaSub.setOpaque(true);
		sodaSub.setContentAreaFilled(true);
		sodaSub.setBorderPainted(false);
		sodaSub.addActionListener(this);

		/** Define latteSub button properties */
		latteSub.setFont(new Font("Arial", Font.BOLD, 25));
		latteSub.setForeground(Color.white);
		latteSub.setOpaque(true);
		latteSub.setContentAreaFilled(true);
		latteSub.setBorderPainted(false);
		latteSub.addActionListener(this);

		/** Define smoothieSub button properties */
		smoothieSub.setFont(new Font("Arial", Font.BOLD, 25));
		smoothieSub.setForeground(Color.white);
		smoothieSub.setOpaque(true);
		smoothieSub.setContentAreaFilled(true);
		smoothieSub.setBorderPainted(false);
		smoothieSub.addActionListener(this);

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

		/** Begin adding components to the JPanels */
		welcome.add(new JLabel(new ImageIcon("logo.png")), welcomeGrid);
		welcomeGrid.gridy = 2;
		welcome.add(author, welcomeGrid);
		welcomeGrid.gridy = 3;
		welcome.add(start, welcomeGrid);

		frameFood.add(new JLabel(new ImageIcon("chipotle-chicken.jpg")),
				foodGrid);
		foodGrid.gridx = 2;
		frameFood.add(new JLabel(new ImageIcon("garden-chicken-wonton.jpg")),
				foodGrid);
		foodGrid.gridx = 3;
		frameFood
				.add(new JLabel(new ImageIcon("grilled-cheese.jpg")), foodGrid);
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

		frameSides.add(new JLabel(new ImageIcon("bagel.jpg")), sideGrid);
		sideGrid.gridx = 2;
		frameSides
				.add(new JLabel(new ImageIcon("cherry-pastry.jpg")), sideGrid);
		sideGrid.gridx = 3;
		frameSides.add(new JLabel(new ImageIcon("grilled-cheese.jpg")),
				sideGrid);
		sideGrid.gridx = 1;
		sideGrid.gridy = 2;
		frameSides.add(bagelName, sideGrid);
		sideGrid.gridx = 2;
		frameSides.add(pastryName, sideGrid);
		sideGrid.gridx = 3;
		frameSides.add(soupName, sideGrid);
		sideGrid.gridx = 1;
		sideGrid.gridy = 3;
		frameSides.add(bagelAdd, sideGrid);
		sideGrid.gridx = 2;
		frameSides.add(pastryAdd, sideGrid);
		sideGrid.gridx = 3;
		frameSides.add(soupAdd, sideGrid);
		sideGrid.gridx = 1;
		sideGrid.gridy = 4;
		frameSides.add(bagelNum, sideGrid);
		sideGrid.gridx = 2;
		frameSides.add(pastryNum, sideGrid);
		sideGrid.gridx = 3;
		frameSides.add(soupNum, sideGrid);
		sideGrid.gridx = 1;
		sideGrid.gridy = 5;
		frameSides.add(bagelSub, sideGrid);
		sideGrid.gridx = 2;
		frameSides.add(pastrySub, sideGrid);
		sideGrid.gridx = 3;
		frameSides.add(soupSub, sideGrid);

		frameDrinks.add(new JLabel(new ImageIcon("pepsi.jpg")), drinkGrid);
		drinkGrid.gridx = 2;
		frameDrinks.add(new JLabel(new ImageIcon("pumpkin-spice.jpg")),
				drinkGrid);
		drinkGrid.gridx = 3;
		frameDrinks.add(new JLabel(new ImageIcon("superfruit-smoothie.jpg")),
				drinkGrid);
		drinkGrid.gridx = 1;
		drinkGrid.gridy = 2;
		frameDrinks.add(sodaName, drinkGrid);
		drinkGrid.gridx = 2;
		frameDrinks.add(latteName, drinkGrid);
		drinkGrid.gridx = 3;
		frameDrinks.add(smoothieName, drinkGrid);
		drinkGrid.gridx = 1;
		drinkGrid.gridy = 3;
		frameDrinks.add(sodaAdd, drinkGrid);
		drinkGrid.gridx = 2;
		frameDrinks.add(latteAdd, drinkGrid);
		drinkGrid.gridx = 3;
		frameDrinks.add(smoothieAdd, drinkGrid);
		drinkGrid.gridx = 1;
		drinkGrid.gridy = 4;
		frameDrinks.add(sodaNum, drinkGrid);
		drinkGrid.gridx = 2;
		frameDrinks.add(latteNum, drinkGrid);
		drinkGrid.gridx = 3;
		frameDrinks.add(smoothieNum, drinkGrid);
		drinkGrid.gridx = 1;
		drinkGrid.gridy = 5;
		frameDrinks.add(sodaSub, drinkGrid);
		drinkGrid.gridx = 2;
		frameDrinks.add(latteSub, drinkGrid);
		drinkGrid.gridx = 3;
		frameDrinks.add(smoothieSub, drinkGrid);

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
			step.setText(" Step 1 of 4 ");
			next.setVisible(true);
			back.setVisible(true);
			cancel.setVisible(true);
			frame++;
			sandwhichOrder = 0;
			saladOrder = 0;
			grilledCheeseOrder = 0;
			bagelOrder = 0;
			pastryOrder = 0;
			soupOrder = 0;
			sodaOrder = 0;
			latteOrder = 0;
			smoothieOrder = 0;
			sandwhichNum.setText("0");
			saladNum.setText("0");
			grilledCheeseNum.setText("0");
			bagelNum.setText("0");
			pastryNum.setText("0");
			soupNum.setText("0");
			sodaNum.setText("0");
			latteNum.setText("0");
			smoothieNum.setText("0");
		}

		if (e.getSource() == next) {
			switch (frame) {
				case 1 :
					cardLayout.next(center);
					frame++;
					title.setText("Choose Your Sides");
					step.setText(" Step 2 of 4 ");
					break;
				case 2 :
					cardLayout.next(center);
					frame++;
					title.setText("Choose Your Drinks");
					step.setText(" Step 3 of 4 ");
					break;
				case 3 :
					cardLayout.next(center);
					frame++;
					title.setText("Checkout");
					step.setText(" Step 4 of 4 ");
					next.setText("New Order");
					break;
				case 4 :
					cancel.doClick();
					break;
			}
		}

		if (e.getSource() == back) {
			switch (frame) {
				case 0 :
					break;
				case 1 :
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
				case 2 :
					frame--;
					cardLayout.previous(center);
					title.setText("Choose Your Entrées");
					step.setText(" Step 1 of 4 ");
					break;
				case 3 :
					frame--;
					cardLayout.previous(center);
					title.setText("Choose Your Sides");
					step.setText(" Step 2 of 4 ");
					break;
				case 4 :
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
			sandwhichOrder = 0;
			saladOrder = 0;
			grilledCheeseOrder = 0;
			bagelOrder = 0;
			pastryOrder = 0;
			soupOrder = 0;
			sodaOrder = 0;
			latteOrder = 0;
			smoothieOrder = 0;
			sandwhichNum.setText("0");
			saladNum.setText("0");
			grilledCheeseNum.setText("0");
			bagelNum.setText("0");
			pastryNum.setText("0");
			soupNum.setText("0");
			sodaNum.setText("0");
			latteNum.setText("0");
			smoothieNum.setText("0");
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

		if (e.getSource() == sandwhichAdd) {
			sandwhichOrder++;
			total += 6.99;
			cost.setText("$" + cost);
			sandwhichNum.setText(sandwhichOrder + "");
		}

		if (e.getSource() == sandwhichSub) {
			if (sandwhichOrder != 0) {
				sandwhichOrder--;
				total -= 6.99;
			}
			cost.setText("$" + cost);
			sandwhichNum.setText(sandwhichOrder + "");
		}

		if (e.getSource() == saladAdd) {
			saladOrder++;
			total += 10.07;
			saladNum.setText(saladOrder + "");
		}

		if (e.getSource() == saladSub) {
			if (saladOrder != 0) {
				saladOrder--;
				total -= 10.07;
			}
			saladNum.setText(saladOrder + "");
		}

		if (e.getSource() == grilledCheeseAdd) {
			grilledCheeseOrder++;
			total += 5.48;
			grilledCheeseNum.setText(grilledCheeseOrder + "");
		}

		if (e.getSource() == grilledCheeseSub) {
			if (grilledCheeseOrder != 0) {
				grilledCheeseOrder--;
				total -= 5.48;
			}
			grilledCheeseNum.setText(grilledCheeseOrder + "");
		}

		if (e.getSource() == bagelAdd) {
			bagelOrder++;
			bagelNum.setText(bagelOrder + "");
		}

		if (e.getSource() == bagelSub) {
			if (bagelOrder != 0)
				bagelOrder--;
			bagelNum.setText(bagelOrder + "");
		}

		if (e.getSource() == pastryAdd) {
			pastryOrder++;
			pastryNum.setText(pastryOrder + "");
		}

		if (e.getSource() == pastrySub) {
			if (pastryOrder != 0)
				pastryOrder--;
			pastryNum.setText(pastryOrder + "");
		}

		if (e.getSource() == soupAdd) {
			soupOrder++;
			soupNum.setText(soupOrder + "");
		}

		if (e.getSource() == soupSub) {
			if (soupOrder != 0)
				soupOrder--;
			soupNum.setText(soupOrder + "");
		}

		if (e.getSource() == sodaAdd) {
			sodaOrder++;
			sodaNum.setText(sodaOrder + "");
		}

		if (e.getSource() == sodaSub) {
			if (sodaOrder != 0)
				sodaOrder--;
			sodaNum.setText(sodaOrder + "");
		}

		if (e.getSource() == latteAdd) {
			latteOrder++;
			latteNum.setText(latteOrder + "");
		}

		if (e.getSource() == latteSub) {
			if (latteOrder != 0)
				latteOrder--;
			latteNum.setText(latteOrder + "");
		}

		if (e.getSource() == smoothieAdd) {
			smoothieOrder++;
			smoothieNum.setText(smoothieOrder + "");
		}

		if (e.getSource() == smoothieSub) {
			if (smoothieOrder != 0)
				smoothieOrder--;
			smoothieNum.setText(smoothieOrder + "");
		}
	}
}
