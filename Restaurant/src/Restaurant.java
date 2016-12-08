import java.awt.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.*;

import java.awt.Font;

/**
 * <h1>Restaurant Midterm Project</h1>
 * 
 * @author mikojimnz
 * @version 1.0
 */
public class Restaurant extends JFrame implements ActionListener {
	/** Instance Variables */
	private static final long serialVersionUID = 1L;
	private JButton start, next, back, cancel, pay, sandwhichAdd, saladAdd,
			grilledCheeseAdd, bagelAdd, pastryAdd, soupAdd, sodaAdd, latteAdd,
			smoothieAdd, sandwhichSub, saladSub, grilledCheeseSub, bagelSub,
			pastrySub, soupSub, sodaSub, latteSub, smoothieSub;
	private JLabel author, cost, tax, step, title, costTitle, taxTitle,
			checkoutTitle, checkoutCost, checkoutTaxTitle, checkoutTaxCost,
			checkoutFinalTitle, checkoutFinalCost, sandwhichName, saladName,
			grilledCheeseName, bagelName, pastryName, soupName, sodaName,
			latteName, smoothieName, sandwhichNum, saladNum, grilledCheeseNum,
			bagelNum, pastryNum, soupNum, sodaNum, latteNum, smoothieNum;
	private JPanel center, welcome, frameFood, frameSides, frameDrinks,
			frameTotal, header, footer, bannerTotal, bannerOrder;
	private double total;
	private int frame = 0, sandwhichOrder = 0, saladOrder = 0,
			grilledCheeseOrder = 0, bagelOrder = 0, pastryOrder = 0,
			soupOrder = 0, sodaOrder = 0, latteOrder = 0, smoothieOrder = 0;
	private static ImageIcon sandwhich, salad, grilledCheese, bagel, pastry,
			soup, soda, latte, smoothie;

