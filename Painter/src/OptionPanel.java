import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class OptionPanel extends JPanel{
	public OptionPanel() {}
	
	Color lightblue = new Color (153, 204, 255);
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Color color1 = Color.MAGENTA;
        Color color2 = lightblue;
        int w = getWidth();
        int h = getHeight();
        GradientPaint gp = new GradientPaint(
            0, 0, color2, 0, h, color1);
  
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
	

}
