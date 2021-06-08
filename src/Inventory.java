public class Inventory extends Stores {
    private String make;    // company
    private String model;            // specific model
    private double price;
    private int quantity;

    public Inventory(String make, String model, double price, int quantity) {
    }

    public Inventory() {

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public Inventory(String store_name, String store_street_name, String store_city_state, String store_phone_number, String phone_make, String phone_model, double phone_price, int phone_quantity) {
        super(store_name, store_street_name, store_city_state, store_phone_number);
        make = phone_make;
        model = phone_model;
        price = phone_price;
        quantity = phone_quantity;
    }

    public Inventory(String store_name, String store_street_name, String store_city_state, String store_phone_number) {
        super(store_name, store_street_name, store_city_state, store_phone_number);
    }

    public static Phones[] showPhones(){
        Phones[] phones = Phones.createPhones();
        for ( Phones phone : phones) {
            System.out.println(
                    "Make and Model: " + phone.getMake() + " " + phone.getModel() + "\n" +
                            "Software: " + phone.getOs() + "\n" +
                            "Memory: " + phone.getRam() + "\n" +
                            "Amount of Cameras: " + phone.getLenses() + "\n" +
                            "Price: " + phone.getPrice() + "\n" +
                            "Store Quantity: " + phone.getQuantity() + "\n"   +
                            "\n-----------__---(o)_(o)---__ ---------------\n");
        }
        return phones;
    }
}
