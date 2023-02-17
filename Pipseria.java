class Pipseria {

    public static void main (String[]args){
        WelcomeMessage();
        hubPage();
        
    }

    public static void WelcomeMessage(){
        System.out.println("=======================================");
        System.out.println("           Pipsería Lofrito");
        System.out.println("=======================================");
        System.out.println();
        System.out.println("Welcome to our pizza page.\n");


    }

    public static void hubPage(){
        System.out.println("- [Order]");
        System.out.println("- [Menu]");
        System.out.println("- [Exit]");
        System.out.print("\nPlease select one of our options: ");

        String hubPageSelection = System.console().readLine();
        String hubPageSelectionLowerCase = hubPageSelection.toLowerCase();
        

        switch (hubPageSelectionLowerCase){

            case "order": OrderProcess.orderProcess();
            break;

            case "menu": Menu.printmenuPrices();
            break;

            case "exit":
            break;
            
            default:
            System.out.println("=======================================\n\n");
            System.out.println("'" + hubPageSelection + "'" + " is not an option. Please try typing one of our provided options.\n");

            hubPage();

        }
    }

}