package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AddTeacher extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTeacher frame = new AddTeacher();
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
	public AddTeacher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 675);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add_Teacher");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(82, 20, 185, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.setIcon(new ImageIcon(AddTeacher.class.getResource("")));
		lblNewLabel_1.setBounds(10, 13, 52, 52);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton(" ");
		btnNewButton.setIcon(new ImageIcon(AddTeacher.class.getResource("")));
		btnNewButton.setBounds(506, 7, 85, 64);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(10, 109, 61, 23);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(82, 109, 185, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Father'sName");
		lblNewLabel_2_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_1.setBounds(287, 109, 97, 23);
		contentPane.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(406, 109, 185, 19);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Mother'sName");
		lblNewLabel_2_1_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_1_1.setBounds(287, 166, 109, 23);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Age");
		lblNewLabel_2_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_2.setBounds(10, 166, 71, 23);
		contentPane.add(lblNewLabel_2_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(82, 166, 185, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(406, 166, 185, 19);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Address");
		lblNewLabel_2_2_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_2_1.setBounds(10, 220, 71, 23);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Phone_No");
		lblNewLabel_2_2_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_2_2.setBounds(287, 223, 71, 23);
		contentPane.add(lblNewLabel_2_2_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(82, 220, 185, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(406, 223, 185, 19);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Gender");
		lblNewLabel_2_2_1_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_2_1_1.setBounds(10, 281, 71, 23);
		contentPane.add(lblNewLabel_2_2_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		rdbtnNewRadioButton.setBounds(82, 280, 71, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Fe-male");
		rdbtnNewRadioButton_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		rdbtnNewRadioButton_1.setBounds(158, 282, 97, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("DOB");
		lblNewLabel_2_2_2_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_2_2_1.setBounds(287, 281, 71, 23);
		contentPane.add(lblNewLabel_2_2_2_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(407, 281, 184, 19);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_2_2_2_2 = new JLabel("Email");
		lblNewLabel_2_2_2_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_2_2_2.setBounds(10, 335, 71, 23);
		contentPane.add(lblNewLabel_2_2_2_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(82, 335, 185, 19);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(406, 335, 185, 19);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Teacher_id");
		lblNewLabel_2_1_1_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_1_1_1.setBounds(277, 338, 109, 23);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_2_2_2_1 = new JLabel("Department");
		lblNewLabel_2_2_2_2_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_2_2_2_1.setBounds(10, 402, 109, 23);
		contentPane.add(lblNewLabel_2_2_2_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MCA", "MBA", "B-TECH", "B-COME", "BSC", "BBA", "BCA"}));
		comboBox.setToolTipText(" ");
		comboBox.setBounds(124, 401, 131, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Submit\r\n");
		btnNewButton_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(23, 480, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_2.setBounds(422, 480, 85, 21);
		contentPane.add(btnNewButton_2);
	}
}
