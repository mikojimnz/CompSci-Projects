import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;

public class MixIt extends JFrame implements ItemListener, ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel panel, btns;
	private JButton randBtn;
	private static ImageIcon h1, h2, h3, h4, h5, b1, b2, b3, b4, b5, l1, l2, l3, l4, l5;
	private Choice headChoice;
	private int state = 0, head = 0, body = 0, legs = 0;

	public static void main(String[] args) {
		MixIt myMixIt = new MixIt();
		myMixIt.setSize(750, 650);
		myMixIt.createGUI();
		myMixIt.setVisible(true);
		
		h1 = new ImageIcon("h1.png");
		h2 = new ImageIcon("h2.png");
		h3 = new ImageIcon("h3.png");
		h4 = new ImageIcon("h4.png");
		h5 = new ImageIcon("h5.png");
		b1 = new ImageIcon("b1.png");
		b2 = new ImageIcon("b2.png");
		b3 = new ImageIcon("b3.png");
		b4 = new ImageIcon("b4.png");
		b5 = new ImageIcon("b5.png");
		l1 = new ImageIcon("l1.png");
		l2 = new ImageIcon("l2.png");
		l3 = new ImageIcon("l3.png");
		l4 = new ImageIcon("l4.png");
		l5 = new ImageIcon("l5.png");
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
		
		preformDraw();

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
			
			preformDraw();
		}
	}
	
	private void preformDraw() {
		Graphics g = panel.getGraphics();
		Font text = new Font("SansSerif", Font.BOLD, 24);
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		if (head == 0) h1.paintIcon(this, g, getWidth()/2-100, 10);
		if (head == 1) h2.paintIcon(this, g, getWidth()/2-100, 10);
		if (head == 2) h3.paintIcon(this, g, getWidth()/2-100, 10);
		if (head == 3) h4.paintIcon(this, g, getWidth()/2-100, 10);
		if (head == 4) h5.paintIcon(this, g, getWidth()/2-100, 10);
		
		if (body == 0) b1.paintIcon(this, g, getWidth()/2-100, 90);
		if (body == 1) b2.paintIcon(this, g, getWidth()/2-100, 90);
		if (body == 2) b3.paintIcon(this, g, getWidth()/2-100, 90);
		if (body == 3) b4.paintIcon(this, g, getWidth()/2-100, 90);
		if (body == 4) b5.paintIcon(this, g, getWidth()/2-100, 90);
		
		if (legs == 0) l1.paintIcon(this, g, getWidth()/2-100, 170);
		if (legs == 1) l2.paintIcon(this, g, getWidth()/2-100, 170);
		if (legs == 2) l3.paintIcon(this, g, getWidth()/2-100, 170);
		if (legs == 3) l4.paintIcon(this, g, getWidth()/2-100, 170);
		if (legs == 4) l5.paintIcon(this, g, getWidth()/2-100, 170);

		g.setFont(text);
		g.setColor(Color.white);
		g.drawString(" Here is your head", 400, 30);
		g.drawString(" Here is your body", 400, 100);
		g.drawString(" Here is your lges", 400, 180);
	}

	public void randomHead() {
		Graphics g = panel.getGraphics();		
		head = (int) (Math.random() * 4);
		System.out.println("random head = " + head);

		for (int i = 0; i < 30; i++) {
			g.setColor(Color.DARK_GRAY);
			g.fillRect(0, 0, getWidth(), getHeight());

			if (i % 2 == 0) h1.paintIcon(this, g, getWidth()/2-100, 10);
			if (i % 3 == 0) h2.paintIcon(this, g, getWidth()/2-100, 10);
			if (i % 4 == 0) h3.paintIcon(this, g, getWidth()/2-100, 10);
			if (i % 5 == 0) {
				h4.paintIcon(this, g, getWidth()/2-100, 10);
			} else {
				h5.paintIcon(this, g, getWidth()/2-100, 10);
			}

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void randomBody() {
		Graphics g = panel.getGraphics();
		body = (int) (Math.random() * 4);
		System.out.println("random body = " + body);
		
		for (int i = 0; i < 30; i++) {
			g.setColor(Color.DARK_GRAY);
			g.fillRect(0, 0, getWidth(), getHeight());

			if (i % 2 == 0) b1.paintIcon(this, g, getWidth()/2-100, 90);
			if (i % 3 == 0) b2.paintIcon(this, g, getWidth()/2-100, 90);
			if (i % 4 == 0) b3.paintIcon(this, g, getWidth()/2-100, 90);
			if (i % 5 == 0) {
				b4.paintIcon(this, g, getWidth()/2-100, 90);
			} else {
				b5.paintIcon(this, g, getWidth()/2-100, 90);
			}

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void randomLegs() {
		Graphics g = panel.getGraphics();
		legs = (int) (Math.random() * 4);
		System.out.println("random legs = " + legs);
		
		for (int i = 0; i < 30; i++) {
			g.setColor(Color.DARK_GRAY);
			g.fillRect(0, 0, getWidth(), getHeight());

			if (i % 2 == 0) l1.paintIcon(this, g, getWidth()/2-100, 170);
			if (i % 3 == 0) l2.paintIcon(this, g, getWidth()/2-100, 170);
			if (i % 4 == 0) l3.paintIcon(this, g, getWidth()/2-100, 170);
			if (i % 5 == 0) {
				l4.paintIcon(this, g, getWidth()/2-100, 170);
			} else {
				l5.paintIcon(this, g, getWidth()/2-100, 170);
			}

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}
