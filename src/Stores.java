import java.util.List;

public class Stores {
    String name;
    String street_name;			// street address of the store
    String city_state;
    String phone_number;
    List<Phones> inventory;

    public void setStore_Name(String name) {
        this.name = name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public void setCity_state(String city_state) {
        this.city_state = city_state;
    }

    public void setStore(List<Phones> inventory){
        this.inventory = inventory;
    }


    public Stores(){}

    public Stores(String store_name, String store_street_name, String store_city_state, String store_phone_number) {
        name = store_name;
        street_name = store_street_name;
        city_state = store_city_state;
        phone_number = store_phone_number;
    }

    public static Stores[] createStore(){
        Stores[] stores;
        Stores newjersey = new Stores("NJ Long Beach Eye-Land", "456 LBEye Street", "Long Beach, NJ", "(609)393-5263");
        Stores penn = new Stores("Beast B-Eye", "789 B-eyeB-eye Street", "Philadelphia, PA", "(215)232-7824");
        for (Stores store : stores = new Stores[]{newjersey,penn}) {
            return new Stores[]{store, newjersey, penn};
        }
        return stores;
    }

}
    public static String addPhoneToStore(){
       // Phones[] stock = Inventory.createSmart(); 	// inventory of Smartphones in this store
        return "";
    }
}
