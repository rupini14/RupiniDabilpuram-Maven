package Sweets;

public class Newyeargift {
public static void main(String[] args)
{
	System.out.println("new year gift consists of:");
	Candy candy=new Candy("Candy",150,2,1);
	Cookie cookie=new Cookie("Cookie",130,2,2);
	Kitkat kitkat=new Kitkat("Kitkat",200,3,3);
	Kajubarfi kajubarfi=new Kajubarfi("Kajubarfi",400,4,4);
	Chocolates chocolates=new Chocolates("Chocolates",100,7,5);
	Sweets[] gift={candy,cookie,kitkat,kajubarfi,chocolates};
	for(Sweets Parametr:gift)
	{
		System.out.println(Parametr.toString());
	}
int price=candy.getPrice()+cookie.getPrice()+kitkat.getPrice()+kajubarfi.getPrice()+chocolates.getPrice();
System.out.println("price of new year gift="+price+"$");
int weight=candy.getWeight()+cookie.getWeight()+kitkat.getWeight()+kajubarfi.getWeight()+chocolates.getWeight();
System.out.println("weight of new year gift"+weight+"g");
}
}