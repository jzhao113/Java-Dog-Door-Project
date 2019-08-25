import java.util.Timer;
import java.util.TimerTask;

public class actualDoor {
	
	String openOrclose="Dog door is closed";
	private boolean insideOroutside=false;//Current status
	private Timer openTimer = new Timer();
	private TimerTask closing;
	
	
	public actualDoor()
	{
	}
	
	public boolean getStatus()
	{
		return insideOroutside;
	}
	
	public void useDoor()
	{
		closing = new TimerTask()
		{
			public void run() 
			{
				openOrclose="Dog door closed";
				System.out.println(openOrclose);
				if(insideOroutside==false)
					System.out.println("Dog is outside");
				else
					System.out.println("Dog is inside");
				System.out.println("");
				insideOroutside=!insideOroutside;
			}
			
		};
		
		openOrclose="Dog door is opened";
		System.out.println(openOrclose);
		openTimer.schedule(closing, 5000);
		
	}
	

}
