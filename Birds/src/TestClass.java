public class TestClass 
{
	public static void main(String[] args)
	{
		Eagle e1 = new Eagle();
		Parrot p1 = new Parrot();
		
		System.out.println(e1.species);
		System.out.println(e1.weight + " Kilograms");
		e1.hunt();
		e1.description();
		
		System.out.println("");
		System.out.println("---------------------------------------------------------");
		System.out.println("");
		System.out.println("Name of the Parrot : " + p1.name);
		System.out.println("Species : " + p1.species);
		p1.fly();
		p1.eat();
		p1.display();
		
	}
}
