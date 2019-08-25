import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class DogDoorMain extends JFrame{
	
	private JButton myDoggo = new JButton("Our Dog Barks");
	private JButton randomDoggo = new JButton("Random Dog Barks");
	
	private JPanel pan = new JPanel();
	
	private ownerDog ownerDog = new ownerDog("Jerry");
	private randomDog randomDog = new randomDog("Random");
	private dogDoor dogDoor = new dogDoor(ownerDog);
	
	public DogDoorMain()
	{
		super();
		setTitle("Using Doggo");
		setSize(200,110);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myDoggo.addActionListener(new myButton());
		randomDoggo.addActionListener(new myButton());
		
		pan.add(myDoggo);
		pan.add(randomDoggo);
		add(pan);
		setVisible(true);	
	}
	
	private class myButton implements ActionListener 
	{
		public void actionPerformed(ActionEvent x)
		{
			String input = x.getActionCommand();
			if(input.equals("Our Dog Barks"))
			{
				dogDoor.hearDogBark(ownerDog.barks());
			}
			else if(input.equals("Random Dog Barks"))
			{
				dogDoor.hearDogBark(randomDog.barks());
			}
		}
	}

	public static void main(String[]args)
	{
		new DogDoorMain();
	}
	
}
