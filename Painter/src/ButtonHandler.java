import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ChangeEvent;


public class ButtonHandler implements ActionListener {

	RectPanel rectp;
	DrawingPanel drawp;
	
	public ButtonHandler (RectPanel rp){
		this.rectp = rp;
	}

	@Override
	public void actionPerformed (ActionEvent e) {
	// TODO: add code, here that will
	// be ran when the button is clicked
		String ac = e.getActionCommand();
		
		System.out.println("Dit is de ac: " + ac + " ");
		
		if (ac.equals("Change Color")) {
		
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		rectp.color = new Color(r, g, b);
		rectp.repaint();
		} 
		
		else if (ac.equals("square")){
			//TODO add square
			Enumo.superenum(1);	
		}
		
		else if (ac.equals("ellipse")){
			//TODO add ellipse
			Enumo.superenum(2);
		}
		
		else if (ac.equals("line")){
			//TODO add line	
			Enumo.superenum(3);
		}
		else if (ac.equals("delete")){
			//TODO add delete
			Enumo.superenum(4);
		}
		else if (ac.equals("black")){
			Enumo.superenum(5);
		}
		else if (ac.equals("white")){
			Enumo.superenum(6);
		}
		else if (ac.equals("red")){
			Enumo.superenum(7);
		}
		else if (ac.equals("green")){
			Enumo.superenum(8);
		}
		else if (ac.equals("blue")){
			Enumo.superenum(9);
		}
		else if (ac.equals("yellow")){
			Enumo.superenum(10);
		}
		else if (ac.equals("cyaan")){
			Enumo.superenum(11);
		}
		else if (ac.equals("magenta")){
			Enumo.superenum(12);
		}
		else if (ac.equals("filled")){
			rectp.changebool(1);
		}
		else if (ac.equals("nofill")){
			rectp.changebool(2);
		}
		else if (ac.equals("brush")){
			Enumo.superenum(50);
		}
		else if (ac.equals("clean all")){
			Enumo.superenum(51);
		}
		else if (ac.equals("purple"))
			Enumo.superenum(13);
		else if (ac.equals("grey"))
			Enumo.superenum(14);
		else if (ac.equals("maroon"))
			Enumo.superenum(15);
		else if (ac.equals("honeydew"))
			Enumo.superenum(16);
		else if (ac.equals("royalblue"))
			Enumo.superenum(17);
		else if (ac.equals("navy"))
			Enumo.superenum(18);
		else if (ac.equals("orange"))
			Enumo.superenum(19);
		else if (ac.equals("brown"))
			Enumo.superenum(20);
		else if (ac.equals("lightpink"))
			Enumo.superenum(21);
		else if (ac.equals("text"))
			Enumo.superenum(22);
	}
	
}

