public class SalariedEmployee extends Employee
{
	private double salary;
	
	public SalariedEmployee(String name, double salary)
	{
		super(name);
		
		if (salary <= 0 )
			throw new IllegalArgumentException("Salary must be >0");
		
		salary = this.salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public double getPay()
	{
		return salary;
	}
	
	@Override 
	
	public String toString()
	{
		return String.format("Salaried %s%nsalary:  \u20A6%.2f", super.toString(), salary);
	}
}