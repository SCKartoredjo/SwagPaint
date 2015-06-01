import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class ButtonPanel extends JPanel {
	public ButtonPanel(RectPanel rp, OptionPanel op, ColorPanel cp) {
		super();
		// Add a button to the panel. The argument to the JButton constructor
		// will become the text on the button.
		
		Color purple = new Color(139, 0, 139);
		Color orange = new Color(255, 140, 0);
		Color navy = new Color(0, 0, 128);
		Color royalblue = new Color(65, 105, 225);
		Color brown = new Color (139,69, 19);
		Color maroon = new Color (128, 0, 0);
		Color grey = new Color (128, 128, 128);
		Color lightpink = new Color (255, 204, 204);
		
		//JPanel pane = new JPanel(new GridBagLayout());
		op.setLayout(new GridBagLayout());
		cp.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		JButton button;
		
		c.fill=GridBagConstraints.BOTH;
		//c.insets = new Insets(5,5,5,5);
		//c.anchor = GridBagConstraints.PAGE_START;
		
		String[] buttonTexts = {"drag", "resize", "square", "ellipse", "line", "brush", "text", "eraser","delete", "clean all"}; 
		ButtonHandler bh = new ButtonHandler(op);
		for (int i = 0; i < buttonTexts.length; i++)
		{
			button = new JButton(buttonTexts[i]);
			c.insets = new Insets(0,10,0,10);
			c.gridx = 0;
			c.gridy = 2+i;
			c.ipady = 20 ;
			button.setPreferredSize(new Dimension(80,20));

			if (i == 1)
				c.insets= new Insets(0,10,50,10);
			if (i == 7){
				c.ipady = 20;
				c.insets = new Insets(50,10,0,10);}
			op.add(button, c);
			button.addActionListener(bh);
		}
		
		JTextField textBox = new JTextField("HIT ENTER!");
		c.insets = new Insets(0,10,40,10);
		c.gridx = 0;
		c.gridy = 9;
		op.add(textBox,c);
	    textBox.addActionListener(new TextHandler(rp));
	    
	    
		c.insets = new Insets(10,15,10,0);
		button = new JButton("bucket");
		c.gridx = 2;
		c.gridy = 1;
		cp.add(button, c);
		button.addActionListener(new ButtonHandler(rp));

		c.insets = new Insets(10,0,0,0);
		
		//Color Buttons
		String[] colourButtons = {"black", "grey", "white", "pink", "red", "maroon", "orange", "brown", "yellow", "green", "cyan", "blue", "magenta", "purple", "royalblue", "navy"};
		Color[] buttonColors = {Color.black, grey, Color.white, lightpink , Color.red, maroon, orange, brown, Color.yellow, Color.green, Color.cyan, Color.blue, Color.magenta, purple, royalblue, navy};
		
		for (int i = 0; i < colourButtons.length; i++)
		{
			button = new JButton (colourButtons[i]);
			if (i >= (colourButtons.length/2)){
				c.insets = new Insets(0,0,10,0);
				c.gridx = 5+(i-8);
				c.gridy = 1;
			}
			else{
				c.gridx = 5+i;
				c.gridy = 0;
			}
			cp.add(button, c);
			button.setBackground(buttonColors[i]);
			button.setForeground(buttonColors[i]);
			button.setPreferredSize(new Dimension(75,20));
			button.addActionListener(new ButtonHandler(op));
		}
		
		button = new JButton ("Eifeltoren");
		c.insets = new Insets(10,10,10,0);
		c.gridx = 14;
		c.gridy = 0;
		c.gridwidth = 2;
		cp.add(button, c);
		button.addActionListener(new ButtonHandler(rp));
		
		c. weightx = 0.0;
		
		JSlider stroke = new JSlider (0, 30) ; 
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 4;
		stroke.setOpaque(false);
		cp.add(stroke, c);
		stroke.addChangeListener(new SliderHandler(rp));
		
		c.fill = GridBagConstraints.NONE;
		c.insets = new Insets(0,0,10,0);
		
		button = new JButton ("nofill");
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 2;
		cp.add(button, c);
		button.addActionListener(new ButtonHandler(rp));

		button = new JButton ("filled");
		c.gridx = 3;
		c.gridy = 1;
		c.gridwidth =2;
		cp.add(button, c);
		button.addActionListener(new ButtonHandler(rp));
	
		button = new JButton (" ");
		c.insets = new Insets (10, 0, 0, 0);
		c.gridx = 0;
		c.gridy = 12;
		c.gridwidth =1;
		button.setForeground(Color.MAGENTA);
		button.setBackground(Color.magenta);
		button.setPreferredSize(new Dimension(30,10));
		op.add(button, c);
		button.addActionListener(new ButtonHandler(op));
		
	}
}
