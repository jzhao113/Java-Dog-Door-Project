
public class barkRecognizer {
	
	private ownerDog owner;
	private bark mystery;
	
	public barkRecognizer()
	{
	}
	
	public barkRecognizer(ownerDog a, bark b)
	{
		owner=a;
		mystery=b;
	}
	public barkRecognizer(ownerDog a)
	{
		owner=a;
	}
	public void setDog(ownerDog a)
	{
		owner=a;
	}
	
	public void setBark(bark a)
	{
		mystery=a;
	}
	
	public boolean isThisBark()
	{
		if(owner.barks()==mystery)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
