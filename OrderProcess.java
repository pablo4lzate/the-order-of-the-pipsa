import java.util.Scanner;

class OrderProcess{

    String pipsaSize;
    String pipsaType;
    enum pipsaIngredients { Pepperoni, Sausage, Mushroom, Onions,
                                BellPeppers, Olives, Ham, Bacon, Pineapple,
                                Tomatoes, Spinach, Jalapeño, Chicken, Beef,
                                Anchovies, FetaCheese, Artichoke, Basil, 
                                Garlic, RicottaCheese}

    static void orderProcess(){
        
        System.out.println(
            "What would you like to do?\n\n"+
            "- 1. Choose one of our pipsas\n"+
            "- 2.Make your own pipsa");
        String orderPipsaSelection = System.console().readLine();
        
        if (orderPipsaSelection.equals("1")){
            orderExistingPipsa();
        }

        else if (orderPipsaSelection.equals("2")){
            orderCustomPipsa();
        }
        
        else {System.out.println(orderPipsaSelection+ " is not an option. Please type [1],[2], or [3]");}

    }

     static void orderExistingPipsa(){
        Menu.menu();
        
        System.out.print("\n\nPlease type the name of the pipsa you'd like to order: "); // Pipsa Type
        String pipsaSelection = System.console().readLine();


        System.out.print("\n\nPlease select a size [Small], [Medium], [Large]: "); // Pipsa Size
        String pipsaSizeSelection = System.console().readLine();

        System.out.println("Please select Crust Type: [Classic], [Thicc]");
        String pipsaCrustType = System.console().readLine();

        Pipsa classicPipsa = new Pipsa();
        classicPipsa.classicPipsaCreate(pipsaSizeSelection, pipsaSelection, pipsaCrustType);
        System.out.println(classicPipsa.getPipsa());
  
    }

    static void orderCustomPipsa(){
        
    
        Menu.printIngredients();

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please type how many ingredients from our menu you'd like to add (max is 20).");
        int ingredientsNumber = scanner.nextInt();
        scanner.nextLine();

        String[]useringredientList = new String[ingredientsNumber];
        pipsaIngredients[] availableIngredients = pipsaIngredients.values();

        for (int i=0; i<ingredientsNumber; i++){
            System.out.println("Please type your ingredient #" + (i+1));
            useringredientList[i] = scanner.nextLine();
        }

        boolean allIngredientsAvailable = true;
        for( String pipsaIngredient : useringredientList){
            boolean ingredientAvailable = false;
            for (pipsaIngredients availableIngredient : availableIngredients) {
                if(availableIngredient.name().equalsIgnoreCase(pipsaIngredient)) {
                    ingredientAvailable = true;
                    break;
                }
            }
            if (!ingredientAvailable) {
                System.out.println("The following ingredient: " + pipsaIngredient + " is not availalbe, please try again.");
                allIngredientsAvailable = false;
            }
        }

        if (allIngredientsAvailable) {
            System.out.println("Thanks!");
        }
        else orderCustomPipsa();

        System.out.print("\n\nPlease select a size [Small], [Medium], [Large]: "); // Pipsa Size
        String pipsaSizeSelection = scanner.nextLine();

        System.out.println("Please select Crust Type: [Classic], [Thicc]");
        String pipsaCrustType = scanner.nextLine();
        scanner.close();
    }
}
