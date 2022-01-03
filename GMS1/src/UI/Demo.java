package UI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Demo 
{
  public static void main(String[] args)
  {
	JFrame frame=new JFrame("Login user");
	Container con=frame.getContentPane();
	con.setLayout(new GridBagLayout());
	GridBagConstraints gbc=new GridBagConstraints();
	gbc.insets=new Insets(5, 5, 5, 5);
	JLabel lbemail=new JLabel("Email");
	JLabel lbpass=new JLabel("Password");
	JTextField txtemail=new JTextField(15);
	JTextField txtpass=new JTextField(15);
	JButton login=new JButton("Login");
	JButton cancel=new JButton("cancel");
	gbc.gridx=0;
	gbc.gridy=0;
	con.add(lbemail,gbc);
	
	gbc.gridx=0;
	gbc.gridy=1;
	con.add(lbpass,gbc);
	
	gbc.gridx=1;
	gbc.gridy=0;
	con.add(txtemail,gbc);
	
	gbc.gridx=1;
	gbc.gridy=1;
	con.add(txtpass,gbc);
	
	gbc.gridx=0;
	gbc.gridy=2;
	con.add(login,gbc);
	
	gbc.gridx=1;
	gbc.gridy=2;
	con.add(cancel,gbc);
	
	
	
	frame.setSize(700, 500);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setVisible(true);
	con.setLayout(null);
	con.setBackground(Color.cyan);
}
}
