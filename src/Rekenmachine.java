import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Font;

public class Rekenmachine {
	
	private JFrame frame = new JFrame("Rekenmachine");
	private JTextArea txtScreen = new JTextArea();
	
	Font font1 = new Font("SansSerif", Font.PLAIN, 25);
	
	String strNum1 = "";
	String strNum2 = "";
	String[] statement;
	int num1 = 0;
	int num2 = 0;
	String strTotal;
	int totalVal = 0;
	
	private JButton btnEqual = new JButton("=");
	
	private JButton btn0 = new JButton("0");
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");
	
	private JButton btnDelen = new JButton("/");
	private JButton btnKeer = new JButton("*");
	private JButton btnMin = new JButton("-");
	private JButton btnPlus = new JButton("+");
	private JButton btnClear = new JButton("AC");
	
	
	public Rekenmachine() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400, 550);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.orange);
		
		txtScreen.setSize(370, 100);
		txtScreen.setLocation(7, 5);
		txtScreen.setEditable(false);
		txtScreen.setFont(font1);
		
		
		btn0.setSize(100, 50);
		btn0.setLocation(140, 450);
		btn0.setBackground(Color.white);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("0");
			}
		});
		
		btn1.setSize(100, 50);
		btn1.setLocation(20, 220);
		btn1.setBackground(Color.white);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("1");
			}
		});
		
		btn2.setSize(100, 50);
		btn2.setLocation(140, 220);
		btn2.setBackground(Color.white);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("2");
			}
		});
		
		btn3.setSize(100, 50);
		btn3.setLocation(260, 220);
		btn3.setBackground(Color.white);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("3");
			}
		});
		
		btn4.setSize(100, 50);
		btn4.setLocation(20, 290);
		btn4.setBackground(Color.white);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("4");
			}
		});
		
		btn5.setSize(100, 50);
		btn5.setLocation(140, 290);
		btn5.setBackground(Color.white);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("5");
			}
		});
		
		btn6.setSize(100, 50);
		btn6.setLocation(260, 290);
		btn6.setBackground(Color.white);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("6");
			}
		});
		
		btn7.setSize(100, 50);
		btn7.setLocation(20, 360);
		btn7.setBackground(Color.white);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("7");
			}
		});
		
		btn8.setSize(100, 50);
		btn8.setLocation(140, 360);
		btn8.setBackground(Color.white);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("8");
			}
			
		});
		btn9.setSize(100, 50);
		btn9.setLocation(260, 360);
		btn9.setBackground(Color.white);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("9");
			}
		});
		
		btnDelen.setSize(70, 60);
		btnDelen.setLocation(290, 130);
		btnDelen.setBackground(Color.white);
		btnDelen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("/");
			}
		});
		
		btnKeer.setSize(70, 60);
		btnKeer.setLocation(200, 130);
		btnKeer.setBackground(Color.white);
		btnKeer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("*");
			}
		});
		
		btnMin.setSize(70, 60);
		btnMin.setLocation(110, 130);
		btnMin.setBackground(Color.white);
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("-");
			}
		});
		
		btnPlus.setSize(70, 60);
		btnPlus.setLocation(20, 130);
		btnPlus.setBackground(Color.white);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.append("+");
			}
		});
		
		btnEqual.setSize(70, 60);
		btnEqual.setLocation(290, 440);
		btnEqual.setBackground(Color.white);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtScreen.getText().contains("+")) {
					statement = txtScreen.getText().split("\\+");
					strNum1 = statement[0];
					strNum2 = statement[1];				
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);				
					totalVal = num1 + num2 ;				
					strTotal = Integer.toString(totalVal);				
					txtScreen.setText(strTotal);
				}
				else if(txtScreen.getText().contains("-")) {
					statement = txtScreen.getText().split("\\-");
					strNum1 = statement[0];
					strNum2 = statement[1];
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					totalVal = num1 - num2;
					strTotal = Integer.toString(totalVal);
					txtScreen.setText(strTotal);
				}
				else if(txtScreen.getText().contains("/")) {
					statement = txtScreen.getText().split("\\/");
					strNum1 = statement[0];
					strNum2 = statement[1];
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					totalVal = num1 / num2;
					strTotal = Integer.toString(totalVal);
					txtScreen.setText(strTotal);
				}
				else if(txtScreen.getText().contains("*")) {
					statement = txtScreen.getText().split("\\*");
					strNum1 = statement[0];
					strNum2 = statement[1];
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					totalVal = num1 * num2;
					strTotal = Integer.toString(totalVal);
					txtScreen.setText(strTotal);
				}
			}
		});
		
		btnClear.setSize(70, 60);
		btnClear.setLocation(20, 440);
		btnClear.setBackground(Color.white);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.setText("");
			}
		});
	
		frame.add(txtScreen);
		frame.add(btn0);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
		
		frame.add(btnDelen);
		frame.add(btnKeer);
		frame.add(btnMin);
		frame.add(btnPlus);
		
		frame.add(btnEqual);
		frame.add(btnClear);
	}

	public static void main(String[] args) {
		new Rekenmachine();

	}

}
