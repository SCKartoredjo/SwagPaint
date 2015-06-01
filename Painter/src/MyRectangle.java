import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class MyRectangle extends MyShape {

	//Color color;
	int strokeWidth;

	public MyRectangle() {
		super();
	}

	public MyRectangle(int x1, int y1, int x2, int y2, int strokeWidth, Color color, boolean troo){
		super(x1, y1, x2, y2, strokeWidth, color, troo);
		//this.color = color;
		this.troo = troo;	
		this.strokeWidth = strokeWidth;
	}
	
	@Override
	public void draw(Graphics2D g) {
		super.draw(g);
		Rectangle2D.Double rect = new Rectangle2D.Double(startx, starty, width,height);
		g.setPaint(color);
		g.setStroke(new BasicStroke(strokeWidth));
		if (troo)
			g.fill(rect);
		
		g.draw(rect);
	}
	@Override
	public boolean contains(int x, int y){
		return x >= startx && x <= startx+width && y >= starty && y <= starty+height;
	}
	
	@Override
	public String getShape(){
		String shape = "rectangle";
		return shape;
	}

}