public class TestClass 
{
	public static void main(String[] args) 
	{
		Bike bk = new Bike();
		Car cr = new Car();
		
		System.out.println("Bike");
		System.out.println("Brand : " + bk.brand);
		System.out.println("Type : " + bk.type);
		bk.ride();
		bk.showInfo();
		
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Car");
		System.out.println("Brand : " + cr.brand);
		System.out.println("Type : " + cr.type);
		cr.drive();
		cr.showInfo();
	}
}
