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
    }
}
