import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

public class RectPanel extends JPanel {
	Graphics2D g2d;
	Color color;
	int strokeWidth = 5;
	List<MyShape> shapeList; 
	boolean troo;
	char[] newText = {}; 
	MyText myText = new MyText (5000 , 5000, newText);

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
		for (MyShape s : shapeList)
			s.draw(g2d); 
		 g.drawChars(myText.newText, 0, myText.lengteChar, myText.x, myText.y);
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
	
	public void addText (int x1, int y1, char[] text){
		this.myText = new MyText (x1, y1, text);
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
	
	public void deleteAll (){
		for (int t= shapeList.size()-1 ; t >= 0 ; t--){
				//System.out.println("HALLO2");			
			MyShape thisOne = shapeList.get(t);
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
