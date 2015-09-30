import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 * @author Aku
 */
public class Chrono extends JFrame implements ActionListener,Runnable 
{	

	private static final long serialVersionUID = 1L;
	public int seconde = 0,tempo;
	public String sec;
    private JButton btn,quitter;
    private JTextField tf;
	private Boolean drap = false;
		
	public Chrono(int t){
		tempo = t;
		aspect();			
	}
	

	private void aspect()
	{		
		setLayout(null);
		setSize(250,300);
		btn = new JButton("Start");
		btn.setBounds ( 20,  50,  80,  20);
		btn.addActionListener(this);
		add(btn);
		
		tf = new JTextField();
		tf.setText(String.valueOf(seconde));
		tf.setBounds ( 120,  50,  50,  20);
		add(tf);
		
		
    	quitter = new JButton("quitter");
    	quitter.setBounds(20, 200, 80, 30);
    	quitter.addActionListener(this);
    	add(quitter);				
		
	}
	

	public void actionPerformed(ActionEvent e)
	{	
		if(e.getActionCommand() == "quitter"){ 
			dispose();
		}
		if(!drap){
			drap = true;
			new Thread(this).start();
		}
		else {
			drap = false;
			Thread.interrupted();			
		}
	}		
		

	@Override

	public void run()
	{		
		while(drap){			
				System.out.println(seconde);seconde++;			
				try
				{
					Thread.sleep(tempo);	
					tf.setText(String.valueOf(seconde));
					repaint();								
				}
			    catch(InterruptedException e){};				
		}
	}
}
