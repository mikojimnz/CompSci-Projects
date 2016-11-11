import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

@SuppressWarnings("serial")
public class RockDemo extends JFrame implements ActionListener {
	private JPanel panel, buttonPanel, textPanel;
	private JButton rock, paper, scissors;
	private JLabel compWins, userWins, result, why;
	private static ImageIcon rockPic;
	private static ImageIcon paperPic;
	private static ImageIcon scissorPic;
	private static ImageIcon tieRock;
	private static ImageIcon tiePaper;
	private static ImageIcon tieScissor;
	private static ImageIcon PbR;
	private static ImageIcon RbS;
	private static ImageIcon SbP; 
	private int user, comp;
	private double userScore = 0, compScore = 0;

	public static void main(String[] args) {

		RockDemo demo = new RockDemo();
		demo.setSize(900, 600);
		demo.createGUI();
		demo.setVisible(true);
		
		rockPic = new ImageIcon("rock.png");
		paperPic = new ImageIcon("paper.png");
		scissorPic = new ImageIcon("scissor.png");
		tieRock = new ImageIcon("RR.png");
		tiePaper = new ImageIcon("PP.png");
		tieScissor = new ImageIcon("SS.png");
		PbR = new ImageIcon("PbR.png");
		RbS = new ImageIcon("RbS.png");
		SbP = new ImageIcon("SbP.png");
	}

	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new BoxLayout(window, BoxLayout.Y_AXIS));
		
		rock = new JButton("Rock");
		rock.setAlignmentX(CENTER_ALIGNMENT);
		rock.addActionListener(this);
		
		paper = new JButton("Paper");
		paper.setAlignmentX(CENTER_ALIGNMENT);
		paper.addActionListener(this);
		
		scissors = new JButton("Scissors");
		scissors.setAlignmentX(CENTER_ALIGNMENT);
		scissors.addActionListener(this);
		
		compWins = new JLabel("", JLabel.CENTER);
		compWins.setFont(new Font("TimesRoman", Font.BOLD, 25));
		compWins.setForeground(Color.WHITE);
		
		userWins = new JLabel("", JLabel.CENTER);
		userWins.setFont(new Font("TimesRoman", Font.BOLD, 25));
		userWins.setForeground(Color.WHITE);
		
		result = new JLabel("", JLabel.CENTER);
		result.setFont(new Font("TimesRoman", Font.BOLD, 25));
		result.setForeground(Color.WHITE);
		
		why = new JLabel("", JLabel.CENTER);
		why.setFont(new Font("TimesRoman", Font.BOLD, 25));
		why.setForeground(Color.WHITE);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(panel.getWidth(), 300));
		panel.setBackground(Color.DARK_GRAY);
		window.add(panel);
		
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(panel.getWidth(), 30));
		buttonPanel.setBackground(Color.DARK_GRAY);
		buttonPanel.add(rock);
		buttonPanel.add(paper);
		buttonPanel.add(scissors);
		window.add(buttonPanel);
		
		textPanel = new JPanel();
		textPanel.setPreferredSize(new Dimension(panel.getWidth(), 30));
		textPanel.setBackground(Color.DARK_GRAY);
		textPanel.setLayout(new GridLayout(2,3));
		textPanel.add(compWins);
		textPanel.add(result);
		textPanel.add(userWins);
		textPanel.add(new JLabel(""));
		textPanel.add(why);
		textPanel.add(new JLabel(""));
		window.add(textPanel);
	}

	public void actionPerformed(ActionEvent event) {

		Graphics graphics = panel.getGraphics();
		Object source = event.getSource();
		
		graphics.setColor(Color.DARK_GRAY);
		graphics.fillRect(0, 0, getWidth(), getWidth());
		graphics.setColor(Color.WHITE);
		graphics.setFont(new Font("TimesRoman", Font.BOLD, 25));

		if (source == rock) {user = 0; rockPic.paintIcon(this, graphics, (panel.getWidth() / 2) + 250, 100);}
		if (source == paper) {user = 1; paperPic.paintIcon(this, graphics, (panel.getWidth() / 2) + 250, 100);}
		if (source == scissors) {user = 2; scissorPic.paintIcon(this, graphics, (panel.getWidth() / 2) + 250, 140);}
		
		comp = ranNum();
		if (comp == 0) rockPic.paintIcon(this, graphics, (panel.getWidth() / 2) - 450, 100);
		if (comp == 1) paperPic.paintIcon(this, graphics, (panel.getWidth() / 2) - 450, 100);
		if (comp == 2) scissorPic.paintIcon(this, graphics, (panel.getWidth() / 2) - 450, 140);
		
		int win = determineWinner(graphics);
		if (win == 0) {
			compScore += 0.5;
			userScore += 0.5;
			result.setText("Tie!");
		} else if (win == 1) {
			userScore++;
			result.setText("Player Wins!");
		} else {
			compScore++;
			result.setText("Computer Wins!");
		}
		
		compWins.setText("   Computer: " + compScore);
		userWins.setText("Player: " + userScore + "   ");
		graphics.drawString("Computer", (panel.getWidth() / 2) - 350, 350);
		graphics.drawString("You", (panel.getWidth() / 2) + 250, 350);
	}
	
	private int determineWinner(Graphics g) {
		switch (user) {
			case 0 :
				if (comp == 0) {
					why.setText("Rock ties Rock");
					tieRock.paintIcon(this, g, panel.getWidth()/2-100, 100);
					return 0;
				}
				if (comp == 1) {
					why.setText("Paper eats Rock");
					PbR.paintIcon(this, g, panel.getWidth()/2-100, 100);
					return 2;
				}
				if (comp == 2) {
					why.setText("Rock beats Scissors");
					RbS.paintIcon(this, g, panel.getWidth()/2-100, 100);
					return 1;
				}
			case 1 :
				if (comp == 0) {
					why.setText("Paper eats Rock");
					PbR.paintIcon(this, g, panel.getWidth()/2-100, 100);
					return 1;
				}
				if (comp == 1) {
					why.setText("Paper ties Paper");
					tiePaper.paintIcon(this, g, panel.getWidth()/2-100, 100);
					return 0;
				}
				if (comp == 2) {
					why.setText("Scissor cuts Paper");
					SbP.paintIcon(this, g, panel.getWidth()/2-100, 100);
					return 2;
				}
			case 2 :
				if (comp == 0) {
					why.setText("Rock beats Scissor");
					RbS.paintIcon(this, g, panel.getWidth()/2-100, 100);
					return 2;
				}
				if (comp == 1) {
					why.setText("Scissor cuts Paper");
					SbP.paintIcon(this, g, panel.getWidth()/2-100, 100);
					return 1;
				}
				if (comp == 2) {
					why.setText("Scissor ties Scissor");
					tieScissor.paintIcon(this, g, panel.getWidth()/2-100, 100);
					return 0;
				}
			default :
				return 0;
		}
	}

	private int ranNum() {
		Random random = new Random();
		return random.nextInt(3);
	}
}
