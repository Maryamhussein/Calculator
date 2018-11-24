import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	private String operations="";
	private String answer;

	private double firstnum;
	private double secondnum;
	private double result;


	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 264, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 22, 219, 31);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//..................Row 1.......................................//
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 111, 57, 48);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(66, 111, 57, 48);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(122, 111, 57, 48);
		frame.getContentPane().add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="+";
			}
			
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.setBounds(178, 64, 57, 48);
		frame.getContentPane().add(btnplus);
		
		//..................Row 2.......................................//
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn4.getText();
					txtDisplay.setText(EnterNumber);
						
					}
				});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 158, 57, 48);
		frame.getContentPane().add(btn4);
				
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String EnterNumber=txtDisplay.getText()+btn5.getText();
					txtDisplay.setText(EnterNumber);
						
					}
				});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(66, 158, 57, 48);
		frame.getContentPane().add(btn5);
				
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
					String EnterNumber=txtDisplay.getText()+btn6.getText();
					txtDisplay.setText(EnterNumber);
						
					}
				});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(122, 158, 57, 48);
		frame.getContentPane().add(btn6);
				
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
			}
			
			
			
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnsub.setBounds(178, 111, 57, 48);
		frame.getContentPane().add(btnsub);
				
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(EnterNumber);
						
					}
				});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 205, 57, 48);
		frame.getContentPane().add(btn1);
				
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(EnterNumber);
						
					}
				});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(66, 205, 57, 48);
		frame.getContentPane().add(btn2);
				
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(EnterNumber);
						
					}
				});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(122, 205, 57, 48);
		frame.getContentPane().add(btn3);
				
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmul.setBounds(178, 158, 57, 48);
		frame.getContentPane().add(btnmul);
				
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(EnterNumber);
						
					}
				});
		btn0.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
					}
				});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 252, 57, 48);
		frame.getContentPane().add(btn0);
				
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btndot.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndot.setBounds(66, 252, 57, 48);
		frame.getContentPane().add(btndot);
				
		JButton btnpm = new JButton("\u00B1");
		btnpm.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
			ops=ops*(-1);
			txtDisplay.setText(String.valueOf(ops));
					}
				});
		btnpm.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpm.setBounds(122, 252, 57, 48);
		frame.getContentPane().add(btnpm);
				
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum=Double.parseDouble(txtDisplay.getText());
				switch(operations) {
				
				case "+":
					result=firstnum+secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
					break;
									
				
			case "-":
				result=firstnum-secondnum;
				answer=String.format("%.2f", result);
				txtDisplay.setText(answer);
				break;
				
			case "*":
				result=firstnum * secondnum;
				answer=String.format("%.2f", result);
				txtDisplay.setText(answer);
				break;
				
			case "/":
				result=firstnum/secondnum;
				answer=String.format("%.2f", result);
				txtDisplay.setText(answer);
				break;
				
			case "%":
				result=firstnum % secondnum;
				answer=String.format("%.2f", result);
				txtDisplay.setText(answer);
				break;
								
			
								
			}
								
			
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBounds(178, 252, 57, 48);
		frame.getContentPane().add(btnequal);
				
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			firstnum=Double.parseDouble(txtDisplay.getText());
			txtDisplay.setText("");
			operations="/";
			}
				});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndiv.setBounds(178, 205, 57, 48);
		frame.getContentPane().add(btndiv);
				
		JButton btnU = new JButton("\u0025");
		btnU.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="%";
					}
				});
		btnU.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnU.setBounds(122, 64, 57, 48);
		frame.getContentPane().add(btnU);
				
		JButton button_1 = new JButton("C");
		button_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
					}
				});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(66, 64, 57, 48);
		frame.getContentPane().add(button_1);
				
		JButton btnback = new JButton();
		btnback.setText("\uF0E7");
		btnback.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			String backspace=null;
			if(txtDisplay.getText().length()>0) {
				StringBuilder strB= new StringBuilder(txtDisplay.getText());
				strB.deleteCharAt(txtDisplay.getText().length()-1);
				backspace=strB.toString();
				txtDisplay.setText(backspace);
			}
					}
				});
		btnback.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnback.setBounds(10, 64, 57, 48);
		frame.getContentPane().add(btnback);
	}
}
