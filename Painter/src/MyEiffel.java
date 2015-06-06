import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.sun.prism.paint.Color;



public class MyEiffel extends MyShape {
	
	BufferedImage img = null;
	
	public MyEiffel() {
		super();
	}
	
	public MyEiffel(int x1, int y1, int x2, int y2, int strokeWidth, Color color, Color color2, boolean troo) {
		super(x1, y1, x2, y2, strokeWidth, null, null, troo);
	}

	@Override
	public void draw(Graphics2D g) {
		//String lokatieS = "C:/Users/sckar_000/Documents/GitHub/SwagPaint/Painter/eiffel.png";
		String lokatie = "/SwagPaint/Painter/src/eiffel.png";
		String lokatieA = "C:/Users/alysha/Documents/GitHub/SwagPaint/Painter/eiffel.png";
		String LokatieS = "C:/Users/sckar_000/Documents/GitHub/SwagPaint/Painter/src/eiffel.png";
		//System.out.println("Does eiffel exists: " + new File(LokatieS).exists());
		
		try {
			img = ImageIO.read(new File(LokatieS));
		} catch (IOException e) {}
		
		g.drawImage(img, x1-img.getWidth()/2, y1-img.getHeight()/2, null);
		
		//System.out.println(x1 + " " + y1);
	}

	@Override
	public boolean contains(int mx, int my){
		if (mx > x1-img.getWidth()/2 && mx < x1+img.getWidth()/2)
			if (my > y1-img.getHeight()/2 && my < y1+img.getHeight()/2)
				return true;
		return false;
	}
	
	@Override
	public String getShape(){
		String shape = "eiffel";
		return shape;
	}
}

