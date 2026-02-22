
public class TestClass 
{
	public static void main(String[] args) 
	{
		Pizza p1 = new Pizza();
		PuranPoli p2 = new PuranPoli();
		
		System.out.println("Pizza");
		System.out.println("Crust used : " + p1.crust);
		System.out.println("Sauce Used : " + p1.sauce);
		p1.bake();
		p1.showOrder();
		
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Puranpoli");
		System.out.println("Flour Used : " + p2.flour);
		System.out.println("Filling is : " + p2.filling);
		System.out.println("---------------------------------------------------------");
		p2.cook();
		System.out.println("---------------------------------------------------------");
		p2.showRecipe();
	}
}
