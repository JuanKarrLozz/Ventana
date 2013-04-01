import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;


public class ClaseComponentes extends Ventana {

	/*public ClaseComponentes(int x, int y, String Cadena) {
		super(x, y, Cadena);
		// TODO Auto-generated constructor stub
	}*/
	
	private JButton botonPrueba;
	
	
	public ClaseComponentes(){
		//this.botonPrueba=new JButton("Clik");
		//FlowLayout fl=new FlowLayout();
		//BorderLayout fl=new BorderLayout();
		//GridLayout fl=new GridLayout(3,5,30,50);
		//BoxLayout fl=new BoxLayout();
		
		Box izq=Box.createVerticalBox();
		ButtonGroup grupoRadio=new ButtonGroup();
		JRadioButton rButton;
		
		grupoRadio.add(rButton=new JRadioButton("Rojo"));
		izq.add(rButton);
		
		grupoRadio.add(rButton=new JRadioButton("Verde"));
		izq.add(rButton);
		
		grupoRadio.add(rButton=new JRadioButton("Azul"));
		izq.add(rButton);
		
		grupoRadio.add(rButton=new JRadioButton("Amarillo"));
		izq.add(rButton);
		
		Box der=Box.createVerticalBox();
		der.add(new JCheckBox("Hola"));
		der.add(new JCheckBox("Buenos Dias"));
		der.add(new JCheckBox("Buenas Noches"));
		der.add(new JCheckBox("Adios"));
		
		Box arriba = Box.createHorizontalBox();
		arriba.add(izq);
		arriba.add(der);
		
		Container contenedor=this.getContentPane();
		contenedor.setLayout(new BorderLayout());
		contenedor.add(arriba);
		
		
		
		/*Container contenedor=this.getContentPane();
		contenedor.setLayout(fl);
		
		for(int i=1;i<11;i++){
			contenedor.add(new JButton ("Boton"+i));
		}*/
		
		/*
		contenedor.add(new JButton("Este"),BorderLayout.EAST);
		contenedor.add(new JButton("Oeste"),BorderLayout.WEST);
		contenedor.add(new JButton("Norte"),BorderLayout.NORTH);
		contenedor.add(new JButton("Sur"),BorderLayout.SOUTH);
		*/
		
		/*for(int i=1;i<6;i++){
			contenedor.add(new JButton ("Boton"+i));
		}*/
		
		//Acomoda la Ventana a los Botones.
		this.pack();
	}
	
}
