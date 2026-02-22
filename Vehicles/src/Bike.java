class Bike
{
    String brand = "Yamaha";
    String type = "Sport";
    int cc = 150;
    String color = "Red";

    void ride()
    {
    	System.out.println("---------------------------------------------------------");
        System.out.println("Riding the " + color + " " + brand + " bike!");
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