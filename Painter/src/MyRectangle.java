import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class MyRectangle extends MyShape {
	int strokeWidth;

	public MyRectangle() {
		super();
	}

	public MyRectangle(int x1, int y1, int x2, int y2, int strokeWidth, Color color, Color color2, boolean troo){
		super(x1, y1, x2, y2, strokeWidth, color, color2, troo);
		this.troo = troo;	
		this.strokeWidth = strokeWidth;
	}
	
	@Override
	public void draw(Graphics2D g) {
		super.draw(g);
		
		g.setColor(color);
		g.fillRect(startx, starty, width, height); //to fill a certain rect with the selected color.
			g.setColor(color2);
		g.drawRect(startx,starty,width,height);//this will draw your border. 

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