	/**
	 * Begin Restaurant and define {@link ImageIcon ImageIcons}.
	 * 
	 * @param args
	 *            Starting arguments.
	 */
	public static void main(String[] args) {
		/** Load food thumb nails */
		sandwhich = new ImageIcon("chipotle-chicken-75.jpg");
		salad = new ImageIcon("garden-chicken-wonton-75.jpg");
		grilledCheese = new ImageIcon("grilled-cheese-75.jpg");
		bagel = new ImageIcon("bagel-75.jpg");
		pastry = new ImageIcon("cherry-pastry-75.jpg");
		soup = new ImageIcon("french-onion-75.jpg");
		soda = new ImageIcon("pepsi-75.jpg");
		latte = new ImageIcon("pumpkin-spice-75.jpg");
		smoothie = new ImageIcon("superfruit-smoothie-75.jpg");

		/** Begin GUI */
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
		bagelName = new JLabel("Plain Bagel");
		bagelNum = new JLabel("0");
		bagelSub = new JButton("-");
		bannerOrder = new JPanel();
		bannerTotal = new JPanel();
		cancel = new JButton("Cancel Order");
		center = new JPanel();
		checkoutCost = new JLabel();
		checkoutFinalCost = new JLabel();
		checkoutFinalTitle = new JLabel("Final Due:");
		checkoutTaxCost = new JLabel();
		checkoutTaxTitle = new JLabel("Tax:");
		checkoutTitle = new JLabel("Total:");
		cost = new JLabel();
		costTitle = new JLabel();
		footer = new JPanel();
		frameDrinks = new JPanel();
		frameFood = new JPanel();
		frameSides = new JPanel();
		frameTotal = new JPanel();
		grilledCheeseAdd = new JButton("+");
		grilledCheeseName = new JLabel("Classic Grilled Cheese");
		grilledCheeseNum = new JLabel("0");
		grilledCheeseSub = new JButton("-");
		header = new JPanel();
		latteAdd = new JButton("+");
		latteName = new JLabel("Pumpkin Spice Latte");
		latteNum = new JLabel("0");
		latteSub = new JButton("-");
		next = new JButton("Continue");
		pastryAdd = new JButton("+");
		pastryName = new JLabel("Cherry Pastry");
		pastryNum = new JLabel("0");
		pastrySub = new JButton("-");
		pay = new JButton("Purchase");
		saladAdd = new JButton("+");
		saladName = new JLabel("Thai Garden Chicken Wonton Bowl");
		saladNum = new JLabel("0");
		saladSub = new JButton("-");
		sandwhichAdd = new JButton("+");
		sandwhichName = new JLabel("Chipotle Chicken Avacado Melt");
		sandwhichNum = new JLabel("0");
		sandwhichSub = new JButton("-");
		smoothieAdd = new JButton("+");
		smoothieName = new JLabel("Superfruit Smoothie");
		smoothieNum = new JLabel("0");
		smoothieSub = new JButton("-");
		sodaAdd = new JButton("+");
		sodaName = new JLabel("Soda");
		sodaNum = new JLabel("0");
		sodaSub = new JButton("-");
		soupAdd = new JButton("+");
		soupName = new JLabel("Bistro French Onion Soup");
		soupNum = new JLabel("0");
		soupSub = new JButton("-");
		start = new JButton("Begin New Order");
		step = new JLabel();
		tax = new JLabel();
		taxTitle = new JLabel();
		title = new JLabel("");
		welcome = new JPanel();

		/** Define preferred size of components */
		bannerOrder.setPreferredSize(new Dimension(300, getHeight()));
		bannerTotal.setPreferredSize(new Dimension(300, getHeight()));
		footer.setPreferredSize(new Dimension(getWidth(), 100));
		header.setPreferredSize(new Dimension(getWidth(), 100));
		start.setPreferredSize(new Dimension(250, 150));
		welcome.setPreferredSize(new Dimension(getWidth(), 100));

		/** Set color of components */
		window.setLayout(new BorderLayout());
		back.setBackground(new Color(92, 114, 50));
		bagelAdd.setBackground(new Color(92, 114, 50));
		bagelSub.setBackground(new Color(150, 54, 32));
		bannerOrder.setBackground(new Color(255, 215, 145));
		bannerTotal.setBackground(new Color(255, 215, 145));
		cancel.setBackground(new Color(150, 54, 32));
		footer.setBackground(new Color(255, 215, 145));
		frameDrinks.setBackground(new Color(255, 215, 145));
		frameFood.setBackground(new Color(255, 215, 145));
		frameSides.setBackground(new Color(255, 215, 145));
		frameTotal.setBackground(new Color(255, 215, 145));
		grilledCheeseAdd.setBackground(new Color(92, 114, 50));
		grilledCheeseSub.setBackground(new Color(150, 54, 32));
		header.setBackground(new Color(255, 215, 145));
		latteAdd.setBackground(new Color(92, 114, 50));
		latteSub.setBackground(new Color(150, 54, 32));
		next.setBackground(new Color(92, 114, 50));
		pastryAdd.setBackground(new Color(92, 114, 50));
		pastrySub.setBackground(new Color(150, 54, 32));
		pay.setBackground(new Color(92, 114, 50));
		saladAdd.setBackground(new Color(92, 114, 50));
		saladSub.setBackground(new Color(150, 54, 32));
		sandwhichAdd.setBackground(new Color(92, 114, 50));
		sandwhichSub.setBackground(new Color(150, 54, 32));
		smoothieAdd.setBackground(new Color(92, 114, 50));
		smoothieSub.setBackground(new Color(150, 54, 32));
		sodaAdd.setBackground(new Color(92, 114, 50));
		sodaSub.setBackground(new Color(150, 54, 32));
		soupAdd.setBackground(new Color(92, 114, 50));
		soupSub.setBackground(new Color(150, 54, 32));
		start.setBackground(new Color(92, 114, 50));
		welcome.setBackground(new Color(255, 215, 145));

		/** Set LayoutManager of JPanels */
		window.setBackground(new Color(255, 215, 145));
		center.setLayout(new CardLayout());
		footer.setLayout(new GridBagLayout());
		frameDrinks.setLayout(new GridBagLayout());
		frameFood.setLayout(new GridBagLayout());
		frameSides.setLayout(new GridBagLayout());
		frameTotal.setLayout(new GridBagLayout());
		welcome.setLayout(new GridBagLayout());

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
		totalGrid.fill = GridBagConstraints.HORIZONTAL;

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

		/** Define pay button properties */
		pay.setFont(new Font("Arial", Font.BOLD, 25));
		pay.setForeground(Color.white);
		pay.setOpaque(true);
		pay.setContentAreaFilled(true);
		pay.setBorderPainted(false);
		pay.addActionListener(this);

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
		bagelName.setFont(new Font("Arial", Font.BOLD, 25));
		bagelNum.setFont(new Font("Arial", Font.BOLD, 25));
		checkoutCost.setFont(new Font("Arial", Font.BOLD, 25));
		checkoutFinalCost.setFont(new Font("Arial", Font.BOLD, 25));
		checkoutFinalTitle.setFont(new Font("Arial", Font.BOLD, 25));
		checkoutTaxCost.setFont(new Font("Arial", Font.BOLD, 25));
		checkoutTaxTitle.setFont(new Font("Arial", Font.BOLD, 25));
		checkoutTitle.setFont(new Font("Arial", Font.BOLD, 25));
		cost.setFont(new Font("Arial", Font.BOLD, 30));
		costTitle.setFont(new Font("Arial", Font.BOLD, 30));
		grilledCheeseName.setFont(new Font("Arial", Font.BOLD, 25));
		grilledCheeseNum.setFont(new Font("Arial", Font.BOLD, 25));
		latteName.setFont(new Font("Arial", Font.BOLD, 25));
		latteNum.setFont(new Font("Arial", Font.BOLD, 25));
		pastryName.setFont(new Font("Arial", Font.BOLD, 25));
		pastryNum.setFont(new Font("Arial", Font.BOLD, 25));
		saladName.setFont(new Font("Arial", Font.BOLD, 25));
		saladNum.setFont(new Font("Arial", Font.BOLD, 25));
		sandwhichName.setFont(new Font("Arial", Font.BOLD, 25));
		sandwhichNum.setFont(new Font("Arial", Font.BOLD, 25));
		smoothieName.setFont(new Font("Arial", Font.BOLD, 25));
		smoothieNum.setFont(new Font("Arial", Font.BOLD, 25));
		sodaName.setFont(new Font("Arial", Font.BOLD, 25));
		sodaNum.setFont(new Font("Arial", Font.BOLD, 25));
		soupName.setFont(new Font("Arial", Font.BOLD, 25));
		soupNum.setFont(new Font("Arial", Font.BOLD, 25));
		step.setFont(new Font("Arial", Font.BOLD, 30));
		tax.setFont(new Font("Arial", Font.BOLD, 30));
		taxTitle.setFont(new Font("Arial", Font.BOLD, 30));
		title.setFont(new Font("Arial", Font.BOLD, 35));

		/** Add welcome components */
		welcome.add(new JLabel(new ImageIcon("logo.png")), welcomeGrid);
		welcomeGrid.gridy = 2;
		welcome.add(author, welcomeGrid);
		welcomeGrid.gridy = 3;
		welcome.add(start, welcomeGrid);

		/** Add frameFood components */
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

		/** Add frameSides components */
		frameSides.add(new JLabel(new ImageIcon("bagel.jpg")), sideGrid);
		sideGrid.gridx = 2;
		frameSides
				.add(new JLabel(new ImageIcon("cherry-pastry.jpg")), sideGrid);
		sideGrid.gridx = 3;
		frameSides.add(new JLabel(new ImageIcon("french-onion.jpg")), sideGrid);
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

		/** Add frameDrinks components */
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

		/** Add frameTotal components */
		frameTotal.add(checkoutTitle, totalGrid);
		totalGrid.gridx = 2;
		frameTotal.add(checkoutCost, totalGrid);
		totalGrid.gridx = 1;
		totalGrid.gridy = 2;
		frameTotal.add(checkoutTaxTitle, totalGrid);
		totalGrid.gridx = 2;
		frameTotal.add(checkoutTaxCost, totalGrid);
		totalGrid.gridx = 1;
		totalGrid.gridy = 3;
		frameTotal.add(checkoutFinalTitle, totalGrid);
		totalGrid.gridx = 2;
		frameTotal.add(checkoutFinalCost, totalGrid);
		totalGrid.gridx = 1;
		totalGrid.gridy = 4;
		frameTotal.add(pay, totalGrid);

		/** Add header components */
		header.add(title);

		/** Add footer components */
		footer.add(back, footerGrid);
		footerGrid.gridx = 2;
		footer.add(step, footerGrid);
		footerGrid.gridx = 3;
		footer.add(next, footerGrid);

		/** Add bannerTotal components */
		bannerTotal.add(costTitle);
		bannerTotal.add(cost);
		bannerTotal.add(taxTitle);
		bannerTotal.add(tax);
		bannerTotal.add(cancel);

		/** Add add cards to center (@link CardLayout CardLayout} */
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

		/** Begins new order, makes buttons and labels visible */
		if (e.getSource() == start) {
			cardLayout.next(center);
			total = 0.0;
			title.setText("Choose Your Entrées");
			costTitle.setText("Your Total Is:");
			cost.setText("$0.0");
			step.setText(" Step 1 of 4 ");
			next.setText("Continue");
			costTitle.setVisible(true);
			cost.setVisible(true);
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

		/** Moves to next frame or restarts program */
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
					costTitle.setVisible(false);
					cost.setVisible(false);
					cancel.setVisible(false);
					break;
				case 4 :
					cancel.doClick();
					break;
			}
		}

