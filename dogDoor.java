import java.util.*;

public class dogDoor{
	//private dog dog;
	private  ownerDog dog;
	private passWord password = new passWord("0");
	private barkRecognizer reco = new barkRecognizer();
	private actualDoor door = new actualDoor();
	private windowOptions window = new windowOptions(door);
	private remote myRemote=new remote(password,window);
	public ArrayList<bark> barkList = new ArrayList<bark>();
	
	private static Scanner sc = new Scanner(System.in);
	
	public dogDoor()
	{
		System.out.println("No Password set.\nDefault password is : 0\n");
	}
	
	public dogDoor(ownerDog a)
	{
		dog=a;
		password.setPassword("0");
		System.out.println("No Password set.\nDefault password is : 0\n");
		reco.setDog(a);
	}
	
	public dogDoor(ownerDog a, String b)
	{
		dog=a;
		password.setPassword(b);
		reco.setDog(a);
	}
	
	public void setDog(ownerDog a)
	{
		dog=a;
		reco.setDog(a);
	}
	
	public void addBarkList(bark a)
	{
		barkList.add(a);
	}
	
	public void hearDogBark(bark a)
	{
		reco.setBark(a);
		if(reco.isThisBark())
		{
			System.out.println("Correct Dog");
			door.useDoor();
			window.useWindow();
		}
		else
		{
			System.out.println("Not correct dog or animal\n");
		}
	}

}
