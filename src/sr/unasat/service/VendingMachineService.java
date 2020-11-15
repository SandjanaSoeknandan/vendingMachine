package sr.unasat.service;

import sr.unasat.beverage.Beverages;

public class VendingMachineService {

    //Opdracht 1a
    public String drinksAndPrice(String chosenDrink){

        String[] drinks = {"Sprite", "Coca Cola", "7up", "Water", "Sparkling water"};
        Double[] prices = {5.50 , 5.75 , 5.77 , 3.25, 7.75};

        String displayMessage = "Please choose a drink";

        switch(chosenDrink){
            case "Sprite":
                displayMessage = drinks[0] + " ---> $" + prices[0];
                break;
            case "Coca Cola":
                displayMessage = drinks[1] + " ---> $" + prices[1];
                break;
            case "7up":
                displayMessage = drinks[2] + " ---> $" + prices[2];
                break;
            case "Water":
                displayMessage = drinks[3] + " ---> $" + prices[3];
                break;
            case "Sparkling water":
                displayMessage = drinks[4] + " ---> $" + prices[4];
                break;
            default:
                displayMessage = "";
        }
        return displayMessage;
    }

    //Opdracht 1b

    private final Beverages beverage1;
    private final Beverages beverage2;

    public VendingMachineService(Beverages beverage_one, Beverages beverage_two) {
        this.beverage1 = beverage_one;
        this.beverage2 = beverage_two;
    }

    public String display_options() {
        String display;
        display = "Press 1 to get your " + beverage1.getName() + " just for " + beverage1.getPrice()
                + "\nPress 2 to get your " + beverage2.getName() + " just for " + beverage2.getPrice();
        return display;
    }

    public String chosenSoftDrink(int choose_beverage) {
        String thank_you_message;
        int option = choose_beverage;
        switch (option) {
            case 1:
                thank_you_message = "Enjoy your " + beverage1.getName() + "\nand have a very nice day!";
                break;
            case 2:
                thank_you_message = "Enjoy your " + beverage2.getName() + "\nand have a very nice day!";
                break;
            case 3:
                thank_you_message = "Enjoy your Sprite" + "\nand have a very nice day!";
                break;
            default:
                thank_you_message = "Please make sure you chose a drink";
        }
        return thank_you_message;
    }

}
