import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;


public class Ventana extends JFrame {
	
	final static Color BG=Color.green;
	final static Color FG=Color.BLUE;
	
	//int x,int y,String Cadena
	
	public Ventana(){
		this.init();
		//this.setTitle("Hola");
		this.setSize(800,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setVisible(true);
	}
	
	public void init(){
		this.setBackground(BG);
		this.setForeground(FG);
	}	
}
