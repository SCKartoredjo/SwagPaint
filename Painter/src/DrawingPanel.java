
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
	int offSetX, offSetY;

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
			rect.color = Color.black;	
		if (b == "white")
			rect.color = Color.white;
		if (b == "red")
			rect.color = Color.red;	
		if (b == "green")
			rect.color = Color.green;	
		if (b == "blue")
			rect.color = Color.blue;
		if (b == "yellow")
			rect.color = Color.yellow;
		if (b == "cyan")
			rect.color = Color.CYAN;
		if (b == "magenta")	
			rect.color = Color.magenta;
		if (b == "purple")
			rect.color = purples;
		if (b == "orange")
			rect.color = oranges;
		if (b == "navy")
			rect.color = navys;
		if (b == "royalblue")
			rect.color = royalblue;
		if (b == "honeydew")
			rect.color = honeydew;
		if (b == "brown")
			rect.color = browns;
		if (b == "maroon")
			rect.color = maroons;
		if (b == "grey")
			rect.color = greys;
		if (b == "pink")
			rect.color = lpink;
	
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
				String text = rect.myText;
				rect.addText (e.getX(), e.getY(), text);
			}
			if( a == "drag"){
				for (int t= shapeList.size()-1 ; t >= 0 ; t--){
					//System.out.println("HALLO2");
								
					MyShape thisOne = shapeList.get(t);
					
					if (thisOne.contains(x1, y1)){
						shape = thisOne;
						break ;
					}
				}
			}
				if (a == "resize"){
					for (int t= shapeList.size()-1 ; t >= 0 ; t--){
						MyShape thisOne = shapeList.get(t);
					
						if (thisOne.contains(x1, y1)){
							shoop = thisOne;
							offSetX = shoop.x1;
							offSetY = shoop.y1;
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

		if (a != "delete" && a != "brush" && a != "cleanAll" && a != "eraser" && a != "drag" && a != "rainbow" && a != "resize" && a != "text"){
			shapeList.get(shapeList.size()-1).setCoords(x1, y1, x2, y2);
		}

		if (a == "brush"){
	        rect.addLine(x2, y2, e.getX(), e.getY());   
		}	

		if (a == "rainbow"){
	        rect.rainbowLine(x2, y2, e.getX(), e.getY());
		}	
		
		if (a == "eraser"){
			rect.addErase(x2,y2,e.getX(), e.getY());
		}
//		System.out.println ("Release");
//		String a ;
//		a = Enumo.keuze.name();
		if (a == "drag"){
			corx2 = e.getX() - shape.width/2;
			cory2 = e.getY() - shape.height/2;
			corx1 = e.getX() + shape.width/2;
			cory1 = e.getY() + shape.height/2;
			shape.setCoords(corx1, cory1, corx2, cory2);
			shapeList.add( shape);
			repaint();
		}
		if (a == "resize"){
			corx2 = e.getX();
			cory2 = e.getY();
			shoop.setCoords(offSetX, offSetY, corx2, cory2);
			shapeList.add(shoop);
			repaint();
		}
		
		rect.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}	
	//preview: shape maken in mousePressed, mouseDragges coordinaten doorgeven en laatste uit array aanpassen (vergeet repaint niet :))
	// delete: in myshape contains functie maken en vervolgens in iedere shape met super aanroepen, kijken of punten erin zitten
	//         met break in for loop kun je er maar eentje pakken
	// Geef sliderHandler de rp, zorg ervoor dat de waarde van de slider naar rp gaat en bij de add functies moet voor elk figuur de lijn dikte nog ge�mplementeerd worden
}
