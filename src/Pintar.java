import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Pintar extends JFrame {
	
	final static Color Red=Color.RED;
	final static Color Blue=Color.BLUE;
	final static Color Yellow=Color.YELLOW;
	final static Color Green=Color.GREEN;
		
	public void PaintLine(Graphics g){
		
		g.drawLine(100, 150, 100, 300);
	}
	public void PaintRectangle(Graphics g){
		g.drawRect(100, 150, 50, 100);
	}
	public void PaintCirculo(Graphics g){
		g.drawOval(100, 200, 100, 100);
	}
	public void PaintCurva(Graphics g){
		g.drawArc(200,200,30,100,50,50);
	}	
	
}
