package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class studentlogin extends JFrame {

	private JPanel contentPane;
	private JTextField edtusername;
	private JPasswordField edtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentlogin frame = new studentlogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public studentlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student_Login");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(10, 10, 215, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User_Name\r\n");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(10, 54, 96, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(10, 118, 96, 21);
		contentPane.add(lblNewLabel_2);
		
		edtusername = new JTextField();
		edtusername.setForeground(new Color(0, 0, 0));
		edtusername.setBounds(116, 50, 206, 29);
		contentPane.add(edtusername);
		edtusername.setColumns(10);
		
		edtpassword = new JPasswordField();
		edtpassword.setBounds(116, 112, 206, 29);
		contentPane.add(edtpassword);
		
		JButton btnNewButton = new JButton("Submit\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","Subh@m9938");
					Statement s=con.createStatement();
					String q="select * from login where username='"+edtusername.getText()+"'";
					ResultSet rs=s.executeQuery(q);
					String password="";
					String pass=String.valueOf(edtpassword.getPassword());
					while(rs.next()) {
						password=rs.getString("password");
					}
					if(pass.equals(password)) {
						 JOptionPane.showMessageDialog(null,"Username and pasword Matched");
							edtusername.setText(null);
							edtpassword.setText(null);
						//eaithi page redirect hela
						
						dispose();
						admin_portal ap =new admin_portal();
						ap.setVisible( true);
					}
					else {
						 JOptionPane.showMessageDialog(null,"bhai username and password thik kar", pass, JOptionPane.ERROR_MESSAGE);
							edtusername.setText(null);
							edtpassword.setText(null);
						
					}
				}	catch(Exception ae) {
					System.out.print(ae);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(10, 186, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edtusername.setText("");
				edtpassword.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(237, 175, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage hp = new HomePage();
				hp.setVisible(true);		}
		});
		btnNewButton_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_2.setBounds(393, 14, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel(" ");
		lblNewLabel_3.setIcon(new ImageIcon(studentlogin.class.getResource("/img/Water-Drop-Blur-HD-Wallpaper.jpg")));
		lblNewLabel_3.setBounds(0, 0, 510, 283);
		contentPane.add(lblNewLabel_3);
	}
}
