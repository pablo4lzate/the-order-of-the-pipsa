public class CustomPipsa extends Pipsa {
    
    private enum pipsaIngredients { Pepperoni, Sausage, Mushroom, Onions,
                                BellPeppers, Olives, Ham, Bacon, Pineapple,
                                Tomatoes, Spinach, Jalapeño, Chicken, Beef,
                                Anchovies, FetaCheese, Artichoke, Basil, 
                                Garlic, RicottaCheese}
    private pipsaIngredients pipsaIngredient;

    private enum pipsaSizes {Small ,Medium, Large, Gigantic}
    private pipsaSizes pipsaSize;


    private enum breadTypes {ClassicBread, ThiccBread}
    private breadTypes breadType;

    //setter

    public void customPipsa(pipsaIngredients newPipsaIngredients, pipsaSizes newPipsaSize, breadTypes newBreadType){

        pipsaIngredient = newPipsaIngredients;
        pipsaSize = newPipsaSize;
        breadType = newBreadType;   

    }

    //getter

    public String getCustomPipsa(){
        return "Your pipsa: " + pipsaSize + " " + pipsaIngredient + " " + breadType;
    }
}

