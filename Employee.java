public abstract class Employee implements Payable
{
	protected String name;
	
	
	public Employee(String name)
	{
		
		this.name = name;
	
	}
	
	public String getName()
	{
		return name;
	}
		
	public abstract double getPay();
	
	public String toString()
	{
		return String.format( "Employee:  %s ", name);
    }
}



