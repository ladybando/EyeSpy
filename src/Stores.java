import java.util.ArrayList;

public class Stores {
    private String name;
    private String street_name;            // street address of the store
    private String city_state;
    private static ArrayList<Inventory> inventory;

    public String getName() {
        return name;
    }

    /*  public void setStore_Name(String name) {
          this.name = name;
      }

      public void setStreet_name(String street_name) {
          this.street_name = street_name;
      }

      public void setCity_state(String city_state) {
          this.city_state = city_state;
      }

      public void setStore(ArrayList<Inventory> inventory){
          this.inventory = inventory;
      }

      public Stores() {
      }

      // public void setName(String name) { this.name = name; }
      */
    public void setInventory(Phones addPhone) {
        inventory.add(addPhone);
    }

//todo add items to array
    //decide which items that should be
    public ArrayList<Inventory> displayInventory() {
        for (Inventory phone : inventory) {
            phone.unveilPhones();
        }
        return inventory;
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
    //public void setPhone_number(String phone_number) {this.phone_number = phone_number;}

    private String phone_number;

    public Stores(String store_name, String store_street_name, String store_city_state, String store_phone_number) {
        name = store_name;
        street_name = store_street_name;
        city_state = store_city_state;
        phone_number = store_phone_number;
        this.inventory = new ArrayList<>();
    }

    public Stores(){}

    public void unveilStores() {
        System.out.println(
                "Name:         " + getName() + "\n" +
                        "Address:      " + getStreet_name() + "\n" +
                        "              " + getCity_state() + "\n" +
                        "Phone Number: " + getPhone_number() + "\n" +
                        "\n-----------__---(o)_(o)---__ ---------------\n");
    }


    //todo create method to add new phones from outside source

}
