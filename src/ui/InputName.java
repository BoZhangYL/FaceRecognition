package ui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.TextField;
import java.awt.Color;
import javax.swing.JButton;

public class InputName extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public InputName() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("\u8BF7\u8F93\u5165\u6CE8\u518C\u8005\u7684\u540D\u5B57\uFF1A");
		textField.setBounds(54, 38, 159, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText("\u6CE8\u518C\u80051\uFF1A");
		textField_1.setBounds(54, 79, 66, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText("\u6CE8\u518C\u80052\uFF1A");
		textField_2.setBounds(54, 113, 66, 21);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 79, 180, 21);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(130, 113, 180, 21);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("\u5F00\u59CB\u7EDF\u8BA1\u6570\u636E");
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(54, 169, 105, 23);
		add(btnNewButton);
		
		
	}
}
