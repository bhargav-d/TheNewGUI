package SCJP;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SimpleCalci {
	JFrame jf;
	JPanel jp,jp1;
	JButton bt;
	JTextField txt;
	String []val ={"1","2","3","4","5","6","7","8","9","0","+","-","*","/","AC","=",};
public void go()
{
	jf= new JFrame("Jcalci");
	jf.setSize(300, 250);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setVisible(true);
	
	jp1 =new JPanel();
	txt = new JTextField(20);
	jf.getContentPane().add(jp1,BorderLayout.NORTH);
	jp1.add(txt);
	
	GridLayout grid = new GridLayout(4,4);
	grid.setHgap(2);
	grid.setVgap(3);
	jp = new JPanel(grid);
	jf.getContentPane().add(jp,BorderLayout.CENTER);
	for(int i=0;i<val.length;i++)
	{
		bt = new JButton(val[i]);
		jp.add(bt);
	}
	txt.requestFocus();
	bt.addActionListener(new ActionListener(){

		
		public void actionPerformed(ActionEvent ev) {
			System.out.println(ev.toString());
			txt.setText("button clicked");
			
			
			
		}
		
	} );
	
	
	}
	public static void main(String[] args)
{
	
SimpleCalci sc = new SimpleCalci();
sc.go();

}
}

