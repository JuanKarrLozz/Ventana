import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import static javax.swing.Action.*;


public class ToolBarDemo extends Ventana implements MouseListener {
	
	private MyAction miAccion;
	private JToolBar toolBar;
	private JButton btnMiAccion;
	private JPopupMenu pop;
	
	ToolBarDemo(){
		toolBar=new JToolBar();
		this.getContentPane().add(toolBar,BorderLayout.NORTH);
		miAccion=new MyAction("");
		miAccion.putValue(SMALL_ICON, new ImageIcon("img/libreoffice-base.png"));
		miAccion.putValue(SHORT_DESCRIPTION, "Bienvenido");
		btnMiAccion=new JButton(miAccion);
		btnMiAccion.setHideActionText(true);
		btnMiAccion.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(2,5,5,2),
				BorderFactory.createRaisedBevelBorder()));
		btnMiAccion=new JButton(miAccion);
		toolBar.add(btnMiAccion);
		
		pop =new JPopupMenu("General");
		pop.add(new JMenuItem("Archivo"));
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton()==e.BUTTON3){
			pop.show(this, e.getX(), e.getY());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
