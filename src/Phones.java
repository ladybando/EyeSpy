class Phones {

    //phone data for each model
        String make = "none";	// company
        String model = "none";			// specific model
        String os = "none";			// operating system
        String network = "none"; //5G, 4G no data
        int ram = 0;				// memory in GB
        boolean sdCard = false;         //true or false
        int cardSize= 0;          //mem card size
        String color = "none";			// primary color
        int lenses= 0;		// number of camera lenses
        int resolution= 0; //MP
        double price =  0.00;			// how much does it cost
        int battLife = 0; //mAh
        String security = "none"; //none, fingerprint, face


   //constructor for basic phone/smartphone
    public Phones(String foneMake, String foneModel, int foneResolution, int foneRam, double fonePrice, int foneBattLife, boolean foneSdCard, int foneCardSize){
        make = foneMake;
        model = foneModel;
        resolution = foneResolution;
        ram = foneRam;
        price = fonePrice;
        battLife = foneBattLife;
        sdCard = foneSdCard;
        cardSize = foneCardSize;
    }

    //constructor for phone/smartphone with more features
    public Phones(String foneMake, String foneModel, String foneOs, int foneResolution, int foneRam, double fonePrice, int foneBattLife, String foneNetwork, String foneColor, boolean foneSdCard, int foneCardSize){
        //for medium level smartphones
        make = foneMake;
        model = foneModel;
        resolution = foneResolution;
        ram = foneRam;
        price = fonePrice;
        battLife = foneBattLife;
        sdCard = foneSdCard;
        network = foneNetwork;
        cardSize = foneCardSize;
        color = foneColor;
        os = foneOs;
    }

    //constructor for smartphone with advanced features
    public Phones(String foneMake, String foneModel, String foneOs, int foneResolution, int foneRam, double fonePrice,
                  int foneBattLife, String foneNetwork, String foneColor, int foneLens, String foneSec, boolean foneSdCard, int foneCardSize){
        //;ultra premium phone with all features
        make = foneMake;
        model = foneModel;
        resolution = foneResolution;
        ram = foneRam;
        price = fonePrice;
        battLife = foneBattLife;
        network = foneNetwork;
        color = foneColor;
        lenses = foneLens;
        security = foneSec;
        sdCard = foneSdCard;
        cardSize = foneCardSize;
        os = foneOs;
    }
    //getters
    public static String getMake(String make) { return make;}

    public static String getModel(String model) { return model;}

    public static String getOs(String os) {return os;}

    public static int getRam(int ram) {return ram;}

    public static int getLenses(int camera_lenses){
        return camera_lenses;
    }

    public static double getPrice( double price){
        return price;
    }

    public static boolean getSdCard(boolean sdCard){ return sdCard;}

    public static int getCardSize(int cardSize){return cardSize;}

    public static String getColor(String color){return color;}

    public static int getResolution(int resolution){return resolution;}

    public static int getBattLife(int battLife){return battLife;}

    public static String getSecurity(String security){return security;}
    //setters

    public void setMake(String make) { this.make = make;}

    public void setModel(String model) { this.model = model;}

    public void setOs(String os) {this.os = os;}

    public void setRam(int ram) {this.ram = ram;}

    public void setLenses(int lenses){ this.lenses = lenses; }

    public void setPrice( double price){ this.price = price;}

    public void setSdCard(boolean sdCard){ this.sdCard = sdCard;}

    public void setCardSize(int cardSize){this.cardSize = cardSize;}

    public void setColor(String color){this.color = color;}

    public void setResolution(int resolution){this.resolution = resolution;}

    public void setBattLife(int battLife){this.battLife = battLife;}

    public void setSecurity(String security){this.security = security;}
}
