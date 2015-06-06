import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;

public abstract class MyShape {

	protected int x1, y1, x2, y2;
	protected int strokeWidth;
	Shape shape;
	protected boolean troo;
	protected int width, height, startx, starty;
	Color color;
	Color color2;
	RectPanel rp;
	public MyShape() {
		this(0, 0, 0, 0, 3, Color.black, Color.BLACK, true);
	}

	public MyShape(int x1, int y1, int x2, int y2, int strokeWidth, Color color, Color color2, boolean troo) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.strokeWidth = strokeWidth;
		this.color = color;
		this.color2 = color2;
		this.troo = troo;
		
	}

	public void draw(Graphics2D g) {
		width = Math.abs(this.x1 - this.x2);
		height = Math.abs(this.y1 - this.y2);
		startx = Math.min(this.x1, this.x2);
		starty = Math.min(this.y1, this.y2);
		g.setStroke(new BasicStroke(strokeWidth));
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
	
	}
	
	public void setCoords(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public boolean contains(int x, int y){
		return false;
	}
	
	public String getShape(){
		String shape = "shape";
		return shape;
	}
	
	public void setColor (Color color){
		this.color = color;
	}

}