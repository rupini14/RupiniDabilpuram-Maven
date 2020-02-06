package Sweets;

public class Kajubarfi extends Sweets {
	private int KajubarfiID;
	public Kajubarfi(String name,int weight,int price,int CandyID)
	{
		super(name,weight,price);
		this.KajubarfiID=KajubarfiID;
	}
	public String toString()
	{
		return "ID"+KajubarfiID+":"+super.toString();
	}

}
