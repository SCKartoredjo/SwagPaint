import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.lang.reflect.Field;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class ButtonPanel extends JPanel {
	public ButtonPanel(RectPanel rp) {
		super();
		// Add a button to the panel. The argument to the JButton constructor
		// will become the text on the button.
		
		Color purple = new Color(139, 0, 139);
		Color orange = new Color(255, 140, 0);
		Color navy = new Color(0, 0, 128);
		Color royalblue = new Color(65, 105, 225);
		//Color honeydew = new Color (240, 255, 240);
		Color brown = new Color (139,69, 19);
		Color maroon = new Color (128, 0, 0);
		Color grey = new Color (128, 128, 128);
		Color lightpink = new Color (255, 204, 204);
		
		//JPanel pane = new JPanel(new GridBagLayout());
		rp.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		JButton button;
		
		c.fill=GridBagConstraints.BOTH;
		//c.insets = new Insets(5,5,5,5);
		//c.anchor = GridBagConstraints.PAGE_START;
		
		button = new JButton ("Save");
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,50);
		rp.add(button, c);
		button.addActionListener(new ButtonHandler(rp));
		
		JSlider stroke = new JSlider (0, 30) ; 
		c.gridx = 2;
		c.gridy = 0;
		//c.gridwidth = 2;
		rp.add(stroke);
		stroke.addChangeListener(new SliderHandler(rp));	
		
		String[] buttonTexts = {"square", "ellipse", "line", "brush", "text","delete", "clean all"}; 
		ButtonHandler bh = new ButtonHandler(rp);
		for (int i = 0; i < buttonTexts.length; i++)
		{
			button = new JButton(buttonTexts[i]);
			c.insets = new Insets(0,0,0,50);
			if (i == 5)
				c.insets = new Insets(50,0,0,50);
			c.gridx = 0;
			c.gridy = 2+i;
			c.ipady = 20 ;
			rp.add(button, c);
			button.addActionListener(bh);
		}
		
		JTextField textField = new JTextField(20);
		c.gridx = 0;
		c.gridy = 20;
		c.ipady = 20 ;
		rp.add(textField, c);
		//textField.addKeyListener(new KeyHandler());
		
		
		c.insets = new Insets(0,0,0,0);
		
		//Color Buttons
		String[] colourButtons = {"black", "white", "red", "green", "blue", "yellow", "cyan", "magenta", "purple", "grey", "maroon", "royalblue", "navy", "orange", "brown", "pink"};
		Color[] buttonColors = {Color.black, Color.white, Color.red, Color.green, Color.blue, Color.yellow, Color.cyan, Color.magenta, purple, grey, maroon, royalblue, navy, orange, brown, lightpink };
		
		for (int i = 0; i < colourButtons.length; i++)
		{
			button = new JButton (colourButtons[i]);
			if (i >= (colourButtons.length/2)){		
				c.gridx = 4+(i-8);
				c.gridy = 1;
			}
			else{
				c.gridx = 4+i;
				c.gridy = 0;
			}
			
			rp.add(button, c);
			button.setBackground(buttonColors[i]);
			button.setForeground(buttonColors[i]);
			button.setPreferredSize(new Dimension(75,20));
			button.addActionListener(new ButtonHandler(rp));
		}
		
		c. weightx = 0.0;
		c.insets = new Insets(0,0,0,50);
	
		button = new JButton ("nofill");
		c.gridx = 2;
		c.gridy = 1;
		rp.add(button, c);
		button.addActionListener(new ButtonHandler(rp));
		
		button = new JButton ("filled");
		c.gridx = 3;
		c.gridy = 1;
		rp.add(button, c);
		button.addActionListener(new ButtonHandler(rp));
		
		button = new JButton ("nep slider") ; 
		c.gridx = 2;
		c.gridy = 0;
		c.gridwidth = 2;
		rp.add(button, c);
		
//		button = new JButton ("nep1");
//		c.gridx = 2;
//		c.gridy = 0;
//		rp.add(button, c);

	}

}