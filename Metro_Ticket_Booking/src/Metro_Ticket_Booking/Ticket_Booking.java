package Metro_Ticket_Booking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ticket_Booking {

	private JFrame frame;
	private JTextField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket_Booking window = new Ticket_Booking();
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
	public Ticket_Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 648, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(115, 25, 183, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\download (1).png"));
		lblNewLabel_1.setBounds(368, 24, 204, 203);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(41, 146, 66, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("From");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(41, 195, 66, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("To");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(41, 249, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tickets");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(41, 298, 66, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb3 = new JTextField();
		tb3.setBounds(146, 145, 123, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "Nagole", "Uppal", "Stadium", "NGRI"}));
		c2.setBounds(146, 193, 123, 22);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"select", "Ameerpet", "Kukatpally", "KPHB", "JNTUH", ""}));
		c3.setBounds(146, 247, 123, 22);
		frame.getContentPane().add(c3);
		
		JComboBox c4 = new JComboBox();
		c4.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		c4.setBounds(146, 296, 66, 22);
		frame.getContentPane().add(c4);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb3.getText();
				String f=(String) c2.getSelectedItem();
				String t=(String) c3.getSelectedItem();
				String t1=(String) c4.getSelectedItem();
				int Tickets=Integer.parseInt(t1);
				int bill=Tickets*10;
				JOptionPane.showMessageDialog(btnNewButton,"HEllo  "+n+"\n From : "+f+"\n  To     : "+t+"\n  Tickets :   "+t1+"\n  Bill :"+bill);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(279, 360, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
