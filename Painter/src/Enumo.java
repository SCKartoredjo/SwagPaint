public class Enumo {
	enum Keuze {square, ellipse, line, brush, delete, cleanAll, text, eraser, drag, rainbow} ;
	enum Kleur {black, white, red, green, blue, yellow, cyan, magenta, purple, grey, maroon, honeydew, royalblue, navy, orange, brown, pink};


	
	static Keuze keuze = Keuze.brush;
	static Kleur kleur = Kleur.black;
	int x;
	
	public static void superenum (int x){	
		
		if (x == 1)
			keuze = Keuze.square;
		if (x == 2)
			keuze = Keuze.ellipse;
		if (x == 3)
			keuze = Keuze.line;
		if (x == 4)
			keuze = Keuze.delete;
		if (x == 5)
			kleur = Kleur.black;
		if (x == 6)
			kleur = Kleur.white;
		if (x == 7)
			kleur = Kleur.red;
		if (x == 8)
			kleur = Kleur.green;
		if (x == 9)
			kleur = Kleur.blue;
		if (x == 10)
			kleur = Kleur.yellow;
		if (x == 11)
			kleur = Kleur.cyan;
		if (x == 12)
			kleur = Kleur.magenta;
		if (x == 50)
			keuze = Keuze.brush;
		if (x == 51)
			keuze = Keuze.cleanAll;
		if (x == 13)
			kleur = Kleur.purple;
		if (x == 14)
			kleur = Kleur.grey;
		if (x == 15)
			kleur = Kleur.maroon;
		if (x == 16)
			kleur = Kleur.honeydew;
		if (x == 17)
			kleur = Kleur.royalblue;
		if (x == 18)
			kleur = Kleur.navy;
		if (x == 19)
			kleur = Kleur.orange;
		if (x == 20)
			kleur = Kleur.brown;
		if (x == 21)
			kleur = Kleur.pink;
		if (x == 22)
			keuze = Keuze.text;
		if (x == 23)
			keuze = Keuze.eraser;
		if (x == 24)
			keuze = Keuze.drag;
		if (x == 30)
			keuze = Keuze.rainbow;

		System.out.print("Keuze is: " + keuze + "\n");	
	}
	
}
