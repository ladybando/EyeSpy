import java.util.Scanner;
//import java.util.ArrayList;

public class EyeSpy {

    public static void main(String[] args){
        /* app should find all smartphones in inventory and search by features
        * should know how much of each type is in stock
       * create show method that can print all features of device
 */     Phones[] stock = Inventory.createSmart();
        System.out.println("Stock outside of method: " + stock[0].make);//returns Samsung
        /*
            Scanner input = new Scanner(System.in);
            String answer = input.next();
            make = stock[0].make;
        for (int i = 0; i < stock.length; i++)
        * if answer == stock[0].make
        *   System.out.println(make)
            end
        end
        * */
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
                spy.unveilStores();
            }else if (answer.equals("stock")){
                System.out.println("EyeSpy with my little eye the total inventory: " + stock.length);
            }
            if(answer.equals("phone")){
                System.out.print("Eye-ing all phones or just some features? Enter 'phone' or 'feat': ");
                answer = input.next();
            }
            switch (answer) {
                case "phone" -> spy.unveil();
                case "feat" -> System.out.println("The phone(s) that meet your need(s): " + spy.unveilByFeat());
                case "q" -> {
                    System.out.println("Thanks for spying all you needed with us!");
                    System.exit(0);
                }
            }
            System.out.println("______---(o)_(o)---_______" + "\n");
        }
    }

    //calling createSmart() method stock to iterate over stock array
    Phones[] stock = Inventory.createSmart();

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


    //TODO abstract for loop to output one , not all, device by features
    public String unveilByFeat(){
        //TODO create variable and print out just one time the name of phone that meets features not all in stock
        //android = stock.make;
        //if there are more than one android
        //print just 1 android.make name to console //will allow users to search for phone by feature
         //what are current features to search for?
        /*
        resolution = key; what is stored in memory is value=10
        network
        lenses
        batt life
        card
        cardsize
        price
        ram
        make
        model
        */
        //Phones p = new Phones();
        //ArrayList<String> stock_hash = new ArrayList<>();
//input.reset will reset values in scanner instance
        System.out.println("Which feature is important to you? ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        String os = stock[0].os;
        for (int i = 0; i < stock.length; i++)
         if (answer.equals(os)){
            return stock[0].make;
        }
        return stock[0].make;
     /*       if (stock_hash.contains("Android")) {
            System.out.printf("EyeSpy with my little eye all %s Phones \n", stock_hash.get(Integer.parseInt(phones.os)) + "\n");
            }//stock_hash[something] = d*/
        }


    public void unveilStores(){
        //TODO allow just one store to print or all stores if wanted based on user input
        Stores[] stores = Stores.createStore();
        System.out.println("EyeSpy with my little eye all stores:");
        for (Stores store : stores) {
            System.out.println(store.name + ":\n" + store.street_name + "\n" + store.city_state + "\n" + store.phone_number + "\n\n");
        }
    }
}
