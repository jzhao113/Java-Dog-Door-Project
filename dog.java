
public class dog {
	
	public String name;
	public bark theBark;
	
	public dog(String x)
	{
		name=x;
		theBark = new bark();
	}
	
	public bark barks()
	{
		return theBark;
	}
	
	public void setName(String a)
	{
		name=a;
	}
	
	public String getName()
	{
		return name;
	}
}
