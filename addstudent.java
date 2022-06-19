package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import org.junit.runner.Computer;
import com.toedter.calendar.JDateChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class addstudent extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField fathername;
	private JTextField age;
	private JTextField mothername;
	private JTextField address;
	private JTextField phone_no;
	private JTextField email_id;
	private JTextField roll_no;
	private JTextField a;
	private JTextField b;
	private JTextField gradution;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addstudent frame = new addstudent();
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
	public addstudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add_Student");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(76, 10, 216, 57);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton(" ");
		btnNewButton.setIcon(new ImageIcon(addstudent.class.getResource("/img/icons8_back_64px.png")));
		btnNewButton.setBounds(466, 9, 85, 57);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.setIcon(new ImageIcon(addstudent.class.getResource("/img/icons8_add_user_male_64px.png")));
		lblNewLabel_1.setBounds(10, 9, 71, 61);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(10, 98, 71, 23);
		contentPane.add(lblNewLabel_2);
		
		name = new JTextField();
		name.setBounds(76, 98, 158, 19);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Father's Name");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setBounds(260, 91, 123, 30);
		contentPane.add(lblNewLabel_3);
		
		fathername = new JTextField();
		fathername.setBounds(393, 98, 158, 19);
		contentPane.add(fathername);
		fathername.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Age");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_1.setBounds(10, 154, 71, 23);
		contentPane.add(lblNewLabel_2_1);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(76, 154, 158, 19);
		contentPane.add(age);
		
		JLabel lblNewLabel_3_1 = new JLabel("Mother's Name");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_1.setBounds(260, 142, 123, 30);
		contentPane.add(lblNewLabel_3_1);
		
		mothername = new JTextField();
		mothername.setColumns(10);
		mothername.setBounds(393, 146, 158, 19);
		contentPane.add(mothername);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Address");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_1_1.setBounds(10, 258, 71, 23);
		contentPane.add(lblNewLabel_2_1_1);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(76, 258, 158, 19);
		contentPane.add(address);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Phone");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_1_1.setBounds(260, 254, 123, 30);
		contentPane.add(lblNewLabel_3_1_1);
		
		phone_no = new JTextField();
		phone_no.setColumns(10);
		phone_no.setBounds(393, 258, 158, 19);
		contentPane.add(phone_no);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Email_id");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_1_1_1.setBounds(10, 310, 71, 23);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		email_id = new JTextField();
		email_id.setColumns(10);
		email_id.setBounds(76, 310, 158, 19);
		contentPane.add(email_id);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("DOB");
		lblNewLabel_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_1_1_1.setBounds(260, 204, 123, 30);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JDateChooser dob = new JDateChooser();
		dob.setBounds(393, 205, 158, 19);
		contentPane.add(dob);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Roll_No");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_1_1_1_1.setBounds(4, 371, 71, 23);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		roll_no = new JTextField();
		roll_no.setColumns(10);
		roll_no.setBounds(76, 371, 158, 19);
		contentPane.add(roll_no);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Class-X%");
		lblNewLabel_3_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_1_1_2.setBounds(260, 306, 123, 30);
		contentPane.add(lblNewLabel_3_1_1_2);
		
		a = new JTextField();
		a.setColumns(10);
		a.setBounds(393, 310, 158, 19);
		contentPane.add(a);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Class-xii %");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_1_1_1_1_1.setBounds(4, 432, 77, 23);
		contentPane.add(lblNewLabel_2_1_1_1_1_1);
		
		b = new JTextField();
		b.setColumns(10);
		b.setBounds(89, 432, 145, 19);
		contentPane.add(b);
		
		JLabel lblNewLabel_3_1_1_2_1 = new JLabel("Gradution%");
		lblNewLabel_3_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_2_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_1_1_2_1.setBounds(260, 367, 123, 30);
		contentPane.add(lblNewLabel_3_1_1_2_1);
		
		gradution = new JTextField();
		gradution.setColumns(10);
		gradution.setBounds(393, 371, 158, 19);
		contentPane.add(gradution);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"MBA", "MCA", "M-COM", "MSC", "BBA", "BCA", "B-TECH", "BSC"}));
		comboBox_1.setBounds(393, 435, 158, 30);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Course");
		lblNewLabel_2_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(10, 475, 77, 23);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1);
		
		/*JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(140, 457, 1, 1);
		contentPane.add(list);
		
		/*JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"mca", "b-tech"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBounds(140, 451, 59, -29);
		contentPane.add(list_1);
		
		*/JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"COMPUTER-SCIENCE", "MECHANICAL", "ELECTRICAL", "CIVIL", "ZOOLOGY", "BOTYNY", "PHYSICS", "CHEMISTRY", "MATH"}));
		comboBox.setBounds(76, 465, 174, 34);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("Branch");
		lblNewLabel_2_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(264, 439, 77, 23);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		rdbtnNewRadioButton.setBounds(80, 209, 61, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Fe-Male");
		rdbtnNewRadioButton_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		rdbtnNewRadioButton_1.setBounds(151, 209, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Gender");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_1_2.setBounds(10, 211, 71, 23);
		contentPane.add(lblNewLabel_2_1_2);
		
		JButton Submit = new JButton("Submit\r\n");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			/*	String Name= name .getText();
				String FatherName = fathername .getText();
				String MotherName = mothername.getText();
				String Age = age.getText();
				String Address = address.getText();
				String A=a.getText();
				String B=b.getText();
				String Gradution=gradution.getText();
				String Email_id=email_id.getText();
				String Phone_no=phone_no.getText();
				String Roll_no=roll_no.getText();
				String type=comboBox.getSelectedItem().toString();
				String type1=comboBox_1.getSelectedItem().toString();
		
				
				
				int len =((CharSequence) phone_no).length();
				if(len!=10) {
				JOptionPane.showMessageDialog(Submit,"Enter a valid mobile number" );
				}
				else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","Subh@m9938");
					
					String q="INSERT INTO student(name,father's_name,mother's_name,age,dob,address,phone_no,email_id,class-x,class-xii,gradution,roll_no,course,branch,gender)values('"+Name+"',''"+Fathername+",'"+Mothername+"','"+Age+"','"+address+"','"+phone_no+"','"+email_id+"','"+a+"','"+b+"','"+gradution+"','"+roll_no+"','"+comobBox+"','"+comboBox1+"')";
					Statement s=con.createStatement();
					int x= s.executeUpdate(q);
					if(x==0) {
						JOptionPane.showMessageDialog(Submit,"Account achi bhai" );
						
					}
					else {
						JOptionPane.showMessageDialog(Submit,"Wellcome,"
								+ "Account Sucessfully Created" );
					}
					con.close();
					}	catch(Exception ae) {
					ae.printStackTrace();
				}
				
				
				
				
				
				}
			*/	}
		});
		Submit.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		Submit.setBounds(38, 529, 103, 30);
		contentPane.add(Submit);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_2.setBounds(420, 534, 85, 21);
		contentPane.add(btnNewButton_2);
		
		
		
		JLabel lblNewLabel_4 = new JLabel(" ");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\photo &sign\\c640c1ce08ba76f0bccf0724f4ced13d.jpg"));
		lblNewLabel_4.setBounds(-5, 0, 607, 585);
		contentPane.add(lblNewLabel_4);
	}
}
