class Car
{
    String brand = "Toyota";
    String type = "SUV";
    int cc = 2000;
    String color = "White";

    void drive()
    {
    	System.out.println("---------------------------------------------------------");
        System.out.println("Driving the " + color + " " + brand + " car!");
    }

    void showInfo()
    {
    	System.out.println("---------------------------------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type); 
        System.out.println("Engine Capacity : " + cc + "CC"); 
        System.out.println("Color: " + color);
    }
}