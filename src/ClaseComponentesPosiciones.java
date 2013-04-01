import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ClaseComponentesPosiciones extends Ventana implements MouseListener{
	
	private JButton boton;
	private JTextField txt;
	private JLabel lbl;
	
	public ClaseComponentesPosiciones(){
		super();
		
		this.setLayout(null);
		
		lbl=new JLabel("Agregar Nombre: ");
		lbl.setBounds(30, 30, 150, 100);
		this.add(lbl);
		
		txt =new JTextField();
		txt.setBounds(30, 100, 150, 40);
		this.add(txt);
		
		boton=new JButton("Click");
		boton.setBounds(30, 150, 150, 30);
		boton.addMouseListener(this);
		this.add(boton);		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Clicked x: " + e.getX() + " y: " + e.getY());
		
		lbl.setText(txt.getText());
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Pressed x: " + e.getX() + " y: " + e.getY());
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
