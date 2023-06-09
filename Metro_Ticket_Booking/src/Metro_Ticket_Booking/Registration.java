package Metro_Ticket_Booking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 637, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(242, 11, 132, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(49, 114, 88, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PH.No");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(49, 160, 70, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(49, 207, 70, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fav PL");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(49, 253, 70, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(145, 115, 154, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(145, 161, 154, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Java", "Python", "C", "Html"}));
		c1.setBounds(145, 251, 88, 22);
		frame.getContentPane().add(c1);
		
		JRadioButton r1 = new JRadioButton("male");
		r1.setFont(new Font("Tahoma", Font.BOLD, 15));
		r1.setBounds(145, 203, 70, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("female");
		r2.setFont(new Font("Tahoma", Font.BOLD, 15));
		r2.setBounds(237, 203, 98, 23);
		frame.getContentPane().add(r2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);;
		bg.add(r2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String ph=tb2.getText();
				String g;
				if(r1.isSelected())
				{
					g="Male";
				}
				else if(r2.isSelected())
				{
					g="female";
				}
				else
				{
					g="invalid";
				}
	           String p=(String) c1.getSelectedItem();
				JOptionPane.showMessageDialog(btnNewButton,"Name :"+n+"\n phno :"+ph+"\n gender :"+g+"\n Fav :"+p);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(246, 327, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
	
		
	}
}
