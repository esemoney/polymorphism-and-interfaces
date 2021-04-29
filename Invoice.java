public class Invoice implements Payable
{
	private String name;
	private int qty;
	private double price;
	
	public Invoice(String name, int qty, double price)
	{
		if(qty <= 0)
			throw new IllegalArgumentException("Quantity must be greater than zero.");
		
		if(price <= 0)
			throw new IllegalArgumentException("The price of the item must be greater than zero.");
		
		this.name = name;
		this.qty = qty;
		this.price = price;
		
	}
	
	@Override
	public double getPay()
	{
		return qty * price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getQty()
	{
		return qty;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return String.format("Invoice%n Product name: %s%n Quantity: %d%n Unit Price: %.2f%n", name, qty, price);
	}
}