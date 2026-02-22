class Parrot 
{
	String name = "Rio";
    String species = "Spix's macaw";
    int age = 8 ;
    String colour = "Vivid Blue";
    
    public void fly() 
    {
    	System.out.println("---------------------------------------------------------");
        System.out.println(name + " is flying.");
    }
    
    public void eat() 
    {
    	System.out.println("---------------------------------------------------------");
        System.out.println(name + " is eating seeds and nuts.");
    }
    
    void display()
    {
    	System.out.println("---------------------------------------------------------");
    	System.out.println("Name of the Parrot : " + name);
    	System.out.println("Species : " + species);
    	System.out.println("Age : " + age);
    	System.out.println("Colour : " + colour);
    }
    
    
}
    