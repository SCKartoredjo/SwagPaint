import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyHandler implements KeyListener{
	
	MyText thisText;
	char button;
	
	public KeyHandler (MyText myText){
		this.thisText = myText;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
			thisText.backspace = true ;
			System.out.println("e.true");
		}
		this.button = e.getKeyChar();
		
		
	}

}