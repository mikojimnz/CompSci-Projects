import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calculator extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, plus, minus, mult, div, sqr, root, equal, reset;
	private JTextField screen;
	private JPanel buttons;
	private int pressed, saved, result, op;
	private String ram = "";
	private Object button;

	public static void main(String[] args) {
		Calculator frame = new Calculator();
		frame.setSize(300, 500);
		frame.createGUI();
		frame.setVisible(true);
	}

	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new BoxLayout(window, 1));

		buttons = new JPanel();
		buttons.setLayout(new GridLayout(7, 3));

		screen = new JTextField(10);
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		plus = new JButton("+");
		minus = new JButton("-");
		mult = new JButton("x");
		div = new JButton("÷");
		sqr = new JButton("^2");
		root = new JButton("√");
		equal = new JButton("=");
		reset = new JButton("Clear");

		screen.setEditable(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		sqr.addActionListener(this);
		root.addActionListener(this);
		equal.addActionListener(this);
		reset.addActionListener(this);

		buttons.add(b1);
		buttons.add(b2);
		buttons.add(b3);

		buttons.add(b4);
		buttons.add(b5);
		buttons.add(b6);

		buttons.add(b7);
		buttons.add(b8);
		buttons.add(b9);

		buttons.add(reset);
		buttons.add(b0);
		buttons.add(equal);

		buttons.add(plus);
		buttons.add(minus);
		buttons.add(mult);

		buttons.add(sqr);
		buttons.add(root);
		buttons.add(div);

		window.add(screen);
		window.add(buttons);

	}

	public void actionPerformed(ActionEvent event) {
		button = event.getSource();

		try {
			if (button == plus) {
				pressed = Integer.parseInt(ram);
				op = 0;
				ram = "";
				screen.setText("");
			}

			if (button == minus) {
				pressed = Integer.parseInt(ram);
				op = 1;
				ram = "";
				screen.setText("");
			}

			if (button == mult) {
				pressed = Integer.parseInt(ram);
				op = 2;
				ram = "";
				screen.setText("");
			}

			if (button == div) {
				pressed = Integer.parseInt(ram);
				op = 3;
				ram = "";
				screen.setText("");
			}

			if (button == sqr) {
				pressed = Integer.parseInt(ram);
				op = 4;
				ram = "";
				screen.setText("");
			}

			if (button == root) {
				pressed = Integer.parseInt(ram);
				op = 5;
				ram = "";
				screen.setText("");
			}

			if (button == equal) {
				if (op == 4 || op == 5)
					ram = "0";
				saved = Integer.parseInt(ram);

				switch (op) {
				case 0:
					result = pressed + saved;
					break;
				case 1:
					result = pressed - saved;
					break;
				case 2:
					result = pressed * saved;
					break;
				case 3:
					result = pressed / saved;
					break;
				case 4:
					result = pressed * pressed;
					break;
				case 5:
					result = (int) Math.sqrt(pressed);
					break;
				default:
					return;
				}

				screen.setText(result + "");
				pressed = 0;
				saved = 0;
				result = 0;
				op = 0;
				ram = "";
			}

			if (button == reset) {
				pressed = 0;
				saved = 0;
				result = 0;
				op = 0;
				ram = "";
				screen.setText("");
			}

			if (button == b1) {
				ram += 1;
				screen.setText(ram);
			}

			if (button == b2) {
				ram += 2;
				screen.setText(ram);
			}

			if (button == b3) {
				ram += 3;
				screen.setText(ram);
			}

			if (button == b4) {
				ram += 4;
				screen.setText(ram);
			}

			if (button == b5) {
				ram += 5;
				screen.setText(ram);
			}

			if (button == b6) {
				ram += 6;
				screen.setText(ram);
			}

			if (button == b7) {
				ram += 7;
				screen.setText(ram);
			}

			if (button == b8) {
				ram += 8;
				screen.setText(ram);
			}

			if (button == b9) {
				ram += 9;
				screen.setText(ram);
			}

			if (button == b0) {
				ram += 0;
				screen.setText(ram);
			}
		} catch (Exception e) {
		}
	}
}
