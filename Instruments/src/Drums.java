class Drums 
{
    String brand    = "Pearl";
    int    pieces   = 5;
    String material = "Maple";
    String color    = "Red Sparkle";

    void play() 
    {
    	System.out.println("---------------------------------------------------------");
        System.out.println("Beating the " + brand + " " + color + " drum kit!");
    }

    void showInfo() 
    {
    	System.out.println("---------------------------------------------------------");
        System.out.println("Brand: " + brand + "Pieces: " + pieces + " Material: " + material + " Color: " + color);
    }
}