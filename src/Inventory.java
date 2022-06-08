public class Inventory {
    private String make;    // company
    private String model;            // specific model
    private double price;
    private int quantity;

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


    public Inventory(String phone_make, String phone_model, double phone_price, int phone_quantity) {
        make = phone_make;
        model = phone_model;
        price = phone_price;
        quantity = phone_quantity;
    }

    public void unveilPhones() {
        System.out.println(
                "   " + getMake() + " " + getModel() +
                        "\n  Price:                  | " + getPrice() +
                        "\n  Quantity:               | " + getQuantity() +
                        "\n-----------__---(o)_(o)---__ ---------------\n");
    }
}