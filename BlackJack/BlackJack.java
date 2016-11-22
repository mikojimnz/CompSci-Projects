import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BlackJack extends JFrame implements ActionListener {

   
    private JPanel panel;
    private JButton button1, button2;
    private ImageIcon pic4Sp, picASp, pic3Sp, redBack;
    private int userCardCount, pcCardCount;
    private int userTotal, pcTotal;
    public static void main(String[] args) {
    
    	
        BlackJack demo = new BlackJack();
        //set screen size to what you think will work for your game
        demo.setSize(450,500); 
        demo.createGUI();
        demo.setVisible(true);
      
    }

    private void createGUI() {
    	//this creates the panel 
    
      	userCardCount = 0;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setBackground(Color.blue);
        window.add(panel);
        
        button1 = new JButton("button1");
        window.add(button1);
        button1.addActionListener(this);
       
       
        button2 = new JButton("button2");
        window.add(button2);
        button2.addActionListener(this);
       
   
       picASp = new ImageIcon("spades-a-75.png");
       pic3Sp = new ImageIcon("spades-3-75.png");
       pic4Sp = new ImageIcon("spades-4-75.png");
       redBack = new ImageIcon("back-red-75-2.png");
  

 
    }

    public void actionPerformed(ActionEvent event) {
       //this is where you handle the event that occurred.
       // if this method is executed, then you need to figure out what 
       // event the user did so your program can respond.
       
        Graphics graphics = panel.getGraphics();
        Object source = event.getSource();
        
        graphics.setColor(Color.blue);
        graphics.fillRect(0,0,500,300);
        graphics.setColor(Color.yellow);
        
        if (source == button2)
        {
            graphics.drawString("HELLO WORLD!",5,30);
        }
        if (source == button1)
        {
          //since the user is getting two cards, set the count of user cards to 2
          //if any cards are added after this, add to the count each time.
          userCardCount=2;
          userTotal = userTotal + displayCard(graphics, 100,100);
          userTotal = userTotal + displayCard(graphics, 120,100);
          
          //computer cards
          pcCardCount = 2;
          pcTotal = pcTotal + displayCard(graphics, 300,100);
          pcTotal = pcTotal + displayCard(graphics, 320,100);
          	
          
          
         
          	
          
          }
       } //end of action performed
        public int displayCard(Graphics graphics, int x, int y)
        {
          int card = (int)(Math.random()*13);
          //this system.out is just to help you debug what cards you got. 
          System.out.println ("card  " + card);
          //if card is 0 -- use ace which is worth 11.
          if(card == 0)
          {
            picASp.paintIcon(this, graphics, x,y);  
            return 11;
          }
          if(card == 3)
          {
        	    pic3Sp.paintIcon(this, graphics, x,y);  
            return 3;
          }
          if(card == 4)
          {
        	     pic4Sp.paintIcon(this, graphics, x, y);	
             return 4;
          }
          
           redBack.paintIcon(this, graphics, x, y);	
           return 0; 
    
        }
     
    }
