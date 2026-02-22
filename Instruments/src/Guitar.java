class Guitar 
{
    String brand  = "Fender";
    String type   = "Electric";
    int    strings = 6;
    String color  = "Sunburst";

    void play() 
    {
    	System.out.println("---------------------------------------------------------");
        System.out.println("Strumming the " + color + " " + brand + " guitar!");
    }

    void showInfo() 
    {
    	System.out.println("---------------------------------------------------------");
        System.out.println("Brand: " + brand); 
        System.out.println("Type: " + type); 
        System.out.println("Number of Strings: " + strings);
        System.out.println("Color: " + color);
    }

}