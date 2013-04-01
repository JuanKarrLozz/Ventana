import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;


public class Menu extends Ventana implements ActionListener{
	
	private JMenuBar menu;
	private JMenu Archivo,Editar,Color,Figuras;
	private JMenuItem newItem,openItem,closeItem,saveItem,saveAsItem,printItem;
	private JRadioButtonMenuItem lineItem,rectangleItem,circleItem,curveItem,textItem;
	private JCheckBoxMenuItem redItem,yellowItem,greenItem,blueItem;
	
	Menu(){
		menu=new JMenuBar();
		this.setJMenuBar(menu);
				
		//Creas los Menu;
		Archivo=new JMenu("Archivo");
		Editar=new JMenu("Editar");
		Figuras=new JMenu("Figuras");
		Color=new JMenu("Colores");
		
		//Agregas al Menu Archivo;
		newItem=Archivo.add("Nuevo");
		newItem.addActionListener(this);
		openItem=Archivo.add("Abrir");
		openItem.addActionListener(this);
		printItem=Archivo.add("Imprimir");
		printItem.addActionListener(this);
		saveItem=Archivo.add("Guardar");
		saveItem.addActionListener(this);
		saveAsItem=Archivo.add("Guardar Como");
		saveAsItem.addActionListener(this);
		closeItem=Archivo.add("Cerrar");
		closeItem.addActionListener(this);
		//Agregas al Menu Archivo el Acceso Directo;
		newItem.setAccelerator(KeyStroke.getKeyStroke('N',InputEvent.CTRL_DOWN_MASK));
		openItem.setAccelerator(KeyStroke.getKeyStroke('A',InputEvent.CTRL_DOWN_MASK));
		printItem.setAccelerator(KeyStroke.getKeyStroke('I',InputEvent.CTRL_DOWN_MASK));
		saveItem.setAccelerator(KeyStroke.getKeyStroke('G',InputEvent.CTRL_DOWN_MASK));
		closeItem.setAccelerator(KeyStroke.getKeyStroke('C',InputEvent.CTRL_DOWN_MASK));		
		//Agregas al Submenu Figuras; 		
		Figuras.add(lineItem = new JRadioButtonMenuItem("Linea",false));
		lineItem.addActionListener(this);
		Figuras.add(rectangleItem = new JRadioButtonMenuItem("Rectangulo",false));
		rectangleItem.addActionListener(this);
		Figuras.add(circleItem = new JRadioButtonMenuItem("Circulo",false));
		circleItem.addActionListener(this);
		Figuras.add(curveItem = new JRadioButtonMenuItem("Curva",false));
		curveItem.addActionListener(this);
		ButtonGroup types =new ButtonGroup();
		types.add(lineItem);
		types.add(rectangleItem);
		types.add(circleItem);
		types.add(curveItem);
		//Agregas al Submenu Color;
		Color.add(redItem = new JCheckBoxMenuItem("Rojo",false));
		redItem.addActionListener(this);
		Color.add(yellowItem = new JCheckBoxMenuItem("Amarillo",false));
		yellowItem.addActionListener(this);
		Color.add(greenItem = new JCheckBoxMenuItem("Verde",false));
		greenItem.addActionListener(this);
		Color.add(blueItem = new JCheckBoxMenuItem("Azul",false));
		blueItem.addActionListener(this);
		ButtonGroup type =new ButtonGroup();
		type.add(redItem);
		type.add(yellowItem);
		type.add(greenItem);
		type.add(blueItem);
		//Asignas el Acces Directo a cada Menu;
		Editar.setMnemonic('E');
		Archivo.setMnemonic('A');
		//Agregas a la Ventana;
		Editar.add(Figuras);
		menu.add(Archivo);
		menu.add(Editar);
		Editar.add(Color);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//Archivo
		if(e.getSource().equals(newItem)){ this.repaint(); }
		if(e.getSource().equals(openItem)){ }
		if(e.getSource().equals(printItem)){}
		if(e.getSource().equals(saveItem)){}
		if(e.getSource().equals(saveAsItem)){}
		if(e.getSource().equals(closeItem)){}
		//Editar Figuras
		Pintar pinta=new Pintar();
		if(e.getSource().equals(lineItem)){
			
			pinta.PaintLine(getGraphics());
			
		}
		if(e.getSource().equals(rectangleItem)){
			pinta.PaintRectangle(getGraphics());
		}
		if(e.getSource().equals(circleItem)){
			pinta.PaintCirculo(getGraphics());
		}
		if(e.getSource().equals(curveItem)){
			pinta.PaintCurva(getGraphics());
		}
		//EditarColores
		if(e.getSource().equals(redItem)){
			
		}
		if(e.getSource().equals(redItem)){}
		if(e.getSource().equals(yellowItem)){}
		if(e.getSource().equals(greenItem)){}
		if(e.getSource().equals(blueItem)){}
	}
}
