import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
//import java.util.Scanner;

public class EyeSpy {

    public static void main(String[] args) {
        /* app should find all smartphones in inventory and search by features
         * should know how much of each type is in stock
         * create show method that can print all features of device
         */
        System.out.println("""
                                
                Welcome! How can EyeSpy __---(o)_(o)---__ what you need?\s
                Eye-ing a new phone, checking stock, or looking for a store?\s
                """);
        EyeSpy spy = new EyeSpy();

        spy.createStoreStock();


    }

    public ArrayList<Inventory> createStoreStock() {//maybe create hashmap with store as key and phone as value? \__O__/

        Stores newyork = new Stores("New York H-Eye R-Eyes", "123 High Rise", "NY, NY", "(917)444-7443");
        newyork.unveilStores();//displays store information

        Phones iphone12 = new Phones("Apple", "iPhone 12 Max", 999.99, 5, "iOS", 512, 5, 10, 2500);
        Phones note10 = new Phones("Samsung", "Note 10", 999.99, 5, "Android", 512, 3, 10, 3500, true);
        Phones basic_0 = new Phones("Samsung", "The Flip", 79.99, 2, 2, 1, 2, 800, false);
        newyork.setInventory(iphone12); //adds phone to store's inventory
        newyork.setInventory(note10);
        newyork.setInventory(basic_0);
        newyork.displayInventory();
        System.out.println("\n");


        Stores newjersey = new Stores("NJ Long Beach Eye-Land", "456 LBEye Street", "Long Beach, NJ", "(609)393-5263");
        newjersey.unveilStores();

        Phones iphone10 = new Phones("Apple", "iPhone 10", 849.99, 8, "iOS", 512, 5, 10, 2500);
        Phones smart = new Phones("Samsung", "Note 10", 949.99, 5, "Android", 256, 5, 8, 3500, true);
        newjersey.setInventory(iphone10);
        newjersey.setInventory(smart);
        newjersey.displayInventory();
        System.out.println("\n");

        Stores penn = new Stores("Beast B-Eye", "789 B-eyeB-eye Street", "Philadelphia, PA", "(215)232-7824");
        penn.unveilStores();

        Phones basic = new Phones("LG", "Chocolate", 129.99, 2, 4, 1, 4, 1000, true);
        Phones basic_1 = new Phones("Samsung", "The Flip", 79.99, 2, 2, 1, 2, 800, false);
        Phones motorola = new Phones("Motorola", "Razr", 999.99, 6, 256, 4, 10, 3500, true);
        penn.setInventory(basic);
        penn.setInventory(basic_1);
        penn.setInventory(motorola);
        penn.displayInventory();
        System.out.println("\n");
        return null;
    }
}
