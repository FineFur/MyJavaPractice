class Pizza
{
    String crust = "Thin";
    String sauce = "Tomato";
    int size = 12;
    String topping = "Pepperoni";

    void bake()
    {
    	System.out.println("---------------------------------------------------------");
        System.out.println("Baking a " + size + " inch " + crust + " crust pizza with " + topping + "!");
        
    }

    void showOrder()
    {
    	System.out.println("---------------------------------------------------------");
        System.out.println("Crust: " + crust + " Sauce: " + sauce + " Size: " + size + " inch Topping: " + topping);
    }
}