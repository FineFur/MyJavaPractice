class PuranPoli
{
    String flour    = "Wheat";
    String filling  = "Chana Dal";
    int    pieces   = 4;
    String sweetener = "Jaggery";

    void cook()
    {
        System.out.println("Cooking " + pieces + " " + flour + " PuranPoli with " + filling + " and " + sweetener + "!");
    }

    void showRecipe()
    {
        System.out.println("Flour: " + flour + " Filling: " + filling + " Pieces: " + pieces + " Sweetener: " + sweetener);
    }
}