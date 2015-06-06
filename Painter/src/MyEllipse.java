import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class MyEllipse extends MyShape {

	Ellipse2D.Double ellipse;
	int strokeWidth ;
	
	public MyEllipse() {
		super();
	}
	
	public MyEllipse(int x1, int y1, int x2, int y2, int strokeWidth, Color color, Color color2, boolean troo) {
		super(x1, y1, x2, y2, strokeWidth, color, color2, troo);
		this.troo = troo;
		this.strokeWidth = strokeWidth ;
	}

	@Override
	public void draw(Graphics2D g) {
		super.draw(g);
		g.setColor(color);
		g.fillOval(startx, starty, width, height); 
			g.setColor(color2);
		g.drawOval(startx,starty,width,height);
	}

	@Override
	public boolean contains(int x, int y){
		//return ellipse.contains(x, y);
		return x >= startx && x <= startx+width && y >= starty && y <= starty+height;
	}
	
	@Override
	public String getShape(){
		String shape = "ellipse";
		return shape;
	}

}