import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class Frame1 {

	private JFrame frame;
	private JTextField textFieldNum2;
	private JTextField textFieldNum1;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 1235, 713);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textFieldNum2.setForeground(Color.BLACK);
		textFieldNum2.setBounds(683, 45, 420, 108);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textFieldNum1.setForeground(Color.BLACK);
		textFieldNum1.setBounds(112, 45, 420, 108);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans =num1+num2;
					textFieldAns.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton.setBounds(112, 268, 219, 108);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSubtract = new JButton("MINUS");
		btnSubtract.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubtract.setForeground(Color.BLACK);
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1-num2;
					textFieldAns.setText(Integer.toString(ans));
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnSubtract.setBounds(367, 268, 209, 108);
		frame.getContentPane().add(btnSubtract);
		
		textFieldAns = new JTextField();
		textFieldAns.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textFieldAns.setBounds(487, 488, 420, 108);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblTheAnswerIs = new JLabel("The Answer is");
		lblTheAnswerIs.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblTheAnswerIs.setBounds(168, 507, 179, 44);
		frame.getContentPane().add(lblTheAnswerIs);
		
		JButton btnNewButton_1 = new JButton("MULTIPLY");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1*num2;
					textFieldAns.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,"Please enter valid number");
				}
			}
		});
		btnNewButton_1.setBounds(622, 268, 209, 108);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnDivide = new JButton("DIVIDE");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1/num2;
					textFieldAns.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,"Please enter valid number");
				}
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDivide.setBounds(876, 268, 209, 108);
		frame.getContentPane().add(btnDivide);
	}
}
