package Sweets;

public class Kitkat extends Sweets {
	private int KitkatID;
	public Kitkat(String name,int weight,int price,int CandyID)
	{
		super(name,weight,price);
		this.KitkatID=KitkatID;
	}
	public String toString()
	{
		return "ID"+KitkatID+":"+super.toString();
	}

}
