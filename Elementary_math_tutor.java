import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Elementary_math_tutor extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JLabel title,CAnswers;
	private JLabel oper_add,oper_sub,oper_mul,oper_div;
	private JLabel equal_add,equal_sub,equal_mul,equal_div;
	private JTextField add_guess,sub_guess,mul_guess,div_guess;
	private static JLabel cw_add,cw_sub,cw_mul,cw_div;
	private static JLabel sug_add,sug_sub,sug_mul,sug_div;
	private static JTextField add_firstnum,add_secondnum;
	private static JTextField sub_firstnum,sub_secondnum;
	private static JTextField mul_firstnum,mul_secondnum;
	private static JTextField div_firstnum,div_secondnum;
	private static int add_results,sub_results,mul_results,div_results;
	
	private int guess_add,guess_sub,guess_mul,guess_div;
	private static Random number = new Random();
	private JButton reset,submit,new_sequence,exit;
	//private Image check,wrong;
	
	
	public static void main(String args[]) {
		Elementary_math system = new Elementary_math();
		system.setVisible(true);
	}
	
	public static void number1_number2() {

		int num1 = number.nextInt(11);
		int num2 = number.nextInt(11);
		
		while(true)
		{
			if(num2 == 0 ) num2 = number.nextInt(11);
			else {
				if (num1 >= num2 && num1 % num2==0) break;
				else {
					num1 = number.nextInt(11);
					num2 = number.nextInt(11);
					if(num2 == 0 )num2 = number.nextInt(11);
					else continue;
				}				
			}
		}
		
		add_firstnum.setText(Integer.toString(num1));
		add_secondnum.setText(Integer.toString(num2));
		add_results = Integer.parseInt(add_firstnum.getText())+Integer.parseInt(add_secondnum.getText());
		sug_add.setText(Integer.toString(add_results));
		cw_add.setVisible(false);
		sug_add.setVisible(false);
		
		sub_firstnum.setText(Integer.toString(num1));
		sub_secondnum.setText(Integer.toString(num2));
		sub_results = Integer.parseInt(sub_firstnum.getText())-Integer.parseInt(sub_secondnum.getText());
		sug_sub.setText(Integer.toString(sub_results));
		cw_sub.setVisible(false);
		sug_sub.setVisible(false);
		
		mul_firstnum.setText(Integer.toString(num1));
		mul_secondnum.setText(Integer.toString(num2));
		mul_results = Integer.parseInt(mul_firstnum.getText())*Integer.parseInt(mul_secondnum.getText());
		sug_mul.setText(Integer.toString(mul_results));
		cw_mul.setVisible(false);
		sug_mul.setVisible(false);
		
		div_firstnum.setText(Integer.toString(num1));
		div_secondnum.setText(Integer.toString(num2));
		div_results = Integer.parseInt(div_firstnum.getText())/Integer.parseInt(div_secondnum.getText());
		sug_div.setText(Integer.toString(div_results));
		cw_div.setVisible(false);
		sug_div.setVisible(false);
	}
	public Elementary_math_tutor() {
		
		//initialize frame
		setTitle("John Liebnitz Cabaluna");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 500);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Object constructor
		title = new JLabel("Elementary Math Tutorial");
		CAnswers = new JLabel("Correct Answer");
		oper_add = new JLabel("+");
		oper_sub = new JLabel("-");
		oper_mul = new JLabel("X");
		oper_div = new JLabel("/");
		equal_add = new JLabel("=");
		equal_sub = new JLabel("=");
		equal_mul = new JLabel("=");
		equal_div = new JLabel("=");
		cw_add = new JLabel("");
		cw_sub = new JLabel("");
		cw_mul = new JLabel("");
		cw_div = new JLabel("");
		sug_add = new JLabel("");
		sug_sub = new JLabel("");
		sug_mul = new JLabel("");
		sug_div = new JLabel("");
		add_firstnum = new JTextField();
		add_secondnum = new JTextField();
		add_guess = new JTextField();
		sub_firstnum = new JTextField();
		sub_secondnum = new JTextField();
		sub_guess = new JTextField();
		mul_firstnum = new JTextField();
		mul_secondnum = new JTextField();
		mul_guess = new JTextField();
		div_firstnum = new JTextField();
		div_secondnum = new JTextField();
		div_guess = new JTextField();
		reset = new JButton("Reset All Answer");
		submit = new JButton("Submit");
		new_sequence = new JButton("New Sequence");
		exit = new JButton("Exit");
		/*
		check = new ImageIcon(this.getClass().getResource("/check.png")).getImage();
		wrong = new ImageIcon(this.getClass().getResource("/wrong.png")).getImage();
		*/
		
		//insert object to frame
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Tahoma", Font.BOLD, 16));
		title.setBounds(170, 10, 209, 26);
		contentPane.add(title);
		
		
		CAnswers.setForeground(Color.WHITE);
		CAnswers.setFont(new Font("Tahoma", Font.BOLD, 12));
		CAnswers.setBounds(460, 40, 100, 25);
		contentPane.add(CAnswers);
		
		add_firstnum.setBounds(70, 80, 50, 25);
		add_firstnum.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(add_firstnum);
		oper_add.setBounds(130, 80, 50, 25);
		oper_add.setHorizontalAlignment(SwingConstants.CENTER);
		oper_add.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(oper_add);
		add_secondnum.setBounds(190, 80, 50, 25);
		add_secondnum.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(add_secondnum);
		equal_add.setBounds(250, 80, 50, 25);
		equal_add.setHorizontalAlignment(SwingConstants.CENTER);
		equal_add.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(equal_add);
		add_guess.setBounds(320, 80, 50, 25);
		add_guess.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(add_guess);
		cw_add.setBounds(380, 80, 50, 25);
		contentPane.add(cw_add);;
		sug_add.setBounds(460, 80, 50, 25);
		sug_add.setForeground(Color.WHITE);
		contentPane.add(sug_add);
		
		sub_firstnum.setBounds(70, 135, 50, 25);
		sub_firstnum.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(sub_firstnum);
		oper_sub.setBounds(130, 135, 50, 25);
		oper_sub.setHorizontalAlignment(SwingConstants.CENTER);
		oper_sub.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(oper_sub);
		sub_secondnum.setBounds(190, 135, 50, 25);
		sub_secondnum.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(sub_secondnum);
		equal_sub.setBounds(250, 135, 50, 25);
		equal_sub.setHorizontalAlignment(SwingConstants.CENTER);
		equal_sub.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(equal_sub);
		sub_guess.setBounds(320, 135, 50, 25);
		sub_guess.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(sub_guess);
		cw_sub.setBounds(380, 135, 50, 25);
		contentPane.add(cw_sub);
		sug_sub.setBounds(460, 135, 50, 25);
		sug_sub.setForeground(Color.WHITE);
		contentPane.add(sug_sub);
		
		mul_firstnum.setBounds(70, 190, 50, 25);
		mul_firstnum.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(mul_firstnum);
		oper_mul.setBounds(130, 190, 50, 25);
		oper_mul.setHorizontalAlignment(SwingConstants.CENTER);
		oper_mul.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(oper_mul);
		mul_secondnum.setBounds(190, 190, 50, 25);
		mul_secondnum.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(mul_secondnum);
		equal_mul.setBounds(250, 190, 50, 25);
		equal_mul.setHorizontalAlignment(SwingConstants.CENTER);
		equal_mul.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(equal_mul);
		mul_guess.setBounds(320, 190, 50, 25);
		mul_guess.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(mul_guess);
		cw_mul.setBounds(380, 190, 50, 25);
		contentPane.add(cw_mul);
		sug_mul.setBounds(460, 190, 50, 25);
		sug_mul.setForeground(Color.WHITE);
		contentPane.add(sug_mul);
		
		div_firstnum.setBounds(70, 245, 50, 25);
		div_firstnum.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(div_firstnum);
		oper_div.setBounds(130, 245, 50, 25);
		oper_div.setHorizontalAlignment(SwingConstants.CENTER);
		oper_div.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(oper_div);
		div_secondnum.setBounds(190, 245, 50, 25);
		div_secondnum.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(div_secondnum);
		equal_div.setBounds(250, 245, 50, 25);
		equal_div.setFont(new Font("Tahoma", Font.BOLD, 20));
		equal_div.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(equal_div);
		div_guess.setBounds(320, 245, 50, 25);
		div_guess.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(div_guess);
		cw_div.setBounds(380, 245, 50, 25);
		contentPane.add(cw_div);
		sug_div.setBounds(460, 245, 50, 25);
		sug_div.setForeground(Color.WHITE);
		contentPane.add(sug_div);
		
		reset.setBounds(80,320,150,25);
		/*reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				add_guess.setText(null);
				sub_guess.setText(null);
				mul_guess.setText(null);
				div_guess.setText(null);
			}
		});
		*/
		reset.addActionListener(this);
		contentPane.add(reset);
		
		submit.setBounds(240,320,80,25);
		/*submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(add_guess.getText().length()==0 || sub_guess.getText().length()==0 || mul_guess.getText().length()==0 || div_guess.getText().length()==0) {
					JOptionPane.showMessageDialog(null, "Please Answer First","Elementary Math Tutorial",JOptionPane.ERROR_MESSAGE);
				}
				else{
					try {
						guess_add = Integer.parseInt(add_guess.getText());
						guess_sub = Integer.parseInt(sub_guess.getText());
						guess_mul = Integer.parseInt(mul_guess.getText());
						guess_div = Integer.parseInt(div_guess.getText());
					if(Integer.parseInt(sug_add.getText()) == guess_add) {
						cw_add.setText("Correct");
						cw_add.setForeground(Color.GREEN);
						add_guess.setForeground(Color.GREEN);
					}
					if(Integer.parseInt(sug_add.getText()) != guess_add) {
						cw_add.setText("Wrong");
						cw_add.setForeground(Color.RED);
						add_guess.setForeground(Color.RED);
						sug_add.setVisible(true);
					}
					if(Integer.parseInt(sug_sub.getText()) == guess_sub) {
						cw_sub.setText("Correct");
						cw_sub.setForeground(Color.GREEN);
						sub_guess.setForeground(Color.GREEN);
					}
					if(Integer.parseInt(sug_sub.getText()) != guess_sub) {
						cw_sub.setText("Wrong");
						cw_sub.setForeground(Color.RED);
						sub_guess.setForeground(Color.RED);
						sug_sub.setVisible(true);
					}
					if(Integer.parseInt(sug_mul.getText()) == guess_mul) {
						cw_mul.setText("Correct");
						cw_mul.setForeground(Color.GREEN);
						mul_guess.setForeground(Color.GREEN);
					}
					if(Integer.parseInt(sug_mul.getText()) != guess_mul) {
						cw_mul.setText("Wrong");
						cw_mul.setForeground(Color.RED);
						mul_guess.setForeground(Color.RED);
						sug_mul.setVisible(true);
					}
					if(Integer.parseInt(sug_div.getText()) == guess_div) {
						cw_div.setText("Correct");
						cw_div.setForeground(Color.GREEN);
						div_guess.setForeground(Color.GREEN);
					}
					if(Integer.parseInt(sug_div.getText()) != guess_div) {
						cw_div.setText("Wrong");
						cw_div.setForeground(Color.RED);
						div_guess.setForeground(Color.RED);
						sug_div.setVisible(true);
					}
					CAnswers.setVisible(true);
					add_guess.setEditable(false);
					sub_guess.setEditable(false);
					mul_guess.setEditable(false);
					div_guess.setEditable(false);
					
					cw_sub.setVisible(true);
					cw_mul.setVisible(true);
					cw_div.setVisible(true);
					cw_add.setVisible(true);
					reset.setEnabled(false);
					submit.setEnabled(false);

					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Please Answer In Number","Elementary Math Tutorial",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		*/
		submit.addActionListener(this);
		contentPane.add(submit);
		
		
		new_sequence.setBounds(330,320,140,25);
		/*new_sequence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				add_guess.setEditable(true);
				sub_guess.setEditable(true);
				mul_guess.setEditable(true);
				div_guess.setEditable(true);
				reset.setVisible(true);
				
				add_guess.setText(null);
				sub_guess.setText(null);
				mul_guess.setText(null);
				div_guess.setText(null);
				
				add_guess.setForeground(Color.BLACK);
				sub_guess.setForeground(Color.BLACK);
				mul_guess.setForeground(Color.BLACK);
				div_guess.setForeground(Color.BLACK);
	
	
				CAnswers.setVisible(false);
				reset.setEnabled(true);
				submit.setEnabled(true);
				
				number1_number2();
			}
		});
		*/
		new_sequence.addActionListener(this);
		contentPane.add(new_sequence);
		

		exit.setBounds(240,350,80,25);
		/*exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				JOptionPane.showMessageDialog(null, "Thank You For Using Elementary Math Tutorial","Elementary Math Tutorial",JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		});*/
		exit.addActionListener(this);
		contentPane.add(exit);
		
		
		CAnswers.setVisible(false);
		number1_number2();
		add_firstnum.setEditable(false);
		add_secondnum.setEditable(false);
		sub_firstnum.setEditable(false);
		sub_secondnum.setEditable(false);
		mul_firstnum.setEditable(false);
		mul_secondnum.setEditable(false);
		div_firstnum.setEditable(false);
		div_secondnum.setEditable(false);

	}

	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == reset) {
			add_guess.setText(null);
			sub_guess.setText(null);
			mul_guess.setText(null);
			div_guess.setText(null);
		}
		
		if(evt.getSource() == exit) {
			dispose();
			JOptionPane.showMessageDialog(null, "Thank You For Using Elementary Math Tutorial","Elementary Math Tutorial",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);	
		}
		
		if(evt.getSource() == new_sequence) {
			add_guess.setEditable(true);
			sub_guess.setEditable(true);
			mul_guess.setEditable(true);
			div_guess.setEditable(true);
			reset.setVisible(true);
			
			add_guess.setText(null);
			sub_guess.setText(null);
			mul_guess.setText(null);
			div_guess.setText(null);
			
			add_guess.setForeground(Color.BLACK);
			sub_guess.setForeground(Color.BLACK);
			mul_guess.setForeground(Color.BLACK);
			div_guess.setForeground(Color.BLACK);


			CAnswers.setVisible(false);
			reset.setEnabled(true);
			submit.setEnabled(true);
			
			number1_number2();
		}
		
		if(evt.getSource() == submit) {

				if(add_guess.getText().length()==0 || sub_guess.getText().length()==0 || mul_guess.getText().length()==0 || div_guess.getText().length()==0) {
					JOptionPane.showMessageDialog(null, "Please Answer First","Elementary Math Tutorial",JOptionPane.ERROR_MESSAGE);
				}
				else{
					try {
						guess_add = Integer.parseInt(add_guess.getText());
						guess_sub = Integer.parseInt(sub_guess.getText());
						guess_mul = Integer.parseInt(mul_guess.getText());
						guess_div = Integer.parseInt(div_guess.getText());
					if(Integer.parseInt(sug_add.getText()) == guess_add) {
						cw_add.setText("Correct");
						cw_add.setForeground(Color.GREEN);
						add_guess.setForeground(Color.GREEN);
					}
					if(Integer.parseInt(sug_add.getText()) != guess_add) {
						cw_add.setText("Wrong");
						cw_add.setForeground(Color.RED);
						add_guess.setForeground(Color.RED);
						sug_add.setVisible(true);
					}
					if(Integer.parseInt(sug_sub.getText()) == guess_sub) {
						cw_sub.setText("Correct");
						cw_sub.setForeground(Color.GREEN);
						sub_guess.setForeground(Color.GREEN);
					}
					if(Integer.parseInt(sug_sub.getText()) != guess_sub) {
						cw_sub.setText("Wrong");
						cw_sub.setForeground(Color.RED);
						sub_guess.setForeground(Color.RED);
						sug_sub.setVisible(true);
					}
					if(Integer.parseInt(sug_mul.getText()) == guess_mul) {
						cw_mul.setText("Correct");
						cw_mul.setForeground(Color.GREEN);
						mul_guess.setForeground(Color.GREEN);
					}
					if(Integer.parseInt(sug_mul.getText()) != guess_mul) {
						cw_mul.setText("Wrong");
						cw_mul.setForeground(Color.RED);
						mul_guess.setForeground(Color.RED);
						sug_mul.setVisible(true);
					}
					if(Integer.parseInt(sug_div.getText()) == guess_div) {
						cw_div.setText("Correct");
						cw_div.setForeground(Color.GREEN);
						div_guess.setForeground(Color.GREEN);
					}
					if(Integer.parseInt(sug_div.getText()) != guess_div) {
						cw_div.setText("Wrong");
						cw_div.setForeground(Color.RED);
						div_guess.setForeground(Color.RED);
						sug_div.setVisible(true);
					}
					CAnswers.setVisible(true);
					add_guess.setEditable(false);
					sub_guess.setEditable(false);
					mul_guess.setEditable(false);
					div_guess.setEditable(false);
					
					cw_sub.setVisible(true);
					cw_mul.setVisible(true);
					cw_div.setVisible(true);
					cw_add.setVisible(true);
					reset.setEnabled(false);
					submit.setEnabled(false);

					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Please Answer In Number","Elementary Math Tutorial",JOptionPane.ERROR_MESSAGE);
					}
				}
		}
	}	
}
