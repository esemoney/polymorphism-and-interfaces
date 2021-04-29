public class EmployeeTest 
{
	public static void main(String[] args)
	{
		CommissionEmployee emp1 = new CommissionEmployee("John Doe", 5000 ,0.05);
		
		BaseCommissionEmployee emp2 = new BaseCommissionEmployee("Pearl Evans", 4500, 0.045, 500);
			
		SalariedEmployee emp3 = new SalariedEmployee("Eze Obi", 30000);
		
		
		HourlyEmployee emp4 = new HourlyEmployee("Name of Staff", 1_000, 45);
		
		Employee[] employees = {emp1, emp2, emp3, emp4};
		
		System.out.println("Processing employees polymorphically.....");
		
		for(Employee emp : employees)
		{
			System.out.println(emp);
			System.out.printf("Pay: $ %.2f", emp.getPay());
			
			System.out.println();
			System.out.println();
		}
	}
}
















