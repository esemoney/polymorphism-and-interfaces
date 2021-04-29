public class BaseCommissionEmployee extends CommissionEmployee
{
	private double baseSalary;
	
	public BaseCommissionEmployee(String name,
		double grossSales, double commissionRate,
		double baseSalary)
	{
		super(name, grossSales, commissionRate);
		
		if(baseSalary <= 0)
			throw new IllegalArgumentException(
				"base salary must be > 0");
		
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	@Override
	public double getPay()
	{
		return baseSalary + super.getPay();
	}
	
	public String toString()
	{
		return String.format("Base commission employee: %s%ngross sales: %.2f%ncommission rate: %.2f%nbase salary: %.2f",
			getName(), getGrossSales(), getCommissionRate(), baseSalary);
	}
}