		/** Moves back a frame or restarts programs */
		if (e.getSource() == back) {
			switch (frame) {
				case 0 :
					break;
				case 1 :
					cancel.doClick();
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
					costTitle.setVisible(true);
					cost.setVisible(true);
					cancel.setVisible(true);
					break;
			}
		}

		/** Cancel(clear) button */
		if (e.getSource() == cancel || e.getSource() == pay) {
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

		/** Add and Remove item buttons */
		DecimalFormat df = new DecimalFormat("###.##");
		df.setRoundingMode(RoundingMode.CEILING);
		total = Double.parseDouble(df.format(total));

		if (e.getSource() == sandwhichAdd) {
			sandwhichOrder++;
			total += 6.99;
			roundTotal();
			sandwhichNum.setText(sandwhichOrder + "");
		}

		if (e.getSource() == sandwhichSub) {
			if (sandwhichOrder != 0) {
				sandwhichOrder--;
				total -= 6.99;
			}
			roundTotal();
			sandwhichNum.setText(sandwhichOrder + "");
		}

		if (e.getSource() == saladAdd) {
			saladOrder++;
			total += 10.07;
			roundTotal();
			saladNum.setText(saladOrder + "");
		}

		if (e.getSource() == saladSub) {
			if (saladOrder != 0) {
				saladOrder--;
				total -= 10.07;
			}
			roundTotal();
			saladNum.setText(saladOrder + "");
		}

		if (e.getSource() == grilledCheeseAdd) {
			grilledCheeseOrder++;
			total += 5.48;
			roundTotal();
			grilledCheeseNum.setText(grilledCheeseOrder + "");
		}

		if (e.getSource() == grilledCheeseSub) {
			if (grilledCheeseOrder != 0) {
				grilledCheeseOrder--;
				total -= 5.48;
			}
			roundTotal();
			grilledCheeseNum.setText(grilledCheeseOrder + "");
		}

		if (e.getSource() == bagelAdd) {
			bagelOrder++;
			total += 1.18;
			roundTotal();
			bagelNum.setText(bagelOrder + "");
		}

		if (e.getSource() == bagelSub) {
			if (bagelOrder != 0) {
				bagelOrder--;
				total -= 1.18;
			}
			roundTotal();
			bagelNum.setText(bagelOrder + "");
		}

		if (e.getSource() == pastryAdd) {
			pastryOrder++;
			total += 3.01;
			roundTotal();
			pastryNum.setText(pastryOrder + "");
		}

		if (e.getSource() == pastrySub) {
			if (pastryOrder != 0) {
				pastryOrder--;
				total -= 3.01;
			}
			roundTotal();
			pastryNum.setText(pastryOrder + "");
		}

		if (e.getSource() == soupAdd) {
			soupOrder++;
			total += 5.92;
			roundTotal();
			soupNum.setText(soupOrder + "");
		}

		if (e.getSource() == soupSub) {
			if (soupOrder != 0) {
				soupOrder--;
				total -= 5.92;
			}
			roundTotal();
			soupNum.setText(soupOrder + "");
		}

		if (e.getSource() == sodaAdd) {
			sodaOrder++;
			total += 2.79;
			roundTotal();
			sodaNum.setText(sodaOrder + "");
		}

		if (e.getSource() == sodaSub) {
			if (sodaOrder != 0) {
				sodaOrder--;
				total -= 2.79;
			}
			roundTotal();
			sodaNum.setText(sodaOrder + "");
		}

		if (e.getSource() == latteAdd) {
			latteOrder++;
			total += 4.86;
			roundTotal();
			latteNum.setText(latteOrder + "");
		}

		if (e.getSource() == latteSub) {
			if (latteOrder != 0) {
				latteOrder--;
				total -= 4.86;
			}
			roundTotal();
			latteNum.setText(latteOrder + "");
		}

		if (e.getSource() == smoothieAdd) {
			smoothieOrder++;
			total += 5.36;
			roundTotal();
			smoothieNum.setText(smoothieOrder + "");
		}

		if (e.getSource() == smoothieSub) {
			if (smoothieOrder != 0) {
				smoothieOrder--;
				total -= 5.36;
			}
			roundTotal();
			smoothieNum.setText(smoothieOrder + "");
		}

//		if (sandwhichOrder == 1 && saladOrder == 2 && grilledCheeseOrder == 3
//				&& bagelOrder == 4 && pastryOrder == 5 && soupOrder == 6
//				&& sodaOrder == 7 && latteOrder == 8 && smoothieOrder == 9) {
//			JOptionPane.showMessageDialog(this, "SECRET MENU!");
//		}
	}

