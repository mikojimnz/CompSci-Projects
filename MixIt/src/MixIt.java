import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;

public class MixIt extends JFrame implements ItemListener, ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel panel, btns;
	private JButton randBtn;
	private ImageIcon boobooH, monkeyH;
	private Choice headChoice;
	private int state = 0;

	public static void main(String[] args) {

		MixIt myMixIt = new MixIt();
		myMixIt.setSize(750, 650);
		myMixIt.createGUI();
		myMixIt.setVisible(true);
	}

	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new BoxLayout(window, BoxLayout.Y_AXIS));

		panel = new JPanel();
		btns = new JPanel();
		headChoice = new Choice();
		randBtn = new JButton("Randomize: ");

		panel.setPreferredSize(new Dimension(getWidth(), 550));
		panel.setBackground(Color.DARK_GRAY);
		btns.setPreferredSize(new Dimension(getWidth(), 50));
		btns.setBackground(Color.WHITE);
		btns.setLayout(new FlowLayout());
		headChoice.add("Head");
		headChoice.add("Body");
		headChoice.add("Legs");
		headChoice.add("All");

		headChoice.addItemListener(this);
		randBtn.addActionListener(this);

		btns.add(randBtn);
		btns.add(headChoice);

		window.add(panel);
		window.add(btns);

		boobooH = new ImageIcon("BooBooHead.jpg");
		monkeyH = new ImageIcon("MonkeyHead.jpg");
	}

	public void actionPerformed(ActionEvent event) {
		Graphics g = panel.getGraphics();
		Object source = event.getSource();

		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, getWidth(), getHeight());

		if (source == randBtn) {
			switch(state) {
				case 0:
					randomHead();
					break;
				case 1:
					randomBody();
					break;
				case 2:
					randomLegs();
					break;
				default:
				case 3:
					randomHead();
					randomBody();
					randomLegs();
					break;
			}
		}

	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == headChoice) {
			String headString = e.getItem().toString();

			if (headString.equals("Head")) {
				state = 0;
			}

			if (headString.equals("Body")) {
				state = 1;
			}

			if (headString.equals("Legs")) {
				state = 2;
			}

			if (headString.equals("All")) {
				state = 3;
			}
		}
	}

	public void randomHead() {
		Graphics g = panel.getGraphics();
		Font text = new Font("SansSerif", Font.BOLD, 24);

		int head = (int) (Math.random() * 2);
		System.out.println("random head = " + head);

		for (int i = 0; i < 30; i++) {
			g.setColor(Color.DARK_GRAY);
			g.fillRect(0, 0, getWidth(), getHeight());

			if (i % 2 == 0)
				monkeyH.paintIcon(this, g, 100, 10);
			if (i % 2 == 1)
				boobooH.paintIcon(this, g, 100, 10);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (head == 0) {
			boobooH.paintIcon(this, g, 100, 10);
		}

		if (head == 1) {
			monkeyH.paintIcon(this, g, 100, 10);
		}

		g.setFont(text);
		g.setColor(Color.white);
		g.drawString(" Here is your head", 200, 30);

	}
}
