
public class windowOptions {
	
	private actualDoor status;
	private String openOrclose="locked";
	private int chose=3;
	private boolean windowStatus=true;
	
	
	public windowOptions(actualDoor a)
	{
		status=a;
	}
	
	public void setWindowOption(int a)
	{
		chose=a;
		if(a==1)
		{
			System.out.println("Windows lock when dog goes outside");
			useOption1();
		}
		else if(a==2)
		{
			System.out.println("Windows unlock when dog goes outside");
			useOption2();
		}
		else if(a==3)
		{
			System.out.println("Windows are always locked");
			useOption3();
		}
		else
		{
			System.out.println("Invalid option");
		}
	}
	public void getWindowStatus()
	{
		if(windowStatus==true)
		{
			System.out.println("Window Status: locked");
		}
		else
		{
			System.out.println("Windows Status: unlocked");
		}
	}
	public void useWindow()
	{
		if(chose==1)
		{
			useOption1();
		}
		else if(chose==2)
		{
			useOption2();
		}
		else
		{
			useOption3();
		}
	}
	
	//true means outside,windows locked
	private void useOption1()
	{
		if(status.getStatus()==false&&windowStatus==true)
		{
			windowStatus=false;
			openOrclose="Windows are unlocked";
			System.out.println(openOrclose);
			getWindowStatus();
		}
		else
		{
			windowStatus=true;
			openOrclose="Windows are locked";
			System.out.println(openOrclose);
			getWindowStatus();
		}
	}
	
	private void useOption2()
	{
		if(status.getStatus()==true&&windowStatus==true)
		{
			windowStatus=false;
			openOrclose="Windows are unlocked";
			System.out.println(openOrclose);
			getWindowStatus();
		}
		else
		{
			windowStatus=true;
			openOrclose="Windows are locked";
			System.out.println(openOrclose);
			getWindowStatus();
		}
	}
	
	private void useOption3()
	{
		windowStatus=true;
		openOrclose="Windows will never be unlocked";
		System.out.println(openOrclose);
		getWindowStatus();
	}

}
