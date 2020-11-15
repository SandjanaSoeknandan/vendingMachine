package sr.unasat.app;

import sr.unasat.beverage.Beverages;
import sr.unasat.service.VendingMachineService;

public class Application {
    public static void main(String[] args) {
        Beverages beverage1 = new Beverages("CokeCola", "$1.77");
        Beverages beverage2 = new Beverages("Pepsi", "$1.75");
        VendingMachineService vms = new VendingMachineService(beverage1, beverage2);
        //System.out.println(vms.drinksAndPrice("Sprite"));
        //vms.display_options();
        //vms.chosenSoftDrink(1);
    }
}
