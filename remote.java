import javax.swing.*;
import java.awt.event.*;
public class remote extends JFrame{
	

	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2");
	private JButton button3 = new JButton("3");
	private JButton button4 = new JButton("4");
	private JButton button5 = new JButton("5");
	private JButton button6 = new JButton("6");
	private JButton button7 = new JButton("7");
	private JButton button8 = new JButton("8");
	private JButton button9 = new JButton("9");
	private JButton button0 = new JButton("0");
	private JButton buttonEnt = new JButton("Enter");
	private JButton setOption1 = new JButton("Window Option 1");
	private JButton setOption2 = new JButton("Window Option 2");
	private JButton setOption3 = new JButton("Window Option 3");
	private JButton backSpace = new JButton("Back Space");
	private JButton reset = new JButton("Reset Password");
	
	private JTextField field = new JTextField(13);
	private JTextField field2 = new JTextField(13);
	
	private passWord realPass;
	private String password="";
	private windowOptions thisWindow;
	private	int option=4;
	private boolean change = false;
	private boolean chance =false;

	
	
	public remote(passWord a,windowOptions b)
	{
		super();
		
		realPass=a;
		thisWindow=b;
		
		setTitle("The Remote");
		setSize(190,400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pan = new JPanel();
		
		button1.addActionListener(new myButton());
		button2.addActionListener(new myButton());
		button3.addActionListener(new myButton());
		button4.addActionListener(new myButton());
		button5.addActionListener(new myButton());
		button6.addActionListener(new myButton());
		button7.addActionListener(new myButton());
		button8.addActionListener(new myButton());
		button9.addActionListener(new myButton());
		button0.addActionListener(new myButton());
		backSpace.addActionListener(new myButton());
		reset.addActionListener(new myButton());
		setOption1.addActionListener(new myButton());
		setOption2.addActionListener(new myButton());
		setOption3.addActionListener(new myButton());
		buttonEnt.addActionListener(new myButton());
		
		pan.add(button1);
		pan.add(button2);
		pan.add(button3);
		pan.add(button4);
		pan.add(button5);
		pan.add(button6);
		pan.add(button7);
		pan.add(button8);
		pan.add(button9);
		pan.add(button0);
		pan.add(backSpace);
		pan.add(field);
		pan.add(reset);
		pan.add(setOption1);
		pan.add(setOption2);
		pan.add(setOption3);
		pan.add(field2);
		pan.add(buttonEnt);
		
		setLocationRelativeTo(null);
		
		add(pan);
		setVisible(true);
		
		
	}
	
	private class myButton implements ActionListener
	{
		public void actionPerformed(ActionEvent x)
		{
			String action = x.getActionCommand();
			if(action.equals("1"))
			{
				password=password+"1";
				field.setText(password);
			}
			else if(action.equals("2"))
			{
				password=password+"2";
				field.setText(password);
			}
			else if(action.equals("3"))
			{
				password=password+"3";
				field.setText(password);
			}
			else if(action.equals("4"))
			{
				password=password+"4";
				field.setText(password);
			}
			else if(action.equals("5"))
			{
				password=password+"5";
				field.setText(password);
			}
			else if(action.equals("6"))
			{
				password=password+"6";
				field.setText(password);
			}
			else if(action.equals("7"))
			{
				password=password+"7";
				field.setText(password);
			}
			else if(action.equals("8"))
			{
				password=password+"8";
				field.setText(password);
			}
			else if(action.equals("9"))
			{
				password=password+"9";
				field.setText(password);
			}
			else if(action.equals("0"))
			{
				password=password+"0";
				field.setText(password);
			}
			else if(action.equals("Window Option 1"))
			{
				option=1;
				field2.setText("Option 1 selected");
			}
			else if(action.equals("Window Option 2"))
			{
				field2.setText("Option 2 selected");
				option=2;
			}
			else if(action.equals("Window Option 3"))
			{
				field2.setText("Option 3 selected");
				option=3;
			}
			else if(action.equals("Enter"))
			{
				if(chance==true)
				{
					realPass.setPassword(password);
					field.setText("Password set");
					chance=false;
					password="";
				}
				else if(change==true)
				{
					if(realPass.getPassword().equals(password))
					{
						field.setText("Enter new password");
						field2.setText("");
						chance=true;
						password="";
					}
					else
					{
						field2.setText("Wrong Password");
					}
					change=false;
				}
				else if(option<4)
				{
					if(realPass.getPassword().equals(password))
					{
						thisWindow.setWindowOption(option);
						field2.setText("Changed");
					}
					else
					{
						field2.setText("Wrong Password");
					}
					option=4;
					password="";
					field.setText("");
				}
			}
			else if(action.equals("Back Space"))
			{
				if(password.length()<=1)
				{
					password="";
				}
				else
				{
					password=password.substring(0,password.length()-1);
				}
				field.setText(password);
			}
			else if(action.equals("Reset Password"))
			{
				change=true;
				field2.setText("Password Reset");
			}
		}
		
	}

}
