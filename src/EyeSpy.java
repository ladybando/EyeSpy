//import java.util.Scanner;
public class EyeSpy {

    public static void main(String[] args) {
        /* app should find all smartphones in inventory and search by features
         * should know how much of each type is in stock
         * create show method that can print all features of device
         */
        //System.out.println("All the stores: " + stores[0].name);

        System.out.println("""
                                
                Welcome! How can EyeSpy __---(o)_(o)---__ what you need?\s
                Eye-ing a new phone, checking stock, or looking for a store?\s
                """);
        Stores all_stores = new Stores();
        all_stores.showStore();
        Inventory all_phones = new Inventory();
        all_phones.showPhones();
    }

    //calling createSmart() method stock to iterate over stock array

}
