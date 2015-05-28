import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

	OptionPanel Optp;
	RectPanel rectp;
	DrawingPanel drawp;
	
	public ButtonHandler (OptionPanel op){
		this.Optp = op;
	}

	public ButtonHandler(RectPanel rp) {
		// TODO Auto-generated constructor stub
		this.rectp = rp;
	}

	@Override
	public void actionPerformed (ActionEvent e) {
	// TODO: add code, here that will
	// be ran when the button is clicked
		String ac = e.getActionCommand();
		System.out.println("Dit is de ac: " + ac + " ");
				
		if (ac.equals("square")){
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
		else if (ac.equals("cyan")){
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
		else if (ac.equals("pink"))
			Enumo.superenum(21);
		else if (ac.equals("text"))
			Enumo.superenum(22);
		else if (ac.equals("eraser"))
			Enumo.superenum(23);
		else if (ac.equals("drag"))
			Enumo.superenum(24);
		else if (ac.equals(" "))
			Enumo.superenum(30);
		else if (ac.equals("resize"))
			Enumo.superenum(31);
		else if (ac.equals("Eifeltoren"))
			Enumo.superenum(60);
		else if (ac.equals("Color last"))
			rectp.changecolor(rectp.color);
	}
	
}

