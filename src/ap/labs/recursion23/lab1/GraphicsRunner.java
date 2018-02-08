package ap.labs.recursion23.lab1;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner() {
		super("Graphics Runner");
		setSize(WIDTH, HEIGHT);

		getContentPane().add(new RecursiveBoxes());

		setVisible(true);
	}

	public static void main(String args[]) {
		GraphicsRunner run = new GraphicsRunner();
	}
}