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
	
	public MyEllipse(int x1, int y1, int x2, int y2, int strokeWidth, Color color, boolean troo) {
		super(x1, y1, x2, y2, strokeWidth, color, troo);
		this.color = color;
		this.troo = troo;
		this.strokeWidth = strokeWidth ;
	}

	@Override
	public void draw(Graphics2D g) {
		super.draw(g);
		ellipse = new Ellipse2D.Double(startx, starty, width,height);
		g.setStroke(new BasicStroke(strokeWidth));
		g.setPaint(color);
		if (troo)
			g.fill(ellipse);
		g.draw(ellipse);
	}

	@Override
	public boolean contains(int x, int y){
		return ellipse.contains(x, y);
	}

}