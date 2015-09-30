import java.awt.*;
import java.applet.*;
import java.awt.event.*;

import javax.swing.JFrame;
/**

 * @author Aku
 */
public class Chronometres {
	

	private static final long serialVersionUID = 1L;
	private Chrono c1,c2;
	
	public Chronometres(){
		
		c1 = new Chrono(100);
		c1.setLocation(100,100);
		c1.setVisible(true);
		
		c2 = new Chrono(1000);
		c2.setLocation(400,100);
		c2.setVisible(true);

		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Chronometres();

	}

}
