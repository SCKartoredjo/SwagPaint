import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Color;

public class MyText extends MyShape {

	String text = "Hello World";
	
	
	public MyText() {
		super();
	}
	
	public MyText(int x1, int y1, int x2, int y2, int strokeWidth, Color color, boolean troo) {
		super(x1, y1, x2, y2, strokeWidth, color, troo);
		this.color = color;
	}
	
	@Override
	public void draw(Graphics2D g) {
		//System.out.println(text + " "+ x1 +  " " + y1);
		Font font = new Font("SANS_SERIF", Font.PLAIN, 24);
        g.setFont(font);
		g.setPaint(color);
		g.drawString(text, x1, y1); 
	}

	@Override
	public boolean contains(int mx, int my){
		if (mx > x1 && mx < x1+(text.length()*12))
			if (my < y1 && my > y1-24)
				return true;
		return false;
	}
	
}
