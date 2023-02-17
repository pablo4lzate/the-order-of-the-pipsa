import javax.swing.SizeRequirements;
import javax.swing.event.SwingPropertyChangeSupport;

public class Pipsa {

    static String pipsaSize;
    public enum pipsaSizes {Small ,Medium, Large, Gigantic}
   
    static String pipsaType;
    public enum pipsaTypes {Pepperoni, Hawaiian, Vegetarian, Margarita, Napolitan}
    
    static String breadType;
    public enum breadType {ClassicBread, ThiccBread}
    
    private String ingredient;
    private enum pipsaIngredients {  Pepperoni, Sausage, Mushroom, Onions,
                                BellPeppers, Olives, Ham, Bacon, Pineapple,
                                Tomatoes, Spinach, Jalapeño, Chicken, Beef,
                                Anchovies, FetaCheese, Artichoke, Basil, 
                                Garlic, RicottaCheese}
   
    //Create  Pipsa
    public void classicPipsaCreate(String size, String type, String crustType){
        pipsaSize = size;
        pipsaType = type;
        breadType = crustType;
    }

    public String getPipsa() {
        return "your pipsa: " + pipsaSize+ " " + pipsaType+ " " + breadType;
    }
    
    //Pizza price calculator

    public void priceCalculate(){
        double sizePrice;
        double crustPrice;

        if (pipsaType.equalsIgnoreCase("pepperoni")){        
            switch (pipsaSize.toLowerCase()){
            case "small" : sizePrice = 9.99;
            break;
            case "medium" : sizePrice = 11.99;
            break;
            case "large" : sizePrice = 13.99;
            }
        }

    }
}
