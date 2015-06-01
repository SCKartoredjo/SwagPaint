
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;
import java.awt.Color;

import javax.swing.JPanel;
public class DrawingPanel extends JPanel implements MouseListener, MouseMotionListener {
	MyLine ln;
	Color purples = new Color(139, 0, 139);
	Color oranges = new Color(255, 140, 0);
	Color navys = new Color(0, 0, 128);
	Color royalblue = new Color(65, 105, 225);
	Color honeydew = new Color (240, 255, 240);
	Color browns = new Color (139,69, 19);
	Color maroons = new Color (128, 0, 0);
	Color greys = new Color (128, 128, 128);
	Color lpink = new Color (255, 204, 204);
	MyShape shape, shoop;
	int corx1, cory1, corx2, cory2;
	int x1, x2 , y1 , y2 ;
	RectPanel rect ;
	List<MyShape> shapeList;
	Color kleur;
	
	int offSetX, offSetY, offx, offy;

	public DrawingPanel(RectPanel rp, List<MyShape> sl) {
		this.rect = rp ;
		this.shapeList = sl ;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Click");
		String a;
		a = Enumo.keuze.name();
		if (a == "cleanAll"){
			rect.deleteAll();
		}
	}

	@Override

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		String b;
		b = Enumo.kleur.name();
		if (b == "black")
			kleur = Color.black;	
		if (b == "white")
			kleur = Color.white;
		if (b == "red")
			kleur = Color.red;	
		if (b == "green")
			kleur = Color.green;	
		if (b == "blue")
			kleur = Color.blue;
		if (b == "yellow")
			kleur = Color.yellow;
		if (b == "cyan")
			kleur = Color.CYAN;
		if (b == "magenta")	
			kleur = Color.magenta;
		if (b == "purple")
			kleur = purples;
		if (b == "orange")
			kleur = oranges;
		if (b == "navy")
			kleur = navys;
		if (b == "royalblue")
			kleur = royalblue;
		if (b == "honeydew")
			kleur = honeydew;
		if (b == "brown")
			kleur = browns;
		if (b == "maroon")
			kleur = maroons;
		if (b == "grey")
			kleur = greys;
		if (b == "pink")
			kleur = lpink;
	rect.color = kleur;
		}

	@Override

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		// niet nodig
		}

	@Override
	public void mousePressed(MouseEvent e) {		
		String a;
		a = Enumo.keuze.name();
		
		System.out.println ("Pressed");
		this.x1 = e.getX();
		this.y1 = e.getY();
		offSetX = e.getX();
		offSetY = e.getY();
		
		if (a == "square")
			rect.addSquare(0,0,0,0);
		if (a == "ellipse")
			rect.addEllipse(0,0,0,0);
		if (a == "line")
			rect.addLine(0,0,0,0);
		if (a == "delete")
			rect.deleteShape(e.getX(), e.getY());
		if (a == "text"){
			for (int t= shapeList.size()-1 ; t >= 0 ; t--){
				MyShape thisOne = shapeList.get(t);
				if (thisOne.contains(x1, y1) && thisOne.getShape() == "text"){
					MyText holder = (MyText)thisOne;
					String text = rect.changeText();
					holder.changeText(text);
					//System.out.println("found TEXT");
					//Change Text
					//thisOne.setColor(Color.BLUE);
					//shapeList.add(thisOne);
					break ;}		
			}	
			rect.addText (e.getX(), e.getY());
		}
		if (a == "eifel")
			rect.addEifel(e.getX(), e.getY());
		if( a == "drag"){
			for (int t= shapeList.size()-1 ; t >= 0 ; t--){
				MyShape thisOne = shapeList.get(t);
				if (thisOne.contains(x1, y1)){
					shape = thisOne;
					shapeList.add(shape);
					break ;}
			}
			if( a == "drag"){
				for (int t= shapeList.size()-1 ; t >= 0 ; t--){
					MyShape thisOne = shapeList.get(t);
					if (thisOne.contains(x1, y1)){
						shape = thisOne;
						shapeList.add( shape);
						break ;}
				}
			}
		}
		
		if (a == "resize"){
			for (int t= shapeList.size()-1 ; t >= 0 ; t--){
				MyShape thisOne = shapeList.get(t);			
				if (thisOne.contains(x1, y1)){
					shoop = thisOne;
					shapeList.add(shoop);
					offSetX = shoop.x1;
					offSetY = shoop.y1;
					offx = shoop.x2;
					offy = shoop.y2;
					break ;
				}			
			}	
		}
	}

	
		
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		this.x2 = e.getX();
		this.y2 = e.getY();
		String a ;
		a = Enumo.keuze.name();


		if (a != "delete" && a != "brush" && a != "cleanAll" && a != "eraser" && a != "drag" && a != "rainbow" && a != "resize" && a != "text" && a != "eifel")
			shapeList.get(shapeList.size()-1).setCoords(x1, y1, x2, y2);
		if (a == "brush")
	        rect.addLine(x2, y2, e.getX(), e.getY());   
		if (a == "rainbow")
	        rect.rainbowLine(x2, y2, e.getX(), e.getY());
		if (a == "eraser")
			rect.addErase(x2,y2,e.getX(), e.getY());
		if (a == "eifel")
			rect.addEifel(x1, y1);
		if (a == "drag"){
			corx2 = e.getX() - shape.width/2;
			cory2 = e.getY() - shape.height/2;
			corx1 = e.getX() + shape.width/2;
			cory1 = e.getY() + shape.height/2;
			if (shape.getClass().equals(MyLine.class))
				shape.setCoords(offSetX +  e.getX() , offSetY + e.getY(), offx +  corx2, offy + cory2 );
			else
				shape.setCoords(corx1, cory1, corx2, cory2);
			repaint();
			}
		
		if (a == "resize"){
			corx2 = e.getX();
			cory2 = e.getY();
			shoop.setCoords(offSetX, offSetY, corx2, cory2);
			repaint();
		}
		rect.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
