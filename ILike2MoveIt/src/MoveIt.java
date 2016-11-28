import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class MoveIt extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel panel, btns;
	private JButton mRight, mLeft, mUp, mDown, mNW, mNE, mSE, mSW, rand, mult,
			body, filler;
	int x, y, objs = 1;
	Boolean color = false, drawBody = false;

	public static void main(String[] args) {
		MoveIt myMoveIt = new MoveIt();
		myMoveIt.setSize(500, 800);
		myMoveIt.createGUI();
		myMoveIt.setVisible(true);
	}

	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new BoxLayout(window, BoxLayout.Y_AXIS));

		panel = new JPanel();
		panel.setPreferredSize(new Dimension(getWidth(), 400));
		panel.setBackground(Color.WHITE);

		btns = new JPanel();
		btns.setLayout(new GridLayout(4, 3));
		btns.setPreferredSize(new Dimension(getWidth(), 300));
		btns.setBackground(Color.WHITE);

		mRight = new JButton("→");
		mLeft = new JButton("←");
		mUp = new JButton("↑");
		mDown = new JButton("↓");
		mNW = new JButton("↖");
		mNE = new JButton("↗");
		mSE = new JButton("↘");
		mSW = new JButton("↙");
		rand = new JButton("Random");
		mult = new JButton("Multiply");
		body = new JButton("Body");
		filler = new JButton();

		mRight.addActionListener(this);
		mLeft.addActionListener(this);
		mUp.addActionListener(this);
		mDown.addActionListener(this);
		mNW.addActionListener(this);
		mNE.addActionListener(this);
		mSW.addActionListener(this);
		mSE.addActionListener(this);
		rand.addActionListener(this);
		mult.addActionListener(this);
		body.addActionListener(this);
		filler.setEnabled(false);

		btns.add(mNW);
		btns.add(mUp);
		btns.add(mNE);

		btns.add(mLeft);
		btns.add(filler);
		btns.add(mRight);

		btns.add(mSW);
		btns.add(mDown);
		btns.add(mSE);

		btns.add(rand);
		btns.add(mult);
		btns.add(body);

		window.add(panel);
		window.add(btns);

		x = 10;
		y = 10;

	}
	public void actionPerformed(ActionEvent event) {
		Graphics graphics = panel.getGraphics();
		Object source = event.getSource();

		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, getWidth(), getHeight());

		if (source == mRight) {
			x += 10;
		}

		if (source == mLeft) {
			x -= 10;
		}

		if (source == mUp) {
			y -= 10;
		}

		if (source == mDown) {
			y += 10;
		}

		if (source == mNW) {
			x -= 10;
			y -= 10;
		}

		if (source == mNE) {
			x += 10;
			y -= 10;
		}

		if (source == mSW) {
			x -= 10;
			y += 10;
		}

		if (source == mSE) {
			x += 10;
			y += 10;
		}

		if (source == rand) {
			x = ranNum(getWidth());
			y = ranNum(getHeight());

			color = true;
		} else {
			color = false;
		}

		if (source == mult) {
			objs = 100;
		} else {
			objs = 1;
		}

		if (source == body) {
			drawBody = true;
		} else {
			drawBody = false;
		}

		for (int i = 0; i <= objs; i++) {
			if (color == true) {
				graphics.setColor(new Color(ranNum(255), ranNum(255),
						ranNum(255)));
			} else {
				graphics.setColor(Color.YELLOW);
			}

			if (objs == 100) {
				x = ranNum(getWidth());
				y = ranNum(getHeight());
			}

			graphics.fillOval(x, y, 40, 40);
			graphics.setColor(Color.BLACK);
			graphics.fillOval(x + 10, y + 10, 5, 5);
			graphics.fillOval(x + 25, y + 10, 5, 5);
			graphics.fillArc(x + 5, y + 15, 30, 15, 0, -180);

			if (drawBody == true) {
				graphics.setColor(Color.BLACK);
				graphics.fillRect(x + 14, y + 40, 12, 35);
				graphics.fillRect(x + 14, y + 75, 4, 20);
				graphics.fillRect(x + 22, y + 75, 4, 20);
				graphics.drawLine(x + 14, y + 40, x + 10, y + 70);
				graphics.drawLine(x + 26, y + 40, x + 31, y + 70);
			} else {

			}
		}

	}

	private int ranNum(int arg) {
		return (int) (Math.random() * (arg - 50));
	}
}
