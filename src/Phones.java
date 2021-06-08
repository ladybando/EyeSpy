<<<<<<< HEAD
class Phones extends Inventory{
    private String os;
    private int ram;				// memory in GB
   // private String color = "none";			// primary color
    private int lenses;		// number of camera lenses
   // private int resolution; //MP
    private int battLife; //mAh
    private boolean sdCard;         //true or false
    //private int cardSize;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getLenses() {
        return lenses;
    }

    public void setLenses(int camera_lenses) {
        this.lenses = camera_lenses;
    }

    public Phones(String store_name, String store_street_name, String store_city_state, String store_phone_number, String phone_make, String phone_model, double phone_price, int phone_quantity, String os, int ram, int camera_lenses) {
        super(store_name, store_street_name, store_city_state, store_phone_number, phone_make, phone_model, phone_price, phone_quantity);
        this.os = os;
        this.ram = ram;
        this.lenses = camera_lenses;
    }

    public static Phones[] createPhones(){
        Phones[] phones;
        Phones iphone = new Phones("New York", "123 The Street", "NY, NY", "(917)777-7777)","Apple", "iPhone 12 Max", 999.99, 10, "iOS",  512,  5);
        Phones note10 = new Phones("New Jersey", "456 The Street", "Long Beach, NJ", "(609)333-3333","Samsung", "Note10", 999.99, 5, "Android", 256, 3);
        phones = new Phones[]{iphone, note10};
        return phones;
=======
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class EyeSpy {

    public static void main(String[] args){
        /* app should find all smartphones in inventory and search by features
        * should know how much of each type is in stock
       * create show method that can print all features of device
 */     Phones[] stock = Phones.createSmart();

        Stores newyork = new Stores();
        newyork.setStore_Name("New York H-Eye R-Eyes");
        newyork.setStreet_name("123 High Rise");
        newyork.setCity_state("NY, NY");

        Stores penn = new Stores();
        penn.setStore_Name("Beast B-Eye");
        penn.setStreet_name("789 B-eyeB-eye Street");
        penn.setCity_state("Philadelphia, PA");

        Phones ultra = new Phones();
        ultra.setMake("Apple");
        ultra.setModel("Pro Max 12");

        Phones smart = new Phones();
        smart.setModel("Note 12");
        smart.setMake("Samsung");

        Phones basic = new Phones();
        basic.setMake("LG");
        basic.setModel("Chocolate");

        List<Phones> inventory = new ArrayList<>();
        inventory.add(ultra);
        inventory.add(smart);
        newyork.setStore(inventory);

        List<Phones> inventory1 = new ArrayList<>();
        inventory1.add(basic);
        penn.setStore(inventory1);
        //System.out.println("All the stores: " + stores[0].name);

        System.out.println("""
                
                Welcome! How can EyeSpy __---(o)_(o)---__ what you need?\s
                Eye-ing a new phone, checking stock, or looking for a store?\s
                """);
        EyeSpy spy = new EyeSpy();

        while(true) {
            System.out.print("Select 'phone', 'store', 'stock', or 'q' to quit: ");
            Scanner input = new Scanner(System.in);
            String answer = input.next();
            if(answer.equals("store")) {
                System.out.print("Eye-ing all stores or stores with Androids? Enter 'all' or 'Android': ");
                answer = input.next();
                if (answer.equals("all")) {
                    spy.unveilStores();
                }else if (answer.equalsIgnoreCase("ANDROID")){
                    System.out.println(newyork.name +" at " + newyork.street_name + ", " + newyork.city_state + " has "+ newyork.inventory.get(1) + " devices in stock.");
                }
            }else if (answer.equals("stock")){
                System.out.println("EyeSpy with my little eye the total inventory: " + stock.length);
            }
            if(answer.equals("phone")){
                System.out.print("Eye-ing all phones or just some features? Enter 'phone' or 'feat': ");
                answer = input.next();
            }
            switch (answer) {
                case "phone" -> spy.unveil();
                case "feat" -> spy.unveilByFeat();
                case "q" -> {
                    System.out.println("Thanks for spying all you needed with us!");
                    System.exit(0);
                }
            }
            System.out.println("______---(o)_(o)---_______" + "\n");
        }
    }

    //calling createSmart() method stock to iterate over stock array
    Phones[] stock = Phones.createSmart();

    public void unveil(){
        //will show all phones for each phone in phones
        for (Phones phones : stock) {
            System.out.println(phones.make + " " + phones.model +
                    "\n  Software: " + phones.os +
                    "\n  Photo Resolution -  megapixels: " + phones.resolution +
                    "\n  Memory - GB: " + phones.ram +
                    "\n  Price: " + phones.price +
                    "\n  Battery Life - mAh: " + phones.battLife +
                    "\n  Network: " +  phones.network +
                    "\n  Memory Card Slot: " + phones.sdCard +
                    "\n  Memory Card Size - GB: " + phones.cardSize +"\n");

        }
    }


    public void unveilByFeat() {
        //searches for phones in stock by os-Android

        for (Phones phone : stock)
         if (phone.os.equals("Android")){
             System.out.println("EyeSpy with my little eye all Android Phones: \n" + phone.make + phone.model);
        }
    }


    public void unveilStores(){
        //prints all stores
        Stores[] stores = Stores.createStore();
        System.out.println("EyeSpy with my little eye all stores:");
        for (Stores store : stores) {
            System.out.println(store.name + ":\n" + store.street_name + "\n" + store.city_state + "\n" + store.phone_number + "\n\n");
        }
>>>>>>> c4d771fbefef7ac8bbae99ea62fd0b6497458da3
    }
}
