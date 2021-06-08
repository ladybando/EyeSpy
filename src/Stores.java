//import java.util.Scanner;

public class Stores {
    private String name;
    private String street_name;            // street address of the store
    private String city_state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet_name() {
        return street_name;
    }

    public String getCity_state() {
        return city_state;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    private String phone_number;


    public void setStore_Name(String name) {
        this.name = name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public void setCity_state(String city_state) {
        this.city_state = city_state;
    }

    public Stores() {
    }

    public Stores(String store_name, String store_street_name, String store_city_state, String store_phone_number) {
        name = store_name;
        street_name = store_street_name;
        city_state = store_city_state;
        phone_number = store_phone_number;
    }

    public Stores[] showStore() {
        Stores[] stores = new Stores[0];
        Stores newyork = new Stores("New York H-Eye R-Eyes", "123 High Rise", "NY, NY", "(917)777-7777");
        Stores newjersey = new Stores("NJ Long Beach Eye-Land", "456 LBEye Street", "Long Beach, NJ", "(609)393-5263");
        Stores penn = new Stores("Beast B-Eye", "789 B-eyeB-eye Street", "Philadelphia, PA", "(215)232-7824");
        stores = new Stores[]{newjersey,newyork,penn};
        for (Stores store : stores) {
            System.out.println(
                    "Name:         " + store.getName() + "\n" +
                            "Address:      " + store.getStreet_name() + "\n" +
                            "              " + store.getCity_state() + "\n" +
                            "Phone Number: " + store.getPhone_number() + "\n" +
                            "\n-----------__---(o)_(o)---__ ---------------\n");
        }
        return stores;
    }
//todo make createStores method and have show store call method
    //public S
//todo make below method work properly
/*    public void showStoreInventory() {
        while (true) {
            System.out.print("Select 'phone', 'store', 'stock', or 'q' to quit: ");
            Scanner input = new Scanner(System.in);
            String answer = input.next();
            if (answer.equals("store")) {
                System.out.print("Eye-ing all stores or stores with Androids? Enter 'all' or 'Android': ");
                answer = input.next();
                if (answer.equals("all")) {
                    spy.unveilStores();
                } else if (answer.equalsIgnoreCase("ANDROID")) {
                    System.out.println(newyork.name + " at " + newyork.street_name + ", " + newyork.city_state + " has " + newyork.inventory.get(1) + " devices in stock.");
                }
            } else if (answer.equals("stock")) {
                System.out.println("EyeSpy with my little eye the total inventory: " + stock.length);
            }
            if (answer.equals("phone")) {
                System.out.print("Eye-ing all phones or just some features? Enter 'phone' or 'feat': ");
                answer = input.next();
            }
            switch (answer) {
                case "phone" -> phone.unveil();
                //case "feat" -> phone.unveilByFeat();
                case "q" -> {
                    System.out.println("Thanks for spying all you needed with us!");
                    System.exit(0);
                }
            }
        }
    }*/

    //todo create method to add new phones from outside source
}
