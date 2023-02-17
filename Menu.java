public class Menu {

    public static void menu(){

        System.out.println(
            "\n|   Pizza    | Small  | Medium | Large  |\n"+
            "|------------|--------|--------|--------|\n"+
            "| Pepperoni  | $9.99  | $11.99 | $13.99 |\n"+
            "| Hawaiian   | $11.00 | $13.00 | $15.00 |\n"+
            "| Vegetarian | $10.00 | $12.00 | $14.00 |\n"+
            "| Margarita  | $9.99  | $11.99 | $13.99 |\n"+
            "| Napolitan  | $10.50 | $12.50 | $14.50 |"
        );
    }
    
    public static void printmenuPrices() {
        menu();
        System.out.println("\nThicc bread is $2.00 extra on any pizza size");
        System.out.println("Extra ingredients are $0.50 each\n");
        returnOrShowAllIngredients();
    }

   static void returnOrShowAllIngredients(){
        System.out.print("[HUB], [Ingredients]");
        String options = System.console().readLine();
        if (options.toLowerCase().equals("hub")) {Pipseria.main(null);}
        if (options.toLowerCase().equals("ingredients")) {printIngredientsAndReturn();}
        else {
            System.out.println("'"+options+"'"+" is not an option, please choose one of the given ones: ");
            returnOrShowAllIngredients();
            }
    }

    static void printIngredientsAndReturn(){
        
        System.out.println(

            "\nThis is a list of our currently available ingredients: \n\n"+
            "╔═════════════╦═══════════════╦══════════╦═══════════╦════════════════╗\n"+
            "║  Peppreoni  ║    Sausage    ║ Mushroom ║  Onions   ║  Bell Peppers  ║\n"+
            "╠═════════════╬═══════════════╬══════════╬═══════════╬════════════════╣\n"+
            "║   Olives    ║      Ham      ║  Bacon   ║ Pineapple ║    Tomatoes    ║\n"+
            "╠═════════════╬═══════════════╬══════════╬═══════════╬════════════════╣\n"+
            "║   Spinach   ║   Jalapeño    ║ Chicken  ║   Beef    ║   Anchovies    ║\n"+
            "╠═════════════╬═══════════════╬══════════╬═══════════╬════════════════╣\n"+
            "║ Feta Cheese ║ Artichoke <3s ║  Basil   ║  Garlic   ║ Ricotta Cheese ║\n"+
            "╚═════════════╩═══════════════╩══════════╩═══════════╩════════════════╝\n\n"+
            "Extra ingredients are $0.50 each.\n");

        returnOrShowAllIngredients();
    }

    static void printIngredients(){
        
        System.out.println(

            "\nThis is a list of our currently available ingredients: \n\n"+
            "╔═════════════╦═══════════════╦══════════╦═══════════╦════════════════╗\n"+
            "║  Peppreoni  ║    Sausage    ║ Mushroom ║  Onions   ║  Bell Peppers  ║\n"+
            "╠═════════════╬═══════════════╬══════════╬═══════════╬════════════════╣\n"+
            "║   Olives    ║      Ham      ║  Bacon   ║ Pineapple ║    Tomatoes    ║\n"+
            "╠═════════════╬═══════════════╬══════════╬═══════════╬════════════════╣\n"+
            "║   Spinach   ║   Jalapeño    ║ Chicken  ║   Beef    ║   Anchovies    ║\n"+
            "╠═════════════╬═══════════════╬══════════╬═══════════╬════════════════╣\n"+
            "║ Feta Cheese ║ Artichoke <3s ║  Basil   ║  Garlic   ║ Ricotta Cheese ║\n"+
            "╚═════════════╩═══════════════╩══════════╩═══════════╩════════════════╝\n\n"+
            "Extra ingredients are $0.50 each.\n");
    }
    

}
