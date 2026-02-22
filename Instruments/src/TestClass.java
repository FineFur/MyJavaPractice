
public class TestClass 
{
	public static void main(String[] args) 
	{
		Guitar gt = new Guitar();
		Drums ds = new Drums();
		
		System.out.println("Guitar");
		System.out.println("Brand : " + gt.brand);
		System.out.println("Type : " + gt.type);
		gt.play();
		gt.showInfo();
		
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Drums");
		System.out.println("Brand : " + ds.brand);
		System.out.println("Number of pieces : " + ds.pieces);
		gt.play();
		gt.showInfo();
	}
}
