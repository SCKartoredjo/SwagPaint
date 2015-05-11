import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSlider;


public class SliderHandler implements ChangeListener {
	RectPanel rect;
	
	public SliderHandler (RectPanel rp){
		this.rect = rp;
	}	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		System.out.println(((JSlider)e.getSource()).getValue());
		
		int x = ((JSlider)e.getSource()).getValue();
		rect.strokeWidth = x;
	}

}