	/**
	 * Rounds total costs before displaying text
	 */
	public void roundTotal() {
		DecimalFormat df = new DecimalFormat("###.##");
		df.setRoundingMode(RoundingMode.HALF_UP);
		total = Double.parseDouble(df.format(total));
		Double tax = Double.parseDouble(df.format((total * .065)));
		Double finalCost = Double.parseDouble(df.format(total + tax));
		cost.setText("$" + total); // Set cost text
		checkoutCost.setText("$" + total); // Set checkoutCost text
		checkoutTaxCost.setText("$" + tax); // Set checkoutTaxCost text
		checkoutFinalCost.setText("$" + finalCost); // Set checkoutFinalCost
													// text
	}

	/**
	 * Creates images for orderBanner
	 */
	public void updateOrder() {
		Graphics g = bannerOrder.getGraphics();
		g.setColor(new Color(255, 215, 145));
		g.fillRect(0, 0, bannerOrder.getWidth(), bannerOrder.getHeight());

		if (sandwhichOrder != 0)
			sandwhich.paintIcon(this, g, 0, 50);
		if (saladOrder != 0)
			salad.paintIcon(this, g, 80, 50);
		if (grilledCheeseOrder != 0)
			grilledCheese.paintIcon(this, g, 0, 130);
		if (bagelOrder != 0)
			bagel.paintIcon(this, g, 80, 130);
		if (pastryOrder != 0)
			pastry.paintIcon(this, g, 0, 210);
		if (soupOrder != 0)
			soup.paintIcon(this, g, 80, 210);
		if (sodaOrder != 0)
			soda.paintIcon(this, g, 0, 290);
		if (latteOrder != 0)
			latte.paintIcon(this, g, 80, 290);
		if (smoothieOrder != 0)
			smoothie.paintIcon(this, g, 0, 370);
	}
}