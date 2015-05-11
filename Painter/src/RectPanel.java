import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;


public class RectPanel extends JPanel {
	Graphics2D g2d;
	Color color;
	int strokeWidth = 10;
	List<MyShape> shapeList; 
	boolean troo;
	MyText myText ;
	
	public RectPanel() {
		super();
		this.color = Color.BLACK;
		this.shapeList = new ArrayList<MyShape>();
		DrawingPanel dp = new DrawingPanel(this, shapeList);
		this.addMouseListener(dp);
		this.addMouseMotionListener(dp);
	}

	public void paintComponent(Graphics g) { 
		super.paintComponent(g); // Cast the graphics object to type Graphics2D 
		Graphics2D g2d = (Graphics2D) g; // Loop through the shapesList and draw every shape 
		int w = getWidth();
        int h = getHeight();  
        g2d.setPaint(Color.white);
        g2d.fillRect(0, 0, w, h);
		for (MyShape s : shapeList)
			s.draw(g2d); 
		//g.drawString(myText.text, myText.x, myText.y); 
		//g.drawString("abc", 500, 500);
	}
	
	public void addSquare(int x1, int y1, int x2, int y2){
		MyShape newShape ;
		newShape = new MyRectangle(x1, y1, x2, y2, strokeWidth, color, troo);
		this.repaint();
		shapeList.add(newShape);
	}
	
	public void addEllipse(int x1, int y1, int x2, int y2){
		MyShape newShape ;
		newShape = new MyEllipse(x1, y1, x2, y2, strokeWidth, color, troo);
		this.repaint();
		shapeList.add(newShape);
	}
	
	public void addLine(int x1, int y1, int x2, int y2){
		MyShape newShape ;
		newShape = new MyLine(x1, y1, x2, y2, strokeWidth, color, troo);
		this.repaint();
		shapeList.add(newShape);
	}
	
	public void addErase(int x1, int y1, int x2, int y2){
		MyShape newShape ;
		newShape = new MyLine(x1, y1, x2, y2, strokeWidth, Color.WHITE, troo);
		this.repaint();
		shapeList.add(newShape);
	}
	
	int i = 0;
	Color [] regenboog = {Color.red,Color.red, Color.red,  Color.ORANGE,Color.ORANGE,Color.ORANGE, Color.YELLOW, Color.YELLOW,Color.YELLOW, Color.green,Color.green,Color.green, Color.BLUE, Color.BLUE,Color.BLUE,Color.magenta,Color.magenta,Color.magenta };
	public void rainbowLine(int x1, int y1, int x2, int y2){
		MyShape newShape ;
		
		Color kleur = regenboog[i];
		i = i+1;
		if (i == regenboog.length)
			i = 0;
		newShape = new MyLine(x1, y1, x2, y2, strokeWidth+10, kleur, troo);
		this.repaint();
		shapeList.add(newShape);
	}
	
	public void addText (int x1, int y1, String text){
		MyText newText = new MyText(x1, y1, text);
		myText = newText ;
		this.repaint();
	}
	
	public void deleteShape (int x1,int y1){
		for (int t= shapeList.size()-1 ; t >= 0 ; t--){
			//System.out.println("HALLO2");
						
			MyShape thisOne = shapeList.get(t);
			
			if (thisOne.contains(x1, y1)){
				System.out.println("Be gone!");
				shapeList.get(t).setCoords(10000, 10000, 10000, 10000);
				this.repaint();
				break ;
			}
		}
	}
	
	public void dragShape (int xpos, int ypos, int x1, int y1, int x2, int y2){
		for (int t= shapeList.size()-1 ; t >= 0 ; t--){
			//System.out.println("HALLO2");
						
			MyShape thisOne = shapeList.get(t);			
			if (thisOne.contains(xpos, ypos)){
				System.out.println("Change!");
				
				thisOne.setX1( x2);
				thisOne.setX2(x2 - thisOne.getX2());
				thisOne.setY1(y2);
				thisOne.setY2(y2 - thisOne.getY2() );
				
				this.repaint();
				
			}
		}
	}
			
	public void deleteAll (){
		for (int t= shapeList.size()-1 ; t >= 0 ; t--){
				//System.out.println("HALLO2");			
	
			shapeList.get(t).setCoords(10000, 10000, 10000, 10000);
			this.repaint();
			}
	}
	
	public void changebool(int x) {
		// TODO Auto-generated method stub
		if (x == 1)
			troo = true;
		if (x == 2)
			troo = false;
	}
	
	public void fakeShape(int x1, int y1, int x2, int y2){
		MyShape fakeShape = new MyRectangle(x1, y1, x2, y2, strokeWidth, color, troo);
		shapeList.add(fakeShape);
		this.repaint();	
	}


}
