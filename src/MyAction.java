import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;


public class MyAction extends AbstractAction {
	
	MyAction(String nombre){
		super(nombre);
	}

	MyAction(String nombre, char letra, int modif){
		super(nombre);
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(letra, modif));
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.print(e.getActionCommand());
	}
	
}
