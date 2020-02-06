package Sweets;

public class Chocolates extends Sweets {
	private int ChocolatesID;
	public Chocolates(String name,int weight,int price,int CandyID)
	{
		super(name,weight,price);
		this.ChocolatesID=ChocolatesID;
	}
	public String toString()
	{
		return "ID"+ChocolatesID+":"+super.toString();
	}

}
