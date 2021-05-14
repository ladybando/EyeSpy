public class Stores {
    String name;			// name of the store
    String street_name;			// street address of the store
    String city_state;
    String phone_number;


    public Stores(String store_name, String store_street_name, String store_city_state, String store_phone_number) {
        name = store_name;
        street_name = store_street_name;
        city_state = store_city_state;
        phone_number = store_phone_number;
    }

    public static String getName(String name){return name;}
    public static String getStreet( String street_name){return street_name;}
    public static String getCity( String city_state){return city_state;}
    public static int getNumber(int phone_number){return phone_number;}
    public void setStore(String name, String street_name, String city_state, String phone_number){
        this.name = name;
        this.street_name = street_name;
        this.city_state = city_state;
        this.phone_number = phone_number;
    }

    public static Stores[] createStore(){
        Stores[] stores;
        Stores newyork = new Stores("New York H-Eye R-Eyes", "123 High Rise", "NY, NY", "(917)444-7443");
        Stores newjersey = new Stores("NJ Long Beach Eye-Land", "456 LBEye Street", "Long Beach, NJ", "(609)393-5263");
        Stores penn = new Stores("Beast B-Eye", "789 B-eyeB-eye Street", "Philadelphia, PA", "(215)232-7824");
        for (Stores store : stores = new Stores[]{newyork,newjersey,penn}) {
            return new Stores[]{store, newjersey, penn};
        }
        return stores;
    }

    public static String addPhoneToStore(){
       // Phones[] stock = Inventory.createSmart(); 	// inventory of Smartphones in this store
        return "";
    }
}
