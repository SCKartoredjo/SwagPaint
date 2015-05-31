import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextHandler implements ActionListener {

	RectPanel rect;
	
	public TextHandler (RectPanel rect){
		this.rect = rect;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println ("TEXT:" + e.getActionCommand());
	} 

}
