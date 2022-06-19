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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class TeacherLogin extends JFrame {

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
					TeacherLogin frame = new TeacherLogin();
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
	public TeacherLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Teacher_Login");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(10, 10, 186, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.setIcon(new ImageIcon(TeacherLogin.class.getResource("")));
		lblNewLabel_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(10, 45, 85, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" ");
		lblNewLabel_2.setIcon(new ImageIcon(TeacherLogin.class.getResource("")));
		lblNewLabel_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(10, 125, 85, 51);
		contentPane.add(lblNewLabel_2);
		
		edtusername = new JTextField();
		edtusername.setBounds(92, 62, 216, 34);
		contentPane.add(edtusername);
		edtusername.setColumns(10);
		
		edtpassword = new JPasswordField();
		edtpassword.setBounds(92, 137, 216, 34);
		contentPane.add(edtpassword);
		
		JButton btnNewButton = new JButton("Submit\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","");
					Statement s=con.createStatement();
					String q="select * from login where username='"+edtusername.getText()+"'";
					ResultSet rs=s.executeQuery(q);
					String password="";
					String pass=String.valueOf(edtpassword.getPassword());
					while(rs.next()) {
						password=rs.getString("password");
					}
					if(pass.equals(password)) {
						 JOptionPane.showMessageDialog(null,"Username and Password Matched");
							edtusername.setText(null);
							edtpassword.setText(null);
						dispose();
						admin_portal ap =new admin_portal();
						ap.setVisible( true);
					}
					else {
						
						 JOptionPane.showMessageDialog(null,"Please Enter Coreect Username and Password",pass, JOptionPane.ERROR_MESSAGE);
							edtusername.setText(null);
							edtpassword.setText(null);
						
					}
				}	catch(Exception ae) {
					System.out.print(ae);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(10, 200, 98, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(189, 204, 111, 35);
		contentPane.add(btnNewButton_1);
		edtusername.setText("");
		edtpassword.setText("");
		
		JButton btnNewButton_2 = new JButton(" ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				HomePage hp= new HomePage();
				hp.setVisible( true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(TeacherLogin.class.getResource("")));
		btnNewButton_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_2.setBounds(358, 3, 85, 59);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel(" ");
		lblNewLabel_3.setIcon(new ImageIcon(TeacherLogin.class.getResource("")));
		lblNewLabel_3.setBounds(219, -8, 53, 77);
		contentPane.add(lblNewLabel_3);
	}

}
