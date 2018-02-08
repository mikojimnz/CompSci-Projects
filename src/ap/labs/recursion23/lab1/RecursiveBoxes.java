package ap.labs.recursion23.lab1;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

public class RecursiveBoxes extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RecursiveBoxes() {
		setSize(640, 480);
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void paintComponent(Graphics window) {
		super.paintComponent(window);
		window.setColor(Color.ORANGE);
		window.setFont(new Font("TAHOMA", Font.BOLD, 12));

		window.drawString("Drawing Boxes Using Recursion ", 20, 80);
		drawBoxes(window, 10, 10);
	}

	public void drawBoxes(Graphics window, int x, int y) {
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		window.setColor(new Color(r, g, b));
		if (1000 < x) {
			window.drawRect(90 + x, 90 + y, 20 + x, 20 + x);
		} else {
			drawBoxes(window, x + 10, y + 10);
		}

		window.drawRect(90 + x, 90 + y, 20 + x, 20 + x);
	}
}