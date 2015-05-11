import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class MyLine extends MyShape {

	Color color;
	Line2D.Double line;
	int strokeWidth ;
	
	public MyLine() {
		super();
	}

	public MyLine(int x1, int y1, int x2, int y2,  int strokeWidth, Color color, boolean troo) {
		super(x1, y1, x2, y2, strokeWidth, color, troo);
		this.color = color;
		this.troo = troo;
		this.strokeWidth = strokeWidth ;
	}

	@Override
	public void draw(Graphics2D g) {
		line = new Line2D.Double(x1, y1, x2,y2);
		g.setStroke(new BasicStroke(strokeWidth));
		g.setPaint(color);
		g.draw(line);
	}

	@Override
	public boolean contains(int mx, int my){
		return 10 >= line.ptLineDist(mx, my);
	}
}