public class PayEverybody
{
	public static void main(String[] args)
	{
		CommissionEmployee emp1 = new CommissionEmployee("John Doe", 5000 ,0.05);
		
		BaseCommissionEmployee emp2 = new BaseCommissionEmployee("Pearl Evans", 4500, 0.045, 500);
			
		SalariedEmployee emp3 = new SalariedEmployee("Eze Obi", 30000);
		
		
		HourlyEmployee emp4 = new HourlyEmployee("Name of Staff", 1_000, 45);
		
		Employee[] employees = {emp1, emp2, emp3, emp4};
	
		
		// creating objects of Invoice
		Invoice inv1 = new Invoice("HP Deskjet Printer", 5, 60000);
		
		
		Invoice inv2 = new Invoice("BIC Biro", 12, 500);
		
		Invoice inv3 = new Invoice ("A4 Paper", 50, 1000);
		
		Invoice[] allInvoices = {inv1, inv2, inv3};
		
		//
		for (Invoice inv : allInvoices)
		{
			System.out.println(inv);
			System.out.printf("Amount: $ %.2f", inv.getPay());
			
			System.out.println();
			System.out.println();
		}
		
		for(Employee emp : employees)
		{
			System.out.println(emp);
			System.out.printf("Pay: $ %.2f", emp.getPay());
			
			System.out.println();
			System.out.println();
		}
		
		
	}
		
}