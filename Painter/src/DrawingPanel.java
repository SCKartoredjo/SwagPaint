
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;

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
	MyShape shape, shoop, sheep;
	int corx1, cory1, corx2, cory2;
	int x1, x2 , y1 , y2 ;
	RectPanel rect ;
	List<MyShape> shapeList;
	Color kleur = Color.BLUE;
	Color kleur2 = Color.BLUE;
	
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
		String c = Enumo.shapeColors.name();
		String b = Enumo.kleur.name();
		if (c == "fill"){
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
		
		if (c == "nofill"){
			if (b == "black")
				kleur2 = Color.black;	
			if (b == "white")
				kleur2 = Color.white;
			if (b == "red")
				kleur2 = Color.red;	
			if (b == "green")
				kleur2 = Color.green;	
			if (b == "blue")
				kleur2 = Color.blue;
			if (b == "yellow")
				kleur2 = Color.yellow;
			if (b == "cyan")
				kleur2 = Color.CYAN;
			if (b == "magenta")	
				kleur2 = Color.magenta;
			if (b == "purple")
				kleur2 = purples;
			if (b == "orange")
				kleur2 = oranges;
			if (b == "navy")
				kleur2 = navys;
			if (b == "royalblue")
				kleur2 = royalblue;
			if (b == "honeydew")
				kleur2 = honeydew;
			if (b == "brown")
				kleur2 = browns;
			if (b == "maroon")
				kleur2 = maroons;
			if (b == "grey")
				kleur2 = greys;
			if (b == "pink")
				kleur2 = lpink;
			rect.color2 = kleur2;
		}
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
					break ;}	
				if (t <= 0)
					rect.addText (e.getX(), e.getY());
			}	
			if(shapeList.size() <= 0 )
				rect.addText (e.getX(), e.getY());
			
		}
		if (a == "eifel")
			rect.addEifel(e.getX(), e.getY());

		if( a == "drag"){
				for (int t= shapeList.size()-1 ; t >= 0 ; t--){
					MyShape thisOne = shapeList.get(t);
					if (thisOne.contains(x1, y1)){
						shape = thisOne;
						offSetX = shape.x1;
						offSetY = shape.y1;
						offx = shape.x2;
						offy = shape.y2;
						shapeList.add( shape);
						break ;}
					else shape = null;
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
					repaint();
					break ;}
				else shoop = null;
			}	
		}
		if (a == "colorc"){
			for (int t= shapeList.size()-1 ; t >= 0 ; t--){
				System.out.println("Change!");
				MyShape thisOne = shapeList.get(t);
				if (thisOne.contains(x1, y1)){
					thisOne.setColor(kleur);
					thisOne.setColor2(kleur2);
					shapeList.add(thisOne);
					break ;}
			}
		
		}
		rect.repaint();
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


		if (a != "delete" && a != "brush" && a != "cleanAll" && a != "eraser" && a != "drag" && a != "rainbow" && a != "resize" && a != "text" && a != "eifel" && a != "colorc")
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
				shape.setCoords(offSetX +  e.getX() , offSetY + e.getY(), offx, offy + cory2 );
			else{
				shape.setCoords(corx1, cory1, corx2, cory2);
			}
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
