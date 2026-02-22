class Eagle 
{
    String species = "Golden Eagle";
    float weight = 4.06f ;
    String altitude = "10,000 to 11,000 feet";
    String habitat = "Throughout the Northern Hemisphere";
    
    void hunt() 
    {
    	System.out.println("---------------------------------------------------------");
    	System.out.println("The " + species + " eagle dives from " + altitude );
    }

    void description() 
    {
    	System.out.println("---------------------------------------------------------");
    	System.out.println("Species: " + species ); 
    	System.out.println("Weight: " + weight + "kg");
    	System.out.println("Max Altitude: " + altitude );
    	System.out.println("Habitat: " + habitat);
    }
}
    
