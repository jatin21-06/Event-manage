import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.border.*;
class Login_page extends JFrame 
{
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;


	LineBorder lb;
	ImageIcon i;
	Login_page()
	{
		super("Login Page");
                //For first label
		lb = new LineBorder(Color.blue,4);
		i = new ImageIcon("images\\login.jpg");
		l1 = new JLabel("Username : ");
		t1 = new JTextField(10);
                l3 = new JLabel(i);
		l3.setBorder(lb);  
                 //for second label
                 l2= new JLabel("Password : ");
                 t2= new JPasswordField(10);

		b1 = new JButton("Submit");
		b2 = new JButton("Exit");	
		add(l1);
		add(t1);
       		         add(l2);
       		add(t2);
		add(b1);
		add(b2);	
		setLayout(null);
		add(l3);
		l1.setBounds(185,40,120,20);
		t1.setBounds(260,40,100,20);
               		 l2.setBounds(185,80,120,20);
                		t2.setBounds(260,80,100,20);
		b1.setBounds(180,170,80,20);
		b2.setBounds(280,170,80,20);
/*
	b1.addActionListener(this);
	b2.addActionListener(this);
*/
	 l1.setForeground(Color.white);
                l2.setForeground(Color.white);
		t1.setBackground(Color.white);
		t1.setForeground(Color.black);
                t2.setBackground(Color.white);
		t2.setForeground(Color.black);
	
		setSize(400,266);
l3.setBounds(0,0,i.getIconWidth(),i.getIconHeight());

		setResizable(false);

		setLocation(
		(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
		(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
		);
setVisible(true);
	}
	
	public static void main(String args[])
	{
		new Login_page();
	}
}


























