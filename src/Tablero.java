import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Tablero extends Ventana implements MouseListener,Runnable {
	
	ImageIcon img;
	JButton boton;
	JLabel reloj;
	Thread crono;
	
	Tablero(){
		this.setLayout(null);
		boton=new JButton();
		img=new ImageIcon("img/libreoffice-base.png");
		boton.setBounds(100,100,200,200);
		boton.setIcon(img);
		this.add(boton);
		boton.addMouseListener(this);
		this.reloj=new JLabel("hola");
		this.reloj.setBounds(50,50,300,50);
		this.add(reloj);
		crono=new Thread(this);
		crono.start();
	}
	boolean click=true;
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		if(click==true){
			crono.suspend();
			click=false;
		}else{
			crono.resume();
			click=true;
		}
		
		img=new ImageIcon("img/libreoffice-calc.png");
		boton.setIcon(img);	
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	int min=0,seg=0,hrs=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			for(;;){
				if(seg==59){seg=0; min++;}
				if(min==59){min=0;hrs++;}
				seg++;
				this.reloj.setText(hrs+":"+min+":"+seg);
			crono.sleep(1);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
