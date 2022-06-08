import java.util.Scanner;

class Phones extends Inventory {

    private String os = "n/a";
    private int ram;                // memory in GB
    // private String color = "none";			// primary color
    private int lenses;        // number of camera lenses
    private int resolution; //MP
    private int battLife; //mAh
    private boolean sdCard;         //true or false
    //private int cardSize;

    public boolean getSdCard() {
        return sdCard;
    }

    public String getOs() {
        return os;
    }

    public int getBattLife() {
        return battLife;
    }

    public int getResolution() {
        return resolution;
    }

    //public void setOs(String os) { this.os = os; }

    public int getRam() {
        return ram;
    }

    // public void setRam(int ram) {this.ram = ram; }

    public int getLenses() {
        return lenses;
    }

//    public void setLenses(int camera_lenses) {this.lenses = camera_lenses;}

    public Phones() {}
    public Phones(String phone_make, String phone_model, double phone_price, int phone_quantity, String os, int ram, int camera_lenses, int camera_resolution, int phone_battLife) {
        super(phone_make, phone_model, phone_price, phone_quantity);
        this.os = os;
        this.ram = ram;
        this.lenses = camera_lenses;
        this.resolution = camera_resolution;
        this.battLife = phone_battLife;
    }

    public Phones(String phone_make, String phone_model, double phone_price, int phone_quantity, String os, int ram, int camera_lenses, int camera_resolution, int battLife, boolean sdCard) {
        super(phone_make, phone_model, phone_price, phone_quantity);
        this.os = os;
        this.ram = ram;
        this.lenses = camera_lenses;
        this.resolution = camera_resolution;
        this.battLife = battLife;
        this.sdCard = sdCard;
    }

    public Phones(String phone_make, String phone_model, double phone_price, int phone_quantity, int phone_ram, int camera_lenses, int phone_resolution, int phone_battLife, boolean phone_sdCard) {
        super(phone_make, phone_model, phone_price, phone_quantity);
        this.ram = phone_ram;
        this.lenses = camera_lenses;
        this.resolution = phone_resolution;
        this.battLife = phone_battLife;
        this.sdCard = phone_sdCard;
    }
@Override
    public void unveilPhones() {
        System.out.println(
                getMake() + " " + getModel() +
                        "\n  Price:                  | " + getPrice() +
                        "\n  Quantity:               | " + getQuantity() +
                        "\n  Software:               | " + getOs() +
                        "\n  Photo Resolution - MP:  | " + getResolution() +
                        "\n  Memory - GB :           | " + getRam() +
                        "\n  Battery Life - mAh:     | " + getBattLife() +
                        "\n  Memory Card Slot:       | " + getSdCard() +
                        "\n-----------__---(o)_(o)---__ ---------------\n");
    }

    public void unveilByFeat(){
        System.out.println("Which software type: Apple or Android? Type Apple or Android. ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if (answer.equals("Android")) {
            if (getOs().equals("Android")) {
                System.out.println(getMake() + " " + getModel());
            }else if (answer.equals("Apple")) {
                if (getOs().equals("Apple")) {
                    System.out.println(getMake() + " " + getModel());
                }
            }
        }
    }
}