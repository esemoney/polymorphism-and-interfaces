public class HourlyEmployee extends Employee
{
	private double hourlyRate;
	private int hoursWorked;
	
	
	public HourlyEmployee(String name, double hourlyRate, int hoursWorked)
	{
		super(name);
		
		if(hourlyRate <= 0)
			throw new IllegalArgumentException("hourly rate must be greater than zero");
		
		if(hoursWorked < 0 || hoursWorked > 168)
			throw new IllegalArgumentException("hours must be greater than zero and not exceed 168");
		
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	
	
	public int getHoursWorked()
	{
		return hoursWorked;
	}
	
	@Override
	public double getPay()
	{
		//return hoursWorked * hourlyRate;
		
		if (hoursWorked <= 40)
			return hoursWorked * hourlyRate;
		
		else
			return (40 * hourlyRate) + (((hoursWorked - 40) * (hourlyRate * 1.5) ));
	}
	
	@Override 
	public String toString()
	{
		return String.format("Hourly %s%nhours worked:  %d%nhourly rate:  ", super.toString(), hoursWorked, hourlyRate );
	}
}