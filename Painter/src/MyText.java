import java.util.Scanner;

public class MyText {

	char[] newText = {};
	int x = 0;
	int y = 0;
	int lengteChar = 0;
	Boolean backspace ;
	Scanner cin = new Scanner(System.in);
	
	public MyText(int x, int y, char[] text){
		this.x = x;
		this.y = y ;
		this.newText = text;
		this.lengteChar = text.length;
		changeText (text);
	}
	
	public void changeText (char[] newText){
			System.out.println("lengteChar: " + lengteChar + " " +  "x=" + " " + x + "y=" + y);	
	}
	
}
